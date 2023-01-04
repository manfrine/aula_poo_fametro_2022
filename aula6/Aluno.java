package aula6;

public class Aluno {

	private String nome;
	private float n1;
	private float n2;
	private float m;
	
	// método de retorno ou recuperação da informacao
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public float getN1() {
		return n1;
	}
	
	public void setN1(float n1) {
		this.n1 = n1;
	}
	
	public float getN2() {
		return n2;
	}
	
	public void setN2(float n2) {
		this.n2 = n2;
	}
	
	public float getM() {
		return m;
	}
	
	public void calcMedia() {
		m = (n1+n2)/2;
	}
}

