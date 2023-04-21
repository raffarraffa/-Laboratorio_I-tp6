package tp6.negocio;

import java.util.ArrayList;
import java.util.HashMap;
<<<<<<< HEAD
import java.util.Iterator;

=======
import java.util.Map;
>>>>>>> 8aa2d2967e25174cb1e6f39e934fac9de33357e2

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
<<<<<<< HEAD
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
=======



//AgregarCliente() que permite registrar un nuevo cliente con su respectivo nro de 
//teléfono. Siendo el nro del teléfono la clave del mismo.
    public boolean agregarCliente(String telefono, Cliente c) {
        boolean agregado = false;
        if (!registro.containsKey(telefono)) {
            registro.put(telefono, c);
            agregado = true;
        }
        return agregado;

}
>>>>>>> 8aa2d2967e25174cb1e6f39e934fac9de33357e2
}
