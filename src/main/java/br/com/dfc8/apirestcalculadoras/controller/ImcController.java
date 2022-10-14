package br.com.dfc8.apirestcalculadoras.controller;

import br.com.dfc8.apirestcalculadoras.model.Imc;
import br.com.dfc8.apirestcalculadoras.service.ImcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping({"/api/v1/imc"})
public class ImcController {

    @Autowired
    private ImcService imcService;

    @PostMapping
    public ResponseEntity<Imc> registrarImc(@RequestBody Imc registroImc){

        imcService.registrarImc(registroImc);
        return ResponseEntity.badRequest().body(registroImc);
    }

    @GetMapping
    public ResponseEntity<List<Imc>> obterListaImc(){
        return ResponseEntity.ok().body(imcService.listarTodos());
    }
}
