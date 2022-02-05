package Cuentas;


import Cuentas.CCuenta;

/**
 * Tarea para Entornos de Desarrollo ED04
 * @author Pablo Santiago
 * @version 1.0
 * Aquí tenemos el método main , dentro de ese método tenemos el método Operativa cuenta.
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
    En este método obtenemos el estado , titular y numero de cuenta acorde a un objeto CCuenta
    * Ademas tenemos la posibilidad de retirar e ingresar dinero y consultar el saldo.
    * Con el objeto cuenta obtenemos titular , numero de cuenta y saldo actual.
    * En caso de introducir un parametro retirar incorrecto , negativo o superior al saldo devuelve el error fallo al retirar.
    * En caso de introducir un parametro ingresar incorrecto devuelve el error fallo al ingresar.
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
