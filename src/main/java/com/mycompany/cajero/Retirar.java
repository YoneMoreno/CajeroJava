/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cajero;

/**
 *
 * @author Yne1
 */
public class Retirar extends Operaciones{

    Retirar(Saldo saldo, int aRetirar) {
        valorUno = saldo.getSaldo();
        valorDos = aRetirar;
    }

    

    @Override
    public void operacion() {
        resultado = valorUno - valorDos;
    }

    @Override
    public void mostrarOperacion() {
        super.mostrarOperacion();
        System.out.println("Usted ha retirado: " + valorDos);
    }
    
    
    
    
}
