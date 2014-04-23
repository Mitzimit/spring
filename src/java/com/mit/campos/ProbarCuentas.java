package com.mit.campos;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ProbarCuentas {
    public static void main(String[] args){
        ApplicationContext ctx=new AnnotationConfigApplicationContext(ApConfig.class);
       ServicioCuenta cuenta= ctx.getBean(ServicioCuenta.class);
     //ServicioCuenta cuenta=new CuentaAhorroimpl();
     System.out.println(cuenta.crearCuenta()); 
                     
    }
    
}
