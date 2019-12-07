package com.vm.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "food_items")
public class GroceryItems {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int groceryId;
	@Column(name = "food_name")
	private String itemName;
	@Column(name = "food_group")
	private String foodGroup;
	@Column(name = "food_subgroup")
	private String foodSubGroup;

	public int getGroceryId() {
		return groceryId;
	}

	public void setGroceryId(int groceryId) {
		this.groceryId = groceryId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getFoodGroup() {
		return foodGroup;
	}

	public void setFoodGroup(String foodGroup) {
		this.foodGroup = foodGroup;
	}

	public String getFoodSubGroup() {
		return foodSubGroup;
	}

	public void setFoodSubGroup(String foodSubGroup) {
		this.foodSubGroup = foodSubGroup;
	}

}
