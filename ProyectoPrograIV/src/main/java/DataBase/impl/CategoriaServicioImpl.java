package DataBase.impl;

import Entidades.Categoria;
import DataBase.CategoriaServicio;
import Repository.CategoriaRepositorio;

public class CategoriaServicioImpl implements CategoriaServicio {

       public CategoriaRepositorio  categoriaRepositorio;
	
	public CategoriaServicioImpl(CategoriaRepositorio categoriaRepositorio) {
		this.categoriaRepositorio = categoriaRepositorio;
	}

	@Override
	public Categoria consultarTodos(Integer clave) {
		return this.categoriaRepositorio.getReferenceById(clave);
	}

	@Override
	public Categoria guardar(Categoria categoria) {
		return this.categoriaRepositorio.save(categoria);
	}

	@Override 
	public Categoria actualizar(Categoria categoria) {
		return this.categoriaRepositorio.save(categoria);
	}

	@Override
	public void eliminar(Integer clave) {
		this.categoriaRepositorio.deleteById(clave);
		
	}
	

}
