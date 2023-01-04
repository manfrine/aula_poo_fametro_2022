package aula5;

import java.util.Scanner;

public class Teste_revisao_prova {

	public static void main(String[] args) {
		
		Sistemas s1 = new Sistemas();
		Sistemas s2 = new Sistemas();
		Sistemas s3 = new Sistemas();
		
		Medicina m1 = new Medicina();
		Medicina m2 = new Medicina();
		
		Scanner into = new Scanner(System.in); 
		
		System.out.println("Digite o nome do aluno: ");
		s1.nome_aluno = into.next();
		System.out.println("Digite a n1: ");
		s1.n1 = into.nextDouble();
		System.out.println("Digite a n2: ");
		s1.n2 = into.nextDouble();
		s1.calcMedia();
		int a =0;
		System.out.println("\nDigite o nome do aluno 2: ");
		s2.nome_aluno = into.next();
		System.out.println("Digite a n1: ");
		s2.n1 = into.nextDouble();
		System.out.println("Digite a n2: ");
		s2.n2 = into.nextDouble();
		s2.calcMedia(a);
		
		System.out.println("Digite o nome do aluno da medicina: ");
		m1.nome_aluno = into.next();
		System.out.println("Digite a n1: ");
		m1.n1 = into.nextDouble();
		System.out.println("Digite a n2: ");
		m1.n2 = into.nextDouble();
		System.out.println("Digite a n3: ");
		m1.n3 = into.nextDouble();
		m1.calcMedia();
		
		System.out.println("Digite o nome do aluno 2 da medicina: ");
		m2.nome_aluno = into.next();
		System.out.println("Digite a n1: ");
		m2.n1 = into.nextDouble();
		System.out.println("Digite a n2: ");
		m2.n2 = into.nextDouble();
		System.out.println("Digite a n3: ");
		m2.n3 = into.nextDouble();
		m2.calcMedia();
		
		System.out.println("O aluno 1: "+s1.nome_aluno);
		System.out.println("A média : "+s1.media);
		System.out.println("O Status: "+s1.status);
		
		System.out.println("\nO aluno 2: "+s2.nome_aluno);
		System.out.println("A média : "+s2.media);
		System.out.println("O Status: "+s2.status);
		
		System.out.println("\nO aluno da medicina: "+m1.nome_aluno);
		System.out.println("A média : "+m1.media);
		System.out.println("O Status: "+m1.status);
		
		System.out.println("\nO aluno 2 da medicina: "+m2.nome_aluno);
		System.out.println("A média : "+m2.media);
		System.out.println("O Status: "+m2.status);
	}

}
