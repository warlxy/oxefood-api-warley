package br.com.ifpe.oxefoodapiwarley.api.promocao;

import br.com.ifpe.oxefoodapiwarley.modelo.promocao.Promocao;
import br.com.ifpe.oxefoodapiwarley.modelo.promocao.PromocaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/promocao")
@CrossOrigin
public class PromocaoController {

    @Autowired
    private PromocaoService promocaoService;

    @PostMapping
    public ResponseEntity<Promocao> save(@RequestBody PromocaoRequest request) {

        Promocao promocao = promocaoService.save(request.build());
        return new ResponseEntity<Promocao>(promocao, HttpStatus.CREATED);
    }

    @GetMapping
    public List<Promocao> listarTodos() {
        return promocaoService.listarTodos();
    }

    @GetMapping("/{id}")
    public Promocao obterPorID(@PathVariable Long id) {
        return promocaoService.obterPorID(id);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Promocao> update(@PathVariable("id") Long id, @RequestBody PromocaoRequest request) {

        promocaoService.update(id, request.build());
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {

        promocaoService.delete(id);
        return ResponseEntity.ok().build();
    }
}
