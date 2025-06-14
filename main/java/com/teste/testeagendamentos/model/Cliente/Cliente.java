package com.teste.testeagendamentos.model.Cliente;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.ArrayList;

import com.teste.testeagendamentos.model.Schedule.*;

@Entity
@Table(name = "tb_clientes")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nome;

    private String email;

    private String numero;

    private boolean horarioagendado;

    // @OneToMany para um cliente receber varios horarios.
    @OneToMany(mappedBy = "cliente")
    private ArrayList<Horario> horarios;



    public Cliente(String nome, String email, String numero){
        this.nome = nome;
        this.email = email;
        this.numero = numero;
        horarioagendado = false;
    }


    @Override
    public String toString(){
        return nome;
    }

    
    public String getNome(){
        return nome;
    }

    public Long getID(){
        return id;
    }

    public boolean getHorarioAgendado(){
        return horarioagendado;
    }

    public ArrayList<Horario> getHorarios(){
        return horarios;
    }
}
