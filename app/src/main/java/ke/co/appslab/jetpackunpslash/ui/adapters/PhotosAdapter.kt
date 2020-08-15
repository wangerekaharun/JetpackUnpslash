package ke.co.appslab.jetpackunpslash.ui.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.paging.PagingDataAdapter
import androidx.recyclerview.widget.RecyclerView
import coil.api.load
import ke.co.appslab.jetpackunpslash.R
import ke.co.appslab.jetpackunpslash.data.remote.models.Photo
import ke.co.appslab.jetpackunpslash.utils.DiffUtilsCallBack
import kotlinx.android.synthetic.main.list_item_photo_layout.view.*

class PhotosAdapter() :
    PagingDataAdapter<Photo, PhotosAdapter.PhotoViewHolder>(DiffUtilsCallBack()) {
    class PhotoViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private val imgPhoto = view.imgPhoto

        fun bindPhoto(photo: Photo) {
            with(photo) {
                imgPhoto.load(photo.urls.regular)
            }
        }

    }

    override fun onBindViewHolder(holder: PhotoViewHolder, position: Int) {
        getItem(position)?.let { holder.bindPhoto(it) }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PhotoViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item_photo_layout, parent, false)
        return PhotoViewHolder(view)
    }
}