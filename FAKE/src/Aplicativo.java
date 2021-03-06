import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Aplicativo {
	@Id
	@GeneratedValue
	private int id;
	private Cadastro cadastro;
	private Login login;
	@Override
	public String toString() {
		return "Aplicativo [cadastro=" + cadastro + ", login=" + login + ", swot=" + swot + ", inst=" + inst + "]";
	}
	public Cadastro getCadastro() {
		return cadastro;
	}
	public void setCadastro(Cadastro cadastro) {
		this.cadastro = cadastro;
	}
	public Login getLogin() {
		return login;
	}
	public void setLogin(Login login) {
		this.login = login;
	}
	public Swot getSwot() {
		return swot;
	}
	public void setSwot(Swot swot) {
		this.swot = swot;
	}
	public Instituicao getInst() {
		return inst;
	}
	public void setInst(Instituicao inst) {
		this.inst = inst;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	private Swot swot;
	private Instituicao inst;
	

}
