package matrizes;

import java.util.Random;
import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		int c = sc.nextInt();
		int i = 0;
		int j = 0;
		int[][] x = new int[l][c];

		int troca;
		for (i = 0; i < x.length; i++) {
			for (j = 0; j < x.length; j++) {
				x[i][j] = rd.nextInt(20);
				System.out.print(x[i][j]+"\t");
				}
			System.out.println();
			}
		
			System.out.println();
			i=0;
			j=x.length-1;
			
		while(i<x.length) {
			troca=x[i][i];
			x[i][i]=x[i][j];
			x[i][j]=troca;
			i++;
			j--;
		}
			
		for (i=0;i<x.length;i++) {
			for(j=0;j<x.length;j++) {
					System.out.print(x[i][j]+"\t");
				}
			System.out.println();
			}
		}
	}