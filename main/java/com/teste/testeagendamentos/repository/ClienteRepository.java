package com.teste.testeagendamentos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.teste.testeagendamentos.model.Cliente.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{

    boolean findById();

}
