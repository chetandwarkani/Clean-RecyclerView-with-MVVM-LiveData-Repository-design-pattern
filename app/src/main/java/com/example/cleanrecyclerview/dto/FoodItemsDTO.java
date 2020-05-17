package com.example.cleanrecyclerview.dto;

import android.graphics.drawable.Drawable;

public class FoodItemsDTO {
    private Integer foodImage;
    private String foodName;

    public FoodItemsDTO(Integer foodImage, String foodName) {
        this.foodImage = foodImage;
        this.foodName = foodName;
    }

    public Integer getFoodImage() {
        return foodImage;
    }

    public void setFoodImage(Integer foodImage) {
        this.foodImage = foodImage;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }
}
