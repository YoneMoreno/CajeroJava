/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cajero;

import java.util.Scanner;

/**
 *
 * @author Yne1
 */
public class Main {

    public static void main(String[] args) {
        int respuesta;
        Saldo saldo = new Saldo(500);

        do {

            System.out.println(">>Por favor, seleccione una opcion: ");
            System.out.println("    1. Consulta de saldo");
            System.out.println("    2. Retiro de efectivo");
            System.out.println("    3. Deposito de efectivo");
            System.out.println("    4. Salir");

            Scanner scanner = new Scanner(System.in);
            respuesta = scanner.nextInt();

            switch (respuesta) {
                case 1:
                    System.out.println("----------------------------------------\n");
                    System.out.println("Su saldo es: " + saldo.getSaldo());
                    System.out.println("----------------------------------------\n");
                    break;
                case 2:
                    System.out.println("----------------------------------------\n");
                    System.out.println("¿Cuanto efectivo desea retirar??");
                    int aRetirar = scanner.nextInt();
                    Operaciones retirar = new Retirar(saldo, aRetirar);
                    retirar.operacion();
                    saldo.setSaldo(retirar.getResultado());
                    System.out.println("----------------------------------------\n");
                    retirar.mostrarOperacion();
                    retirar.imprimirSaldoFinal();
                    System.out.println("----------------------------------------\n");
                    break;
                case 3:
                    System.out.println("----------------------------------------\n");
                    System.out.println("¿¿¿Cuanto desea depositar???");
                    int aDepositar = scanner.nextInt();
                    Operaciones depositar = new Depositar(saldo, aDepositar);
                    depositar.operacion();
                    saldo.setSaldo(depositar.getResultado());
                    System.out.println("----------------------------------------\n");
                    depositar.mostrarOperacion();
                    depositar.imprimirSaldoFinal();
                    System.out.println("----------------------------------------\n");
                    break;
            }
        } while (respuesta != 4);

        System.out.println("----------------------------------------\n");
        System.out.println("¡¡¡Gracias por usar nuestro cajero!!!");
        System.out.println("----------------------------------------\n");

    }
}
