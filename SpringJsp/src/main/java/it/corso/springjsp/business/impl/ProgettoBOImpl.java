package it.corso.springjsp.business.impl;

import it.corso.springjsp.business.interfaces.ProgettoBO;
import it.corso.springjsp.model.Progetto;
import it.corso.springjsp.repository.ProgettoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProgettoBOImpl implements ProgettoBO {

    @Autowired
    ProgettoRepository progettoRepository;


    @Override
    public List<Progetto> getAll() throws DataAccessException {
        return progettoRepository.findAll();
    }

    @Override
    public void inserisci(Progetto progetto) throws DataAccessException {
        progettoRepository.save(progetto);
    }

    @Override
    public void deleteByid(long id) throws DataAccessException {
        progettoRepository.deleteById(id);
    }

    @Override
    public void update(long id, String nome, String descrizione, String skills) throws DataAccessException {
        Progetto p = progettoRepository.findById(id).orElseThrow();
        p.setNome(nome);
        p.setDescrizione(descrizione);
        p.setSkill(skills);
        progettoRepository.save(p);
    }
}
