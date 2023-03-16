
package ipc.proyecto1;

public class Municipio {
  
    String codeDep;
    private String nameMunicipio;

    public Municipio(String codeDep, String nameMunicipio) {
        this.codeDep = codeDep;
        this.nameMunicipio = nameMunicipio;
    }

    public String getCodeDep() {
        return codeDep;
    }

    public void setCodeDep(String codeDep) {
        this.codeDep = codeDep;
    }

    public String getNameMunicipio() {
        return nameMunicipio;
    }

    public void setNameMunicipio(String nameMunicipio) {
        this.nameMunicipio = nameMunicipio;
    }
}
