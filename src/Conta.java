
public class Conta {
	
	private int numero;
	private String nome;
	private static int totalConta;
	
	
	public Conta() {
		totalConta++;
	}


	public int getNumero() {
		return numero;
	}


	public static int getTotalConta() {
		return totalConta;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	

}
