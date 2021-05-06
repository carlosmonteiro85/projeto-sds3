package com.devsuperior.dsvendas.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.dsvendas.dto.SellerDTO;
import com.devsuperior.dsvendas.entities.Seller;
import com.devsuperior.dsvendas.repositories.SellerRepository;


//Registrando como componente do Sistema
@Service
public class SellerService {
	
	@Autowired
	private SellerRepository repository;
	
	public List<SellerDTO> findAll (){
		List<Seller> result = repository.findAll();
		
		/*
		 * Converter uma lista de Seller em SellerDTO
		 * lambda significado = para cara X da minha lista original,
		 * crie um novo objeto DTO, depois converter de novo a stream apa list com o collect(Collectors.toList()) 
		 * */
		return result.stream().map(x -> new SellerDTO(x)).collect(Collectors.toList());
	}
}
