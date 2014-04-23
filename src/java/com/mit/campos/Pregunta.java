package com.mit.campos;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author T107
 */
public class Pregunta {
    private int num;
   private ArrayList<Opciones>opciones;
   private String titulo;

    public Pregunta(int num,ArrayList<Opciones> opciones, String titulo) {
        this.opciones = opciones;
        this.titulo = titulo;
         this.num = num;
    }

    public ArrayList<Opciones> getOpciones() {
        return opciones;
    }

    public void setOpciones(ArrayList<Opciones> opciones) {
        this.opciones = opciones;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
   

}
