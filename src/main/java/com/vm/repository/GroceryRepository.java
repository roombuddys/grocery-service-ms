package com.vm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vm.model.GroceryItems;

public interface GroceryRepository extends JpaRepository<GroceryItems, Integer>{

}
