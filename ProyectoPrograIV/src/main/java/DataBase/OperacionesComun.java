package DataBase;

public interface OperacionesComun<T, E> {

	public T consultarTodos(E clave);

	public T guardar(T entidad);

	public T actualizar(T entidad);

	public void eliminar(E clave);

}
