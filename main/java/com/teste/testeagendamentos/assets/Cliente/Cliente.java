package com.teste.testeagendamentos.assets.Cliente;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.ArrayList;

import com.teste.testeagendamentos.assets.Schedule.*;

@Entity
@Table(name = "tb_clientes")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String nome;
    private String email;
    private String numero;
    private boolean horarioagendado;
    private ArrayList<Horario> horarios;

    public Cliente(String nome, String email, String numero){
        this.nome = nome;
        this.email = email;
        this.numero = numero;
        horarioagendado = false;
    }




    public void verificarAgendamento(Cliente cliente){
        if(horarioagendado){
            cliente.verHorarioMarcado();
        }
        else{
            System.err.printf("O cliente $s não tem horario marcado", this.nome);
        }
    }

    public String verHorarioMarcado(){
        String retorno = null;
        for(Horario horario : horarios){
            retorno += horario.getHorario();
        }
        return String.format("os horarios do cliente $s são:" + retorno, nome);
    }

    @Override
    public String toString(){
        return nome;
    }

    
    public String getNome(){
        return nome;
    }
}
