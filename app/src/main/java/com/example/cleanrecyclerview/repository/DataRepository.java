package com.example.cleanrecyclerview.repository;

import com.example.cleanrecyclerview.R;
import com.example.cleanrecyclerview.dto.FoodItemsDTO;

import java.util.ArrayList;
import java.util.List;

 public class DataRepository {
    public DataRepository(){

    }
    public List<FoodItemsDTO> populateItems()
    {
        List<FoodItemsDTO> foodItemsDTO= new ArrayList<>();;
        //here you can make an API call for populating. If you are doing API call then return observables and observe them in the fragments accordingly.
        foodItemsDTO.add(new FoodItemsDTO(R.drawable.sandwich,"Sandwich"));
        foodItemsDTO.add(new FoodItemsDTO(R.drawable.pizza,"Pizza"));
        foodItemsDTO.add(new FoodItemsDTO(R.drawable.burger,"Burger"));
        return foodItemsDTO;
    }
}
