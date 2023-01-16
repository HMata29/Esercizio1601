package it.corso.springjsp.repository;

import it.corso.springjsp.model.Progetto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProgettoRepository extends JpaRepository <Progetto, Long> {
}
