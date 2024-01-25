package com.capstone.realestate.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping; // Added import
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.capstone.realestate.models.PropertyDetails;
import com.capstone.realestate.repositories.PropertyRepository;

@CrossOrigin(origins = "*")
@RestController
public class PropertyController {
	
	@Autowired
	private PropertyRepository repository;
	
	@GetMapping("/getdata")
	public List<PropertyDetails> getProperties() {
		return repository.findAll();
	}
	
	@GetMapping("/getdata/{id}")
	public Optional<PropertyDetails> findById(@PathVariable String id) {
		return repository.findById(id);
	}
	
	@PostMapping("/postdata")
	public String saveProperty(@RequestBody PropertyDetails propertyInformation) {
		repository.save(propertyInformation);
		return "Added property with ID: " + propertyInformation.getId();
	}
	
	@GetMapping("/getFilteredData")
	public List<PropertyDetails> getFilteredData(@RequestParam String category, @RequestParam int area, @RequestParam int minPrice, @RequestParam int maxPrice) {
	    return repository.findFilteredData(category, area, minPrice, maxPrice);
	}
	
	@DeleteMapping("/delete/{id}") // Added delete mapping
	public String deleteProperty(@PathVariable String id) {
		repository.deleteById(id);
		return "Deleted property with ID: " + id;
	}
}