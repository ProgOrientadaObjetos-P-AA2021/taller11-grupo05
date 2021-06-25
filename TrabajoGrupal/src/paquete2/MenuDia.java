package paquete2;

public class MenuDia extends Menu {

    protected double valorInicialMenu;
    protected double valorPostre;
    protected double valorBebida;

    public MenuDia(String nomPla, double valIniMenu, double valPostre,
            double valBebida) {
        super(nomPla);
        valorInicialMenu = valIniMenu;
        valorPostre = valPostre;
        valorBebida = valBebida;
    }

    @Override
    public void establecerValorMenu() {
        valorMenu = valorInicialMenu + valorPostre + valorBebida;
    }

    public void establecerValorInicialMenu(double valIniMenu) {
        valorInicialMenu = valIniMenu;
    }

    public void establecerValorPostre(double valPostre) {
        valorPostre = valPostre;
    }

    public void establecerValorBebida(double valBebida) {
        valorBebida = valBebida;
    }

    public double obtenerValorInicialMenu() {
        return valorInicialMenu;
    }

    public double obtenerValorPostre() {
        return valorPostre;
    }

    public double obtenerValorBebida() {
        return valorBebida;
    }

    @Override
    public String toString() {
        String cadena = String.format("\n**MENÚ DEL DIA**\n----------------\n"
                + "Nombre del plato: %s\n"
                + "Valor inicial: $ %.2f\n"
                + "Valor del postre: $ %.2f\n"
                + "Valor de bebida: $ %.2f\n"
                + "Valor del menú: $ %.2f",
                obtenerPlato(), obtenerValorInicialMenu(), obtenerValorPostre(),
                obtenerValorBebida(), obtenerValorMenu());

        return cadena;
    }
}
