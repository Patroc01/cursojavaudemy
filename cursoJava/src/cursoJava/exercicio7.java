package cursoJava;
import java.util.Scanner;

public class exercicio7 {

	public static void main(String[] args) {
		
		/*
		 * Fazer um programa para ler um n�mero inteiro,
		 * e depois dizer se este n�mero � negativo ou n�o
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int numero;
		
		numero = sc.nextInt();
		
		if (numero < 0) {
			System.out.println("NEGATIVO");
		}
		else {
			System.out.println("N�O NEGATIVO");
		}
		
		sc.close();
	}

}
