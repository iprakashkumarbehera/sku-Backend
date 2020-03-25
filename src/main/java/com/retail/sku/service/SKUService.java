package com.retail.sku.service;

import java.util.List;

import com.retail.sku.entities.SKUDetails;
import com.retail.sku.models.MetadataDTO;

public interface SKUService {

	public List<SKUDetails> getAllFilteredSKUs(MetadataDTO filter);

	public String addOrUpdateSKUs(SKUDetails skuData);

	public String deleteSKUData(Long skuId);

	public SKUDetails getSKUDataById(Long skuId);
	
}
