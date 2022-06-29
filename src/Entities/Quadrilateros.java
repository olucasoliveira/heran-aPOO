package Entities;

import java.util.Objects;

public abstract class Quadrilateros {
	
	private static String  Quadrilatero = "Todo quadrilátero possui 4 lados";
	private static String  Autor = "Lucas de Oliveira - SP3082741";
	private double Lado1;
	private double Lado2;
	private double Base1;
	private double Base2;
	private double Altura;
	protected double Perimetro;
	protected double Area;
	

	public static String getQuadrilatero() {
		return Quadrilatero;
	}

	public static String getAutor() {
		return Autor;
	}

	public double getLado1() {
		return Lado1;
	}

	public void setLado1(double lado1) {
		Lado1 = lado1;
	}

	public double getLado2() {
		return Lado2;
	}

	public void setLado2(double lado2) {
		Lado2 = lado2;
	}

	public double getBase1() {
		return Base1;
	}

	public void setBase1(double base1) {
		Base1 = base1;
	}

	public double getBase2() {
		return Base2;
	}

	public void setBase2(double base2) {
		Base2 = base2;
	}
	

	public double getAltura() {
		return Altura;
	}
	

	public void setAltura(double altura) {
		Altura = altura;
	}
	
	public double getArea() {
		return Area;
	}

	public void setArea(double area) {
		Area = area;
	}

	public double getPerimetro() {
		return Perimetro;
	}
	
	public abstract double calcularPerimetro();
	public abstract double calcularArea();
	public abstract String toString();

	@Override
	public int hashCode() {
		return Objects.hash(Altura, Base1, Base2, Lado1, Lado2);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Quadrilateros other = (Quadrilateros) obj;
		return Double.doubleToLongBits(Altura) == Double.doubleToLongBits(other.Altura)
				&& Double.doubleToLongBits(Base1) == Double.doubleToLongBits(other.Base1)
				&& Double.doubleToLongBits(Base2) == Double.doubleToLongBits(other.Base2)
				&& Double.doubleToLongBits(Lado1) == Double.doubleToLongBits(other.Lado1)
				&& Double.doubleToLongBits(Lado2) == Double.doubleToLongBits(other.Lado2);
	}
	
	
	
	
	
	
	
	
}
