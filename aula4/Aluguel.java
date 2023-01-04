package aula4;

public class Aluguel {
	
	Carro c;
	Cliente cli;
	Integer qtddias;
	Double valorAlu;
	int x=0;
	
	void alugar(Carro car) {
		
		valorAlu = qtddias * car.valor;
		x = 1;
		car.atualizarStatus(x);
		c = car;
	}
	
	void devolver(Carro car) {
		x = 0;
		car.atualizarStatus(x);
		c = car;
	}

}
