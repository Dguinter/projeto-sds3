package com.devesuperior.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devesuperior.dsvendas.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long> {

}
