package cuenta;
public class Cuenta {

protected float saldo;
protected int numConsignaciones = 0;
protected int numeRetiro = 0 ;
protected float tasaAnual;// porcentaje
protected float comisionmensual = 0;

public Cuenta(float saldo, float tasaAnual){
    this.saldo = saldo;
    this.tasaAnual = tasaAnual;
}

public void imprimir(){
    
    System.out.println("Saldo: " + saldo);
    System.out.println("Numero de consignaciones: " + numConsignaciones);
    System.out.println("Numero de retiro:" + numeRetiro);
    System.out.println("Tasa anual:" + tasaAnual);
    System.out.println("Comision mensual: " + comisionmensual);
}

public void consignar(float cantidad){
    
    saldo = saldo + cantidad;
    
}

public void retirar (float cantidad){
    
    float nuelvoSaldoTemporal = saldo - cantidad;
    
    if (nuelvoSaldoTemporal >= 0 ){
        
       saldo = saldo - cantidad;
        
    } else{ 
        System.out.println("La cantidad a retirar excede a la cantidad actual");
    }
    
}

public void interesMensual (){
    
    float intMensual = (float) (saldo * (1+ 0.20 *1));
}
    
}












    

