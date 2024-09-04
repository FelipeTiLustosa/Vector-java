package aplication;

import java.util.Locale;
import java.util.Scanner;

public class Program_Vect_TipoValor {

	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler um número inteiro N e a altura de N pessoas.
		 * Armazene as N alturas em um vetor. Em seguida, mostrar a altura média dessas
		 * pessoas.
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		double[] vect=new double[n];
		
		for(int i=0;i<vect.length;i++) {
			double altura=sc.nextDouble();
			vect[i]=altura;
		}
		double soma=0.0;
		for(int i=0;i<vect.length;i++) {
			soma+=vect[i];
		}
		double avg=soma/vect.length;
		System.out.printf("AVERAGE HEIGHT = %.2f%n",avg); 
		sc.close();
	}

}
