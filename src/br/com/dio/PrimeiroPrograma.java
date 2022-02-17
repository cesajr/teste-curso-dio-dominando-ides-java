package br.com.dio;

import br.com.dio.model.Cat;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		Cat cat = new Cat();
		Livros livros = new Livros();
		System.out.println(cat);
		System.out.println(livros);
		/*int a = 2;
		int b = 3;
		System.out.println("Hello World! " + (a+b));*/
	}
}

class Livros
{
	private String nome;
	private String npag;
}