package ke.co.appslab.jetpackunpslash.ui.views.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.lifecycleScope
import ke.co.appslab.jetpackunpslash.databinding.FragmentPhotosBinding
import ke.co.appslab.jetpackunpslash.ui.adapters.PhotosAdapter
import ke.co.appslab.jetpackunpslash.ui.viewmodels.PhotosViewModel
import kotlinx.android.synthetic.main.fragment_photos.view.*
import kotlinx.coroutines.launch
import org.koin.androidx.viewmodel.ext.android.viewModel

class PhotosFragment : Fragment() {
    private var _binding: FragmentPhotosBinding? = null
    private val binding get() = _binding!!
    private val photosViewModel: PhotosViewModel by viewModel()
    private val photosAdapter = PhotosAdapter()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentPhotosBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        fetchPhotos()
        setupViews()
    }

    private fun fetchPhotos() {
        photosViewModel.fetchPhotos().observe(viewLifecycleOwner, Observer { pagingData ->
            lifecycleScope.launch {
                photosAdapter.submitData(pagingData)
            }
        })
    }

    private fun setupViews() {
        binding.root.rvPhotos.adapter = photosAdapter

    }
}