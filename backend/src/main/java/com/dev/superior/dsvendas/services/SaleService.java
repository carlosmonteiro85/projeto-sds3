package com.dev.superior.dsvendas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.superior.dsvendas.entities.Sale;
import com.dev.superior.dsvendas.repositories.SaleRepository;


//Registrando como componente do Sistema
@Service
public class SaleService {
	
	@Autowired
	private SaleRepository repository;
	
	public List<Sale> findAll (){
		return repository.findAll();
	}
}
