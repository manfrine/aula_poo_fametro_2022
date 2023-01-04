package aula1;

public class Moto extends Veiculo {

	Integer cilindradas;
	
	void calcIpva() {
		if(cilindradas <= 160)
			ipva = valor*3/100;
		else if(cilindradas <= 300)
			ipva = valor*5/100;
		else if(cilindradas <= 500)
			ipva = valor*6/100;
		else
			ipva = valor*7/100;
	}
}
