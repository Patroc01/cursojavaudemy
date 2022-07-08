package cursoJava;

import java.util.Scanner;

public class exercicio15 {

	public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in);
		
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		
		int entrada = sc.nextInt();
		
		while (entrada != 4) {
			if (entrada == 1) {
				alcool = alcool + 1;
			}
			else if (entrada == 2) {
				gasolina = gasolina + 1;
			}
			else if (entrada == 3) {
				diesel = diesel + 1;
			}
				entrada = sc.nextInt();			
				}
		
		System.out.println("Muito Obrigado");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel:" + diesel);
		
		sc.close();
		
	}
	}
	
	