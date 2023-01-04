package aula4;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		
		Marca m1 = new Marca(1, "Honda");
		Marca m2 = new Marca(2, "Fiat");
		Marca m3 = new Marca(3, "Toyota");
		
		Carro c1 = new Carro();
		Carro c2 = new Carro();
		
		Cliente cl1 = new Cliente();
		Cliente cl2 = new Cliente();
		
		Aluguel a1 = new Aluguel();
		
		Scanner into = new Scanner(System.in);
		
		System.out.println("Digite o modelo do carro 1: ");
		c1.modelo = into.next();
		c1.codigo = 1;
		System.out.println("Digite o valor da diária : ");
		c1.valor = into.nextDouble();
		c1.status = "Disponivel";
		
		System.out.println("Marca 1 : "+m1.nome);
		System.out.println("Marca 2 : "+m2.nome);
		System.out.println("Marca 3 : "+m3.nome);
		
		System.out.println("Digite 1 p/ a marca 1  e 2 p/ marca 2 e 3 p/ marca 3 : ");
		int z = into.nextInt();
		if(z==1)
			c1.m=m1;
		else if(z==2)
			c1.m=m2;
		else
			c1.m=m3;
		
		System.out.println("### Cadastro Realizado com Sucesso!!! ");
		
		System.out.println("Digite o modelo do carro 2: ");
		c2.modelo = into.next();
		c2.codigo = 2;
		System.out.println("Digite o valor da diária : ");
		c2.valor = into.nextDouble();
		c2.status = "Disponivel";
		
		System.out.println("Marca 1 : "+m1.nome);
		System.out.println("Marca 2 : "+m2.nome);
		System.out.println("Marca 3 : "+m3.nome);
		
		System.out.println("Digite 1 p/ a marca 1  e 2 p/ marca 2 e 3 p/ marca 3 : ");
		int zz = into.nextInt();
		if(zz==1)
			c2.m=m1;
		else if(zz==2)
			c2.m=m2;
		else
			c2.m=m3;
		
		System.out.println("### Cadastro Realizado com Sucesso!!! ");
		
		System.out.println("\n*** LISTA DE CARROS !!! ");
		System.out.println("\nCARRO 1: "+c1.modelo);
		System.out.println("A marca: "+c1.m.nome);
		System.out.println("O Valor: R$ "+c1.valor);
		
		System.out.println("\nCARRO 2: "+c2.modelo);
		System.out.println("A marca: "+c2.m.nome);
		System.out.println("O Valor: R$ "+c2.valor);
		
		System.out.println("\n### Sistema no módulo de aluguel !!! ");
		
		System.out.println("Digite a quantidade de dias : ");
		a1.qtddias = into.nextInt();
		
		System.out.println("\nDigite 1  para alugar o carro 1 \n"
				+ "Digite 2 p/ alugar o carro 2 ### ");
		
		int f = into.nextInt();
		if(f==1)
			a1.alugar(c1);
		else
			a1.alugar(c2);
			
		System.out.println("\n### Aluguel realizado com Sucesso !!! ");
		
		System.out.println("\nO Modelo: "+a1.c.modelo);
		System.out.println("O valor do aluguel: R$ "+a1.valorAlu);
		System.out.println("O Status: "+a1.c.status);
		
		
	}
}
