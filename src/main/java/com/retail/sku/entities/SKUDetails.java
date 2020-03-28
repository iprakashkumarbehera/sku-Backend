package com.retail.sku.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "sku_data")
public class SKUDetails implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
//
//	public SKUDetails() {
//	}
//
//	public SKUDetails(Long skuId, String skuDetails, String location, String department, String category,
//			String subCategory) {
//		this.skuId = skuId;
//		this.skuDetails = skuDetails;
//		this.location = location;
//		this.department = department;
//		this.category = category;
//		this.subCategory = subCategory;
//	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "SKU")
	private Long skuId;
	
	@Column( name = "NAME")
	private String skuDetails;
	
	@Column(name = "Location")
	private String location;
	
	@Column(name = "department")
	private String department;
	
	@Column(name = "category")
	private String category ;
	
	@Column(name = "subcategory")
	private String subCategory ;

	public Long getSkuId() {
		return skuId;
	}

	public void setSkuId(Long skuId) {
		this.skuId = skuId;
	}

	public String getSkuDetails() {
		return skuDetails;
	}

	public void setSkuDetails(String skuDetails) {
		this.skuDetails = skuDetails;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getSubCategory() {
		return subCategory;
	}

	public void setSubCategory(String subCategory) {
		this.subCategory = subCategory;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "SKUDetails [skuId=" + skuId + ", skuDetails=" + skuDetails + ", location=" + location + ", department="
				+ department + ", category=" + category + ", subCategory=" + subCategory + "]";
	}

	
	
	
}
