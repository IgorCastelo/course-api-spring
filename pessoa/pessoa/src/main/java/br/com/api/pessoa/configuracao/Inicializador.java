package br.com.api.pessoa.configuracao;

import br.com.api.pessoa.entities.PessoaModelo;
import br.com.api.pessoa.repositores.PessoaRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Inicializador implements CommandLineRunner {

    private final PessoaRepository pessoaRepository;

    public Inicializador(PessoaRepository pessoaRepository){
        this.pessoaRepository = pessoaRepository;
    }
    @Override
    public void run(String... args) throws Exception {

        PessoaModelo pessoa1 = new PessoaModelo();
        pessoa1.setNome("Islam Makhachev");
        pessoa1.setIdade(33);
        pessoa1.setCidade("Makhachkala");
        pessoa1.setPais("Rússia");

        PessoaModelo pessoa2 = new PessoaModelo();
        pessoa2.setNome("Marcelo Garcia");
        pessoa2.setIdade(42);
        pessoa2.setCidade("Maringá");
        pessoa2.setPais("Brasil");

        PessoaModelo pessoa3 = new PessoaModelo();
        pessoa3.setNome("Dean Lister");
        pessoa3.setIdade(49);
        pessoa3.setCidade("San Diego");
        pessoa3.setPais("EUA");

        PessoaModelo pessoa4 = new PessoaModelo();
        pessoa4.setNome("Craig Jones");
        pessoa4.setIdade(34);
        pessoa4.setCidade("Adelaide");
        pessoa4.setPais("Austrália");

        PessoaModelo pessoa5 = new PessoaModelo();
        pessoa5.setNome("Rafael Mendes");
        pessoa5.setIdade(36);
        pessoa5.setCidade("Rio Claro");
        pessoa5.setPais("Brasil");

        PessoaModelo pessoa6 = new PessoaModelo();
        pessoa6.setNome("Leandro Lo");
        pessoa6.setIdade(35);
        pessoa6.setCidade("São Paulo");
        pessoa6.setPais("Brasil");

        PessoaModelo pessoa7 = new PessoaModelo();
        pessoa7.setNome("Anderson Silva");
        pessoa7.setIdade(49);
        pessoa7.setCidade("Curitiba");
        pessoa7.setPais("Brasil");

        PessoaModelo pessoa8 = new PessoaModelo();
        pessoa8.setNome("Georges St-Pierre");
        pessoa8.setIdade(43);
        pessoa8.setCidade("Saint-Isidore");
        pessoa8.setPais("Canadá");

        PessoaModelo pessoa9 = new PessoaModelo();
        pessoa9.setNome("Jon Jones");
        pessoa9.setIdade(37);
        pessoa9.setCidade("Rochester");
        pessoa9.setPais("EUA");

        PessoaModelo pessoa10 = new PessoaModelo();
        pessoa10.setNome("Khabib Nurmagomedov");
        pessoa10.setIdade(36);
        pessoa10.setCidade("Makhachkala");
        pessoa10.setPais("Rússia");

        PessoaModelo pessoa11 = new PessoaModelo();
        pessoa11.setNome("Chuck Liddell");
        pessoa11.setIdade(55);
        pessoa11.setCidade("Santa Barbara");
        pessoa11.setPais("EUA");

        PessoaModelo pessoa12 = new PessoaModelo();
        pessoa12.setNome("José Aldo");
        pessoa12.setIdade(38);
        pessoa12.setCidade("Manaus");
        pessoa12.setPais("Brasil");

        PessoaModelo pessoa13 = new PessoaModelo();
        pessoa13.setNome("Randy Couture");
        pessoa13.setIdade(61);
        pessoa13.setCidade("Everett");
        pessoa13.setPais("EUA");

        PessoaModelo pessoa14 = new PessoaModelo();
        pessoa14.setNome("BJ Penn");
        pessoa14.setIdade(46);
        pessoa14.setCidade("Kailua");
        pessoa14.setPais("EUA");

        PessoaModelo pessoa15 = new PessoaModelo();
        pessoa15.setNome("Daniel Cormier");
        pessoa15.setIdade(46);
        pessoa15.setCidade("Lafayette");
        pessoa15.setPais("EUA");

        pessoaRepository.save(pessoa1);
        pessoaRepository.save(pessoa2);
        pessoaRepository.save(pessoa3);
        pessoaRepository.save(pessoa4);
        pessoaRepository.save(pessoa5);
        pessoaRepository.save(pessoa6);
        pessoaRepository.save(pessoa7);
        pessoaRepository.save(pessoa8);
        pessoaRepository.save(pessoa9);
        pessoaRepository.save(pessoa10);
        pessoaRepository.save(pessoa11);
        pessoaRepository.save(pessoa12);
        pessoaRepository.save(pessoa13);
        pessoaRepository.save(pessoa14);
        pessoaRepository.save(pessoa15);

    }
}
