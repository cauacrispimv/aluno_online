package com.exemplo.aluno.controller;

import com.exemplo.aluno.model.Aluno;
import com.exemplo.aluno.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

    @Autowired
    private AlunoRepository alunoRepository;

    @GetMapping
    public List<Aluno> listarTodos() {
        return alunoRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Aluno> buscarPorId(@PathVariable Long id) {
        return alunoRepository.findById(id);
    }

    @PostMapping
    public Aluno criarAluno(@RequestBody Aluno aluno) {
        return alunoRepository.save(aluno);
    }

    @DeleteMapping("/{id}")
    public void deletarAluno(@PathVariable Long id) {
        alunoRepository.deleteById(id);
    }
}
