
package ipc.proyecto1;

public class Kiosco {
    
    private String codeKiosco;
    private String nameKiosco;
    private String codeRegiones;

    public Kiosco(String codeKiosco, String nameKiosco, String codeRegiones) {
        this.codeKiosco = codeKiosco;
        this.nameKiosco = nameKiosco;
        this.codeRegiones = codeRegiones;
    }

    public String getCodeKiosco() {
        return codeKiosco;
    }

    public void setCodeKiosco(String codeKiosco) {
        this.codeKiosco = codeKiosco;
    }

    public String getNameKiosco() {
        return nameKiosco;
    }

    public void setNameKiosco(String nameKiosco) {
        this.nameKiosco = nameKiosco;
    }

    public String getCodeRegiones() {
        return codeRegiones;
    }

    public void setCodeRegiones(String codeRegiones) {
        this.codeRegiones = codeRegiones;
    }
}
