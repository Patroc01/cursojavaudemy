package cursoJava;

import java.util.Scanner;
import java.util.Locale;

public class exercicio4 {

	public static void main(String[] args) {
		/*
		 * Fazer um programa que leia o n�mero de um funcion�rio, seu n�mero de horas
		 *  trabalhadas, o valor que recebe por hora e calcula o sal�rio desse
		 *  funcion�rio. A seguir, mostre o n�mero e o sal�rio do funcion�rio, 
		 *  com duas casas decimais.
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int funcionario;
		int horastrabalhadas;
		double valorhora;
		
		funcionario = sc.nextInt();
		horastrabalhadas = sc.nextInt();
		valorhora = sc.nextDouble();
		
		double salario = horastrabalhadas * valorhora;
		
		
		System.out.println("Number = " + funcionario);
		System.out.printf("Salary = U$ %.2f%n", salario);
		
		sc.close();
		
	}

}
