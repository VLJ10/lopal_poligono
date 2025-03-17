package br.senai.sp.jandira.poligonos.dao;

import java.util.Scanner;

import br.senai.sp.jandira.poligonos.model.Retangulo;


public class RetanguloDao {
	public static void criar() {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Criando Retangulo");
		
		Retangulo retangulo = new Retangulo();
		
		System.out.print("Digite o valor da base: ");
		retangulo.setBase(leitor.nextDouble());
		
		System.out.print("Digite o valor da altura: ");
		retangulo.setAltura(leitor.nextDouble());
		retangulo.exibirDados();
		
	}
}
