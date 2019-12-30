package com.vm.service.impl;

import java.util.List;
import java.util.Optional;

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
	@Override
	public GroceryItems saveOrUpdateGroceryItem(GroceryItems request) {
		Optional<GroceryItems> grocery = groceryRepo.findById(request.getGroceryId());
        if(grocery.isPresent()) 
        {
            GroceryItems newEntity = grocery.get();
            newEntity.setItemName(request.getItemName());
            newEntity.setFoodGroup(request.getFoodGroup());
            newEntity.setFoodSubGroup(request.getFoodSubGroup());
            newEntity = groceryRepo.save(newEntity);
             
            return newEntity;
        } else {
        	request = groceryRepo.save(request);
            return request;
        }
	}
	

}
