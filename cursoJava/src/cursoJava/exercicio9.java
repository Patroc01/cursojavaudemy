package cursoJava;
import java.util.Scanner;

public class exercicio9 {

	public static void main(String[] args) {
		
		/*
		 * Leia 2 valores inteiros (A e B). Ap�s, o programa deve mostrar 
		 * uma mensagem "Sao Multiplos" ou "Nao sao Multiplos", 
		 * indicando se os valores lidos s�o m�ltiplos entre si. 
		 * Aten��o: os n�meros devem poder ser digitados em ordem crescente ou decrescente.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int a, b;
		
		a = sc.nextInt();
		b = sc.nextInt();
		
		if (a % b == 0) {
			System.out.println("S�o multiplos");
		}
		else if (b % a == 0){
			System.out.println("S�o multiplos"); // eu poderia usar o || ao inv�s do else if
		}
		
		else {
			System.out.println("N�o s�o multiplos");
		}

		sc.close();
		
	}

}
