package ke.co.appslab.jetpackunpslash.data.repository

import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import ke.co.appslab.jetpackunpslash.data.remote.UnsplashService
import ke.co.appslab.jetpackunpslash.data.remote.models.Photo
import kotlinx.coroutines.flow.Flow

class PhotosRepo(
    private val unsplashService: UnsplashService,
    private val accessKey: String
) {
    fun getPhotos(): Flow<PagingData<Photo>> {
        return Pager(
            PagingConfig(pageSize = 1, enablePlaceholders = false)
        ) {
            UnsplashPagingSource(unsplashService, accessKey)
        }.flow
    }
}