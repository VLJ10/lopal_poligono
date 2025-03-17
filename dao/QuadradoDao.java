package br.senai.sp.jandira.poligonos.dao;

import java.util.Scanner;

import br.senai.sp.jandira.poligonos.model.Quadrado;

public class QuadradoDao {
	
	public static void criar() {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Criando um Quadrado");
		
		Quadrado quadrado = new Quadrado();
		
		System.out.print("Digite a media do lado do quadrado: ");
		
		quadrado.setLado(leitor.nextDouble());
		quadrado.exibirDados();
	}
}
