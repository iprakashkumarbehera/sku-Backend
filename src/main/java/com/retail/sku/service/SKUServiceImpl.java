package com.retail.sku.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.retail.sku.entities.SKUDetails;
import com.retail.sku.models.MetadataDTO;
import com.retail.sku.repository.SKURepository;

@Service
public class SKUServiceImpl implements SKUService {

	@Autowired
	SKURepository skuRepository;

	@Override
	public List<SKUDetails> getAllFilteredSKUs(MetadataDTO filter) {
		List<SKUDetails> allSKUs = skuRepository.findAll();

		// filter by location
		if (!StringUtils.isEmpty(filter.getLocation())) {
			allSKUs = allSKUs.stream().filter(sku -> sku.getLocation().equalsIgnoreCase(filter.getLocation()))
					.collect(Collectors.toList());
		}

		// filter by department
		if (!StringUtils.isEmpty(filter.getDepartment())) {
			allSKUs = allSKUs.stream().filter(sku -> sku.getDepartment().equals(filter.getDepartment()))
					.collect(Collectors.toList());
		}

		// filter by category
		if (!StringUtils.isEmpty(filter.getCategory())) {
			allSKUs = allSKUs.stream().filter(sku -> sku.getCategory().equals(filter.getCategory()))
					.collect(Collectors.toList());
		}

		// filter by subCategory
		if (!StringUtils.isEmpty(filter.getSubCategory())) {
			allSKUs = allSKUs.stream().filter(sku -> sku.getSubCategory().equals(filter.getSubCategory()))
					.collect(Collectors.toList());
		}

		return allSKUs;
	}

	@Override
	public String addOrUpdateSKUs(SKUDetails skuData) {
		String response ;
		skuRepository.save(skuData);
		if(skuData.getSkuId() != null) {
			response = "{\"message\":\"SKUData Updated Successfully for Id: "+skuData.getSkuId()+"\"}";
		}else {
			response = "{\"message\":\"SKUData added Successfully\"}";
		}
		return response;
	}
	@Override
	public String deleteSKUData(Long skuId) {
		skuRepository.deleteById(skuId);
		return "{\"message\" : \"Successfully deleted SKUData for ID : "+skuId +"\"}";
	}
	
	@Override
	public SKUDetails getSKUDataById(Long skuId) {
		return skuRepository.findById(skuId).get();
	}
}
