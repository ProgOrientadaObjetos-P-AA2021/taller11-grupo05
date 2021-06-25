package paquete2;

public class MenuEconomico extends Menu {

    protected double valorInicialMenu;
    protected double porcentajeDescuento;

    public MenuEconomico(String nomPla, double valIniMenu, double valDesc) {
        super(nomPla);
        valorInicialMenu = valIniMenu;
        porcentajeDescuento = valDesc;
    }

    @Override
    public void establecerValorMenu() {
        valorMenu = valorInicialMenu
                - (valorInicialMenu * porcentajeDescuento / 100);
    }

    public void establecerValorInicialMenu(double valIniMenu) {
        valorInicialMenu = valIniMenu;
    }

    public void establecerPorcentajeDescuento(double valDesc) {
        porcentajeDescuento = valDesc;
    }

    public double obtenerValorInicialMenu() {
        return valorInicialMenu;
    }

    public double obtenerPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    @Override
    public String toString() {
        String cadena = String.format("\n**MENÚ ECONÓMICO**\n"
                + "------------------\n"
                + "Nombre del plato: %s\n"
                + "Valor inicial: $ %.2f\n"
                + "Porcentaje del descuento: %.2f%s ($ %.2f)\n"
                + "Valor del menú: $ %.2f",
                obtenerPlato(), obtenerValorInicialMenu(),
                obtenerPorcentajeDescuento(), "%",
                (obtenerValorInicialMenu() * obtenerPorcentajeDescuento() / 100),
                obtenerValorMenu());

        return cadena;
    }
}
