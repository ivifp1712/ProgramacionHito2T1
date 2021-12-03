package com.desarrollo;

public class Hija extends Padre{
	
	public Hija(String texto, int numerico) {
		super(texto, numerico);
	}

	//Se utiliza el concepto de Sobrescritura
	//En la que el metodo de la clase Padre Saludar() se sobrescribe por el metodo de la clase Hija
	@Override
	public void Saludar() {
		System.out.println("Hola, soy la hija");
	}
	
}
