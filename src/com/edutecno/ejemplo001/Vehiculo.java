package com.edutecno.ejemplo001;

public abstract class Vehiculo {
	private String marca;

	public Vehiculo(String marca) {
		super();
		this.marca = marca;
	}
	
	public abstract void acelerar();

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

}
