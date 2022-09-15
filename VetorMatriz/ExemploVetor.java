package VetorMatriz;

import java.util.Scanner;

public class ExemploVetor {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int vet[] = new int[5];
		int vet1[]= {1,2,3,4,5};
		
		vet[3]=8;
		vet1[3]=7;
		
		for(int x=0;x<5;x++)
			System.out.print(vet1[x]+"\t");
		
		for(int x=0;x<5;x++)
		{
			System.out.print("\nDigite um numero:");
			vet[x]=ler.nextInt();
		}
		
		for(int x=0;x<5;x++)
			System.out.print(vet[x]+"\t");
	}
	

}
