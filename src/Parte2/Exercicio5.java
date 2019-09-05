package Parte2;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int cod = sc.nextInt();
		int quant = sc.nextInt();
		double total;
		
		if (cod == 1) {
			total = 4.00 * quant;
		}
		else if (cod == 2) {
			total = 4.50 * quant;
		}
		else if (cod == 3) {
			total = 5.00 * quant;
		}
		else if (cod == 4) {
			total = 2.00 * quant;
		}
		else {
			total = 1.50 * quant;
		}
		
		System.out.printf("Total: R$ %.2f%n", total);
		
		sc.close();
	}

}
