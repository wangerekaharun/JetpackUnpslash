package ke.co.appslab.jetpackunpslash.data.local.entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName = "photos")
data class PhotoEntity(
    @PrimaryKey
    val id: String
)
