package Decisao;

import java.util.Scanner;

public class Exemplo1 {

	public static void main(String[] args) {
		int n1;
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite um numero: ");
		n1=ler.nextInt();
		
		if(n1>=0)
			System.out.println("Positivo");
		else
			System.out.println("Negativo");
	}

}
