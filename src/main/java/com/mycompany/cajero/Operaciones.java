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
public abstract class Operaciones {

    protected int valorUno, valorDos, resultado;

    public abstract void operacion();

    public void mostrarOperacion() {
        System.out.println("...Efectuando operación...");
    }

    public void imprimirSaldoFinal() {
        System.out.println("Su saldo final es: " + resultado);
    }

    public int getValorUno() {
        return valorUno;
    }

    public void setValorUno(int valorUno) {
        this.valorUno = valorUno;
    }

    public int getValorDos() {
        return valorDos;
    }

    public void setValorDos(int valorDos) {
        this.valorDos = valorDos;
    }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }

}
