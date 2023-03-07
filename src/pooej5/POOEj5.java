/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej5;

import Entidades.CuentaBancaria;
import Servicio.ServicioCuenta;
import java.util.Scanner;

/**
 *
 * @author 54343
 */
public class POOEj5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        CuentaBancaria c1 = new CuentaBancaria();
        double ingresar, retirar = 0;
  
        ServicioCuenta SC = new ServicioCuenta();
        CuentaBancaria C1 = new CuentaBancaria();
        C1 = SC.crearCuenta();
         System.out.println("Que operacion desea realizar");
         System.out.println("Opcion 1: Ingresar dinero");
         System.out.println("Opcion 2: Retirar dinero");
         System.out.println("Opcion 3: Extraccion Rapida");
         System.out.println("Opcion 4: Consultar Saldo");
         System.out.println("Opcion 5: Mostrar Datos");
         System.out.println("Opcion 6: Salir");
         int opc =leer.nextInt();
        
        do {  
            switch (opc) {

                case 1:
                  SC.ingresarDinero(C1);
                  break;
                case 2:
                    SC.retirarDinero(C1, retirar);                    
                    break;
                case 3:
                    SC.extraccionRapida(retirar);
                    break;
                case 4:
                    SC.consultarSaldo(c1);
                    break;
                case 5:
                    SC.mostrarDatos(c1);
                default: 
                    System.out.println("Opción Erronea");
                break;
            }

        } while (opc != 6);  
    }
}
