package DataBase.impl;

import Entidades.Venta;
import DataBase.VentaServicio;
import Repository.VentaRepositorio;

public class VentaServicioImpl implements VentaServicio{

	private final VentaRepositorio ventaRepositorio;
	
	
	public VentaServicioImpl(VentaRepositorio ventaRepositorio) {
		this.ventaRepositorio = ventaRepositorio;
	}

	@Override
	public Venta consultarTodos(Integer clave) {
		return this.ventaRepositorio.getReferenceById(clave);
	}

	@Override
	public Venta guardar(Venta venta) {
		
		return this.ventaRepositorio.save(venta);
	}

	@Override
	public Venta actualizar(Venta venta) {
		return this.ventaRepositorio.save(venta);
	}

	@Override
	public void eliminar(Integer clave) {
		this.ventaRepositorio.deleteById(clave);
		
	}

}
