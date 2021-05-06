package com.dev.superior.dsvendas.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dev.superior.dsvendas.dto.SaleDTO;
import com.dev.superior.dsvendas.entities.Sale;
import com.dev.superior.dsvendas.repositories.SaleRepository;
import com.dev.superior.dsvendas.repositories.SellerRepository;


//Registrando como componente do Sistema
@Service
public class SaleService {
	
	@Autowired
	private SaleRepository repository;
	@Autowired
	private SellerRepository sellerRepository;
	
	//Busca paginada
	@Transactional(readOnly = true)
	public Page<SaleDTO> findAll (Pageable pageable){
		/*
		 * Armazenando todos os Sellers em memoria
		 * para evitar varias consultas ao BD
		 * */ 
		sellerRepository.findAll();
		Page<Sale> result = repository.findAll(pageable);
		return result.map(x -> new SaleDTO(x));
	}
	
	
}
