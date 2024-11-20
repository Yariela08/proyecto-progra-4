import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


@Entity
@Table(name="DetallesVenta")
public class DetalleVenta {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idDetalle;
	
	 @ManyToOne
	 @JoinColumn(name = "id_venta", referencedColumnName = "id_venta")
	 private Venta venta;
	 
	 @ManyToOne
	 @JoinColumn(name = "id_producto", nullable = false, referencedColumnName = "id_producto")
	 private Producto producto;
	 
	 @Column(name = "cantidad", nullable= false)
	 private int cantidad;
	 
	 @Column(name = "precio_unitario", nullable= false)
	 private double precio;
	 
	 @Column(name = "subtotal", nullable= false)
	 private double subtotal;

	 
	public DetalleVenta() {
		super();
	}

	public DetalleVenta(int idDetalle, Venta venta, Producto producto, int cantidad, double precio, double subtotal) {
		super();
		this.idDetalle = idDetalle;
		this.venta = venta;
		this.producto = producto;
		this.cantidad = cantidad;
		this.precio = precio;
		this.subtotal = subtotal;
	}

	public int getIdDetalle() {
		return idDetalle;
	}

	public void setIdDetalle(int idDetalle) {
		this.idDetalle = idDetalle;
	}

	public Venta getVenta() {
		return venta;
	}

	public void setVenta(Venta venta) {
		this.venta = venta;
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
