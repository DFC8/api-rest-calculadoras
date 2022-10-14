package br.com.dfc8.apirestcalculadoras.service;

import br.com.dfc8.apirestcalculadoras.model.Imc;
import br.com.dfc8.apirestcalculadoras.repository.ImcRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImcService {

    @Autowired
    private ImcRepository imcRepository;

    public void registrarImc(Imc imc){
        imcRepository.save(imc);
    }

    public List<Imc> listarTodos(){
        return imcRepository.findAll();
    }
}
