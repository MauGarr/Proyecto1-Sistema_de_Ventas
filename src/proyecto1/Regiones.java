
package ipc.proyecto1;

public class Regiones {
    
    private String code;
    private String name;
    private Double estandar;
    private Double especial;

    public Regiones() {
    }

    public Regiones (String code, String name,Double estandar, Double especial ){    
        this.code = code;
        this.name = name;
        this.estandar = estandar;
        this.especial = especial;       
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getEstandar() {
        return estandar;
    }

    public void setEstandar(Double estandar) {
        this.estandar = estandar;
    }

    public Double getEspecial() {
        return especial;
    }

    public void setEspecial(Double especial) {
        this.especial = especial;
    }
}
