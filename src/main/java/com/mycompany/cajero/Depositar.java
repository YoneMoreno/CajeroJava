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
public class Depositar extends Operaciones{

    Depositar(Saldo saldo, int aDepositar) {
        valorUno = saldo.getSaldo();
        valorDos = aDepositar;
    }

    
    
    @Override
    public void operacion() {
        resultado = valorUno + valorDos;
    }

    @Override
    public void mostrarOperacion() {
        super.mostrarOperacion();
        System.out.println("Usted ha depositado: " + valorDos + "!!!");
    }
    
    
    
}
