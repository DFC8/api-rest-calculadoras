package br.com.dfc8.apirestcalculadoras.repository;

import br.com.dfc8.apirestcalculadoras.model.Imc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImcRepository extends JpaRepository<Imc, Integer> {
}
