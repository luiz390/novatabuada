package MULTIPLICACAO;

import java.util.Scanner;

public class Multiplicar {

	public static void main(String[] args) {
		// TABUADA DO NUMERO QUATRO
		
		Scanner sc = new Scanner(System.in);
		
		int x = 1;
		int y = 3;
		int soma;
		while(x <= 10) {
		     soma = y * x;
		     System.out.println(y +" x "+ x +" = " + soma);
		     x = x + 1;
		}
		

	}

}
