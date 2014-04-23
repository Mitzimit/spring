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
public class ProbarDAO  {
    public static void main(String args[]){
    DAOPruebaImpl d=new DAOPruebaImpl();
   
Prueba p=new Prueba();
p.setNombre("mitzi");
p.setId(1);
d.actualizaReg(p);
ArrayList<Prueba> pr=d.buscarTodos();
for(Prueba i:pr){
    System.out.println("id: "+i.getId()+" Nombre:  "+i.getNombre());
}
    }
    
    
    
}

