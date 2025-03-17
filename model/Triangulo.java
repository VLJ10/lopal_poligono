package br.senai.sp.jandira.poligonos.model;

public class Triangulo {
	
	private double base;
	private double altura;
	
	public void setBase(double base) {
		this.base = base;
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	
	public double calcularArea() {
		double area = (base * altura) / 2;
		return area;
	}
	
	public double calcularPerimetro( ) {
		double perimetro = base * 3;
		return perimetro;
	}
}
