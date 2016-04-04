package com.cafe.mybatis.domain;

public class IngredientData {

	private Integer indredientID;
	private Integer restaurantID;
	private String name;
	
	public Integer getIndredientID() {
		return indredientID;
	}
	public void setIndredientID(Integer indredientID) {
		this.indredientID = indredientID;
	}
	public Integer getRestaurantID() {
		return restaurantID;
	}
	public void setRestaurantID(Integer restaurantID) {
		this.restaurantID = restaurantID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
