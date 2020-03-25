package com.retail.sku.service;

import java.util.List;

public interface MetadataService {

	public List<String> getAllLocations();
	
	public List<String> getAllDeptsUnderLocation(String locationId);
	
	public List<String> getFilteredCategories(String locationId,String departmentId);
	
	public List<String> getFilteredSubCategories(String locationId,String departmentId,String categoryId);
	
//	public String getFilteredSubCategory(String locationId,String departmentId,String categoryId,String subCategoryId);
}
