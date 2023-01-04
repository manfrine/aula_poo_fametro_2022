package aula1;

public class Veiculo {

	String modelo;
	String marca;
	Double valor;
	Double ipva;
	
	void calcIpva() {
		if(marca.equals("Honda")) {
			ipva = valor*3/100;
		}else if(marca.equals("Toyota")) {
			ipva = valor*4/100;
		}else {
			ipva = valor*2/100;
		}
	}
}
