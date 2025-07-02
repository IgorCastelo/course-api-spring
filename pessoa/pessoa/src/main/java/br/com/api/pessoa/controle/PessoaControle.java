package br.com.api.pessoa.controle;

import br.com.api.pessoa.entities.PessoaModelo;
import br.com.api.pessoa.repositores.PessoaRepository;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RequiredArgsConstructor
@RestController
public class PessoaControle {


    private final PessoaRepository pr;

     //Rotas
    @GetMapping("/")
    public ResponseEntity<Iterable <PessoaModelo>>listaPessoas(){
        return new ResponseEntity<>(this.pr.findAll(), HttpStatus.OK); //select*from pesoas
    }

    @PostMapping("/")
    public ResponseEntity<PessoaModelo> cadastarPessoa(@Valid @RequestBody PessoaModelo pm){
        return new ResponseEntity<>(this.pr.save(pm), HttpStatus.CREATED);
    }

    @PutMapping("/{codigo}")
    public ResponseEntity<PessoaModelo> alterarPessoaTotal(@Valid @PathVariable Long codigo, @RequestBody PessoaModelo pm){

        Optional<PessoaModelo> obj = this.pr.findById(codigo);

        if (obj.isPresent()){
            pm.setCodigo(codigo);//seta o id no body(isd esse que foi gerado automaticamente)
            return new ResponseEntity<>(this.pr.save(pm), HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);

    }
    @PatchMapping("/{codigo}")
    public ResponseEntity<PessoaModelo> alterarPessoaParcial(@PathVariable Long codigo, @RequestBody PessoaModelo pm){
        //obter o registro contido na tabela
        Optional<PessoaModelo> obj = this.pr.findById(codigo); // SELECT*FROM  pessoas wherw codigo = {codigo}

        //converter Optional para pessoa
        if (obj.isPresent()){
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
        return new ResponseEntity<>(this.pr.save(pm2), HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);

    }
    @DeleteMapping("/{codigo}")
    public ResponseEntity<Void> removerPessoa(@PathVariable Long codigo) {
        boolean existecodigo = this.pr.existsById(codigo);
        if (existecodigo){
            this.pr.deleteById(codigo);
            return new ResponseEntity<>(HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

}

