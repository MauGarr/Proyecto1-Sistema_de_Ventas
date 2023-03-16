package ipc.proyecto1;

import java.util.ArrayList;

public class Proyecto1 {

    public static ArrayList<Regiones> regiones = new ArrayList<>();
    public static ArrayList<Departamentos> departamentos = new ArrayList<>();
    public static ArrayList<Municipio> municipios = new ArrayList<>();
    public static ArrayList<Kiosco> kioscos = new ArrayList<>();
    public static void main(String[] args) {
        LoginFrame loginFrame = new LoginFrame();
        loginFrame.setVisible(true);
    }

    public static void registrarRegiones(String code, String name, Double estandar, Double especial) {
        regiones.add(new Regiones(code, name, estandar, especial));
    }
    
    public static void registrarDepartemtos(String codigoRegistro, String codigoDep, String nameDep){
        departamentos.add(new Departamentos(codigoRegistro, codigoDep, nameDep));
    }
    
    public static void registrarMunicipio(String codeDep, String nameMunicipio){
        municipios.add(new Municipio(codeDep, nameMunicipio));
    }

    public static void registrarKiosco(String codeKiosco, String nameKiosco, String codeRegiones){
        kioscos.add(new Kiosco(codeKiosco, nameKiosco, codeRegiones));
    }
}
