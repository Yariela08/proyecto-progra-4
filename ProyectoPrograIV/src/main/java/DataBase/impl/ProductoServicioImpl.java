package DataBase.impl;

import Entidades.Producto;
import DataBase.ProductoServicio;
import Repository.ProductoRepositorio;

public class ProductoServicioImpl implements ProductoServicio {
	private final ProductoRepositorio productoRepositorio;
	
	public ProductoServicioImpl(ProductoRepositorio productoRepositorio) {
		this.productoRepositorio = productoRepositorio;
	}

	@Override
	public Producto consultarTodos(Integer clave) {
		
		return this.productoRepositorio.getReferenceById(clave);
	}

	@Override
	public Producto guardar(Producto producto) {
		
		return this.productoRepositorio.save(producto);
	}

	@Override
	public Producto actualizar(Producto producto) {
		return this.productoRepositorio.save(producto);
	}

	@Override
	public void eliminar(Integer clave) {
		this.productoRepositorio.deleteById(clave);
	}

}
