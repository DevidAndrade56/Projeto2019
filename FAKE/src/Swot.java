
public class Swot {
	private Empregador empregador;
	private Instituicao institui��o;
	private String cincow2h;
	private String Intranet;
	private String internet;
	public Empregador getEmpregador() {
		return empregador;
	}
	public void setEmpregador(Empregador empregador) {
		this.empregador = empregador;
	}
	public Instituicao getInstitui��o() {
		return institui��o;
	}
	public void setInstitui��o(Instituicao institui��o) {
		this.institui��o = institui��o;
	}
	public String getCincow2h() {
		return cincow2h;
	}
	public void setCincow2h(String cincow2h) {
		this.cincow2h = cincow2h;
	}
	public String getIntranet() {
		return Intranet;
	}
	public void setIntranet(String intranet) {
		Intranet = intranet;
	}
	public String getInternet() {
		return internet;
	}
	public void setInternet(String internet) {
		this.internet = internet;
	}
	@Override
	public String toString() {
		return "Swot [empregador=" + empregador + ", institui��o=" + institui��o + ", cincow2h=" + cincow2h
				+ ", Intranet=" + Intranet + ", internet=" + internet + "]";
	}
	

}
