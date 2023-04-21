
package tp6.negocio;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;


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
     public ArrayList buscarClientes(String ciudad){
        
        ArrayList<Cliente>buscar= new ArrayList();
        
       Iterator<Cliente> it = registro.Iterator();
       while(it.hasNext()){
           if(it.next().getCiudad().equals(ciudad)){
               buscar.add(it.next());
           }         
       }
        return buscar;
    }
}
