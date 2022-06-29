package Entities;

public class Quadrado extends Quadrilateros {

	@Override
	public double calcularPerimetro() {
		this.Perimetro = (this.getLado1() * 4);
		System.out.println("\nCalculando perimetro do Quadrado...");
		return 0;
	}
	
	public double calcularArea() {
		this.Area = (this.getLado1()*this.getLado1());
		System.out.println("Calculando area do Quadrado...");
		return 0;
	}
	
	public static void teoria() {
		System.out.println("\n\nQuadrado é uma figura plana que tem 4 lados,\n"
				        + "todos com a mesma medida. Ele é bastante comum\n"
				        + "no cotidiano, sendo presente, por exemplo, no\n"
				        + "formato de algumas paredes. O quadrado é um polígono\n"
				        + "de 4 lados.\n");
	}

	@Override
	public String toString() {
		return "\nLado     : " +getLado1()+
			   "\nPerimetro: " +getPerimetro()+
			   "\nArea     : " +getArea();
	} 
	
	
	
}
