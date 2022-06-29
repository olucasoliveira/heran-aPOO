package Entities;

public class Retangulo extends Quadrilateros {

	@Override
	public double calcularPerimetro() {
		this.Perimetro = (getAltura() * 2  + getBase1() * 2 );
		System.out.println("\nCalculando perimetro do Retangulo...");
		return 0;
	}
	
	public double calcularArea() {
		this.Area = (this.getAltura()*this.getBase1());
		System.out.println("Calculando area do Retangulo...");
		return 0;
	}
	
	public static void teoria() {
		System.out.println("\n\nO retângulo é um polígono de quatro lados\n"
				         + "e recebe esse nome por possuir todos os ângulos\n"
				         + "internos retos, ou seja, medindo 90°\n");
	}


	@Override
	public String toString() {
		return     "\nBase     : " +getBase1()+
				   "\nAltura   : " +getAltura()+
				   "\nPerimetro: " +getPerimetro()+
				   "\nArea     : "  +getArea();
	}

}
