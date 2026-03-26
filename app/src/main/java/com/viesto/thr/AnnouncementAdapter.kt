package com.viesto.thr

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.viesto.thr.databinding.ItemAnnouncementBinding

class AnnouncementAdapter(private val onItemClick: (Announcement) -> Unit) :
    ListAdapter<Announcement, AnnouncementAdapter.ViewHolder>(DiffCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemAnnouncementBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val announcement = getItem(position)
        holder.bind(announcement, onItemClick)
    }

    class ViewHolder(private val binding: ItemAnnouncementBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(announcement: Announcement, onItemClick: (Announcement) -> Unit) {
            binding.tvItemTitle.text = announcement.title
            binding.tvItemDate.text = announcement.date
            binding.tvItemCategory.text = announcement.category
            binding.root.setOnClickListener {
                onItemClick(announcement)
            }
        }
    }

    class DiffCallback : DiffUtil.ItemCallback<Announcement>() {
        override fun areItemsTheSame(oldItem: Announcement, newItem: Announcement): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: Announcement, newItem: Announcement): Boolean {
            return oldItem == newItem
        }
    }
}
