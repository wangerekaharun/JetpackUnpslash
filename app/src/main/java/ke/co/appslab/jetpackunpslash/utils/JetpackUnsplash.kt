package ke.co.appslab.jetpackunpslash.utils

import android.app.Application
import ke.co.appslab.jetpackunpslash.di.appModules
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class JetpackUnsplash : Application() {

    override fun onCreate() {
        super.onCreate()

        initKoin()
    }

    private fun initKoin() {
        startKoin {
            androidLogger()
            androidContext(applicationContext)
            modules(appModules)
        }
    }
}