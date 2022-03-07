package matrizes;

import java.util.Random;
import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rd=new Random();
		Scanner sc=new Scanner(System.in);
		int l=sc.nextInt();
		int c=sc.nextInt();
		int i=0;
		int j=0;
		int[][] x= new int[l][c];
		
		for(i=0;i<l;i++) {
			for(j=0;j<c;j++) {
				//x[i][j]=sc.nextInt();
				x[i][j]=rd.nextInt(20);
			}
		}
		
		for(i=0;i<l;i++) {System.out.print("Tabela "+i+": ");
			for(j=0;j<c;j++) {
				System.out.print(x[i][j]+"\t");
			}
			System.out.println();
		}
		int sum=0;
		
		for(i=0;i<l;i++) {
			for(j=0;j<c;j++) {
				if(i==j) {
					sum=sum+x[i][j];
				}
			}
		}
		int sum1=0;
		System.out.print("Soma da diagonal principal: "+sum);
		for(i=0;i<l;++i) {
			for(j=0;j<c;++j) {
				if(j+i==2) {//diagonal segundaria é linha+coluna==quadrante-1
					sum1=sum1+x[i][j];
				}
			}
		}
		System.out.println("\nSoma da diagonal segundária: "+sum1);
		sc.close();
	}

}
