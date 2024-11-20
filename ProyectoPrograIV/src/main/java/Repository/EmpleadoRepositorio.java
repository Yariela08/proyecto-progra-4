package Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import ProyectopIV.Entidades.Empleado;

public interface EmpleadoRepositorio extends JpaRepository<Empleado, Integer> {

}
