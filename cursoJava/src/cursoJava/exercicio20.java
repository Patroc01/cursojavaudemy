package cursoJava;

import java.util.Locale;
import java.util.Scanner;

public class exercicio20 {

	public static void main(String[] args) {
		// faça um programa para converter a temperatura de Celsius para Fahrenheit

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		char resp;
		do {
			System.out.print("digite a temperatura em Celsius: ");
			double celsius = sc.nextDouble();
			double F = celsius * 1.8 + 32;
			System.out.println("A temperatura em Fahrenheit é de: " + F);
			System.out.println("Deseja repetir? s/n ");
			resp = sc.next().charAt(0);
		} while (resp != 'n');
		sc.close();
	}
}
