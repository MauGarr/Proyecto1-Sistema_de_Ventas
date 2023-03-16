package ipc.proyecto1;

public class ContenedorTarjeta {
    
String nameTarjeta;
String numTarjeta;
String cvv;
String fecha;


    public ContenedorTarjeta(String nameTarjeta, String numTarjeta, String cvv, String fecha) {
        this.nameTarjeta = nameTarjeta;
        this.numTarjeta = numTarjeta;
        this.cvv = cvv;
        this.fecha = fecha;
    }

    public String getNameTarjeta() {
        return nameTarjeta;
    }

    public void setNameTarjeta(String nameTarjeta) {
        this.nameTarjeta = nameTarjeta;
    }

    public String getNumTarjeta() {
        return numTarjeta;
    }

    public void setNumTarjeta(String numTarjeta) {
        this.numTarjeta = numTarjeta;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }  
}
