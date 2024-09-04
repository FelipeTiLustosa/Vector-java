package aplication;

import java.util.Locale;
import java.util.Scanner;

public class Exerc_05 {

	public static void main(String[] args) {
	/*Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela 
o maior número do vetor (supor não haver empates). Mostrar também a posição do maior elemento, 
considerando a primeira posição como 0 (zero).
 
Exemplo: 
Quantos numeros voce vai digitar? 6
Digite um numero: 8.0
Digite um numero: 4.0
Digite um numero: 10.0
Digite um numero: 14.0
Digite um numero: 13.0
Digite um numero: 7.0

MAIOR VALOR = 14.0 
POSICAO DO MAIOR VALOR = 3 
*/
Locale.setDefault(Locale.US);
Scanner sc=new Scanner(System.in);

System.out.print("Quantos numeros voce vai digitar? ");
int n=sc.nextInt();
double[] numeros=new double[n];

for(int i=0;i<numeros.length;i++) {
	 System.out.print("Digite um numero: ");
	 double num=sc.nextDouble();
	 numeros[i]=num;
}

double maior=numeros[0];
int posicao=0;
for(int i=0;i<numeros.length;i++) {
	if (numeros[i]>maior) {
		maior=numeros[i];
		posicao=i;
	}
}
System.out.println("");
System.out.println("MAIOR VALOR = "+maior+"\n");
System.out.println("POSICAO DO MAIOR VALOR = "+posicao);

sc.close();
	}

}
