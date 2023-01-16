package it.corso.springjsp.business.interfaces;

import it.corso.springjsp.model.Progetto;
import org.springframework.dao.DataAccessException;

import java.util.List;

public interface ProgettoBO {

    List <Progetto> getAll() throws DataAccessException;

    void inserisci(Progetto progetto) throws DataAccessException;

    void deleteByid(long id) throws DataAccessException;

    void update(long id, String nome, String descrizione, String skills) throws DataAccessException;
}
