package Repeticao;

import java.util.Scanner;

public class Exercício3 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int mv=0, mc=0,p;
		System.out.print("Digite sua idade ou -99 para enserrar o programa: ");
		p=ler.nextInt();
		while(p!=-99)
		{
			if(p<21)
				mv++;
			if(p>50)
				mc++;
			System.out.print("Digite sua idade ou -99 para enserrar o programa: ");
			p=ler.nextInt();
		}
		System.out.println("O total de pessoas com menos de 21 anos �: "+mv);
		System.out.println("O total de pessoas com mais de 50 anos � : "+mc);
	}

}
