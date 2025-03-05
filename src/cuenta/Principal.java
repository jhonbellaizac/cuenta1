package cuenta;
public class Principal {
    public static void main(String[] args) {

      
        Cuenta cuenta= new Cuenta (10000, 0);
        cuenta.imprimir();
        System.out.println("");
        
        cuenta.consignar(5245);
        cuenta.imprimir();
        System.out.println("");
        
        cuenta.retirar(1501);
        cuenta.imprimir();
        System.out.println("");
        
        cuenta.interesMensual();
        cuenta.imprimir();
        System.out.println("");
    }
    
}






    
    

