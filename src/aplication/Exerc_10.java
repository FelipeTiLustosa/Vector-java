package aplication;

import java.util.Locale;
import java.util.Scanner;

public class Exerc_10 {

	public static void main(String[] args) {
	/*Fazer um programa para ler um conjunto de N nomes de alunos, bem como as notas que eles tiraram 
no 1º e 2º semestres. Cada uma dessas informações deve ser armazenada em um vetor. Depois, imprimir 
os nomes dos alunos aprovados, considerando aprovados aqueles cuja média das notas seja maior ou 
igual a 6.0 (seis). 
Exemplo: 

Quantos alunos serao digitados? 4
Digite nome, primeira e segunda nota do 1o aluno: 
Joao Silva 
7.0 
8.5 
Digite nome, primeira e segunda nota do 2o aluno: 
Maria Teixeira 
9.2 
6.5 
Digite nome, primeira e segunda nota do 3o aluno: 
Carlos Carvalho 
5.0 
6.0 
Digite nome, primeira e segunda nota do 4o aluno: 
Teresa Pires 
5.5 
6.5 
Alunos aprovados: 
Joao Silva 
Maria Teixeira 
Teresa Pires*/
		Locale.setDefault(Locale.US);
		Scanner sc =new Scanner(System.in);
		System.out.print("Quantos alunos serao digitados? ");
		int n=sc.nextInt();
		String[] name=new String[n];
		double[] n1=new double[n];
		double[] n2=new double[n];
		
		for(int i=0;i<n;i++) {
			System.out.printf("Digite nome, primeira e segunda nota do %d° aluno:%n",i+1);
			String nome=sc.next();
			name[i]=nome;
			double nota1=sc.nextDouble();
			n1[i]=nota1;
			double nota2=sc.nextDouble();
			n2[i]=nota2;
		}
		System.out.println("Alunos aprovados:");
		for(int i=0;i<n;i++) {
			double media=(n1[i]+n2[i])/2;
			if (media>=6.0) {
				System.out.println(name[i]);
			}
		}
		sc.close();
	}

}
