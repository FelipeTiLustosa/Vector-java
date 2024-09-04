package aplication;

import java.util.Locale;
import java.util.Scanner;

public class Exerc_11 {

	public static void main(String[] args) {
	/*Tem-se um conjunto de dados contendo a altura e o gênero (M, F) de N pessoas. Fazer um programa 
que calcule e escreva a maior e a menor altura do grupo, a média de altura das mulheres, e o número 
de homens. 
Exemplo: 
Quantas pessoas serao digitadas? 5
Altura da 1a pessoa: 1.70
Genero da 1a pessoa: F
Altura da 2a pessoa: 1.83 
Genero da 2a pessoa: M
Altura da 3a pessoa: 1.54 
Genero da 3a pessoa: M
Altura da 4a pessoa: 1.61 
Genero da 4a pessoa: F
Altura da 5a pessoa: 1.75 
Genero da 5a pessoa: F
Menor altura = 1.54 
Maior altura = 1.83 
Media das alturas das mulheres = 1.69 
Numero de homens = 2*/
		Locale.setDefault(Locale.US);
		Scanner sc =new Scanner(System.in);
		System.out.print("Quantas pessoas serao digitadas? ");
		int n=sc.nextInt();
		double[] altura=new double[n];
		char[] sexo=new char[n];
		
		for(int i=0;i<n;i++) {
			System.out.printf("Altura da %da pessoa: ",i+1);
			double alt=sc.nextDouble();			
			altura[i]=alt;
			System.out.printf("Genero da %da pessoa: ",i+1);
			char sex=sc.next().charAt(0);
			sexo[i]=sex;
		}
		double maiorAltura=altura[0];
		for(int i=0;i<n;i++) {
			if (maiorAltura>altura[i]) {
				maiorAltura=altura[i];
			}
		}
		double menorAltura=altura[0];
		for(int i=0;i<n;i++) {
			if (menorAltura<altura[i]) {
				menorAltura=altura[i];
			}
		}
		double soma=0;
		int numMulheres=0;
		for(int i=0;i<n;i++) {
			if (sexo[i]=='F' || sexo[i]=='f') {
				soma+=altura[i];
				numMulheres++;
			}
		}
		int numHomen=0;
		for(int i=0;i<n;i++) {
			if (sexo[i]=='M' || sexo[i]=='m') {
				numHomen++;
			}
		}
		double mediaAlturaMulheres=soma/numMulheres;
		
		System.out.printf("Menor altura = %.2f%n",maiorAltura);
		System.out.printf("Maior altura = %.2f%n",menorAltura);
		System.out.printf("Media das alturas das mulheres = %.2f%n",mediaAlturaMulheres);
		System.out.printf("Numero de homens = %d",numHomen);
		
		sc.close();
	}

}
