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
public class CuentaNominaimpl extends Cuenta implements ServicioCuenta{

    public String crearCuenta() {
        //aqui va codigo que se conecta a la base de datos que se crea con este tipo de cuenta
        return "Se ha creado con exito una cuenta de nomina";
    }
    
}
