package DAO;


import java.awt.List;

public class UsuarioDAO<Usuario, E, e> extends DAO<e> {

	public UsuarioDAO() {
		super();
	}

	public List findBy(Usuario a) {
		return (List) a;
	}

	public Usuario getByID(long usuarioId) {
		return null;
	}

	public List getAll() {
		return null;
	}

}