
public class Empregador {
	private String nome;
	private int CPF;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCPF() {
		return CPF;
	}

	public void setCPF(int cPF) {
		CPF = cPF;
	}
	@Override
	public String toString() {
		return "Empregador [nome=" + nome + ", CPF=" + CPF + ", CNPJ=" + "]";
	}
}
