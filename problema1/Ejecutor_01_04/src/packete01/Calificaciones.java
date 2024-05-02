
package packete01;

public class Calificaciones {
     //Declaracion de varaibles
    private String nom;
    private double cal_1;
    private double cal_2;
    private double cal_3;
    private double prom_cal;

    public Calificaciones(String nombre, double calificacion1, double calificacion2,double calificacion3) {
        this.nom = nombre;
        this.cal_1 = calificacion1;
        this.cal_2 = calificacion2;
        this.cal_3 = calificacion3;

    }
    //Nombre
    public String getNombre() {
        return nom;
    }

    public void setNombre(String nombre) {
        this.nom = nombre;
    }
    
    //Calificacion1
    public double getCalificacion1() {
        return cal_1;
    }

    public void setCalificacion1(double calificacion1) {
        this.cal_1 = calificacion1;
    }
    
    //Calificacion2
    public double getCalificacion2() {
        return cal_2;
    }

    public void setCalificacion2(double calificacion2) {
        this.cal_2 = calificacion2;
    }
    
    //Calificacion3
    public double getCalificacion3() {
        return cal_3;
    }

    public void setCalificacion3(double calificacion3) {
        this.cal_3 = calificacion3;
    }
    
    //Promedio
    public double getPromedio() {
        return prom_cal;
    }

    public void calcularPromedio() {
        prom_cal = (cal_1 + cal_2 + cal_3) / 3;
    }
    
    @Override
    public String toString(){
        return "Nombre del estudiante: "+nom
                + "\nCalificacion 1:"+ cal_1
                +"\nCalificacion 2: "+cal_2
                +"\nCalificacion 3: "+cal_3
                +"\nPromedio:"+prom_cal;
    }
    
}

