
public class Login {
	private String nome;
	private String senha;
	@Override
	public String toString() {
		return "Login [nome=" + nome + ", senha=" + senha + "]";
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}

}
