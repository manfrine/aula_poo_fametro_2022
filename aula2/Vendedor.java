package aula2;

public class Vendedor extends Funcionario{

	Double valorvendas;
	Double comissao;
	
	void calcSalario() {
		comissao = valorvendas * 2/100;
		salariofinal = salario - imposto + comissao;
	}
	
	void calcSalario(int a) {
		if(funcao.equals("celulares")) {
			comissao = valorvendas * 5/100;
			salariofinal = salario - imposto + comissao;
		}else if(funcao.equals("cozinha")) {
			comissao = valorvendas * 6/100;
			salariofinal = salario - imposto + comissao;
		}else if(funcao.equals("estofados")) {
			comissao = valorvendas * 7/100;
			salariofinal = salario - imposto + comissao;
		}else {
			comissao = valorvendas * 4/100;
			salariofinal = salario - imposto + comissao;
		}
	}
	
}
