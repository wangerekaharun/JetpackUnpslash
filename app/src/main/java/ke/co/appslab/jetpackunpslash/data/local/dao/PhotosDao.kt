package ke.co.appslab.jetpackunpslash.data.local.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import androidx.room.OnConflictStrategy.REPLACE
import ke.co.appslab.jetpackunpslash.data.local.entities.PhotoEntity

@Dao
interface PhotosDao {

    @Insert(onConflict = REPLACE)
    suspend fun insertPhotos(photos: List<PhotoEntity>)

    @Query("SELECT * FROM photos")
    fun getPhotos(): LiveData<List<PhotoEntity>>

    @Delete
    suspend fun deleteAllPhotos()
}