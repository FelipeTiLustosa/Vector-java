package aplication;

import java.util.Locale;
import java.util.Scanner;

public class Exerc_03 {

	public static void main(String[] args) {
	/*Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na 
tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos, 
bem como os nomes dessas pessoas caso houver. 
Exemplo: 
Quantas pessoas serao digitadas? 5
Dados da 1a pessoa: 
Nome: Joao
Idade: 15
Altura: 1.82
Dados da 2a pessoa: 
Nome: Maria
Idade: 16
Altura: 1.60
Dados da 3a pessoa: 
Nome: Teresa
Idade: 14
Altura: 1.58
Dados da 4a pessoa: 
Nome: Carlos
Idade: 21
Altura: 1.65
Dados da 5a pessoa: 
Nome: Paulo
Idade: 17
Altura: 1.78
Altura média: 1.69 
Pessoas com menos de 16 anos: 40.0% 
Joao 
Teresa*/

		Locale.setDefault(Locale.US);
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Quantas pessoas serao digitadas? ");
		 int n=sc.nextInt();
		 
		 double[] altura= new double[n];
		 String[] name=new String[n];
		 int[] idade=new int[n];
		 
		 for(int i=0;i<n;i++) {
			 System.out.printf("Dados da %da pessoa:\n",i+1);
			 System.out.print("Nome: ");
			 String nome=sc.next();
			 name[i]=nome;
			 System.out.print("Idade: ");
			 int ida=sc.nextInt();
			 idade[i]=ida;
			 System.out.print("Altura: ");
			 double alt=sc.nextDouble();
			 altura[i]=alt;
		 }
		 
		 double somaAltura=0.0;
		 for(int i=0;i<altura.length;i++) {
			 somaAltura+=altura[i];
			}
		 double avg=somaAltura/n;
		 System.out.println("========================================================");
		 System.out.printf("Altura média: %.2f%n",avg);
		 
		 int quant16=0;
		 for(int i=0;i<idade.length;i++) {
			 if (idade[i]<16) {
				 quant16++;
			}
			}
		 double porcentagem=(double) quant16/n*100;
		 
		 System.out.printf("Pessoas com menos de 16 anos: %.2f%n",porcentagem);
		 
		 for(int i=0;i<idade.length;i++) {
			 if (idade[i]<16) {
				 System.out.println(name[i]);
			}
		 }
		 sc.close();
	}

}
