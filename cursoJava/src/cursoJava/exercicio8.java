package cursoJava;
import java.util.Scanner;

public class exercicio8 {

	public static void main(String[] args) {
		
		/*
		 * Fazer um programa para ler um n�mero inteiro e dizer se 
		 * este n�mero � par ou �mpar.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int numero = sc.nextInt();
		
		if (numero % 2 == 0) {
			System.out.println("Par");
		}
		else {
			System.out.println("Impar");
		}
	
		sc.close();
		
	}

}
