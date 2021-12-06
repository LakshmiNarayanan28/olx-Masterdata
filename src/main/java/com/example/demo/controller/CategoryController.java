package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.CatagoryStatus;
import com.example.demo.model.Category;
import com.example.demo.service.CategoryService;

@RestController
public class CategoryController {

	@Autowired 
	CategoryService categoryService;
	
	@PostMapping(value="/category")
	public Category register(@RequestBody Category category) {
		return categoryService.registerUser(category);
	}
	
	@GetMapping(value="/category")
	public List<Category> getAllCategory(){
		return categoryService.getAllCategory();
	}
	
	@GetMapping(value="/categoryStatus")
	public List<CatagoryStatus> getAllCategoryStatus(){
		return categoryService.getAllCategoryStatus();
	}
}
