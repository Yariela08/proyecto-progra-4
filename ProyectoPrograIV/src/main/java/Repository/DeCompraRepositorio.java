package Repository;
import org.springframework.data.jpa.repository.JpaRepository;


import Entidades.DetalleCompra;

public interface DeCompraRepositorio extends JpaRepository<DetalleCompra, Integer>{

}
