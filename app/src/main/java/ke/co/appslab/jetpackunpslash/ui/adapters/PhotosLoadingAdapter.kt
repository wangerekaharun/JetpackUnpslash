package ke.co.appslab.jetpackunpslash.ui.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ProgressBar
import android.widget.TextView
import androidx.core.view.isVisible
import androidx.paging.LoadState
import androidx.paging.LoadStateAdapter
import androidx.recyclerview.widget.RecyclerView
import ke.co.appslab.jetpackunpslash.R
import kotlinx.android.synthetic.main.list_item_load_state.view.*

class PhotosLoadingAdapter(private val retry : () -> Unit) : LoadStateAdapter<PhotosLoadingAdapter.PhotosLoadingViewHolder>() {
    class PhotosLoadingViewHolder(view: View, private val retry : () -> Unit) : RecyclerView.ViewHolder(view) {
        private val tvErrorMessage: TextView = itemView.tvErrorMessage
        private val progressBar: ProgressBar = itemView.progress_bar
        private val btnRetry: Button = itemView.btnRetry

        init {
            btnRetry.setOnClickListener {
                retry.invoke()
            }
        }

        fun bindState(loadState: LoadState) {
            if (loadState is LoadState.Error) {
                tvErrorMessage.error = loadState.error.localizedMessage
            }
            btnRetry.isVisible = loadState is LoadState.Error
            progressBar.isVisible = loadState is LoadState.Loading
            tvErrorMessage.isVisible = loadState is LoadState.Error

        }

    }

    override fun onBindViewHolder(holder: PhotosLoadingViewHolder, loadState: LoadState) {
        holder.bindState(loadState)
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        loadState: LoadState
    ): PhotosLoadingViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item_load_state, parent, false)
        return PhotosLoadingViewHolder(view, retry)
    }
}