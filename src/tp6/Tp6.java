/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp6;

import java.util.*;
import javax.swing.JOptionPane;
import tel.Cliente;
import tel.Directorio;

/**
 *
 * @author Usuario
 */
public class Tp6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // nuevo directorio
        Directorio d = new Directorio();
        ArrayList<Cliente> clientes = new ArrayList();
        ArrayList<String> clientes_tel = new ArrayList();

        //Cliente martin lucero de la punta mod 11 mz 33 dni 123 telefono 4242
        boolean resultado1 = d.agregarCliente("4241", new Cliente(121, "martin", "lucero", "la punta", "mod 11 mz 33"));
        boolean resultado2 = d.agregarCliente("4242", new Cliente(122, "martin", "lucero", "san luis", "junin y belgrano"));
        boolean resultado3 = d.agregarCliente("4243", new Cliente(123, "martin", "lucero", "la punta", "mod 11 mz 33"));
        boolean resultado4 = d.agregarCliente("4244", new Cliente(124, "martin", "lucero", "san luis", "junin y belgrano"));
        boolean resultado5 = d.agregarCliente("4245", new Cliente(125, "pepe", "tresmarias", "la punta", "mod 11 mz 33"));

    }

}

}
