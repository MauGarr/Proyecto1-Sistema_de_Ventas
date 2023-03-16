package ipc.proyecto1;

public class ContenedorTarjeta {
    
String nameTarjeta;
String numTarjeta;
String fecha;


    public ContenedorTarjeta(String nameTarjeta, String numTarjeta, String fecha) {
        this.nameTarjeta = nameTarjeta;
        this.numTarjeta = numTarjeta;
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

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }  
}
