package cuentas;


import cuentas.CCuenta;

public class Main {
    
    
    public static void main(String[] args) {
        CCuenta cuenta1;
        double saldoActual;

        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es"+ saldoActual );
        operativa_cuenta(cuenta1,300);
        
    }
    
    /**
     * 
     * @param cuenta1 es la cuenta que entra como parámetro en el método
     * @param cantidad es la cantidad que modificas del saldo
     */
    public static void operativa_cuenta(CCuenta cuenta1,float cantidad){
        

        try {
            cuenta1.retirar(cantidad);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(cantidad);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}
