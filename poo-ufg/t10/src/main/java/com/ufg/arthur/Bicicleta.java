package com.ufg.arthur;

public class Bicicleta {
    private String marca;
    private String modelo;
    private int ano;
    private String categoria;
    
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	public String toString() {
		return "Bicicleta [marca=" + marca + ", categoria=" + categoria + ", ano=" + ano + ", modelo=" + modelo + "]";
	}
    
    
    
}