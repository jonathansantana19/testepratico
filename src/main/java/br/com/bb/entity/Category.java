package br.com.bb.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CATEGORIA")
public class Category {
//todo
	
	 @Id
	 @GeneratedValue(strategy= GenerationType.IDENTITY)
	 private Long id;
	 
	 @Column(name="DESCRICAO")
	 private String name;
	 
	 @Column(name="ATIVO")
	 private boolean ativo;
	 
	 public Category() {
		 
	 }
	 

	public Category(Long id, String name, boolean ativo) {
		super();
		this.id = id;
		this.name = name;
		this.ativo = ativo;
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

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	 
}
