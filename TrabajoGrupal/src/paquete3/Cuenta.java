package paquete3;

import java.util.ArrayList;
import paquete2.Menu;

public class Cuenta {

    private String cliente;
    private ArrayList<Menu> Lista;
    private double subtotal;
    private double iva;
    private double total;

    public Cuenta(String clie, ArrayList<Menu> lst) {
        cliente = clie;
        Lista = lst;
    }

    public void establecerCliente(String cli) {
        cliente = cli;
    }

    public void establecerLista(ArrayList<Menu> lst) {
        Lista = lst;
    }

    public String obtenerCliente() {
        return cliente;
    }

    public ArrayList<Menu> obtenerLista() {
        return Lista;
    }

    public void establecerSubtotal() {
        for (int i = 0; i < obtenerLista().size(); i++) {
            subtotal = subtotal + obtenerLista().get(i).obtenerValorMenu();
        }
    }

    public void establecerIva() {
        iva = subtotal * 0.12;
    }

    public void establecerTotal() {
        total = subtotal + iva;
    }

    public double obtenerSubtotal() {
        return subtotal;
    }

    public double obtenerIva() {
        return iva;
    }

    public double obtenerTotal() {
        return total;
    }

    @Override
    public String toString() {
        String cadena = "\n\t<< RESTAURANTE EL 'BATFET' >>\n"
                + "\t=============================\n";
        cadena = String.format("%sNombre del cliente: %s\n", cadena,
                obtenerCliente());
        cadena = String.format("%s\nLISTA DEL MENÚ DE PEDIDOS DEL CLIENTE:\n",
                cadena);
        for (int i = 0; i < obtenerLista().size(); i++) {
            cadena = String.format("%s %s\n\n", cadena, obtenerLista().get(i));
        }
        cadena = String.format("%s\nSubtotal:  %12.2f\nIva:  %17.2f\n"
                + "-----------------------\nTotal a pagar: $ %2.2f",
                cadena, obtenerSubtotal(), obtenerIva(), obtenerTotal());
        return cadena;
    }
}
