package IdSwot;

public abstract class Identificavel<Cadastro> {

	public abstract Long getId();

	public abstract void setId(Long id);
	
	@SuppressWarnings({ "unchecked", "unlikely-arg-type" })
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cadastro a = (Cadastro) obj;
		if (getId() == null) {
				return false;
		} else if (!getId().equals(((Object) a).getClass()))
			return false;
		return true;
	}
}


