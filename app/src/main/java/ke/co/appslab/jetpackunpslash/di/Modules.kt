package ke.co.appslab.jetpackunpslash.di

import com.google.gson.GsonBuilder
import ke.co.appslab.jetpackunpslash.R
import ke.co.appslab.jetpackunpslash.data.remote.UnsplashService
import ke.co.appslab.jetpackunpslash.data.repository.PhotosRepo
import ke.co.appslab.jetpackunpslash.ui.viewmodels.PhotosViewModel
import ke.co.appslab.jetpackunpslash.utils.Constants
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import org.koin.android.BuildConfig
import org.koin.android.ext.koin.androidContext
import org.koin.core.module.Module
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create
import java.util.concurrent.TimeUnit

private val networkingModule: Module = module {

    single {
        val interceptor = HttpLoggingInterceptor()
        interceptor.level = when (BuildConfig.BUILD_TYPE) {
            "release" -> HttpLoggingInterceptor.Level.NONE
            else -> HttpLoggingInterceptor.Level.BODY
        }

        OkHttpClient.Builder()
            .addInterceptor(interceptor)
            .connectTimeout(10, TimeUnit.MINUTES)
            .readTimeout(10, TimeUnit.MINUTES)
            .build()
    }

    single {

        val gson = GsonBuilder()
            .serializeNulls()
            .create()

        Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create(gson))
            .client(get())
            .build()
    }
}

val apiModule: Module = module {
    single<UnsplashService> { get<Retrofit>().create() }
}


val accessKeyModule: Module = module {
    single { androidContext().getString(R.string.unsplash_access_key) }
}
val repositoryModule: Module = module {
    single { PhotosRepo(get(), get()) }
}
val viewModelModule: Module = module {
single { PhotosViewModel(get()) }
}

val appModules = listOf(
    networkingModule,
    apiModule,
    accessKeyModule,
    repositoryModule,
    viewModelModule
)
