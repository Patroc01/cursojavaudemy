package cursoJava;
import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {

		/*
		 * Fa�a um programa para ler o valor do raio de um c�rculo, e depois mostrar o
		 * valor da �rea deste c�rculo com quatro casas decimais conforme exemplos.
		 * F�rmula da �rea: area = pi . raio2 Considere o valor de pi = 3.14159
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
