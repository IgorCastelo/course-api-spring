package br.com.api.pessoa.controle;
import br.com.api.pessoa.entities.PessoaModelo;
import br.com.api.pessoa.servicos.PessoaServico;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RequiredArgsConstructor
@RestController
public class PessoaControle {


    private final PessoaServico ps;

     //Rotas
    @GetMapping("/")
    public ResponseEntity<Iterable <PessoaModelo>>listaPessoas(){
        return  this.ps.listaPessoas();
    }

    @PostMapping("/")
    public ResponseEntity<PessoaModelo> cadastarPessoa(@Valid @RequestBody PessoaModelo pm){
        return this.ps.cadastarPessoa(pm);
    }

    @PutMapping("/{codigo}")
    public ResponseEntity<PessoaModelo> alterarPessoaTotal(@Valid @PathVariable Long codigo, @RequestBody PessoaModelo pm){

       return this.ps.alterarPessoaTotal(codigo,pm);

    }
    @PatchMapping("/{codigo}")
    public ResponseEntity<PessoaModelo> alterarPessoaParcial(@PathVariable Long codigo, @RequestBody PessoaModelo pm){
        //obter o registro contido na tabela
        return this.ps.alterarPessoaParcial(codigo,pm);

    }
    @DeleteMapping("/{codigo}")
    public ResponseEntity<Void> removerPessoa(@PathVariable Long codigo) {
       return this.ps.removerPessoa(codigo);

    }
}

