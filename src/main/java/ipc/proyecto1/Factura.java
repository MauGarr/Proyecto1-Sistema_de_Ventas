
package ipc.proyecto1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Factura {
   
    int numFactura;
    String codePaquete;
    String origenDertamento;
    String origenMunicipio;
    String destinoDepartamento;
    String destinoMunicipio;
    String nit;
    String typePago;
    String tamañoP;
    double numPaquetes;
    double total;
    String fecha;

    public Factura(int numFactura, String codePaquete, String origenDertamento, String origenMunicipio, String destinoDepartamento, String destinoMunicipio, String nit, String typePago, String tamañoP, double numPaquetes, double total) {
        this.numFactura = numFactura;
        this.codePaquete = codePaquete;
        this.origenDertamento = origenDertamento;
        this.origenMunicipio = origenMunicipio;
        this.destinoDepartamento = destinoDepartamento;
        this.destinoMunicipio = destinoMunicipio;
        this.nit = nit;
        this.typePago = typePago;
        this.tamañoP = tamañoP;
        this.numPaquetes = numPaquetes;
        this.total = total;
        
        
        LocalDateTime fechaHoraActual = LocalDateTime.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy - HH:mm:ss");
        this.fecha = fechaHoraActual.format(formato);
    }

    public int getNumFactura() {
        return numFactura;
    }

    public void setNumFactura(int numFactura) {
        this.numFactura = numFactura;
    }

    public String getCodePaquete() {
        return codePaquete;
    }

    public void setCodePaquete(String codePaquete) {
        this.codePaquete = codePaquete;
    }

    public String getOrigenDertamento() {
        return origenDertamento;
    }

    public void setOrigenDertamento(String origenDertamento) {
        this.origenDertamento = origenDertamento;
    }

    public String getOrigenMunicipio() {
        return origenMunicipio;
    }

    public void setOrigenMunicipio(String origenMunicipio) {
        this.origenMunicipio = origenMunicipio;
    }

    public String getDestinoDepartamento() {
        return destinoDepartamento;
    }

    public void setDestinoDepartamento(String destinoDepartamento) {
        this.destinoDepartamento = destinoDepartamento;
    }

    public String getDestinoMunicipio() {
        return destinoMunicipio;
    }

    public void setDestinoMunicipio(String destinoMunicipio) {
        this.destinoMunicipio = destinoMunicipio;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getTypePago() {
        return typePago;
    }

    public void setTypePago(String typePago) {
        this.typePago = typePago;
    }

    public String getTamañoP() {
        return tamañoP;
    }

    public void setTamañoP(String tamañoP) {
        this.tamañoP = tamañoP;
    }

    public double getNumPaquetes() {
        return numPaquetes;
    }

    public void setNumPaquetes(double numPaquetes) {
        this.numPaquetes = numPaquetes;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    } 
}
