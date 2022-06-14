package com.farmaciagen.farmacia.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity

@Table(name = "tb_produto")

public class Produto 
{
 @Id
 
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 public Long id;
 
 @NotNull
 private String nome;
 private String marca;
 private Long preco;
 private int qtd;
 private String sessao;
 
 @ManyToOne
 @JsonIgnoreProperties("produto")
 private Categoria categoria;

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public String getMarca() {
	return marca;
}

public void setMarca(String marca) {
	this.marca = marca;
}

public Long getPreco() {
	return preco;
}

public void setPreco(Long preco) {
	this.preco = preco;
}

public int getQtd() {
	return qtd;
}

public void setQtd(int qtd) {
	this.qtd = qtd;
}

public String getSessao() {
	return sessao;
}

public void setSessao(String sessao) {
	this.sessao = sessao;
}

public Categoria getCategoria() {
	return categoria;
}

public void setCategoria(Categoria categoria) {
	this.categoria = categoria;
}
	
}
