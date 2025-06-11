package com.teste.testeagendamentos.assets.Schedule;

import com.teste.testeagendamentos.assets.Cliente.Cliente;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_horarios")
public class Horario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private double hora;
    private double data;
    private Cliente cliente;

    public Horario(){
    }

    @Override
    public String toString(){
        return cliente.getNome() + " " + hora + " " + data;
    }

    public String getHorario(){
        return hora + " " + data + "\n";
    }

}
