package Services;

import java.util.List;

import IdSwot.Identificavel;

public interface Services<E extends Identificavel> {
	void save(E e);

	void update(E e);

	void remove(E e);

	E getByID(long userId);

	List<E> getAll();

}
