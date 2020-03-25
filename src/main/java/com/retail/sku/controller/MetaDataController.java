package com.retail.sku.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.retail.sku.service.MetadataService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/v1")
public class MetaDataController {
	
	@Autowired
	MetadataService metadataService;
	
	@GetMapping("/location")
	public List<String> getAllLocations() {

		return metadataService.getAllLocations();
	}
	@PostMapping("/location/{location_id}/department")
	public List<String> getAllDeptsUnderLocation( @PathVariable("location_id") String locationId) {

		return metadataService.getAllDeptsUnderLocation(locationId);
	}

	@PostMapping("/location/{location_id}/department/{department_id}/category")
	public List<String> getFilteredCategories(@PathVariable("location_id") String locationId,
			@PathVariable("department_id") String departmentId) {

		return metadataService.getFilteredCategories(locationId, departmentId);
	}
	@PostMapping("/location/{location_id}/department/{department_id}/category/{category_id}/subcategory")
	public List<String> getFilteredSubCategories(@PathVariable("location_id") String locationId,
			@PathVariable("department_id") String departmentId,
			@PathVariable("category_id") String categoryId) {

		return metadataService.getFilteredSubCategories(locationId, departmentId, categoryId);
	}
//	@GetMapping("/location/{location_id}/department/{department_id}/category/{category_id}/subcategory/{subcategory_id}")
//	public String getFilteredSubCategory(@PathVariable("location_id") String locationId,
//			@PathVariable("department_id") String departmentId,
//			@PathVariable("category_id") String categoryId,
//			@PathVariable("subcategory_id") String subCategoryId) {
//
//		return null;
//	}

}
