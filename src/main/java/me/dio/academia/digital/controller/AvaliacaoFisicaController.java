package me.dio.academia.digital.controller;

import me.dio.academia.digital.entity.Aluno;
import me.dio.academia.digital.entity.AvaliacaoFisica;
import me.dio.academia.digital.entity.form.AlunoUpdateForm;
import me.dio.academia.digital.entity.form.AvaliacaoFisicaForm;
import me.dio.academia.digital.entity.form.AvaliacaoFisicaUpdateForm;
import me.dio.academia.digital.service.impl.AvaliacaoFisicaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/avaliacoes")
public class AvaliacaoFisicaController {

    @Autowired
    private AvaliacaoFisicaServiceImpl avaliacaoService;

    @PostMapping
    public AvaliacaoFisica create (@Valid @RequestBody AvaliacaoFisicaForm form){
            return avaliacaoService.create(form);
    }

    @GetMapping("/{id}")
    public AvaliacaoFisica get(@RequestParam(value = "id", required = true) Long id){

        return avaliacaoService.get(id);
    }

    @GetMapping
    public List<AvaliacaoFisica> getAll(){

        return avaliacaoService.getAll();
    }

    @PutMapping("/{id}")
    public AvaliacaoFisica update(@RequestParam(value = "id", required = true) Long id, @RequestBody AvaliacaoFisicaUpdateForm form){
        return avaliacaoService.update(id, form);
    }

    @DeleteMapping("/{id}")
    public void deleteAvaliacao(@RequestParam(value = "id", required = true) Long id){

        avaliacaoService.delete(id);
    }


}
