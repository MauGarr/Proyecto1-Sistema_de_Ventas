
package ipc.proyecto1;

import java.util.LinkedList;

public class AppState {
    
    public static Usuario usuarioLogeado;
    public static LinkedList<Usuario> usuarios = new LinkedList();
   
    public static void registrarUsuarios(String cerreo, String nombre, String apellido, String alias, String dpi, String nacionalida, String telefono, String genero, String rol, String fecha, String contrasena) {
      // departamentos.add(new Departamentos(codigoRegistro, codigoDep, nameDep));
        usuarios.add(new Usuario(cerreo, nombre, apellido, alias, dpi,nacionalida, telefono, genero, rol, fecha, contrasena));
    }
    
}



