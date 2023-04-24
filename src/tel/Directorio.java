package tel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// buscarTeléfono() que en base a un apellido nos devuelve una lista con los nros de
//teléfono asociados a dicho apellido.
public class Directorio {

    private HashMap<String, Cliente> registro = new HashMap<String, Cliente>();

    public Cliente buscarCliente(String numTelefono) {
        for (Map.Entry<String, Cliente> entry : registro.entrySet()) {
            String key = entry.getKey();
            Cliente value = entry.getValue();
            if (numTelefono.equals(key)) {
                return value;
            }
        }
        System.out.println("No se encontrò el telefono asociado a un cliente");
        return null;
    }

    public ArrayList<Cliente> buscarClientes(String ciudad) {

        ArrayList<Cliente> buscar = new ArrayList();
        Set<String> claves = registro.keySet();
        Iterator<String> it = claves.iterator();
        while (it.hasNext()) {
            String claveActual = it.next();
            Cliente clienteActual = registro.get(claveActual);

            if (clienteActual.getCiudad().equals(ciudad)) {
                buscar.add(clienteActual);
            }
        }
        return buscar;
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

    public ArrayList<String> buscarTelefono(String apellido) {

        ArrayList<String> num = new ArrayList<String>();
        for (Map.Entry<String, Cliente> entry : registro.entrySet()) {
            Cliente aux = buscarCliente(entry.getKey());
            if (aux.getApellido().equals(apellido)) {
                num.add(entry.getKey());
            }
        }
        return num;
    }

    public boolean borrarCliente(String telefono) {
        System.out.println("registro" + registro.toString());
        Cliente aux = registro.remove(telefono);
        System.out.println("registro" + registro.toString());
        System.out.println("linea68" + aux.toString());
        if (aux != null) {
            return true;
        }
        return false;
    }
}
