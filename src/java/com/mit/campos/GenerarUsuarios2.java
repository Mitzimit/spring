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
public class GenerarUsuarios2 {
    public static ArrayList<Usuario2> oo(){
        ArrayList<Usuario2> usuario2=new ArrayList<Usuario2>();
        Usuario2 u01=new Usuario2("mitzy", 0001, "lhvv@.com");
        Usuario2 u02=new Usuario2("carlos", 0002, "hbkb@.com");
        Usuario2 u03=new Usuario2("alexis", 0003, "lsdg@.com");
        
        usuario2.add(u01);
        usuario2.add(u02);
        usuario2.add(u03);
        
        return usuario2;
    }
    
}
