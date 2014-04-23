/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mit.campos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping(value="/empresax")
public class ControladorVistas {
    
    @Autowired ServicioCuenta cuenta;
    
    @RequestMapping(value="/administracion" )
    public String accesoAnominas(){
        return "administracion";
    }
    
    @RequestMapping(value="/nominas.aspx" )
    public String accesonominas(Model model){
        model.addAttribute("gatonejo", cuenta.crearCuenta());
        return "algodon";
    }
 
}
