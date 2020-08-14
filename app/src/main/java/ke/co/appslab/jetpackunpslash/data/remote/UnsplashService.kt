package ke.co.appslab.jetpackunpslash.data.remote

import ke.co.appslab.jetpackunpslash.data.remote.models.Photo
import ke.co.appslab.jetpackunpslash.data.remote.models.UnsplashApiResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface UnsplashService {

    @GET("/photos")
    suspend fun fetchPhotos(
        @Query("") page: Int,
        @Query("per_page") perPage: Int,
        @Query("order_by") orderBy: String,
        @Query("client_id") clientId: String
    ): Response<List<Photo>>
}