package Entities;

public class Trap�zio extends Quadrilateros{
	

	@Override
	public double calcularPerimetro() {
		this.Perimetro = (this.getLado1() + this.getLado2() + this.getBase1() + this.getBase2());
		System.out.println("\nCalculando perimetro do Trap�zio...");
		return 0;
	}

	public double calcularArea() {
		this.Area = ((this.getBase1()+ this.getBase2()) * this.getAltura())/ 2;
		System.out.println("Calculando area do Trap�zio...");
		return 0;
	}
	
	public static void teoria() {
		System.out.println("\n\nTrap�zios s�o quadril�teros que possuem\n"
				         + "um par de lados opostos paralelos. Suas\n"
				         + "propriedades espec�ficas envolvem seus\n"
				         + "�ngulos e diagonais. Os trap�zios s�o\n"
				         + "quadril�teros que possuem um par de lados\n"
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
