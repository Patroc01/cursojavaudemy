package cursoJava;
import java.util.Scanner;

public class exercicio10 {

	public static void main(String[] args) {
		
		/*
		 * Leia a hora inicial e a hora final de um jogo. 
		 * A seguir calcule a dura��o do jogo, sabendo que o mesmo pode come�ar 
		 * em um dia e terminar em outro, tendo uma dura��o m�nima de 1 hora e 
		 * m�xima de 24 horas.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int inicio, fim, duracao;
		
		inicio = sc.nextInt();
		fim = sc.nextInt();
		
		if (inicio < fim) {
			duracao = fim - inicio;
			System.out.println("O jogo durou " + duracao + " horas");
		}
		else {
			duracao = 24 - inicio + fim;
			System.out.println("O jogo durou " + duracao + " horas");
		}
		
		//posso colocar, neste caso, apenas um print para todas as situa��es
		
		sc.close();
		
	}

}
