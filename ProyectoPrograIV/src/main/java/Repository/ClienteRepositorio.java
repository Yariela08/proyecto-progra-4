package Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Entidades.Cliente;


public interface ClienteRepositorio extends JpaRepository<Cliente, Integer>{

}
