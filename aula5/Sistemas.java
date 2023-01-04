package aula5;

public class Sistemas {
	String nome_aluno;
	String status;
	Double n1;
	Double n2;
	Double media;
	
	void calcMedia() {
		media = (n1+n2)/2;
		if(media >5 )
			status = "Aprovado";
		else
			status = "Reprovado";
	}
	
	void calcMedia(int a) {
		status = "Trancou o curso";
	}

}
