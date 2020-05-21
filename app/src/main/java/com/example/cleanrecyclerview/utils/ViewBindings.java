package com.example.cleanrecyclerview.utils;

import android.widget.ImageView;

import androidx.databinding.BindingAdapter;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cleanrecyclerview.R;

public class ViewBindings {
    @BindingAdapter(value = {"setAdapter","gridLayoutManagerValue","vertical"}, requireAll = false )
    public static void bindRecyclerViewAdapter(RecyclerView recyclerView, RecyclerView.Adapter<?> adapter, Integer gridLayoutManagerValue, Boolean isVertical) {
        recyclerView.setHasFixedSize(true);
        if(isVertical!=null && !isVertical)
        {
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(),LinearLayoutManager.HORIZONTAL, false));
        }else if(gridLayoutManagerValue!=null && gridLayoutManagerValue>0)
        {
            recyclerView.setLayoutManager(new GridLayoutManager(recyclerView.getContext(), gridLayoutManagerValue));
        }else
        {
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        }
        recyclerView.setAdapter(adapter);

    }
    @BindingAdapter("android:src")
    public static void setImageResource(ImageView imageView, int resource){
        imageView.setImageResource(resource);
    }
}
