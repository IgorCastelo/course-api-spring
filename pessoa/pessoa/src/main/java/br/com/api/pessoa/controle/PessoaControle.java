package br.com.api.pessoa.controle;

import br.com.api.pessoa.entities.PessoaModelo;
import br.com.api.pessoa.repositores.PessoaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class PessoaControle {


    private final PessoaRepository pr;

     //Rotas
    @GetMapping("/")
    public Iterable<PessoaModelo> listaPessoas(){
        return this.pr.findAll(); //select*from pesoas
    }
    @PostMapping("/")
    public PessoaModelo cadastarPessoa(@RequestBody PessoaModelo pm){
        return this.pr.save(pm);
    }

}

