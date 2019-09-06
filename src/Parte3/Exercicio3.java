package Parte3;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int cod = sc.nextInt();
		int totAlcool = 0;
		int totGasolina = 0;
		int totDiesel = 0;
		
		while (cod != 4) {
			if ( cod == 1) {
				totAlcool = totAlcool + 1;	
			}
			else if (cod == 2){
				totGasolina = totGasolina + 1;
			}
			else if (cod ==3){
				totDiesel = totDiesel + 1;
			}
			
			cod = sc.nextInt();
			
		}
		
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool:"+ totAlcool);
		System.out.println("Gasolina:"+ totGasolina);
		System.out.println("Diesel:"+ totDiesel);
		
		sc.close();
	}

}
