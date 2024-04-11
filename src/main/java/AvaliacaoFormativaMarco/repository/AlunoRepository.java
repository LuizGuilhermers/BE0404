package AvaliacaoFormativaMarco.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import AvaliacaoFormativaMarco.entities.Aluno;
import AvaliacaoFormativaMarco.entities.Turma;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {
	List<Aluno> findByCidade (String cidade);
	List<Aluno> findByRenda (double renda);
	List<Aluno> findByRa (String ra);
	List<Aluno> findByCidadeAndRenda (String cidade, double renda);

}
