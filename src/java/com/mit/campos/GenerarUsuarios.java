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
public class GenerarUsuarios {
    public static ArrayList<Usuario> obtenerUsuario(){
        ArrayList<Usuario> usuarios=new ArrayList<Usuario>();
        Usuario u1=new Usuario("Alexis Nájea", "31906611", 150000, 01, "ldkbf@sdfjb.com");
        Usuario u2=new Usuario("Carlos Hernández", "52698743", 50000, 02, "ldkbf@sdfjb.com");
        Usuario u3=new Usuario("Noemi Hernández", "40881396", 270000, 03, "ldkbf@sdfjb.com");
        Usuario u4=new Usuario("Alejandro Guerrero", "26498036", 200000, 04, "ldkbf@sdfjb.com");
        Usuario u5=new Usuario("Irma Nájera", "15383100", 250000, 05, "ldkbf@sdfjb.com");
        
        usuarios.add(u1);
        usuarios.add(u2);
        usuarios.add(u3);
        usuarios.add(u4);
        usuarios.add(u5);
        
        return usuarios;
    }
    
}
