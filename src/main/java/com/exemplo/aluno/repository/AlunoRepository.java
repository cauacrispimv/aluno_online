package com.exemplo.aluno.repository;

import com.exemplo.aluno.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {
}
