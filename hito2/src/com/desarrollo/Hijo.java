package com.desarrollo;

public class Hijo extends Padre{

	public Hijo(String texto, float numerico) {
		super(texto, numerico);
	}
	
	public void Saludar() {
		System.out.println("Hola soy el hijo y yo me llamo " + texto);
	}
	
	
}
