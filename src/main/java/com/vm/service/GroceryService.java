package com.vm.service;

import java.util.List;

import com.vm.model.GroceryItems;


public interface GroceryService {

	public List<GroceryItems> getAllGroceryItems();

	public GroceryItems saveOrUpdateGroceryItem(GroceryItems request);

	


}
