package cursoJava;
import java.util.Scanner;
import java.util.Locale;

public class exercicio18 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
				
		int x = sc.nextInt();
		
		for (int y = 0; y < x; y++) {
			
			double nota1 = sc.nextDouble();
			double nota2 = sc.nextDouble();
			double nota3 = sc.nextDouble();
			
			double media = (nota1 * 2 + nota2 * 3 + nota3 * 5) / 10.0;
			
			System.out.printf("%.1f%n", media);
		}
		
		sc.close();

	}

}
