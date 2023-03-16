package ipc.proyecto1;

public class ContenedorFactura {
    
    String nameCompleto;
    String direccion;
    String nit;

    public ContenedorFactura(String nameCompleto, String direccion, String nit) {
        this.nameCompleto = nameCompleto;
        this.direccion = direccion;
        this.nit = nit;
    }

    public String getNameCompleto() {
        return nameCompleto;
    }

    public void setNameCompleto(String nameCompleto) {
        this.nameCompleto = nameCompleto;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    } 
}
