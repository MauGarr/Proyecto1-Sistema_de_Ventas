
package ipc.proyecto1;

public class Departamentos {
    
   private String codigoRegistro;
   String codigoDep;
   private String nameDep;

    public Departamentos() {
    }

    public Departamentos(String codigoRegistro, String codigoDep, String nameDep) {
        this.codigoRegistro = codigoRegistro;
        this.codigoDep = codigoDep;
        this.nameDep = nameDep;
    }

    public String getCodigoRegistro() {
        return codigoRegistro;
    }

    public void setCodigoRegistro(String codigoRegistro) {
        this.codigoRegistro = codigoRegistro;
    }

    public String getCodigoDep() {
        return codigoDep;
    }

    public void setCodigoDep(String codigoDep) {
        this.codigoDep = codigoDep;
    }

    public String getNameDep() {
        return nameDep;
    }

    public void setNameDep(String nameDep) {
        this.nameDep = nameDep;
    }
   
}
