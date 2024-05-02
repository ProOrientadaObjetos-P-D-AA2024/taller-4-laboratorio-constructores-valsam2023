package ejecutor_04_04;
import packete2.EntidadFinanciera_Cheque;

public class Ejecutor_04_04 {

    public static void main(String[] args) {
        //Primer Objeto
        EntidadFinanciera_Cheque uno = new EntidadFinanciera_Cheque("Jostin Estiben", "JEP", 2500);
        uno.cal_comim_banco();
        
        //Segundo Objeto
        EntidadFinanciera_Cheque doz = new EntidadFinanciera_Cheque(" Maria Paula", "Banco de Loja", 3200);
        doz.cal_comim_banco();
        
        //Salida de datos
        System.out.println("===================================");
        System.out.println("     Datos del primer Cheque");
        System.out.println("===================================");
        System.out.println(uno.toString());
        System.out.println("===================================");
        System.out.println("    Datos del segundo Cheque");
        System.out.println("===================================");
        System.out.println(doz.toString());
    }
    
}
   
