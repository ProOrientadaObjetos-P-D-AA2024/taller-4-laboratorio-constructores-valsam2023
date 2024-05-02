package packete2;

public class Automotor_caracter {
    private String ced;
    private String marc_veh;
    private int anio;
    private double valor_Veh;
    private double valor_Matr;

    public Automotor_caracter(String ce_dueno, String marca_Veh, int anio, double val_Veh) {
        this.ced = ce_dueno;
        this.anio = anio;
        this.valor_Veh = val_Veh;
    }


    public String getCedulaDuenio() {
        return ced;
    }

    public void setCedulaDuenio(String cedulaDuenio) {
        this.ced = cedulaDuenio;
    }

    public String getMarcaVehiculo() {
        return marc_veh;
    }

    public void setMarcaVehiculo(String marcaVehiculo) {
        this.marc_veh = marcaVehiculo;
    }

    public int getAnioFabricacion() {
        return anio;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anio = anioFabricacion;
    }

    public double getValorVehiculo() {
        return valor_Veh;
    }

    public void setValorVehiculo(double valorVehiculo) {
        this.valor_Veh = valorVehiculo;
    }

    public double getValorMatricula() {
        return valor_Matr;
    }

    public void calcularValorMatricula() {
        valor_Matr = 0.002 * valor_Veh * (2024 - anio);
    }

    @Override
    public String toString() {
        return "-Cedula: " + getCedulaDuenio()+
                "\n-Año de fabricacion: " + getAnioFabricacion() +
                "\n-Valor del vehículo: " + getValorVehiculo() +
                "\n-Valor de la matrícula: " + getValorMatricula();
    }
}

