package cursoJava;

import java.util.Scanner;

public class exercicio17 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int in = 0;
		int out = 0;
		
		for (int x = 0; x < n; x++) {
			
			int y = sc.nextInt();
			if (y >= 10 && y <= 20) {
				in = in+1;
			}
			else {
				out = out +1;
			}
				}
		
		System.out.println(in + " in");
		System.out.println(out + " out");
		sc.close();
			}
			
		}
