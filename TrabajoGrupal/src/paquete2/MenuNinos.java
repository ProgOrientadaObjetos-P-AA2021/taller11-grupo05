package paquete2;

public class MenuNinos extends Menu {

    protected double valorInicialMenu;
    protected double valorHelado;
    protected double valorPastel;

    public MenuNinos(String nomPla, double valIniMenu, double valHelado,
            double valPastel) {
        super(nomPla);
        valorInicialMenu = valIniMenu;
        valorHelado = valHelado;
        valorPastel = valPastel;
    }

    @Override
    public void establecerValorMenu() {
        valorMenu = valorInicialMenu + valorHelado + valorPastel;
    }

    public void establecerValorInicialMenu(double valIniMenu) {
        valorInicialMenu = valIniMenu;
    }

    public void establecerValorHelado(double valHelado) {
        valorHelado = valHelado;
    }

    public void establecerValorPastel(double valPastel) {
        valorPastel = valPastel;
    }

    public double obtenerValorInicialMenu() {
        return valorInicialMenu;
    }

    public double obtenerValorHelado() {
        return valorHelado;
    }

    public double obtenerValorPastel() {
        return valorPastel;
    }

    @Override
    public String toString() {
        String cadena = String.format("\n**MENÚ DE NIÑOS**\n-----------------\n"
                + "Nombre del plato: %s\n"
                + "Valor inicial: $ %.2f\n"
                + "Valor del helado: $ %.2f\n"
                + "Valor del pastel: $ %.2f\n"
                + "Valor del menú: $ %.2f",
                obtenerPlato(), obtenerValorInicialMenu(), obtenerValorHelado(),
                obtenerValorPastel(), obtenerValorMenu());
        return cadena;
    }
}
