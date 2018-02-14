package br.com.casadocodigo.models;

import java.math.BigDecimal;

public class Livro {
	
	private String titulo;
	private String descricao;
	private BigDecimal valor;
	private Integer numeroDePaginas;
	
	@Override
	public String toString() {
		return "Livro [titulo=" + titulo + ", descricao=" + descricao + ", valor=" + valor + ", numeroDePaginas="
				+ numeroDePaginas + "]";
	}

	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public BigDecimal getValor() {
		return valor;
	}
	
	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
	
	public Integer getNumeroDePaginas() {
		return numeroDePaginas;
	}
	 
	public void setNumeroDePaginas(Integer numeroDePaginas) {
		this.numeroDePaginas = numeroDePaginas;
	}

}
