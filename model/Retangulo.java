package br.senai.sp.jandira.poligonos.model;

public class Retangulo {
	
	private double base;
	private double altura;
	
	public void setBase(double base) {
		this.base = base;
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double calcularArea() {
		double area = base * altura;
		return area;
	}
	
	public double calcularPerimetro() {
		double perimetro = base * 2 + altura * 2;
		return perimetro;
	}
	
	public void exibirDados() {
		System.out.println("----------------------------");
		System.out.println("DADOS DO RETANGULO");
		System.out.println("Tamanho da base: " + base);
		System.out.println("Tamanho da altura: " + altura);
		System.out.println("Área total: " + calcularArea());
		System.out.println("Perímetro: " + calcularPerimetro());
		System.out.println("----------------------------");
		
	}
}
