package br.com.api.pessoa.servicos;

import br.com.api.pessoa.repositores.PessoaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PessoaServico {

    private final PessoaRepository pessoaRepository;

}
