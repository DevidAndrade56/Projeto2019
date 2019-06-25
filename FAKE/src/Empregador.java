import javax.persistence.Id;
import javax.persistence.OneToMany;

public class Empregador {
	@Id
	@OneToMany
	private int CPF;
	private String nome;

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
