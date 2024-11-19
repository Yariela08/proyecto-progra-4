package Entities;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Compras")
public class Compras {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_compra")
	private int id;
	
	private LocalDateTime fecha;
	
	private double total;
	
	 @ManyToOne
	 @JoinColumn(name = "id_proveedor", referencedColumnName = "id_proveedor")
	 private Proveedor proveedor;

	public Compras() {
		super();
	}

	public Compras(int id, LocalDateTime fecha, double total, Proveedor proveedor) {
		super();
		this.id = id;
		this.fecha = fecha;
		this.total = total;
		this.proveedor = proveedor;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocalDateTime getFecha() {
		return fecha;
	}

	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public Proveedor getProveedor() {
		return proveedor;
	}

	public void setProveedor(Proveedor proveedor) {
		this.proveedor = proveedor;
	}
	 
	 
	
}

