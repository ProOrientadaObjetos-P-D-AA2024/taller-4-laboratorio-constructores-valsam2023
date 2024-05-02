package packete2;

public class EntidadFinanciera_Cheque {
    private String nomb;
    private String nom_Banco;
    private double comim_banco;
    private double val_cheque;


    public EntidadFinanciera_Cheque(String Cliente, String Banco, double Cheque) {
        this.nomb = Cliente;
        this.nom_Banco = Banco;
        this.val_cheque = Cheque;
    }
    public double getcomim_banco() {
        return comim_banco;
    }

    public void cal_comim_banco() {
        comim_banco = (0.003 * val_cheque);
    }


    
    public String toString(){
      return "-Nombre del Cliente: " + nomb + 
             "\n-Nombre del Banco: " + nom_Banco +
             "\n-Valor cheque: " + val_cheque + 
             "\n-Valor de la comision del banco: " + comim_banco;
    }
    
}

