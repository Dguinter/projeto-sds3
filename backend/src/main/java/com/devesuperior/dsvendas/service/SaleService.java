package com.devesuperior.dsvendas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devesuperior.dsvendas.dto.SaleDTO;
import com.devesuperior.dsvendas.entities.Sale;
import com.devesuperior.dsvendas.repositories.SaleRepository;
import com.devesuperior.dsvendas.repositories.SellerRepository;

@Service
public class SaleService {

	@Autowired
	private SaleRepository repository;
	
	@Autowired
	private SellerRepository sellerRepository;
	
	@Transactional(readOnly =true)
	public Page<SaleDTO> findall(Pageable pageable){
		sellerRepository.findAll();
		Page<Sale> result = repository.findAll(pageable);
		return result.map(X -> new SaleDTO(X));
	}
	
}