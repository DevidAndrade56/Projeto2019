import javax.persistence.Id;
import javax.persistence.OneToMany;

public class Instituicao {
	private String nome;
	@Id
	@OneToMany
	private int CNPJ;
	private Empregador empregador;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCNPJ() {
		return CNPJ;
	}
	public void setCNPJ(int cNPJ) {
		CNPJ = cNPJ;
	}
	public Empregador getEmpregador() {
		return empregador;
	}
	public void setEmpregador(Empregador empregador) {
		this.empregador = empregador;
	}
	@Override
	public String toString() {
		return "Instituicao [nome=" + nome + ", CNPJ=" + CNPJ + ", empregador=" + empregador + "]";
	}
	

}
