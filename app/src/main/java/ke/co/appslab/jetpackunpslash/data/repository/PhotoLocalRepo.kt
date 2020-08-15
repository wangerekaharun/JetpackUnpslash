package ke.co.appslab.jetpackunpslash.data.repository

import android.content.Context
import androidx.lifecycle.LiveData
import ke.co.appslab.jetpackunpslash.data.local.UnsplashDataBase
import ke.co.appslab.jetpackunpslash.data.local.entities.PhotoEntity

class PhotoLocalRepo(val unsplashDataBase: UnsplashDataBase) {

    suspend fun savePhotos(photos: List<PhotoEntity>) {
        unsplashDataBase.photosDao().insertPhotos(photos)
    }

    suspend fun getPhotos(): LiveData<List<PhotoEntity>> = unsplashDataBase.photosDao().getPhotos()

    suspend fun deletePhotos() {
        unsplashDataBase.photosDao().deleteAllPhotos()
    }
}