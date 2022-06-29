package Entities;

public class Trapézio extends Quadrilateros{
	

	@Override
	public double calcularPerimetro() {
		this.Perimetro = (this.getLado1() + this.getLado2() + this.getBase1() + this.getBase2());
		System.out.println("\nCalculando perimetro do Trapézio...");
		return 0;
	}

	public double calcularArea() {
		this.Area = ((this.getBase1()+ this.getBase2()) * this.getAltura())/ 2;
		System.out.println("Calculando area do Trapézio...");
		return 0;
	}
	
	public static void teoria() {
		System.out.println("\n\nTrapézios são quadriláteros que possuem\n"
				         + "um par de lados opostos paralelos. Suas\n"
				         + "propriedades específicas envolvem seus\n"
				         + "ângulos e diagonais. Os trapézios são\n"
				         + "quadriláteros que possuem um par de lados\n"
				         + "opostos paralelos.");
	}

	@Override
	public String toString() {
		return "\nBase Maior: " +getBase1()+
			   "\nBase Menor: " +getBase2()+
			   "\nAltura    : " +getAltura()+
			   "\nPerimetro : " +getPerimetro()+
			   "\nArea      : " +getArea();
	}
}
