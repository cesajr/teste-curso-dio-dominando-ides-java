package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a, b;
		System.out.println("Digite o primeiro valor: ");
		a = scan.nextInt();
		System.out.println("Digite o primeiro valor: ");
		b = scan.nextInt();
		
		int soma = soma(a,b);
		int subtracao = subtracao(a,b);
		int multiplicacao = multiplicacao(a,b);
		int divisao = divisao(a,b);
		
		System.out.println("soma " + soma);
		System.out.println("Subt " + subtracao);
		System.out.println("multip " + multiplicacao);
		System.out.println("Div " + divisao);
		
	}
	
	public static int soma(int a, int b)
	{
		return a + b;
	}
	public static int subtracao(int a, int b)
	{
		return a - b;
	}
	public static int divisao(int a, int b)
	{
		return a / b;
	}
	public static int multiplicacao(int a, int b)
	{
		return a * b;
	}

}
