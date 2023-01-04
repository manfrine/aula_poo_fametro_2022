package aula1;

import java.util.Scanner;

public class TestePessoa {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa();
		Pessoa p2 = new Pessoa();
		Pessoa p3 = new Pessoa();
		
		Scanner into = new Scanner(System.in);
	
		p1.nome = "João";
		p1.idade = 20;
		p1.tel = "(92)90990-0099";
		p1.ocupacao = "estudate";
		p1.renda = 1000.0;
		
		p2.nome = "Maria";
		p2.idade = 25;
		p2.tel = "(92)90990-0099";
		p2.ocupacao = "Assistente ADM";
		p2.renda = 2500.00;
		
		System.out.println("Informe o nome: ");
		p3.nome = into.next();// captura Strings
		System.out.println("Informe a idade: ");
		p3.idade = into.nextInt();// captura inteiro
		System.out.println("Informe a renda: ");
		p3.renda = into.nextDouble();// captura Double
		
		//System.out.println("O nome: "+p1.nome);
		p1.ola();
		System.out.println("A idade: "+p1.idade);
		System.out.println("O Telefone: "+p1.tel);
		System.out.println("A ocupação: "+p1.ocupacao);
		System.out.println("A renda: "+p1.renda);
		System.out.println("\n");
		p2.ola();
		System.out.println("A idade: "+p2.idade);
		System.out.println("O Telefone: "+p2.tel);
		System.out.println("A ocupação: "+p2.ocupacao);
		System.out.println("A renda: "+p2.renda);
		System.out.println("\n");
		p3.ola();
		System.out.println("A idade: "+p3.idade);
		System.out.println("A renda: "+p3.renda);
	}
}
