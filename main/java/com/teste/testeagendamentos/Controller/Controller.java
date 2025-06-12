package com.teste.testeagendamentos.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import com.teste.testeagendamentos.service.service;
import com.teste.testeagendamentos.model.Cliente.Cliente;
import com.teste.testeagendamentos.model.Schedule.Horario;

@RestController
@RequestMapping
public class Controller {

    // injenção de dependẽncia
    private final service schedulerServices;


    public Controller(service schedulerServices){
        this.schedulerServices = schedulerServices;

    }


    @GetMapping("/home")
    public String Home(){
        return "bomdia minha ameixinha lindinha, meu moranguinho docinho que amo";
    }

    @GetMapping("/agendamento")
    public String Agendamento(){
        return "pagina para agendamenro de horarios";
    }

    @GetMapping("/galery")
    public String Galeria(){
        return "imagens dos nossos cortes";
    }

    @GetMapping
    public String marcarHorario(){
        return schedulerServices.marcarHorario();
    }

    @GetMapping
    public String remarcarHorario(){
        return schedulerServices.remarcarHorario();
    }

    @GetMapping
    public String desmarcarHorario(){
        return schedulerServices.desmarcarHorario();
    }

    @GetMapping
    public List<Cliente> listarClientes(){
        return schedulerServices.listarClientes();
    }

    @GetMapping List<Horario> listarHorarios(){
        return schedulerServices.listarHorarios();
    }
}
