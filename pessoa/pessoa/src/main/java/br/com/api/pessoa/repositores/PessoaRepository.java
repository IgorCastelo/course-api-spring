package br.com.api.pessoa.repositores;

import br.com.api.pessoa.entities.PessoaModelo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaRepository extends CrudRepository<PessoaModelo, Long> {
}
