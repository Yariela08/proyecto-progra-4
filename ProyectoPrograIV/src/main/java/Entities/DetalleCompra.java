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
@Table(name="DetallesCompra")

public class DetalleCompra {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_detalle;
	
	@ManyToOne
    @JoinColumn(name = "id_compra", referencedColumnName = "id_compra")
    private Compras compras;
	
	@ManyToOne
    @JoinColumn(name = "id_producto", referencedColumnName = "id_producto")
    private Producto producto;
	
	
	 @Column(name = "cantidad", nullable = false)
	private int cantidad;
	
	 @Column(name = "precio_unitario", nullable = false)
	private double precio;
	
	 @Column(name = "subtotal", nullable = false)
	private double subtotal;

	public DetalleCompra() {
		super();
	}

	public DetalleCompra(int id_detalle, Compras compras, Producto producto, int cantidad, double precio,
			double subtotal) {
		super();
		this.id_detalle = id_detalle;
		this.compras = compras;
		this.producto = producto;
		this.cantidad = cantidad;
		this.precio = precio;
		this.subtotal = subtotal;
	}

	public int getId_detalle() {
		return id_detalle;
	}

	public void setId_detalle(int id_detalle) {
		this.id_detalle = id_detalle;
	}

	public Compras getCompras() {
		return compras;
	}

	public void setCompras(Compras compras) {
		this.compras = compras;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public double getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}
	
	 
	
}
