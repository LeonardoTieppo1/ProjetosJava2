package matrizes;

import java.util.Random;
import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		int c = sc.nextInt();
		int i = 0;
		int j = 0;
		int[][] x = new int[l][c];

		for (i = 0; i < l; i++) {
			for (j = 0; j < c; j++) {
				// x[i][j]=sc.nextInt();
				x[i][j] = rd.nextInt(1001);
			}
		}

		for (i = 0; i < l; i++) {
			System.out.print("Tabela " + i + ": ");
			for (j = 0; j < c; j++) {
				System.out.print(x[i][j] + "\t");
			}
			System.out.println();
		}
		int max = 0;
		System.out.println();
		for (i = 0; i < l; i++) {
			for (j = 0; j < c; j++) {
				if (x[i][j] > max) {
					max = x[i][j];

				}
			}
		}
		for (i = 0; i < l; i++) {
			for (j = 0; j < c; j++) {
				if (max == x[i][j]) {
					System.out.print("Indice da Linha:["+i+"]\n");
					System.out.print("Indice da Coluna:["+j+"]\n");
					System.out.print("Valor máximo da tabela=" + max);
				}
			}
		}
		sc.close();
	}
}
