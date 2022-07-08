package cursoJava;

import java.util.Scanner;

public class exercicio16 {

	public static void main(String[] args) {

		/*
		 * Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares 
		 * de 1 até X, um valor por linha, inclusive o X, se for o caso.
		 */

		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
	
		for (int y = 1; y <= x; y++) {
			
			if (y % 2 != 0) {
				System.out.println(y);
			}
			
		}
		
		sc.close();
		
	}

}
