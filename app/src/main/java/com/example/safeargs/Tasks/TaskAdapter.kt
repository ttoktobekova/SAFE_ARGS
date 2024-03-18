package com.example.safeargs.Tasks

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.safeargs.databinding.ItemTaskBinding

class TaskAdapter : ListAdapter<String, TaskAdapter.ContactViewHolder>(DIFF_UTIL_CALL_BACK) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        return ContactViewHolder(
            binding = ItemTaskBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )
    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        holder.bind(getItem(position))
    }


    companion object {
        val DIFF_UTIL_CALL_BACK = object : DiffUtil.ItemCallback<String>() {
            override fun areItemsTheSame(oldItem: String, newItem: String): Boolean =
                oldItem == newItem

            override fun areContentsTheSame(oldItem: String, newItem: String): Boolean =
                oldItem == newItem

        }
    }

    inner class ContactViewHolder(private val binding: ItemTaskBinding) :
        ViewHolder(binding.root) {
        fun bind(contact: String) {
            binding.tvPhone.text = contact

        }
    }

}

