package Parte2;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int number = sc.nextInt();
		
		if (number < 0) {
			System.out.println("NEGATIVO");
		} 
		else {
			System.out.println("NAO NEGATIVO");
		}
		
		sc.close();
	}

}
