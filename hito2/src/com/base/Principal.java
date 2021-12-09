package com.base;

import com.desarrollo.Hija;
import com.desarrollo.Hijo;
import com.desarrollo.Padre;
import com.desarrollo.Trabajador;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		
		
		Trabajador trabajador1 = new Trabajador("NombreComun", "CiudadComun", 2000, true);
		
		
		System.out.println("Cuestion 1: ");
		
		//Con setters cambiamos los atributos del objeto
		trabajador1.setNombre("Juan");
		trabajador1.setCiudad("Madrid");
		//Con getters obtenemos los valores de los atributos
		System.out.println("Nombre: " + trabajador1.getNombre());
		System.out.println("Ciudad: " + trabajador1.getCiudad());
		System.out.println("Salario Bruto: " + trabajador1.getSalarioBruto());
		System.out.println("Contrato temporal : " + trabajador1.isContratoTemporal());

		// Ficha del trabajador 
		System.out.println("Ficha del trabajador: " + trabajador1.toString());
		
		System.out.println("Cuestion 2: ");
		
		Hijo hijo = new Hijo("Antonio", 10);
		
		hijo.Saludar();
		System.out.println("Esto es posible gracias a la herencia");
		System.out.println("Ya que no se define el metodo Saludar sino que viene heredado de la clase Padre");
		
		
		// Entrada por consola del nombre de la hija
		
		System.out.println("Introduce por consola el nombre de la Hija: ");
		Scanner lectura = new Scanner (System.in);
		String nombre = lectura.next();
		Hija hija = new Hija(nombre , 10);
		hija.Saludar();
		
		System.out.println("Cuestion 3: ");
		
		Padre[] lista= {hija, hijo};
		lista[0].Saludar();
		lista[1].Saludar();
		// Esto es un polimorfismo basado en herencia
		// Los dos objetos son de clases hijas heredadas de una clase padre comun
		// 
		
		
	}

}
