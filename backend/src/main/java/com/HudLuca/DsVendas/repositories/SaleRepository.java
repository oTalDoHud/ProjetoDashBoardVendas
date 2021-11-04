package com.HudLuca.DsVendas.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.HudLuca.DsVendas.dto.SaleSuccessDTO;
import com.HudLuca.DsVendas.dto.SaleSumDTO;
import com.HudLuca.DsVendas.entitites.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {
	
	@Query("SELECT new com.HudLuca.DsVendas.dto.SaleSumDTO(obj.seller, SUM(obj.amount) ) "
			+ " FROM Sale AS obj GROUP BY obj.seller")
	List<SaleSumDTO> amountGroupedBySeller();
		
	@Query("SELECT new com.HudLuca.DsVendas.dto.SaleSuccessDTO(obj.seller, SUM(obj.visited), SUM(obj.deals) ) "
			+ " FROM Sale AS obj GROUP BY obj.seller")
	List<SaleSuccessDTO> successGroupedBySeller();
	
}
