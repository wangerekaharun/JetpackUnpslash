package ke.co.appslab.jetpackunpslash.utils

import androidx.recyclerview.widget.DiffUtil
import ke.co.appslab.jetpackunpslash.data.remote.models.Photo

class DiffUtilsCallBack : DiffUtil.ItemCallback<Photo>() {
    override fun areItemsTheSame(oldItem: Photo, newItem: Photo): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: Photo, newItem: Photo): Boolean {
        return oldItem.likes == newItem.likes &&
                oldItem.description == newItem.description

    }
}