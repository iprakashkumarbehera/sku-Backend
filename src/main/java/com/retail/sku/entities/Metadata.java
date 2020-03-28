package com.retail.sku.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "meta_data")
@IdClass(Metadata.class)
public class Metadata implements Serializable{
	
	
//	
//	public Metadata() {
//	}
//
//	public Metadata(String location, String department, String category, String subCategory) {
//		this.location = location;
//		this.department = department;
//		this.category = category;
//		this.subCategory = subCategory;
//	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "Location")
	private String location;
	
	@Id
	@Column(name = "department")
	private String department;
	
	@Id
	@Column(name = "category")
	private String category ;
	
	@Id
	@Column(name = "subcategory")
	private String subCategory ;

}
