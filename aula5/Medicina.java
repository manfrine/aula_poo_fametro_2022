package aula5;

public class Medicina extends Sistemas {
	
	Double n3;
	
	void calcMedia() {
		media = (n1+n2+n3)/3;
		
		if(media >= 7)
			 status = "Aprovado";
		else if(media < 5)
			status = "Reprovado";
		else
			status = "Em Recuperação";
	} 

}
