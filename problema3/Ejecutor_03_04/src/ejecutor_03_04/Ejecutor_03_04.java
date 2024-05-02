package ejecutor_03_04;
import packete2.Automotor_caracter;

public class Ejecutor_03_04 {

    public static void main(String[] args) {
        //Primer Objeto
        Automotor_caracter uno = new Automotor_caracter("1158965432", "Toyota", 2020, 30000);
        uno.calcularValorMatricula();
        //Segundo Objeto
        Automotor_caracter doz = new Automotor_caracter("1104718697", "Mazda", 2022, 20000);
        doz.calcularValorMatricula();
        
        //Salida de datos
        System.out.println("===================================");
        System.out.println("    Datos del primera Automotor");
        System.out.println("===================================");
        System.out.println(uno.toString());
        System.out.println("===================================");
        System.out.println("    Datos del segunda Automotor");
        System.out.println("===================================");
        System.out.println(doz.toString());
        
    }
      
}

