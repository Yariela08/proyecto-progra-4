package DataBase.impl;

import Entidades.Compras;
import DataBase.CompraServicio;
import Repository.CompraRepositorio;

public class CompraServicioImpl implements CompraServicio {

	private final CompraRepositorio compraRepositorio;
 
	public CompraServicioImpl(CompraRepositorio compraRepositorio) {
	this.compraRepositorio = compraRepositorio;
    }

	@Override
	public Compras consultarTodos(Integer clave) {
		return this.compraRepositorio.getReferenceById(clave);
	}

	@Override
	public Compras guardar(Compras compra) {
		return this.compraRepositorio.save(compra);
	}

	@Override
	public Compras actualizar(Compras compra) {
		return this.compraRepositorio.save(compra);
	}

	@Override
	public void eliminar(Integer clave) {
		this.compraRepositorio.deleteById(clave);
		
	}

}

