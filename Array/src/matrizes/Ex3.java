package matrizes;

import java.util.Locale;
import java.util.Scanner;
import exercicio.Ex1;


public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		// nome do aluno e nota, total de alunos = 5, colocados em um vetor, para
		// calcular a média tem que ter P1,P2,T
		System.out.print("Informe a quantidade total de alunos: ");
		int al = sc.nextInt();
		int i = 0;
		int j = 0;
		int qtdN=3;
		String[] nome = new String[al];
		String[] coluna= {"Prova 1","Prova 2","Trabalho"};
		double[] peso= {0.3,0.5,0.2};
		double[][] notas = new double[al][qtdN+1];
		double media=0;
		for (i = 0; i < al; i++) {
			sc.nextLine();
			System.out.print("Aluno"+(i+1)+"\n");
			System.out.print("Nome:");
			nome[i] = sc.nextLine();
			
			for(j=0;j<qtdN;j++) {
				System.out.print(coluna[j]+":");
				notas[i][j]=sc.nextDouble();
				media+=notas[i][j]*peso[j];
				
			}
				notas[i][qtdN]=media;
				System.out.println();
			}
		
		for(i=0;i<al;i++) {
			System.out.println("Nome: "+nome[i]);
			System.out.print(notas[i][qtdN]+": ");
			if(notas[i][qtdN]>=7) {
				System.out.println("Aprovado!");
			} else {
				System.out.println("Reprovado!");
			}
			
		}
		/*
		for (i = 0; i < al; i++) {
			System.out.print("Tabela " + nome[i] + ": ");
			for (j = 0; j < qtdN; j++) {
				System.out.print(notas[i][j] + "\t");
			}
			System.out.println();
		}

		System.out.println();
		for (i = 0; i < al; i++) {
			for (j = 0; j < qtdN; j++) {
				if (notas[i][j] == notas[i][0]) {
					notas[i][0] = notas[i][0] * 0.3;
				} else if (notas[i][j] == notas[i][1]) {
					notas[i][1] = notas[i][1] * 0.5;
				} else if (notas[i][j] == notas[i][2]) {
					notas[i][2] = notas[i][2] * 0.2;
				}
			}
			double nf = notas[i][0] + notas[i][1] + notas[i][2];
			System.out.printf("Olá",ex1.mdf(nf));
		}*/

	sc.close();
	}
}
