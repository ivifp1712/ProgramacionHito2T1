package com.desarrollo;
// Al introducir el parámetro abstract, la clase Padre no puede ser inicializada
public abstract class Padre {
	String texto; 
	float numerico;
	
	public Padre(String texto, float numerico) {
		super();
		this.texto = texto;
		this.numerico = numerico;
	}
	public void Saludar() {
		System.out.println("Hola, soy el padre");
	}
	
}
