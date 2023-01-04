package aula2;

public class Funcionario {

	String nome;
	String funcao;
	Double imposto;
	Double salario;
	Double salariofinal;
	
	void calcImposto() {
	  if(salario <= 2000)	
		imposto = salario*5/100;
	  else if(salario <= 4000)	
			imposto = salario*10/100;
	  else
		  imposto = salario*15/100;
	}//fim método
	
	void calcSalario() {
		salariofinal = salario-imposto;
	}	
}
