package com.retail.sku.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.retail.sku.entities.Metadata;

@Repository
public interface MetadataRepository extends JpaRepository<Metadata, Metadata> {

	@Query("SELECT DISTINCT location FROM Metadata")
	List<String> fetchAllDitinctLocations();

	@Query("SELECT DISTINCT department FROM Metadata WHERE location =:location")
	List<String> fetchAllDeptsByLocation(@Param("location")String location);

	@Query("SELECT DISTINCT category FROM Metadata WHERE location =:location AND department =:department")
	List<String> fetchAllCategoriesBylocationAndDept(@Param("location")String location, @Param("department")String department);

	@Query("SELECT subCategory FROM Metadata WHERE location =:location AND department =:department AND category =:category")
	List<String> fetchAllSubCategoriesByLocationAndDeptAndCategory(@Param("location")String location, @Param("department")String department, @Param("category")String category);
	
	

}
