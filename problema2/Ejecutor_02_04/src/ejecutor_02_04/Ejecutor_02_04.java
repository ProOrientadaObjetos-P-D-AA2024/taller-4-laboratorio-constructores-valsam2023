package ejecutor_02_04;
import packete2.Profesores_sueldo;

public class Ejecutor_02_04 {

    public static void main(String[] args) {
      //Primer Objeto
        Profesores_sueldo uno = new Profesores_sueldo("Guido", "Alvarez", 3000, "1125986312");
        
        //Segundo Objeto
        Profesores_sueldo doz = new Profesores_sueldo("Roberto", "Bustamante", 2500, "1106895263");

                
        //Salida de datos
        System.out.println("===================================");
        System.out.println("     Datos del primer Profesor");
        System.out.println("===================================");
        System.out.println(uno.toString());
        
        System.out.println("===================================");
        System.out.println("    Datos del segundo Profesor");
        System.out.println("===================================");
        System.out.println(doz.toString());
        
    }
 
}  
    
