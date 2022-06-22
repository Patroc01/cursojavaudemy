package cursoJava;
import java.util.Locale;
import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler o c�digo de uma pe�a 1, o n�mero de pe�as 1,
		 * o valor unit�rio de cada pe�a 1, o c�digo de uma pe�a 2, 
		 * o n�mero de pe�as 2 e o valor unit�rio de cada pe�a 2. 
		 * Calcule e mostre o valor a ser pago.
		 */

	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner (System.in);
		
		int peca1, peca2, num1, num2;
		double valor1, valor2;
		
		peca1 = sc.nextInt();
		num1 = sc.nextInt();
		valor1 = sc.nextDouble();
		
		peca2 = sc.nextInt();
		num2 = sc.nextInt();
		valor2 = sc.nextDouble();
		
		double total = (valor1 * num1) + (valor2 * num2);
		
		System.out.printf("Valor a pagar: R$ %.2f%n", total);
		
		sc.close();
		
	}

}
