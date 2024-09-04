package aplication;

import java.util.Locale;
import java.util.Scanner;

public class Exerc_08 {

	public static void main(String[] args) {
	/*Fazer um programa para ler um vetor de N números inteiros. Em seguida, mostrar na tela a média 
aritmética somente dos números pares lidos, com uma casa decimal. Se nenhum número par for 
digitado, mostrar a mensagem "NENHUM NUMERO PAR" 
Exemplo 1: 
Quantos elementos vai ter o vetor? 6
Digite um numero: 8 
Digite um numero: 2 
Digite um numero: 11 
Digite um numero: 14 
Digite um numero: 13 
Digite um numero: 20
MEDIA DOS PARES = 11.0 

Exemplo 2: 
Quantos elementos vai ter o vetor? 3
Digite um numero: 7 
Digite um numero: 9 
Digite um numero: 11 
NENHUM NUMERO PAR */
		
		Locale.setDefault(Locale.US);
		Scanner sc =new Scanner(System.in);
		System.out.print("Quantos elementos vai ter o vetor? ");
		int n=sc.nextInt();
		int[] vect=new int[n];
		
		for(int i=0;i<vect.length;i++) {
			System.out.print("Digite um numero: ");
			int num=sc.nextInt();
			vect[i]=num;
		}
		int soma=0;
		int quantPar=0;
		for(int i=0;i<vect.length;i++) {
			if(vect[i]%2==0) {
				soma+=vect[i];
				quantPar++;
			}
		}
		if(quantPar!=0) {
			double avg=soma/quantPar;
			System.out.printf("MEDIA DOS PARES = %.1f%n",avg);
		}else 
			System.out.println("NENHUM NUMERO PAR ");
			
		sc.close();
	}

}
