package ipc.proyecto1;

import java.util.LinkedList;

public class Usuario {

    String cerreo;
    String nombre;
    String apellido;
    String alias;
    String dpi;
    String nacionalida;
    String telefono;
    String genero;
    String rol;
    String fecha;
    String contrasena;
    LinkedList<ContenedorImagen> imagenes = new LinkedList<>();
    LinkedList<ContenedorFactura> facturas = new LinkedList<>();
    LinkedList<ContenedorTarjeta> tarjetas = new LinkedList<>();
    LinkedList<Factura> facturasdatos = new LinkedList<>();

    public int agregarFoto(ContenedorImagen contenedorImagen) {
        this.imagenes.add(contenedorImagen);
        return this.imagenes.size();
    }

    public Usuario(String cerreo, String nombre, String apellido, String alias, String dpi, String nacionalida, String telefono, String genero, String rol, String fecha, String contrasena) {
        this.cerreo = cerreo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.alias = alias;
        this.dpi = dpi;
        this.nacionalida = nacionalida;
        this.telefono = telefono;
        this.genero = genero;
        this.rol = rol;
        this.fecha = fecha;
        this.contrasena = contrasena;
    }

    public int agregarDatosFacuturas(Factura factura){
       this.facturasdatos.add(factura);
       return this.facturasdatos.size();
    }
    
    public int agregarTarjeta(ContenedorTarjeta contenedorTarjeta) {
        this.tarjetas.add(contenedorTarjeta);
        return this.tarjetas.size();
    }
    public int agregarFactura(ContenedorFactura contenedorFactura){
        this.facturas.add(contenedorFactura);
        return this.facturas.size();
    }
    
    /*
    public static void registrarTarjeta(String nameTarjeta, String numTarjeta, String cvv, String fecha) {
        tarjetas.add(new ContenedorTarjeta(nameTarjeta, numTarjeta, cvv, fecha));
    }

    
        public int agregarFoto(ContenedorImagen contenedorImagen) {
        this.imagenes.add(contenedorImagen);
        return this.imagenes.size();
    }
    
    
    
     */
    public String getCerreo() {
        return cerreo;
    }

    public void setCerreo(String cerreo) {
        this.cerreo = cerreo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getDpi() {
        return dpi;
    }

    public void setDpi(String dpi) {
        this.dpi = dpi;
    }

    public String getNacionalida() {
        return nacionalida;
    }

    public void setNacionalida(String nacionalida) {
        this.nacionalida = nacionalida;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
}
