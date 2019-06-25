import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

public class Cadastro {
	@Id
	@GeneratedValue
	@OneToMany
	private int id;
	private String nome;
	private String email;
	private String senha;
	public int getCpf() {
		return id;
	}
	public void setid(int id) {
		this.id = id;
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
		return "Cadastro [id=" + id + ", nome=" + nome + ", email=" + email + ", senha=" + senha + "]";
	}

}
