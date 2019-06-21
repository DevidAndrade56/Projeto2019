package IdSwot;

public abstract class Identificavel<Cadastro> {

	public abstract Long getId();

	public abstract void setId(Long id);
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cadastro other = (Cadastro) obj;
		if (getId() == null) {
			if (((Object) other).getId() != null)
				return false;
		} else if (!getId().equals(((Object) other).getId()))
			return false;
		return true;
	}
}
