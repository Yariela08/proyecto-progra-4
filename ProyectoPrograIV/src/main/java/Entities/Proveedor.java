package Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Proveedores")

public class Proveedor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_proveedor")
	private int id;
	
	@Column(name = "nombre", nullable= false)
	private String nombre;
	
	@Column(name = "telefono", nullable= false)
	private String telefono;
	
	 @Column(name = "email")
	private String email;
	
	@Column(name = "direccion")
	private String direccion;

	public Proveedor() {
		super();
	}

	public Proveedor(int id, String nombre, String telefono, String email, String direccion) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.telefono = telefono;
		this.email = email;
		this.direccion = direccion;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	
	
}
