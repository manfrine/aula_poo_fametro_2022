package aula6;

import java.util.Scanner;

public class Testeencap {

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno();
		Aluno a2 = new Aluno();
		Scanner into = new Scanner(System.in);
		
		a1.setNome("Joao");
		a1.setN1(8);
		a1.setN2(9);
		a1.calcMedia();
		
		System.out.println("Digite um nome: ");
		a2.setNome(into.next());
		System.out.println("Digite a n1: ");
		a2.setN1(into.nextFloat());
		System.out.println("Digite a n2: ");
		a2.setN2(into.nextFloat());
		a2.calcMedia();
				
		System.out.println("O nome: "+ a1.getNome());
		System.out.println("O nota 1: "+a1.getN1());
		System.out.println("O nota 2: "+a1.getN2());
		System.out.println("A média: "+a1.getM());
		
		System.out.println("\nO nome: "+ a2.getNome());
		System.out.println("O nota 1: "+a2.getN1());
		System.out.println("O nota 2: "+a2.getN2());
		System.out.println("A média: "+a2.getM());
	}

}
