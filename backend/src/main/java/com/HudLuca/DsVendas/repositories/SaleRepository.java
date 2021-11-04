package com.HudLuca.DsVendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.HudLuca.DsVendas.entitites.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {
		
}
