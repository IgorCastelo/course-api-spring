package br.com.api.pessoa.configuracao;

import br.com.api.pessoa.entities.PessoaModelo;
import br.com.api.pessoa.repositores.PessoaRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Inicializador implements CommandLineRunner {
    @SuppressWarnings("unused")
    private final PessoaRepository pessoaRepository;

    public Inicializador(PessoaRepository pessoaRepository){
        this.pessoaRepository = pessoaRepository;
    }
    @Override
    public void run(String... args) throws Exception {
        //cria a tabela de dados
        String [][] dados = {
                {"Islam Makhachev", "33", "Makhachkala", "Rússia"},
                {"Marcelo Garcia", "42", "Maringá", "Brasil"},
                {"Dean Lister", "49", "San Diego", "EUA"},
                {"Craig Jones", "34", "Adelaide", "Austrália"},
                {"Rafael Mendes", "36", "Rio Claro", "Brasil"},
                {"Leandro Lo", "35", "São Paulo", "Brasil"},
                {"Anderson Silva", "49", "Curitiba", "Brasil"},
                {"Georges St-Pierre", "43", "Saint-Isidore", "Canadá"},
                {"Jon Jones", "37", "Rochester", "EUA"},
                {"Khabib Nurmagomedov", "36", "Makhachkala", "Rússia"},
                {"Chuck Liddell", "55", "Santa Barbara", "EUA"},
                {"José Aldo", "38", "Manaus", "Brasil"},
                {"Randy Couture", "61", "Everett", "EUA"},
                {"BJ Penn", "46", "Kailua", "EUA"},
                {"Daniel Cormier", "46", "Lafayette", "EUA"}
        };

        /*
         1 - Percorre a Lista
         2 - cria nova pessoa vazia
         3 - seta os atributos
         4 - salva no banco de dados*/
        for (String[] pessoa: dados){
            PessoaModelo novaPessoa = new PessoaModelo();
            novaPessoa.setNome(pessoa[0]);
            novaPessoa.setIdade(Integer.parseInt(pessoa[1]));
            novaPessoa.setCidade(pessoa[2]);
            novaPessoa.setPais(pessoa[3]);
            pessoaRepository.save(novaPessoa);
        }

    }
}
