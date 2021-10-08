package main;

import java.util.Scanner;

import controller.MultiplicacaoController;

public class Principal {

	public static void main(String[] args) {
		MultiplicacaoController mController = new MultiplicacaoController();

		Scanner sc = new Scanner(System.in);

		System.out.print("INSIRA O VALOR A SER MULTIPLICADO -> ");

		int fatorA = sc.nextInt();

		System.out.print("\n\nINSIRA O NUMERO DE VEZES A MULTIPLICAR -> ");

		int fatorB = sc.nextInt();
		
		sc.close();
		
		int resultado = mController.multiplicar(fatorA, fatorB);
		
		System.out.println();
		System.out.println(fatorA + " * " + fatorB + " = " + resultado);
		
	}

}
