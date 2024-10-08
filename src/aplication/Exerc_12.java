package aplication;

import java.util.Scanner;

import entities.Product_Vect_TipoReferencia;
import entities.Rent_Exerc12;

public class Exerc_12 {

	public static void main(String[] args) {
	/*A dona de um pensionato possui dez quartos para alugar para estudantes,
sendo esses quartos identificados pelos números 0 a 9.
Fazer um programa que inicie com todos os dez quartos vazios, e depois
leia uma quantidade N representando o número de estudantes que vão
alugar quartos (N pode ser de 1 a 10). Em seguida, registre o aluguel dos
N estudantes. Para cada registro de aluguel, informar o nome e email do
estudante, bem como qual dos quartos ele escolheu (de 0 a 9). Suponha
que seja escolhido um quarto vago. Ao final, seu programa deve imprimir
um relatório de todas ocupações do pensionato, por ordem de quarto,
conforme exemplo.
*/
		Scanner sc=new Scanner(System.in);
		Rent_Exerc12[] rent =new Rent_Exerc12[10];
		System.out.print("How many rooms will be rented? ");
		int n=sc.nextInt();
		System.out.println();
		for(int i=0;i<n;i++) {
			System.out.printf("Rent #%d:%n",i+1);
			System.out.print("Name: ");
			String name=sc.next();
			System.out.print("Email: ");
			String email=sc.next();
			System.out.print("Room: ");
			int numQuarto=sc.nextInt();
			System.out.println();
			rent[numQuarto]=new Rent_Exerc12(name, email);
		}
		System.out.println("Busy rooms:");
		for (int i = 0; i < rent.length; i++) {
			if (rent[i]!=null) {
				System.out.println(i+": "+ rent[i]);
			}
		}
		sc.close();
	}

}
