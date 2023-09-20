package com.proyectoPri.userRegister.repositories;

import com.proyectoPri.userRegister.entities.Cliente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsuariosRepository extends CrudRepository<Cliente, Long> {

    Optional<Cliente> findBynum_identificacion(String num_identificacion);
    Optional<Cliente> findByid_usuario(String id_usuario);
}
