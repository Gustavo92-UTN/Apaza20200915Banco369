package apaza20200915banco369;
public class cuentaBancaria{
//Atributos de cuentaBancaria
    private String nombreTitular;
    private String tipoDeCuenta;
    private float saldo = 10000;
    
    public cuentaBancaria(String nombreTitular, String tipoDeCuenta, float saldo){
        this.nombreTitular = nombreTitular;
        this.tipoDeCuenta = tipoDeCuenta;
    }
//Aca se crea los metodos getter y setter
    public void setCuentaBancaria(float saldo){
        if(saldo >= 0 && saldo <= this.saldo){
            this.saldo = saldo;
        }
    }
     
    public float getCuentaBancaria(){
        return saldo;
    }
//Aca se crea el metodo del punto 3    
    public void extraer(){
        System.out.println("Su saldo actual es: " + saldo);
    }
}
