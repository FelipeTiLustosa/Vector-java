package aplication;

import java.util.Locale;
import java.util.Scanner;

public class Exerc_07 {

	public static void main(String[] args) {
	/*Fazer um programa para ler um número inteiro N e depois um vetor de N números reais. Em seguida, 
mostrar na tela a média aritmética de todos elementos com três casas decimais. Depois mostrar todos 
os elementos do vetor que estejam abaixo da média, com uma casa decimal cada. 
Exemplo: 
Quantos elementos vai ter o vetor? 4
Digite um numero: 10.0
Digite um numero: 15.5
Digite um numero: 13.2
Digite um numero: 9.8

MEDIA DO VETOR = 12.125 
ELEMENTOS ABAIXO DA MEDIA: 
10.0 
9.8 
*/

	Locale.setDefault(Locale.US);
	Scanner sc =new Scanner(System.in);
	System.out.print("Quantos elementos vai ter o vetor? ");
	int n=sc.nextInt();
	double[] vect=new double[n];
	
	for(int i=0;i<vect.length;i++) {
		System.out.println("Digite um numero: ");
		double num=sc.nextDouble();
		vect[i]=num;
	}
	
	double soma=0.0;
	for(int i=0;i<vect.length;i++) {
		soma+=vect[i];
	}
	System.out.println("");
	double avg=soma/vect.length;
	System.out.printf("MEDIA DO VETOR = %.3f%n",avg);
	
	for(int i=0;i<vect.length;i++) {
		if(vect[i]<avg) {
			System.out.printf("%.1f%n",vect[i]);
			
		}
	}
	sc.close();
	}

}
