
package tp6.negocio;

import java.util.HashMap;


public class Directorio {
    private HashMap<String,Cliente> registro=new HashMap<String,Cliente>();
    
    
    
    //Metodos
    public void borrarCliente(String telefono){
        if (registro.containsKey(telefono)) {
            registro.remove(telefono);
            System.out.println("Se ha eliminado correctamente.");
        } else {
            System.out.println("Cliente no encontrado.");
        }
    }
}
