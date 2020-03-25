package com.retail.sku.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.retail.sku.entities.SKUDetails;

@Repository
public interface SKURepository extends JpaRepository<SKUDetails, Long> {

}
