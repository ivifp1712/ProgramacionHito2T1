package com.desarrollo;
// Al introducir el parámetro abstract, la clase Padre no puede ser inicializada
public abstract class Padre {
	private String texto; 
	private float numerico;
	
	public Padre(String texto, float numerico) {
		super();
		this.texto = texto;
		this.numerico = numerico;
	}
	public void Saludar() {
		System.out.println("Hola, soy el padre");
	}
	public String getTexto() {
		return this.texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	public float getNumerico() {
		return this.numerico;
	}
	public void setNumerico(float numerico) {
		this.numerico = numerico;
	}
	
	
	
}
