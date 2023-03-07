/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.CuentaBancaria;
import java.util.Scanner;

/**
 *
 * @author 54343
 */
public class ServicioCuenta {
        CuentaBancaria c1 = new CuentaBancaria();
        Scanner leer = new Scanner(System.in);
     public CuentaBancaria crearCuenta(){
        System.out.println("Ingrese su número de cuenta");
        c1.setNumeroCuenta(leer.nextInt());
        System.out.println("Ingrese su dni");
        c1.setDni(leer.nextLong());       
        System.out.println("Ingrese el dinero a acreditar como saldo");
        c1.setSaldo(leer.nextDouble());
        
        return c1;
              
        
    }
    
    
    public double ingresarDinero(CuentaBancaria c1){
        System.out.println("Ingrese el monto que desea ingresar a al cuenta");
        double deposito;
        Scanner leer = new Scanner(System.in);
        deposito = leer.nextInt();
        
       deposito = c1.getSaldo() + deposito;
        c1.setSaldo(deposito);
        return deposito;
        
    }
    
    public double retirarDinero(CuentaBancaria c1, double dinero){
        System.out.println("Ingrese el monto que desea retirar a al cuenta");
        double retiro;
        Scanner leer = new Scanner(System.in);
        retiro = leer.nextDouble();
        
        if (retiro <= dinero){
            dinero -= (int) retiro;
        } else {
            retiro = 0;
        }
        c1.setSaldo(retiro);
        return retiro;
    }
    
    public double extraccionRapida(double retiro){
        Scanner leer = new Scanner(System.in);
        System.out.println("Extraccion rapida");
        int extraccion = leer.nextInt(); 
        if (extraccion <= retiro * 0.2){
            retiro -= extraccion;
        } else {
            System.out.println("El valor a retirar supera el 20% del saldo actual");
        }
        c1.setSaldo(retiro);
        return retiro;
        
        
    }
    
    public void consultarSaldo(CuentaBancaria c1){
        
               
        System.out.println(c1.getSaldo());
    }
    
    public void mostrarDatos(CuentaBancaria c1){
        
        System.out.println("Numero de cuenta: "+c1.getNumeroCuenta());
        System.out.println("DNI Titular de la cuenta: "+c1.getDni());
        System.out.println("Saldo en la cuenta: "+c1.getSaldo());
        
        
                
    }

}
