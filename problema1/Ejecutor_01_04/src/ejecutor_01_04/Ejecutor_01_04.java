package ejecutor_01_04;
import packete01.Calificaciones;

public class Ejecutor_01_04 {

    public static void main(String[] args) {
        //Primer Objeto
        Calificaciones uno_cal =new Calificaciones("Paula",10,9,10);
        uno_cal.calcularPromedio();

        
        //Segundo Objeto
        Calificaciones dos_cal =new Calificaciones("Valentina",9,10,9);
        dos_cal.calcularPromedio();
        
        //Salida de datos
        System.out.println("===================================");
        System.out.println("    Datos del primer Estudiante");
        System.out.println("===================================");
        System.out.println(uno_cal.toString());
        
        System.out.println("===================================");
        System.out.println("   Datos del segundo Estudiante");
        System.out.println("===================================");
        System.out.println(dos_cal.toString());
    }
    
}
