/*3 - Crear la clase cuentaBancaria que tenga como atributo nombreTitular , tipoDeCuenta y
    saldo . Elegir el tipo de dato adecuado para cada uno de ellos. Además hacer el método
    extraer() que permita extraer dinero, si se puede. Crear un objeto de esta clase y comprobar
    el funcionamiento
6 - Para la clase del ejercicio 3 crear el método constructor que solicite como parámetro los 3
    atributos de la clase.
9 - Encapsular la clase del ejercicio 3 y realizar los métodos getter y setter necesarios.*/
package apaza20200915banco369;
import java.util.Scanner;
public class Apaza20200915Banco369 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nombrePersona = "", tipoDeCuenta = "";
        String tipoCuenta[] = {"Premium Gold", "Plus", "Estandar", "Universitaria"};
        float retirar, saldo = 10000;
        int opcion;
        
        System.out.print("Ingrese el nombre del titular de la cuenta: ");
        nombrePersona = input.next();
        System.out.println("Elija el tipo de cuenta con el numero asociado");
        for(int i = 0; i < 4; i++){
            System.out.println((1+i) +" - " + tipoCuenta[i]);
        }
        System.out.print("Opcion: ");
        opcion = input.nextInt();
        
        while(opcion < 1 || opcion > 4){
            System.out.print("Eleecion INCORRECTA, elija un numero del menu de opciones: ");
            opcion = input.nextInt();
        }
        
        switch(opcion){
            case 1:
                tipoDeCuenta = "Premium Gold";
                break;
            case 2:
                tipoDeCuenta = "Plus";
                break;
            case 3:
                tipoDeCuenta = "Estandar";
                break;
            default:
                tipoDeCuenta = "Universitaria";                
        }
        
        System.out.print("Ingrese la cantidad de dinero a retirar: ");
        retirar = input.nextFloat();
        saldo = saldo - retirar;

//Creo objeto de la clase cuentaBancaria
        cuentaBancaria persona1, persona2;
        //persona1 = new cuentaBancaria();
        persona2 = new cuentaBancaria(nombrePersona, tipoDeCuenta, saldo);
        persona2.setCuentaBancaria(saldo);
        //persona1.extraer();
        
        System.out.println("\nNombre: " + nombrePersona);
        System.out.println("Tipo de cuenta: " + tipoDeCuenta);
        
        if(persona2.getCuentaBancaria() == saldo){
            persona2.extraer();
        }
        else{
            System.out.println("Saldo INSUFICIENTE");
        }
    }
}
