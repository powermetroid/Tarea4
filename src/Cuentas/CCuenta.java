package Cuentas;

/** He movido las clases desde el Package por defecto al paquete Cuentas*/
/**
 * Tarea para Entornos de Desarrollo ED04
 * @author Pablo Santiago
 * @version 1.0
 */




public class CCuenta {

    /**
     * @return Nombre del titular de la cuenta
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre Para poner el nombre del titular de la cuenta.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return El numero de cuenta asociado al objeto cuenta.
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * @param cuenta para definir el numero de cuenta.
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * @return Devuelve el saldo que contiene la cuenta.
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo para definir el saldo de la cuenta
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * @return the tipoInterés para ver que tipo de interés tiene asociado esta cuenta.
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * @param tipoInterés para definir el tipo de interés que tiene asociado la cuenta.
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }


    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /**
     *
     */
    public CCuenta()
    {
    }

    /**
     *
     * @param nom Parametro de nombre asociado a Ccuenta
     * @param cue Parametro de nº de cuenta asociado a Ccuenta
     * @param sal Parametro de saldo asociado a Ccuenta
     * @param tipo Parametro de tipo de interés
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    /**
     *
     * @return el nombre , el numero de cuenta y el saldo.
     */
    public double estado()
    {
        return getSaldo();
    }

    /**
     *
     * @param cantidad si la cantidad fuese negativa
     * @throws java.lang.Exception muestra el texto por consola de que no se puede ingresar una cantidad negativa
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    /**
     *
     * @param cantidad si la cantidad a retirar fuese negativa
     * @throws java.lang.Exception muestra el texto por consola de que no se puede retirar una cantidad negativa
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
}
