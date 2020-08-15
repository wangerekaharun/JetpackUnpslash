package ke.co.appslab.jetpackunpslash.data.repository

import androidx.paging.PagingSource
import ke.co.appslab.jetpackunpslash.data.remote.UnsplashService
import ke.co.appslab.jetpackunpslash.data.remote.models.Photo
import retrofit2.HttpException
import java.io.IOException

private const val START_PAGE = 1

class UnsplashPagingSource(
    private val unsplashService: UnsplashService,
    private val accessKey: String
) :
    PagingSource<Int, Photo>() {
    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, Photo> {
        val position = params.key ?: START_PAGE
        return try {
            val response =
                unsplashService.fetchPhotos(1, params.loadSize, "latest", accessKey)
            val photos = response.body()!!
            LoadResult.Page(
                data = photos,
                prevKey = if (position == START_PAGE) null else position - 1,
                nextKey = if (photos.isEmpty()) null else position + 1
            )
        } catch (exception: IOException) {
            return LoadResult.Error(exception)
        } catch (exception: HttpException) {
            return LoadResult.Error(exception)
        }
    }
}