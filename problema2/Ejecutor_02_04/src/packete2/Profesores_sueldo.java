package packete2;

public class Profesores_sueldo {
    private String nom;
    private String per_ape;
    private double sueldo_Basico;
    private double sueldo_Total;
    private String ced;

    public Profesores_sueldo(String nombre, String apellido, double sueldoBasico, String cedula) {
        this.nom = nombre;
        this.per_ape = apellido;
        this.sueldo_Basico = sueldoBasico;
        this.ced = cedula;
    }

    public String toString(){
        return "-Nombre: " + nom + 
               "\n-Apellido: " + per_ape + 
               "\n-Cedula: " + ced + 
               "\n-Sueldo Basico: " + sueldo_Basico + 
               "\n-Sueldo Total: " + calcularSueldoTotal();
                
        
    }
    
    public double calcularSueldoTotal(){
        return (sueldo_Basico * 1.2);
    
    }
}

