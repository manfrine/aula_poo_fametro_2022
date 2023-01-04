package aula1;

public class TesteVeiculo {

	public static void main(String[] args) {
		
		Veiculo v1 = new Veiculo();
		Moto m1 = new Moto();
		
		v1.modelo = "Gol";
		v1.marca = "Vw";
		v1.valor = 40000.0;
		v1.calcIpva();//mensagem
		
		m1.modelo = "Hornet";
		m1.marca = "Honda";
		m1.valor = 50000.0;
		m1.cilindradas = 100;
		m1.calcIpva();
		
		System.out.println("O modelo: "+v1.modelo);
		System.out.println("O marca: "+v1.marca);
		System.out.println("O valor do veiculo: R$ "+v1.valor);
		System.out.println("O ipva: R$ "+v1.ipva);
		
		System.out.println("\nO modelo da moto: "+m1.modelo);
		System.out.println("O marca: "+m1.marca);
		System.out.println("OAs cilindradas: "+m1.cilindradas);
		System.out.println("O valor do veiculo: R$ "+m1.valor);
		System.out.println("O ipva: R$ "+m1.ipva);
	}

}
