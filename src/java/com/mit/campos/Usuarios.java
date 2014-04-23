/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mit.campos;

/**
 *
 * @author T107
 */
public class Usuarios {
    String nombre;
    Cuenta Cuenta;

    public Usuarios(String nombre, Cuenta Cuenta) {
        this.nombre = nombre;
        this.Cuenta = Cuenta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Cuenta getCuenta() {
        return Cuenta;
    }

    public void setCuenta(Cuenta Cuenta) {
        this.Cuenta = Cuenta;
    }
  /*CREATE TABLE cuentas(saldo float,numero int)CREATE TABLE cuentas(numero int,saldo float ,foreign key(numero)
 references usuarios(cuenta))  */
}
