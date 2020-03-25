package com.retail.sku.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.retail.sku.entities.SKUDetails;
import com.retail.sku.models.MetadataDTO;
import com.retail.sku.service.SKUService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/v1")
public class SKUController {

	@Autowired
	SKUService skuService;
	
	@PostMapping("/getSkuDetails")
	public List<SKUDetails> getSKUDetails(
			@RequestBody MetadataDTO filter){
		return skuService.getAllFilteredSKUs(filter);
	}
	
	@PostMapping("/addOrUpdateSkuDetails")
	public String addOrUpdateSKUDetails(
			@RequestBody SKUDetails skuData){
		return skuService.addOrUpdateSKUs(skuData);
	}
	
	@DeleteMapping("/deleteSkuDetails/{skuId}")
	public String deleteSKUDetails(
			@PathVariable Long skuId){
		
		return skuService.deleteSKUData(skuId);
	}
	
	@PostMapping("/getSkuDetailsById/{skuId}")
	public SKUDetails getSKUDetailsById(
			@PathVariable Long skuId){
		
		return skuService.getSKUDataById(skuId);
	}
	
	
}
