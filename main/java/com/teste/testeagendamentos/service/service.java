package com.teste.testeagendamentos.service;

import org.springframework.stereotype.Service;

import java.util.List;

import com.teste.testeagendamentos.repository.AgendamentosRepository;
import com.teste.testeagendamentos.repository.ClienteRepository;
import com.teste.testeagendamentos.model.Cliente.Cliente;
import com.teste.testeagendamentos.model.Schedule.Horario;


@Service
public class service {

    private final AgendamentosRepository agendamentosRepository;

    private final ClienteRepository clienteRepository;

    public service(AgendamentosRepository agendamentosRepository, ClienteRepository clienteRepository){
        this.agendamentosRepository = agendamentosRepository;
        this.clienteRepository = clienteRepository;
    }


    public List<Cliente> listarClientes(){
        return clienteRepository.findAll();
    }

    public List<Horario> listarHorarios(){
        return agendamentosRepository.findAll();
    }

    public String marcarHorario(){
        return "o horario foi marcado";
    }

    public String remarcarHorario(){
        return "o horario foi remarcado";
    }

    public String desmarcarHorario(){
        return "o horario foi desmarcado";
    }

    public String verHorarioMarcado(Cliente cliente){
        String retorno = null;
        for(Horario horario : cliente.getHorarios()){
            retorno += horario.getHorario();
        }
        return String.format("Os horarios do cliente $s são:" + retorno, cliente.getNome());
    }

    public void verificarAgendamento(Cliente cliente){
        if(clienteRepository.existsById(cliente.getID())){
            if(cliente.getHorarioAgendado()){
                verHorarioMarcado(cliente);
            }
            else{
                System.err.printf("o cliende $s não tem horario marcado", cliente.getNome());
            }
        }
        else{
            System.err.printf("o cliente $s não existe", cliente.getNome());
        }
    }
}
