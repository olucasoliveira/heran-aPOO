package Application;

import java.util.Locale;

import Entities.Quadrado;
import Entities.Quadrilateros;
import Entities.Retangulo;
import Entities.Trapézio;

public class programTeste {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		System.out.println("Autor: "+ Quadrilateros.getAutor());
		System.out.println(Quadrilateros.getQuadrilatero());
		
		System.out.println("---------------------------------------------");
		System.out.println("Utilizando a clase do Quadrado:");
		
		Quadrado.teoria();
		
		Quadrilateros quadrado  = new Quadrado();
		
		quadrado.setLado1(6);
		
		quadrado.calcularPerimetro();
		quadrado.calcularArea();
		
		System.out.println(quadrado);
		
		System.out.println("---------------------------------------------");
		System.out.println("Utilizando a clase do Trapézio:");
		
		Trapézio.teoria();
		
		Quadrilateros trapezio  = new Trapézio();
		
		trapezio.setBase1(20);
		trapezio.setBase2(12);
		trapezio.setLado1(7);
		trapezio.setLado2(7);
		trapezio.setAltura(6);
		
		trapezio.calcularPerimetro();
		trapezio.calcularArea();
		
		System.out.println(trapezio);

		System.out.println("---------------------------------------------");
		System.out.println("Utilizando a clase do Retangulo:");
		
		Retangulo.teoria();
	
		Quadrilateros retangulo = new Retangulo();
		
		retangulo.setBase1(10);
		retangulo.setAltura(30);
		
		retangulo.calcularPerimetro();
		retangulo.calcularArea();
		
		System.out.println(retangulo);
;		

	}

}
