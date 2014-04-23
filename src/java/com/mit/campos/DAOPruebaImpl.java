/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mit.campos;

import java.util.ArrayList;
import org.hibernate.Query;


/**
 *
 * @author T107
 */
public class DAOPruebaImpl extends DAO{
        //------------------------- INSERTS------------------------------------------
    public void insertarRegistro(Prueba p){
    
    begin();
    //contiene la clase dao
    getSession().save(p);
    commit();
    close();
    System.out.println("registro insertado");
    }
        //------------------------- ACTUALIZACIONES------------------------------------------
    public void actualizaReg(Prueba P){
    begin();
    getSession().update(P);
    commit();
    close();
    
    System.out.println("registro MODIFICADO");
    
    
    }
    //------------------------- BUSQUEDAS------------------------------------------
    public ArrayList<Prueba>buscarTodos(){
    begin();
Query q= getSession().createQuery("from Prueba");
   ArrayList<Prueba> pr=(ArrayList<Prueba>) q.list();
 
    
    commit();
    close();
  
    System.out.println("Resultados");
        return pr;
    
    }
}
