package com.mit.campos;

/**
 *
 * @author T107
 */
public class Usuario2 {
    private String nombre;
    private int id_usuario;
    private String correo;

    public Usuario2(String nombre, int id_usuario, String correo) {
        this.nombre = nombre;
        this.id_usuario = id_usuario;
        this.correo = correo;
        
    }

    @Override
    public String toString() {
        return "Usuario2" + " nombre= " + nombre + ", id_usuario= " + id_usuario + ", correo= " + correo  ;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
   
}
