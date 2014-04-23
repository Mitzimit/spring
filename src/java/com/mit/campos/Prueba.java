/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mit.campos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
//JAVX PERSISTANCE ES UN FRAMEWORK
@Entity
//estas anotacion pertece a framework determina que esta sera una entidad a la que le corresponde una tabla identica de la bd
@Table(name="prueba")
public class Prueba {
    @Column
    @GeneratedValue
    @Id
    private int id;
    
@Column(name="nombre") 
    private String nombre;
   
  

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
}
