package taller11;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        
        ArrayList<Menu> listaMenus = new ArrayList<>();
        
        
        
        MenudeNiños menuNiño1 = new MenudeNiños("Papas fritas",6,2,2);
        menuNiño1.getValorMenu();
        
        
        
        MenudeNiños menuNiño2 = new MenudeNiños("Nuggets",5,1,1);
        menuNiño2.getValorMenu();
        
        
        
        MenuEconomico menuEco1 = new MenuEconomico("Arveja con guineo",3);
        menuEco1.setPorcentajeDescuento();
        menuEco1.getValorMenu();
        
        
        
        MenuDia menuDia1 = new MenuDia("Seco de pollo",8,2,2);
        menuDia1.getValorMenu();
        
        
        
        MenuCarta menuCarta1 = new MenuCarta("Ceviche",10,2,2);
        menuCarta1.setPorcentajeAdicional();
        menuCarta1.getValorMenu();
        
        
        
        listaMenus.add(menuNiño1);
        listaMenus.add(menuNiño2);
        listaMenus.add(menuEco1);
        listaMenus.add(menuDia1);
        listaMenus.add(menuCarta1);        
        
        
        
        for (int i = 0; i < listaMenus.size(); i++) {
            listaMenus.get(i).setValorMenu();
        }
        
        
        
        Cuenta cuenta1 = new Cuenta("Juan Pedro", listaMenus);
        cuenta1.setSubTotal();
        cuenta1.setIva();
        cuenta1.setValorTotal();
        System.out.println(cuenta1);
        
    }
}