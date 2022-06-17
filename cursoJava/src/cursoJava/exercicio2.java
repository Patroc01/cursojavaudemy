package cursoJava;
import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {

		/*
		 * Faça um programa para ler o valor do raio de um círculo, e depois mostrar o
		 * valor da área deste círculo com quatro casas decimais conforme exemplos.
		 * Fórmula da área: area = pi . raio2 Considere o valor de pi = 3.14159
		 */

		Scanner sc = new Scanner(System.in);
		
		double area, raio, pi;
		
		pi = 3.14159;
		raio = sc.nextDouble();
		
		area = pi * raio * raio;
		
		
		System.out.printf("Resultado : %.4f%n", area);
		
		sc.close();
		
	}

	private static double nextDouble() {
		// TODO Auto-generated method stub
		return 0;
	}

}
