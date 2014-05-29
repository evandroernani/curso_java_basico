package com.evandro.cursojava.aula10;

public class Variáveis {

	public static void main(String[] args) {
		
		// convenção Java
		int idade = 20;
		String name = "Evandro";
		String nomeDoMeuCachorro = "toy";
		String ano2014 = "2014";
		
		
		// não é convenção java
		String nome_do_meu_cachorro;
		String NomeDoMEuCachorro;
		String nomeDoMEucachorro;
		
		// aceito mas não utilizado
		int _idade;
		int $idade;
			
		idade = 25;
		
		System.out.println ("idade = " + idade);
		System.out.println ("nome = " + name);
		
		// má prática
		int a = 10;
		String b = "Evandro";
				
			
	}
	
}
