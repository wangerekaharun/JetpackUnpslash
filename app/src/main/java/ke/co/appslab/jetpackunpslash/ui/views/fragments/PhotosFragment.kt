package ke.co.appslab.jetpackunpslash.ui.views.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import ke.co.appslab.jetpackunpslash.databinding.FragmentPhotosBinding

class PhotosFragment : Fragment() {
    private var _binding: FragmentPhotosBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentPhotosBinding.inflate(inflater, container, false)
        return binding.root
    }
}