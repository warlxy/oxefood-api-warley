package br.com.ifpe.oxefoodapiwarley.modelo.promocao;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class PromocaoService {

    @Autowired
    private PromocaoRepository repository;

    @Transactional
    public Promocao save(Promocao promocao) {

        promocao.setHabilitado(Boolean.TRUE);
        promocao.setVersao(1L);
        promocao.setDataCriacao(LocalDate.now());
        return repository.save(promocao);
    }

    public List<Promocao> listarTodos() {
        return repository.findAll();
    }

    public Promocao obterPorID(Long id) {
        return repository.findById(id).get();
    }

    @Transactional
    public void update(Long id, Promocao promocaoAlterada) {


//        private String titulo;
//        private LocalDate dataInicio;
//        private LocalDate dataFim;
//        private String regra;
//        private Double valorDesconto;

        Promocao promocao = repository.findById(id).get();
        promocao.setTitulo(promocaoAlterada.getTitulo());
        promocao.setDataInicio(promocaoAlterada.getDataInicio());
        promocao.setDataFim(promocaoAlterada.getDataFim());
        promocao.setRegra(promocaoAlterada.getRegra());
        promocao.setValorDesconto(promocaoAlterada.getValorDesconto());

        promocao.setVersao(promocao.getVersao() + 1);
        repository.save(promocao);
    }

    @Transactional
    public void delete(Long id) {

        Promocao promocao = repository.findById(id).get();
        promocao.setHabilitado(Boolean.FALSE);
        promocao.setVersao(promocao.getVersao() + 1);

        repository.save(promocao);
    }

}
