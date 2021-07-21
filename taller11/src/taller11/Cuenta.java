package taller11;

import java.util.ArrayList;

public class Cuenta {
    
    private String nombreCliente;
    private ArrayList<Menu> menus;
    private double valorTotal;
    private double subTotal;
    private double iva;
    
    
    public Cuenta(String nombre,ArrayList<Menu> m) {        
        nombreCliente = nombre;
        menus = m;        
    }
    
    
    
    public void setNombreCliente(String x){
        nombreCliente = x;
    }       
    
    
    
    public String getNombreCliente(){
        return nombreCliente;
    }
    
    
    
    public void setMenus(ArrayList<Menu> x){
        menus = x;
    }    
    
    
    
    public ArrayList<Menu> getMenus(){
        return menus;
    }
    
    
    
    public void setValorTotal(){
        valorTotal = subTotal + (subTotal * iva);       
    }       
    
    
    
    public double getValorTotal(){
        return valorTotal;
    }
    
    
    
    public void setSubTotal(){
        for (int i = 0; i < getMenus().size(); i++) {
            subTotal = subTotal + getMenus().get(i).getValorMenu();
        } 
    }       
    
    
    
    public double getSubTotal(){
        return subTotal;
    }
    
    
    
    public void setIva(){
        iva = 0.12;
    }       
    
    
    
    public double getIva(){
        return iva;
    }
    
    
    
    @Override
    public String toString(){
        String cadena = String.format("Cuenta a pagar.-\n"
                + "Nombre del cliente: %s\n"
                + "Listado de todos los menus ordenados: %s\n"
                + "Subtotal: %.2f\n"
                + "IVA: %.2f\n"
                + "Valor total a pagar: %.2f\n",
                getNombreCliente(),getMenus(),
                getSubTotal(),getIva(),
                getValorTotal());
        
        return cadena;
    }
}