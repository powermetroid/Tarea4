package Cuentas;


import Cuentas.CCuenta;

/**
 * Tarea para Entornos de Desarrollo ED04
 * @author Pablo Santiago
 * @version 1.0
 */
public class Main {

    /**
     *
     * @param args es la variable dentro del metodo
     */
    public static void main(String[] args) {
        CCuenta miCuenta = null;
        double saldoActual;
        /** Cambiamos la variable micuenta por cuenta1*/
        final CCuenta cuenta1 = miCuenta;

    }
/** Introducimos el metodo Operativa_cue
     * @param cantidadn que corresponde al nuevo metodo Operativa_cuenta
    */
    public static void operativa_cuenta(float cantidadn) {
        CCuenta cuenta1;
        double saldoActual;
        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es"+ saldoActual );
        try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}
