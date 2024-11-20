package Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import Entidades.Producto;


public interface ProductoRepositorio extends JpaRepository<Producto, Integer>{

}
