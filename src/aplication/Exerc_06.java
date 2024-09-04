package aplication;

import java.util.Locale;
import java.util.Scanner;

public class Exerc_06 {

	public static void main(String[] args) {
	/*Faça um programa para ler dois vetores A e B, contendo N elementos cada. Em seguida, gere um 
terceiro vetor C onde cada elemento de C é a soma dos elementos correspondentes de A e B. Imprima 
o vetor C gerado. 

Exemplo: 
Quantos valores vai ter cada vetor? 6
Digite os valores do vetor A: 
8 
2 
11 
14 
13 
20 
Digite os valores do vetor B: 
5 
10 
3 
1 
10 
7 
VETOR RESULTANTE: 
13 
12 
14 
15 
23 
27 
*/
		Locale.setDefault(Locale.US);
		Scanner sc=new Scanner(System.in);

		System.out.print("Quantos valores vai ter cada vetor? ");
		int n=sc.nextInt();
		int[] vectA=new int[n];
		int[] vectB=new int[n];
		
		System.out.println("Digite os valores do vetor A:");
		for(int i=0;i<vectA.length;i++) {
			 System.out.print("Digite um numero: ");
			 int num=sc.nextInt();
			 vectA[i]=num;
		}
		System.out.println("Digite os valores do vetor B:");
		for(int i=0;i<vectA.length;i++) {
			 int num=sc.nextInt();
			 vectB[i]=num;
		}
		int[] vectc=new int[n];
		for(int i=0;i<n;i++) {
			vectc[i]=vectA[i]+vectB[i];
		}
		System.out.println("VETOR RESULTANTE:");
		for(int i=0;i<n;i++) {
			System.out.println(vectc[i]);
		}
		sc.close();
	}

}
