package Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Inventario")
public class Inventario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_inventario;
	
	@ManyToOne
	@JoinColumn(name = "id_producto", referencedColumnName = "id_producto")
	private Producto producto;
	
	@Column(name="stock_actual",nullable = false)
	private int stock_actual;
	
	 @Column(name = "fecha_actualizacio", nullable = false)
	private int fecha_actualizacion;

	public Inventario() {
		super();
	}

	public Inventario(int id_inventario, Producto producto, int stock_actual, int fecha_actualizacion) {
		super();
		this.id_inventario = id_inventario;
		this.producto = producto;
		this.stock_actual = stock_actual;
		this.fecha_actualizacion = fecha_actualizacion;
	}

	public int getId_inventario() {
		return id_inventario;
	}

	public void setId_inventario(int id_inventario) {
		this.id_inventario = id_inventario;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public int getStock_actual() {
		return stock_actual;
	}

	public void setStock_actual(int stock_actual) {
		this.stock_actual = stock_actual;
	}

	public int getFecha_actualizacion() {
		return fecha_actualizacion;
	}

	public void setFecha_actualizacion(int fecha_actualizacion) {
		this.fecha_actualizacion = fecha_actualizacion;
	}
	 
	 
}
