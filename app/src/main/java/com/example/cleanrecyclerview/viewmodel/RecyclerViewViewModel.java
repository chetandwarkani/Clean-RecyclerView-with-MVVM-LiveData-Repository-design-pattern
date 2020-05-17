package com.example.cleanrecyclerview.viewmodel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

import com.example.cleanrecyclerview.dto.FoodItemsDTO;
import com.example.cleanrecyclerview.R;
import com.example.cleanrecyclerview.adapter.RecyclerViewAdapter;
import com.example.cleanrecyclerview.repository.DataRepository;

import java.util.ArrayList;
import java.util.List;

public class RecyclerViewViewModel extends AndroidViewModel {
    //Stores data to be displayed on recycler view
    private List<FoodItemsDTO> foodItemsDTO= new ArrayList<>();
    private RecyclerViewAdapter recyclerViewAdapter=new RecyclerViewAdapter();
    DataRepository dataRepository=new DataRepository();

    public RecyclerViewViewModel(@NonNull Application application) {
        super(application);
        recyclerViewAdapter.setRecyclerViewViewModel(this);
        populateData();
    }

    public List<FoodItemsDTO> getFoodItemsDTO() {
        return foodItemsDTO;
    }

    public void setFoodItemsDTO(List<FoodItemsDTO> foodItemsDTO) {
        this.foodItemsDTO = foodItemsDTO;
    }
    private void populateData()
    {
        foodItemsDTO=dataRepository.populateItems();
        recyclerViewAdapter.notifyDataSetChanged();
    }

    public String getFoodName(Integer position)
    {
        return foodItemsDTO.get(position).getFoodName();
    }
    public Integer getFoodImage(Integer position)
    {
        return foodItemsDTO.get(position).getFoodImage();
    }

    public RecyclerViewAdapter getRecyclerViewAdapter() {
        return recyclerViewAdapter;
    }
}