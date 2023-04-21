
package tp6.negocio;

import java.util.HashMap;
import java.util.Map;


public class Directorio {
    private HashMap<String,Cliente> registro=new HashMap<String,Cliente>();
    
    
    public Cliente buscarCliente(String numTelefono){
        for (Map.Entry<String, Cliente> entry : registro.entrySet()) {
            String key = entry.getKey();
            Cliente value = entry.getValue();
            if(numTelefono.equals(key)){
                return value;
            }
        }
        System.out.println("No se encontrò el telefono asociado a un cliente");
        return null;
    }
}
