package com.viesto.thr

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.viesto.thr.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    private val viewModel: HomeViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val adapter = AnnouncementAdapter { announcement ->
            val action = HomeFragmentDirections.actionHomeFragmentToAnnouncementDetailFragment(announcement.id)
            findNavController().navigate(action)
        }

        binding.rvAnnouncements.layoutManager = LinearLayoutManager(requireContext())
        binding.rvAnnouncements.adapter = adapter

        viewModel.announcements.observe(viewLifecycleOwner) { list ->
            adapter.submitList(list)
        }

        binding.cgFilters.setOnCheckedChangeListener { _, checkedId ->
            val category = when (checkedId) {
                R.id.chip_akademik -> "Akademik"
                R.id.chip_beasiswa -> "Beasiswa"
                R.id.chip_umum -> "Umum"
                else -> "Semua"
            }
            viewModel.setFilter(category)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
