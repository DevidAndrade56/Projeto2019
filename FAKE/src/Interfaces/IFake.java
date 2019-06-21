package Interfaces;

public interface IFake<Cadastro> {
	public <Empregador> void Instituicao (String nome, int CNPJ, Empregador empregador);
	
	public void Empregador (String nome, int CPF);
	
	public <Login> void Aplicativo(Cadastro cadastro, Login login);
	
	public void Cadastro (int cpf, String nome, String email, String senha);
	
	public void Login (String nome, String senha);
	
	public <Empregador, Instituicao> void Swot (Empregador empregador, Instituicao instituição, String cincow2h, 
			String Intranet, String internet);

}
