package DataBase.impl;

import Entidades.Inventario;
import DataBase.InventarioServicio;
import Repository.InventarioRepositorio;

public class InventarioServicioImpl implements InventarioServicio{

	
	private final InventarioRepositorio inventarioRepositorio;
	
	
	public InventarioServicioImpl(InventarioRepositorio inventarioRepositorio) {
		super();
		this.inventarioRepositorio = inventarioRepositorio;
	}

	@Override
	public Inventario consultarTodos(Integer clave) {
	
		return this.inventarioRepositorio.getReferenceById(clave);
	}

	@Override
	public Inventario guardar(Inventario inventario) {
		return this.inventarioRepositorio.save(inventario);
	}

	@Override
	public Inventario actualizar(Inventario inventario) {
		return this.inventarioRepositorio.save(inventario);
	}

	@Override
	public void eliminar(Integer clave) {
		this.inventarioRepositorio.deleteById(clave);
		
	}

}
