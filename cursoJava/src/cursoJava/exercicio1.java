package cursoJava;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {

		/*
		 * Fa�a um programa para ler dois valores inteiros, e depois mostrar na tela a
		 * soma desses n�meros com uma mensagem explicativa
		 */

		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int y = sc.nextInt();

		int total = x + y;
		System.out.println("Resultado: " + total);

		sc.close();
		
	}

}
