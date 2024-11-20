package DataBase.impl;

import Entidades.Cliente;
import DataBase.ClienteServicio;
import Repository.ClienteRepositorio;

public class ClienteServicioImpl implements ClienteServicio {
	
	private final ClienteRepositorio clienteRepositorio;
	
	
	public ClienteServicioImpl(ClienteRepositorio clienteRepositorio) {
		this.clienteRepositorio = clienteRepositorio;
	}

	@Override
	public Cliente consultarTodos(Integer clave) {
		return this.clienteRepositorio.getReferenceById(clave);
	}

	@Override
	public Cliente guardar(Cliente cliente) {
		return this.clienteRepositorio.save(cliente);
	}

	@Override
	public Cliente actualizar(Cliente cliente) {
		return this.clienteRepositorio.save(cliente);
	}

	@Override
	public void eliminar(Integer clave) {
		this.clienteRepositorio.deleteById(clave);
		
	}

}

