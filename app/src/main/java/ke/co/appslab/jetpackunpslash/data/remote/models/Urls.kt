package ke.co.appslab.jetpackunpslash.data.remote.models


import com.google.gson.annotations.SerializedName

data class Urls(
    @SerializedName("full")
    val full: String,
    @SerializedName("raw")
    val raw: String,
    @SerializedName("regular")
    val regular: String,
    @SerializedName("small")
    val small: String,
    @SerializedName("thumb")
    val thumb: String
)