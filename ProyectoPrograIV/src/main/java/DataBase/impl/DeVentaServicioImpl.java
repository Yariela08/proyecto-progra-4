package DataBase.impl;

import Entidades.DetalleVenta;
import DataBase.DeVentaServicio;
import Repository.DeVentaRepositorio;

public class DeVentaServicioImpl implements DeVentaServicio {

	private final DeVentaRepositorio deVentaRepositorio;
	
	
	public DeVentaServicioImpl(DeVentaRepositorio deVentaRepositorio) {
		this.deVentaRepositorio = deVentaRepositorio;
	}

	@Override
	public DetalleVenta consultarTodos(Integer clave) {
	return this.deVentaRepositorio.getReferenceById(clave);
	}

	@Override
	public DetalleVenta guardar(DetalleVenta detalleVenta) {
		return this.deVentaRepositorio.save(detalleVenta);
	}

	@Override
	public DetalleVenta actualizar(DetalleVenta detalleVenta) {
		return this.deVentaRepositorio.save(detalleVenta);
	}

	@Override
	public void eliminar(Integer clave) {
		 this.deVentaRepositorio.deleteById(clave);
		
	}

}
