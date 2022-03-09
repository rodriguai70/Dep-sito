/**
 * Esta clase contiene los atributos y los contructores y métodos de una cuenta bancaria
 */
package cuentas;

public class CCuenta {
    /**
     * es una clase para gestionar cuentas bancarias
     */

/**
 * son los atributos de la clase cuenta, nombre, saldo y tipoInterés
  */
   
     /**
     * * @return the cuenta
 * Devuelve la cuenta con setCuenta
     */
     /**
     * * @return the saldo
 * Devuelve el saldo con setSaldo
     */
     /**
     * * @return the tipoInterés
 * Devuelve el tipo de interés con setTipoInterés
     */
   /*
 * Devuelve el nombre del cliente
     */
    private String nombre;
    
    private String cuenta;
    private double saldo;
    private double tipoInterés;
 /*
 * Constructor por defecto de la clase CCuenta
     */
    public CCuenta()
    {
    }
        
 /*
 * Constructor parametrizado de la clase CCuenta que crea una cuenta con esos valores
    * * @param nombre, cuenta, saldo y tipo
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }
/**
 * @return the saldo
 * Devuelve la cantidad del saldo
 */ 
    public double estado()
    {
        return saldo;
    }
/**
 * 
 * @param cantidad
 * Dicho parámetro sirve para ver el ingreso, o sea la cantidad.
 * @throws Exception 
 * Este metodo no permite ingresar cantidades que sean negativas
 */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }
    
/**
 * 
 * @param cantidad
 * Dicho parámetro sirve para ver el retirar, o sea la cantidad.
 * @throws Exception 
 * Este otro metodo no permite retirar cantidades que sean negativas
 */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");//indica que no podremos retirar nunca una cantidad inferior a 0
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");//indica que no podremos retirar una cantidad mayor al saldo existente
        saldo = saldo - cantidad;
    }
}
