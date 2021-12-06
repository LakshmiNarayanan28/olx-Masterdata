package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.CatagoryStatus;
import com.example.demo.model.Category;
import com.example.demo.repository.CategoryRepository;
import com.example.demo.repository.CategoryStatusRepository;

@Service
public class CategoryService {

	@Autowired
	CategoryRepository categoryRepository;
	@Autowired
	CategoryStatusRepository categoryStatusRepository;
	
	public Category registerUser(Category user) {
		return categoryRepository.save(user);
	}

	public List<Category> getAllCategory() {
		return categoryRepository.findAll();
	}

	public List<CatagoryStatus> getAllCategoryStatus() {
		return categoryStatusRepository.findAll();
	}
	
	
}
