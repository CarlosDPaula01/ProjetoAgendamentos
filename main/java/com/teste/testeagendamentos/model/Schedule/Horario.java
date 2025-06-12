package com.teste.testeagendamentos.model.Schedule;

import com.teste.testeagendamentos.model.Cliente.Cliente;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_horarios")
public class Horario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private double hora;

    private double data;

    // @ManyToOne para cada horario ter apenas 1 cliente.
    @ManyToOne
    @JoinColumn(name = "cliente_id") // Foreing Key
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
