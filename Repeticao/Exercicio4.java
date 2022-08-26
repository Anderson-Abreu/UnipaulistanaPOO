package Repeticao;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int cont=0, pc=0,mn=0,ha=0,oc=0,n40=0,c18=0,idade,op1,op2;
		while(cont<15)
		{
			System.out.print("Digite sua idade: ");
			idade=ler.nextInt();
			System.out.print("\nDigite \n1-feminino\n2-masculino\n3-outos: ");
			op1=ler.nextInt();
			System.out.print("\nDigite \n1-calmo\n2-nervoso\n3-agressivo: ");
			op2=ler.nextInt();
			
			if(op2==1)
				pc++;
			if(op1==1 && op2==2)
				mn++;
			if(op1==2 && op2==3)
				ha++;
			if(op1==3 && op2==1)
				oc++;
			if(op2==2 && idade>40)
				n40++;
			if(op2==1 && idade<18)
				c18++;
			cont++;
		}
		System.out.println("O numero de pessoas calmas é: "+pc);
		System.out.println("O numero de mulheres nervosas é: "+mn);
		System.out.println("O numero de homens agressivos é: "+ha);
		System.out.println("O numero de outros calmos é: "+oc);
		System.out.println("O numero de pessoas nervosas com mais de 40 é: "+n40);
		System.out.println("O numero de pessoas calmas com menos de 18 é: "+c18);
		
	}

}
