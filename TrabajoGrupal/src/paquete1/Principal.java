package paquete1;

import java.util.ArrayList;
import paquete2.Menu;
import paquete2.MenuCarta;
import paquete2.MenuDia;
import paquete2.MenuEconomico;
import paquete2.MenuNinos;
import paquete3.Cuenta;

public class Principal {

    public static void main(String[] args) {
        MenuNinos mn1 = new MenuNinos("Pure de verduras", 10, 5, 15);
        MenuNinos mn2 = new MenuNinos("Cereales con leche", 20, 15, 30);

        MenuEconomico me = new MenuEconomico("Guatita", 20, 2);

        MenuDia md = new MenuDia("Ensalada mixta", 10, 5, 3);

        MenuCarta mc = new MenuCarta("Parihuela", 30, 10, 7, 3);

        ArrayList<Menu> ListaMenuPedidos = new ArrayList<>();
        ListaMenuPedidos.add(mn1);
        mn1.establecerValorMenu();
        ListaMenuPedidos.add(mn2);
        mn2.establecerValorMenu();
        ListaMenuPedidos.add(me);
        me.establecerValorMenu();
        ListaMenuPedidos.add(md);
        md.establecerValorMenu();
        ListaMenuPedidos.add(mc);
        mc.establecerValorMenu();

        Cuenta ct = new Cuenta("ALEXANDER JIMÉNEZ", ListaMenuPedidos);
        ct.establecerSubtotal();
        ct.establecerIva();
        ct.establecerTotal();
        System.out.println(ct);
    }
}


