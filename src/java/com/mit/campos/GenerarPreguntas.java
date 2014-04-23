/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mit.campos;

import java.util.ArrayList;

/**
 *
 * @author T107
 */
public class GenerarPreguntas {
    public ArrayList<Pregunta> obtenerPreguntas(){
    ArrayList<Pregunta> preg=new ArrayList<Pregunta>();
     ArrayList<Opciones> opc=new ArrayList<Opciones>();
    Opciones op11=new Opciones("tokio",true);
    Opciones op12=new Opciones("tokigo",false);
   opc.add(op12);
    opc.add(op11);
    Pregunta p1=new Pregunta(1,opc,"capital de japon");
    preg.add(p1);
    return preg;
    }
    
}
