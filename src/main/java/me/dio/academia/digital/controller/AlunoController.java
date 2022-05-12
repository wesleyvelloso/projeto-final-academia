package me.dio.academia.digital.controller;

import me.dio.academia.digital.entity.Aluno;
import me.dio.academia.digital.entity.AvaliacaoFisica;
import me.dio.academia.digital.entity.form.AlunoForm;
import me.dio.academia.digital.entity.form.AlunoUpdateForm;
import me.dio.academia.digital.service.impl.AlunoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController

@RequestMapping("/alunos")
public class AlunoController {

    @Autowired
    private AlunoServiceImpl alunoService;

    @PostMapping
    public Aluno create(@Valid @RequestBody AlunoForm form){
        return alunoService.create(form);
    }

    @GetMapping("/{id}")
    public Aluno get(@RequestParam(value = "id", required = true) Long id){

        return alunoService.get(id);
    }
    @GetMapping
    public List<Aluno> getAll(@RequestParam(value = "dataDeNascimento", required = false) String dataDeNascimento){

        return alunoService.getAll(dataDeNascimento);
    }
    @GetMapping("/avaliacoes/{id}")
    public List<AvaliacaoFisica> getAllAvalicaoFisicaId(@PathVariable Long id){
        return alunoService.getAllAvaliacaoFisicaId(id);
    }

    @PutMapping("/{id}")
    public Aluno update(@RequestParam(value = "id", required = true) Long id, @Valid @RequestBody AlunoUpdateForm form){
        return alunoService.update(id, form);
    }

    //new
    @DeleteMapping("/{id}")
    public void deleteAluno(@RequestParam(value = "id", required = true) Long id){

        alunoService.delete(id);
    }

}





