package br.senai.sp.jandira.poligonos.ui;

import java.util.Scanner;

import br.senai.sp.jandira.poligonos.dao.QuadradoDao;
import br.senai.sp.jandira.poligonos.dao.RetanguloDao;

public class Menu {
	
	public static void criarMenu() {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("-------------------------");
		System.out.println("CALCULADORA DE POLIGÓNOS");
		System.out.println("-------------------------");
		System.out.println("1 - QUADRADO");
		System.out.println("2 - RETÂNGULO");
		System.out.println("3 - TRIÂNGULO");
		System.out.println("4 - TRAPÉZIO");
		System.out.println("5 - CIRCUNFERÊNCIA");
		System.out.println("-------------------------");
		System.out.print("Escolha uma opção (1-5): ");
		
		int opcao = leitor.nextInt();
		
		if (opcao == 1) {
			QuadradoDao.criar();
		} else if (opcao == 2) {
			RetanguloDao.criar();
		} else if (opcao == 3) {
			//chamar TrianguloDao
		} else if (opcao == 4) {
			// Chamar TrapezioDao
		} else if (opcao == 5) {
			//Chamar a CircunferenciaDao
		} else {
			System.out.println("A opção escolhida é inválida. Escolha um número de 1 a 5!");
		}
		
		System.out.println("A opção escolhida foi " + opcao);

	}
}
