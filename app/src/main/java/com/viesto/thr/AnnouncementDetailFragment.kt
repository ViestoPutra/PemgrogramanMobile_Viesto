package com.viesto.thr

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.navArgs
import com.viesto.thr.databinding.FragmentAnnouncementDetailBinding

class AnnouncementDetailFragment : Fragment() {

    private var _binding: FragmentAnnouncementDetailBinding? = null
    private val binding get() = _binding!!

    private val viewModel: HomeViewModel by activityViewModels()
    private val args: AnnouncementDetailFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentAnnouncementDetailBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val announcement = viewModel.getAnnouncementById(args.announcementId)
        announcement?.let {
            binding.tvDetailTitle.text = it.title
            binding.tvDetailDate.text = it.date
            binding.tvDetailCategory.text = it.category
            binding.tvDetailContent.text = it.content
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
