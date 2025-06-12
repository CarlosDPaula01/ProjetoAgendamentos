package com.teste.testeagendamentos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.teste.testeagendamentos.model.Schedule.Horario;

public interface AgendamentosRepository extends JpaRepository<Horario, Long>{
}
