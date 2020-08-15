package ke.co.appslab.jetpackunpslash.data.local

import android.content.Context
import android.content.Entity
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import ke.co.appslab.jetpackunpslash.data.local.dao.PhotosDao
import ke.co.appslab.jetpackunpslash.data.local.entities.PhotoEntity

@Database(
    entities = [PhotoEntity::class],
    version = 1,
    exportSchema = false
)
abstract class UnsplashDataBase : RoomDatabase() {
    companion object {
        fun create(context: Context): UnsplashDataBase {
            val databaseBuilder =
                Room.databaseBuilder(context, UnsplashDataBase::class.java, "jetpack_unsplash.db")
            return databaseBuilder.build()
        }
    }

    abstract fun photosDao(): PhotosDao
}