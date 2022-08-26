package Decisao;

import java.util.Scanner;

public class Exemplo2 {

	public static void main(String[] args) {
		double nota;
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite a media final: ");
		nota=ler.nextDouble();
		
		if(nota<5)
			System.out.println("Reprovado");
		else if(nota>7)
			System.out.println("Aprovado");
		else
			System.out.println("Exame");
		System.out.println("\nFIM DO PROGRAMA");

	}

}
