package com.base;

import com.desarrollo.Hija;
import com.desarrollo.Hijo;
import com.desarrollo.Padre;
import com.desarrollo.Trabajador;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Trabajador trabajador1 = new Trabajador("Juan", "Madrid", 2000, true);
		System.out.println("Cuestion 1: ");
		System.out.println(trabajador1.toString());
		System.out.println("Cuestion 2: ");
		Hija hija = new Hija("Pepe", 10);
		hija.Saludar();
		System.out.println("Cuestion 3: ");
		Hijo hijo = new Hijo("Antonio", 10);
		Padre[] lista= {hija, hijo};
		lista[0].Saludar();
		lista[1].Saludar();
		// Esto es un polimorfismo basado en herencia
		// Los dos objetos son de clases hijas heredadas de una clase padre comun
		// Pero la diferencia es que cada clase hija tiene su metodo especifico de su clase
	}

}
