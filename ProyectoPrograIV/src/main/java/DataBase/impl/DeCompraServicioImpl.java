package DataBase.impl;

import Entidades.DetalleCompra;
import DataBase.DeCompraServicio;
import Repository.DeCompraRepositorio;

public class DeCompraServicioImpl implements DeCompraServicio {
	
	private final DeCompraRepositorio deCompraRepositorio;
	
	public DeCompraServicioImpl(DeCompraRepositorio deCompraRepositorio) {
		this.deCompraRepositorio = deCompraRepositorio;
	}

	@Override
	public DetalleCompra consultarTodos(Integer clave) {
	
		return this.deCompraRepositorio.getReferenceById(clave);
	}

	@Override
	public DetalleCompra guardar(DetalleCompra detalleCompra) {
		
		return this.deCompraRepositorio.save(detalleCompra);
	}

	@Override
	public DetalleCompra actualizar(DetalleCompra detalleCompra) {
		
		return this.deCompraRepositorio.save(detalleCompra);
	}

	@Override
	public void eliminar(Integer clave) {
		this.deCompraRepositorio.deleteById(clave);
		
	}

}
