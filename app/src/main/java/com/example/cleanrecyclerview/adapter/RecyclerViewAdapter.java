package com.example.cleanrecyclerview.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cleanrecyclerview.BR;
import com.example.cleanrecyclerview.R;
import com.example.cleanrecyclerview.viewmodel.RecyclerViewViewModel;
import com.example.cleanrecyclerview.databinding.RecyclerViewLayoutBinding;

public class RecyclerViewAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<RecyclerViewAdapter.GenericViewHolder>{
    private RecyclerViewViewModel recyclerViewViewModel;
    public RecyclerViewAdapter() {
    }

    public void setRecyclerViewViewModel(RecyclerViewViewModel recyclerViewViewModel) {
        this.recyclerViewViewModel = recyclerViewViewModel;
    }

    static class GenericViewHolder extends RecyclerView.ViewHolder {
        final RecyclerViewLayoutBinding binding;
        GenericViewHolder(RecyclerViewLayoutBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
        void bind(RecyclerViewViewModel recyclerViewViewModel, Integer position) {
            binding.setVariable(BR.recyclerViewModel, recyclerViewViewModel);
            binding.setVariable(BR.position, position);
            binding.executePendingBindings();
        }
    }

    @NonNull
    @Override
    public GenericViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        RecyclerViewLayoutBinding binding = DataBindingUtil.inflate(layoutInflater, R.layout.recycler_view_layout, parent, false);
        return new GenericViewHolder(binding);
    }


    @Override
    public void onBindViewHolder(@NonNull GenericViewHolder holder, int position) {
        holder.bind(recyclerViewViewModel, position);
    }

    @Override
    public int getItemCount() {
        if (recyclerViewViewModel != null && recyclerViewViewModel.getFoodItemsDTO()!=null && recyclerViewViewModel.getFoodItemsDTO().size()>0) {
            return recyclerViewViewModel.getFoodItemsDTO().size();
        }
        return 0;
    }
}
