package matrizes;

import java.util.Scanner;

public class Aula1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		//isto é uma array unidimensional
		//int [] x= new int[5];
		
		//isto é uma array bidimensional
		//int [Linha][Coluna] y = new int [5][3];
		//quadrada é a nlinha=ncoluna
		int l=sc.nextInt();
		int c=sc.nextInt();
		int [][] y= new int [l][c];
		
		for(int i=0; i<l;i++) {//linha
			for (int j=0;j<c;j++) {//coluna
				y[i][j]=sc.nextInt();

			}
		}
		
		for(int i=0; i<l;i++) {//linha
			for (int j=0;j<c;j++) {//coluna
				System.out.print(y[i][j]+" ");
			}
			System.out.println();
		}
		
		sc.close();
	}

}
