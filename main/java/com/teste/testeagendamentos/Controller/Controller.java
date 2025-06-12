package com.teste.testeagendamentos.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class Controller {

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
}
