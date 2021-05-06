package com.dev.superior.dsvendas.dto;

import java.io.Serializable;

import com.dev.superior.dsvendas.entities.Seller;

//Boa pratica para garantior que o objeto sera convertido para bite
public class SellerDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String name;
	
	public SellerDTO(Long id, String name) {
		this.setId(id);
		this.setName(name);
	}
	
	public SellerDTO() {
	}
	
	//Rerebe uma entidade no DTO
	public SellerDTO(Seller entity) {
		id = entity.getId();
		name = entity.getName();
	}
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
