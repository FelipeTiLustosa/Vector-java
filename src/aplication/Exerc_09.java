package aplication;

import java.util.Scanner;

public class Exerc_09 {

	public static void main(String[] args) {
	/*Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas idades. Os nomes 
devem ser armazenados em um vetor, e as idades em um outro vetor. Depois, mostrar na tela o nome 
da pessoa mais velha. 

Exemplo: 
Quantas pessoas voce vai digitar? 5
Dados da 1a pessoa: 
Nome: Joao
Idade: 16
Dados da 2a pessoa: 
Nome: Maria
Idade: 21
Dados da 3a pessoa: 
Nome: Teresa
Idade: 15
Dados da 4a pessoa: 
Nome: Carlos
Idade: 23
Dados da 5a pessoa: 
Nome: Paulo
Idade: 17
PESSOA MAIS VELHA: Carlos 
*/
Scanner sc=new Scanner(System.in);
System.out.print("Quantas pessoas voce vai digitar? ");
int n=sc.nextInt();
String[] name=new String[n];
int[] idade=new int[n];

for(int i=0;i<n;i++) {
	System.out.printf("Dados da %da pessoa:%n",i+1);
	System.out.print("Nome: ");
	String nome=sc.next();
	name[i]=nome;
	System.out.print("Idade: ");
	int num=sc.nextInt();
	idade[i]=num;
}
int maisVelho=idade[0];
String nomeDoMaisVelho=name[0];
for(int i=0;i<n;i++) {
	if(idade[i]>maisVelho) {
		maisVelho=idade[i];
		nomeDoMaisVelho=name[i];
	}
}
System.out.print("PESSOA MAIS VELHA: "+nomeDoMaisVelho);
sc.close();
	}

}
