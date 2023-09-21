package com.srk.teste.model;

public class Produto {
	public Produto(int id, String descricao, int preco) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.preco = preco;
	}
	private int id;
	private String descricao;
	private int preco;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getPreco() {
		return preco;
	}
	public void setPreco(int preco) {
		this.preco = preco;
	}
	@Override
	public String toString() {
		return "Produto [id=" + id + ", descricao=" + descricao + ", preco=" + preco + "]";
	}

}
