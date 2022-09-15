package VetorMatriz;

import java.util.Scanner;

//linha2,coluna3->7

public class ExemploMatriz {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int mat[][]=new int[3][4];
		int mat1[][]= {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		
		/*for(int col=0;col<4;col++)
		{
			for(int linha=0;linha<3;linha++)
				System.out.print(mat1[linha][col]+"\t");
			System.out.println();
		}
		*/
		for(int linha=0;linha<3;linha++)
		{
			for(int col=0;col<4;col++)
			{
				System.out.print("Digite um numero: ");
				mat[linha][col]=ler.nextInt();		
			}	
		}
		
		for(int linha=0;linha<3;linha++)
		{
			for(int col=0;col<4;col++)
				System.out.print(mat[linha][col]+"\t");
			System.out.println();
		}
	}

}
