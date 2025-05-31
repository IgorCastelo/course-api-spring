package br.com.api.pessoa.controle;

import br.com.api.pessoa.repositores.PessoaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
@RequiredArgsConstructor
@RestController
public class PessoaControle {

    
    private  final PessoaRepository pr;


    @GetMapping("/mensagem")
    public String mensagem() {
        return "Utilizando o devtools";
    }

    @GetMapping("apresentacao/{nome}")
    public String apresentacao(@PathVariable String nome){
        return "Olá " + nome;
    }
}

/*Injeção de dependências - Construtor.txt

Injeção de dependências – Construtor

Vantagens:
        - Garante que o objeto estará disponível, já que é o primeiro método a ser executado;
- Segurança, pois o atributo é imutável;
- Facilidade para trabalhar com testes unitários;
- Annotation @Autowired:
        - Caso a classe tenha apenas um construtor, não é necessário utilizar a annotation (Versão 4.3 ou superior);
    - Caso a classe tenha mais de um construtor, utilize a annotation.
        - Flexibilidade de migração para outros frameworks (Guice ou CDI no Java EE).

Desvantagens:
        - Estrutura mais complexa (Comparado com a injeção via atributo);
- As dependências não podem ser alteradas após a criação do objeto.*/
