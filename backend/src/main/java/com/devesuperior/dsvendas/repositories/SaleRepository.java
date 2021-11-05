package com.devesuperior.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devesuperior.dsvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

}
