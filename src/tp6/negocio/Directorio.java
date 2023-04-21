
package tp6.negocio;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

// buscarTeléfono() que en base a un apellido nos devuelve una lista con los nros de 
//teléfono asociados a dicho apellido.
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
    
    public ArrayList<String> buscarTelefono(String apellido){
        ArrayList <String> num= new ArrayList<String>();
        for (Map.Entry<String, Cliente> entry : registro.entrySet()) {
            if(registro.containsValue(apellido)){
                num.add(entry.getKey());
            }
        }
        //hola
//        Iterator <String> i= num.iterator();
//        while(i.hasNext()){
//            System.out.println(i.next());
//        }
        return num;
    }
}
