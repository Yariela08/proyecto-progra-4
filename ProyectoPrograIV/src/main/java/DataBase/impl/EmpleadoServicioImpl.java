package DataBse.impl;

import Entidades.Empleado;
import DataBase.EmpleadoServicio;
import Repository.EmpleadoRepositorio;

public class EmpleadoServicioImpl implements EmpleadoServicio {

	private final EmpleadoRepositorio empleadoRepositorio;
 
 
	public EmpleadoServicioImpl(EmpleadoRepositorio empleadoRepositorio) {
	this.empleadoRepositorio = empleadoRepositorio;
}

	@Override
	public Empleado consultarTodos(Integer clave) {
		
		return this.empleadoRepositorio.getReferenceById(clave);
	}

	@Override
	public Empleado guardar(Empleado empleado) {		
		return this.empleadoRepositorio.save(empleado);
	}

	@Override
	public Empleado actualizar(Empleado empleado) {
		return this.empleadoRepositorio.save(empleado);
	}

	@Override
	public void eliminar(Integer clave) {
		this.empleadoRepositorio.deleteById(clave);
		
	}

}
