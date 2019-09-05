package Parte2;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int hinicial = sc.nextInt();
		int hfinal = sc.nextInt();
		int duracao;
		
		if (hinicial < hfinal) {
			duracao = hfinal - hinicial;
		}
		else {
			duracao = 24 - hinicial + hfinal;	
		}
		
		System.out.println("O JOGO DUROU "+ duracao +" HORA(S)");
		
		sc.close();
	}

}
