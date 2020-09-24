package com.kk.nytimesapp.view.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.kk.nytimesapp.R
import com.kk.nytimesapp.databinding.ItemCellBinding
import com.kk.nytimesapp.model.Result
import com.kk.nytimesapp.viewModel.NewsViewModel

class NewsAdapter : RecyclerView.Adapter<NewsAdapter.ViewHolder>() {
    private var resultList = ArrayList<Result>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding: ItemCellBinding = DataBindingUtil.inflate(LayoutInflater.from(parent.context), R.layout.item_cell, parent, false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return resultList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(resultList[position])
    }

    fun updateResultList(results: List<Result>) {
        resultList.addAll(results)
        notifyDataSetChanged()
    }

    class ViewHolder(val binding: ItemCellBinding) : RecyclerView.ViewHolder(binding.root) {
        private val viewModel = NewsViewModel()

        fun bind(result: Result) {
            viewModel.bind(result)
            binding.viewModel = viewModel
        }


    }

}