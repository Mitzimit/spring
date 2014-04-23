package com.mit.campos;

/**
 *
 * @author T107
 */
public class Usuario {
    private String nombre;
    private String telefono;
    private float sueldo;
    private int id_usuario;
    private String correo;

    public Usuario(String nombre, String telefono, float sueldo, int id_usuario, String correo) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.sueldo = sueldo;
        this.id_usuario= id_usuario;
        this.correo = correo;
        
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", telefono=" + telefono + ", sueldo=" + sueldo + ", id_usuario=" + id_usuario + ", correo=" + correo + '}';
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
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
