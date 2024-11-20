package DataBase.impl;

import Entidades.Proveedor;
import DataBase.ProveedorServicio;
import Repository.ProveedorRepositorio;

public class ProveedorServicioImpl implements ProveedorServicio{
	private final ProveedorRepositorio proveedorRepositorio;
	
	
	public ProveedorServicioImpl(ProveedorRepositorio proveedorRepositorio) {
		this.proveedorRepositorio = proveedorRepositorio;
	}

	@Override
	public Proveedor consultarTodos(Integer clave) {
		
		return this.proveedorRepositorio.getReferenceById(clave);
	}

	@Override
	public Proveedor guardar(Proveedor proveedor) {
		return this.proveedorRepositorio.save(proveedor);
	}

	@Override
	public Proveedor actualizar(Proveedor proveedor) {
		return this.proveedorRepositorio.save(proveedor);
	}

	@Override
	public void eliminar(Integer clave) {
	this.proveedorRepositorio.deleteById(clave);
		
	}

}

}
