package paquete2;

public abstract class Menu {

    protected String nombrePlato;
    protected double valorMenu;

    public Menu(String nomPla) {
        nombrePlato = nomPla;
    }

    public void establecerPlato(String plat) {
        nombrePlato = plat;
    }

    public abstract void establecerValorMenu();

    public String obtenerPlato() {
        return nombrePlato;
    }

    public double obtenerValorMenu() {
        return valorMenu;
    }
}
