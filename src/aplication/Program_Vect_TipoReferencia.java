package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Product_Vect_TipoReferencia;

public class Program_Vect_TipoReferencia {

	public static void main(String[] args) {
	/*Fazer um programa para ler um número inteiro N e os dados (nome e
preço) de N Produtos. Armazene os N produtos em um vetor. Em
seguida, mostrar o preço médio dos produtos.*/

		Locale.setDefault(Locale.US);
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Product_Vect_TipoReferencia[] vect= new Product_Vect_TipoReferencia[n];
		
		for(int i=0;i<vect.length;i++) {
			sc.nextLine();
			String name=sc.nextLine();
			double price=sc.nextDouble();
			vect[i]=new Product_Vect_TipoReferencia(name,price);
		}
		
		double soma=0.0;
		
		for(int i=0;i<vect.length;i++) {
			soma+=vect[i].getPrice();	
		}
		
		double avg=soma/vect.length;
		System.out.printf("AVERAGE PRICE = %.2f%n",avg);
		sc.close();
	}

}
