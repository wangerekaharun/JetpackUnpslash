package ke.co.appslab.jetpackunpslash.ui.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import androidx.lifecycle.viewModelScope
import androidx.paging.PagingData
import androidx.paging.cachedIn
import ke.co.appslab.jetpackunpslash.data.remote.models.Photo
import ke.co.appslab.jetpackunpslash.data.repository.PhotosRepo

class PhotosViewModel(private val photosRepo: PhotosRepo) : ViewModel() {

    fun fetchPhotos(): LiveData<PagingData<Photo>> =
        photosRepo.getPhotos().asLiveData().cachedIn(viewModelScope)

}