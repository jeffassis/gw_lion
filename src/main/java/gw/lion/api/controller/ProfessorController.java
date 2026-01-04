package gw.lion.api.controller;

import gw.lion.api.professor.DadosCadastroProfessor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/professores")
public class ProfessorController {

    @PostMapping
    public void createProfessor(@RequestBody DadosCadastroProfessor dados) {
        System.out.println(dados);
    }

}
