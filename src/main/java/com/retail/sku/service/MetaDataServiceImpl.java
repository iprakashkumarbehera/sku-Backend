package com.retail.sku.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.retail.sku.repository.MetadataRepository;

@Service
public class MetaDataServiceImpl implements MetadataService {

	@Autowired
	MetadataRepository metadataRepository;
	
	@Override
	public List<String> getAllLocations() {
		return metadataRepository.fetchAllDitinctLocations();
	}

	@Override
	public List<String> getAllDeptsUnderLocation(String location) {
		return metadataRepository.fetchAllDeptsByLocation(location);
	}

	@Override
	public List<String> getFilteredCategories(String location, String department) {
		
		return metadataRepository.fetchAllCategoriesBylocationAndDept(location, department);
	}

	@Override
	public List<String> getFilteredSubCategories(String location, String department, String category) {
		return metadataRepository.fetchAllSubCategoriesByLocationAndDeptAndCategory(location,department,category);
	}

//	@Override
//	public String getFilteredSubCategory(String locationId, String departmentId, String categoryId,
//			String subCategoryId) {
//		return metadataRepository.fetchSubCategoryByLocationAndDeptAndCategory()
//	}

}
