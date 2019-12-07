package com.vm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vm.model.GroceryItems;
import com.vm.repository.GroceryRepository;
import com.vm.service.GroceryService;
@Service
public class GroceryServiceImpl implements GroceryService {
	
	@Autowired
	private GroceryRepository groceryRepo;
	
	

	@Override
	public List<GroceryItems> getAllGroceryItems() {
		return groceryRepo.findAll();
	}

}
