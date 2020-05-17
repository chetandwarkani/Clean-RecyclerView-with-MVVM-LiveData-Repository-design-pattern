package com.example.cleanrecyclerview.ui;

import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.cleanrecyclerview.R;
import com.example.cleanrecyclerview.databinding.RecyclerViewFragmentBinding;
import com.example.cleanrecyclerview.viewmodel.RecyclerViewViewModel;

public class RecyclerViewFragment extends Fragment {

    private RecyclerViewViewModel recyclerViewViewModel;

    private RecyclerViewFragmentBinding binding;

    public static RecyclerViewFragment newInstance() {
        return new RecyclerViewFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        binding= DataBindingUtil.inflate(inflater, R.layout.recycler_view_fragment, container, false);
        binding.setLifecycleOwner(this);
        return binding.getRoot();
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        recyclerViewViewModel = ViewModelProviders.of(getActivity()).get(RecyclerViewViewModel.class);
        binding.setRecyclerViewModel(recyclerViewViewModel);
    }

}
