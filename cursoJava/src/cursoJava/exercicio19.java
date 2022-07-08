package cursoJava;

import java.util.Scanner;
import java.util.Locale;

public class exercicio19 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int primeiro, segundo;
		
		for (int y = 0; y < x; y++) {
			
			primeiro = sc.nextInt();
			segundo = sc.nextInt();
			
			if (segundo == 0) {
				System.out.println("divisão impossivel");
			}
			else {
				double resultado = (double) primeiro / segundo;
				System.out.printf("%.1f%n", resultado);
			}
		}
		
		sc.close();
	}

}
