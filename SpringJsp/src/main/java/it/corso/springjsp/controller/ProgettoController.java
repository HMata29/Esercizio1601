package it.corso.springjsp.controller;

import it.corso.springjsp.business.impl.ProgettoBOImpl;
import it.corso.springjsp.model.Progetto;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
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


}
