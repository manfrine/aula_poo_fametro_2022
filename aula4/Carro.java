package aula4;

public class Carro {
	Integer codigo;
	String modelo;
	Double valor;
	String status;
	Marca m;
	
	void atualizarStatus(int a) {
		if(a == 1)
			status = "Alugado";
		else
			status = "Disponivel";
	}
}
