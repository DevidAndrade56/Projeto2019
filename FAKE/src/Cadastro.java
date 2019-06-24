import javax.persistence.Id;
import javax.persistence.OneToMany;

public class Cadastro {
	@Id
	@OneToMany
	private int cpf;
	private String nome;
	private String email;
	private String senha;
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	@Override
	public String toString() {
		return "Cadastro [cpf=" + cpf + ", nome=" + nome + ", email=" + email + ", senha=" + senha + "]";
	}

}
