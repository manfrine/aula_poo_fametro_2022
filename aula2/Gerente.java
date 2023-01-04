package aula2;

public class Gerente extends Funcionario{
	
	Double comissao = 2000.0;
	Double bonus = 2000.0;
	
	void calcSalario() {
		salariofinal = salario+comissao+bonus-imposto;
	}
}
