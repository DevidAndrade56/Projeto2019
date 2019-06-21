
public class Swot {
	private Empregador empregador;
	private Instituicao instituição;
	private String cincow2h;
	private String Intranet;
	private String internet;
	public Empregador getEmpregador() {
		return empregador;
	}
	public void setEmpregador(Empregador empregador) {
		this.empregador = empregador;
	}
	public Instituicao getInstituição() {
		return instituição;
	}
	public void setInstituição(Instituicao instituição) {
		this.instituição = instituição;
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
		return "Swot [empregador=" + empregador + ", instituição=" + instituição + ", cincow2h=" + cincow2h
				+ ", Intranet=" + Intranet + ", internet=" + internet + "]";
	}
	

}
