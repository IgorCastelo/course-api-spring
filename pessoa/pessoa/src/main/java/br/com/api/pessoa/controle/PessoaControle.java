package br.com.api.pessoa.controle;

import br.com.api.pessoa.entities.PessoaModelo;
import br.com.api.pessoa.repositores.PessoaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

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

    @PutMapping("/{codigo}")
    public  PessoaModelo alterarPessoatotal(@PathVariable Long codigo, @RequestBody PessoaModelo pm){
        pm.setCodigo(codigo); //seta o id no body(isd esse que foi gerado automaticamente)
        return this.pr.save(pm);

    }
    @PatchMapping("/{codigo}")
    public PessoaModelo alterarPessoaParcial(@PathVariable Long codigo, @RequestBody PessoaModelo pm){
        //obter o registro contido na tabela
        Optional<PessoaModelo> obj = this.pr.findById(codigo); // SELECT*FROM  pessoas wherw codigo = {codigo}

        //converter Optional para pessoa
        PessoaModelo pm2 = obj.get();

        //verificação
        if(pm.getNome()!=null){
            pm2.setNome(pm.getNome());
        }
        if(pm.getIdade()!=null){
            pm2.setIdade(pm.getIdade());
        }
        if(pm.getCidade()!=null){
            pm2.setCidade(pm.getCidade());
        }
        if(pm.getPais()!=null){
            pm2.setPais(pm.getPais());
        }
        //return
        return this.pr.save(pm2);

    }
    @DeleteMapping("/{codigo}")
    public void removerPessoa(@PathVariable Long codigo) {
        this.pr.deleteById(codigo);
    }

}

