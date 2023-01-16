package it.corso.springjsp.controller;

import it.corso.springjsp.business.impl.ProgettoBOImpl;
import it.corso.springjsp.model.Progetto;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class ProgettoController {
    @Autowired
    ProgettoBOImpl progettoBO;

    @GetMapping( path = "/index")
    public ModelAndView home(){
        return new ModelAndView("/jsp/index.jsp");
    }

    @GetMapping("getAll")
    public ModelAndView getAll(){
        List<Progetto> lista = progettoBO.getAll();
        return new ModelAndView("/jsp/progetti.jsp","lista",lista);
    }

    @GetMapping("creaProgetto")
    public ModelAndView creaInfo(){
        return new ModelAndView("jsp/crea.jsp");
    }
    @PostMapping("creaProgetto")
    public ModelAndView creaInfo(@RequestParam String nome, String descrizione , String skill){
        Progetto p = new Progetto();
        p.setNome(nome);
        p.setDescrizione(descrizione);
        p.setSkill(skill);
        progettoBO.inserisci(p);
        return new ModelAndView("/jsp/crea.jsp","operation",true);
    }

    @GetMapping("deleteProgetto")
    public ModelAndView delete(@RequestParam String id){
        if(!id.isEmpty()) {
            progettoBO.deleteByid(Long.parseLong(id));
            return new ModelAndView("/jsp/index.jsp");
        }
        return new ModelAndView("/jsp/error.jsp");
    }

    @GetMapping("updateDaLista")
    public ModelAndView UpdateDaLista(@RequestParam String id){
        return new ModelAndView("/jsp/update.jsp", "idDaModificare", id);
    }

    @PostMapping("updateDaLista")
    public ModelAndView updateInfo(@RequestParam String id, @RequestParam String nome , @RequestParam String descrizione, @RequestParam String skill){
        long idLong = Long.parseLong(id);
        progettoBO.update(idLong,nome,descrizione, skill);
        return new ModelAndView("/jsp/index.jsp");
    }



}
