/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mit.campos;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author T107
 */
@Controller
@RequestMapping("/vistaete")
public class ControladorETE {
    
      
    @RequestMapping(value="/h")
  
    public String  vistaresultado(Model model){
    Usuario2  H=new Usuario2("homero simpson",1,"hola@hotmail.com");
    model.addAttribute("hola",H);
    return "resultados";}
}
