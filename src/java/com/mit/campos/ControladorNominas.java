package com.mit.campos;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
/**
 * 
 * @author T107
 * URI
 */

@Controller
@RequestMapping("/servicio-cuenta")
public class ControladorNominas {
    @RequestMapping(value="/tipo/{tipo}", method=RequestMethod.GET)
    public String obtenerNomina(@PathVariable String tipo,Model model){
        String mensaje="tu estas interesado en un tipo de cuenta "+tipo;
        model.addAttribute("minomina", mensaje);
        
        return "servicioNomina";
        
    }
    
     @RequestMapping(value="/tipo", method=RequestMethod.GET)
     public String obtenerNom(Model model){
        String mensaje="que cuenta es de tu interes??";
        model.addAttribute("minomina", mensaje);
        
        return "servicioNomina";
        
    }
}
