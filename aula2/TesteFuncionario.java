package aula2;

import java.util.Scanner;

public class TesteFuncionario {

	public static void main(String[] args) {
		
		Funcionario f1 = new Funcionario();
		Vendedor v1 = new Vendedor();
		Gerente g1 = new Gerente();
		
		int x = 0, a, b;
		
		Scanner into = new Scanner(System.in);

		do {
			System.out.println("\n###Sistema de cadastro de funcionarios #### ");
			System.out.println("1 -  Funcionario: ");
			System.out.println("2 -  Vendedor: ");
			System.out.println("3 -  Gerente: ");
			System.out.println("\nEscolha a opção: ");
			b = into.nextInt();
			switch (b) {
			case 1: 
				System.out.println("Digite o nome do funcionario: ");
				f1.nome = into.next();
				System.out.println("Digite a função do funcionario: ");
				f1.funcao = into.next();
				System.out.println("Digite o salario base do funcionario: ");
				f1.salario = into.nextDouble();
				f1.calcImposto();
				f1.calcSalario();
				
				System.out.println("O nome do funcionario: "+f1.nome);
				System.out.println("O imposto do funcionario: R$ "+f1.imposto);
				System.out.println("O salario final do funcionario: R$ "+f1.salariofinal);
				
				
				break;
			
			case 2: 
				System.out.println("\nDigite o nome do vendedor: ");
				v1.nome = into.next();
				System.out.println("Digite a função no setor do vendedor: ");
				v1.funcao = into.next();
				System.out.println("Digite o salario base do funcionario: ");
				v1.salario = into.nextDouble();
				System.out.println("Digite o valor das vendas: ");
				v1.valorvendas = into.nextDouble();
				v1.calcImposto();
				System.out.println("---Digite o tipo de calculo --- ");
				System.out.println("---1 p/ calcular 2% de comissão --- ");
				System.out.println("---2 p/ calcular comissão com base no setor --- ");
				int y = into.nextInt();
				if(y == 1)
					v1.calcSalario();
				else
					v1.calcSalario(x);
				
				System.out.println("\nO nome do vendedor: "+v1.nome);
				System.out.println("O imposto do funcionario: R$ "+v1.imposto);
				System.out.println("A comissão do funcionario: R$ "+v1.comissao);
				System.out.println("O salario final do funcionario: R$ "+v1.salariofinal);
				
				break;
			case 3:
				System.out.println("\nDigite o nome do Gerente: ");
				g1.nome = into.next();
				System.out.println("Digite a função do funcionario: ");
				g1.funcao = into.next();
				System.out.println("Digite o salario base do funcionario: ");
				g1.salario = into.nextDouble();
				g1.calcImposto();
				g1.calcSalario();
				
				System.out.println("\nO nome do gerente: "+g1.nome);
				System.out.println("O imposto do funcionario: R$ "+g1.imposto);
				System.out.println("A comissão do funcionario: R$ "+g1.comissao);
				System.out.println("O bonus do funcionario: R$ "+g1.bonus);
				System.out.println("O salario final do funcionario: R$ "+g1.salariofinal);
				
				break;
			
			default:
				System.out.println("***** OPÇÃO INVALIDA *****");
			
			}
			System.out.println("Digite 1 p/ continuar ou 0 p/ sair: ");
			a = into.nextInt();
			
		}while(a !=0);
	}
}
