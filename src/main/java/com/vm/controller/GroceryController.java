package com.vm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.vm.model.GroceryItems;
import com.vm.service.GroceryService;

@RestController
@RequestMapping("/grocery")
public class GroceryController {
	
	@Autowired
	private GroceryService groceryService;
	
	@RequestMapping(value="/all-items" , method=RequestMethod.GET)
	private List<GroceryItems> getAllGroceryItems() {
		return  groceryService.getAllGroceryItems();
	}

}
