package com.desarrollo;

public class Trabajador {
	private String nombre;
	private String ciudad;
	private int salarioBruto;
	private boolean contratoTemporal;
	
	
	
	public Trabajador(String nombre, String ciudad, int salarioBruto, boolean contratoTemporal) {
		super();
		this.nombre = nombre;
		this.ciudad = ciudad;
		this.salarioBruto = salarioBruto;
		this.contratoTemporal = contratoTemporal;
	}


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public int getSalarioBruto() {
		return salarioBruto;
	}

	public void setSalarioBruto(int salarioBruto) {
		this.salarioBruto = salarioBruto;
	}

	public boolean isContratoTemporal() {
		return contratoTemporal;
	}

	public void setContratoTemporal(boolean contratoTemporal) {
		this.contratoTemporal = contratoTemporal;
	}
	
	
	@Override
	public String toString() {
		return "El Trabajador " + nombre + " que vive en " + ciudad + ", tiene un salario bruto de " + salarioBruto
				+ " y un contrato Temporal =" + contratoTemporal ;
	}


}
