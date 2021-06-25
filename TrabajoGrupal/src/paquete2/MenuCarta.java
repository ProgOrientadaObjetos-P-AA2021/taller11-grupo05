package paquete2;

public class MenuCarta extends Menu {

    protected double valorInicialMenu;
    protected double valorGuarnicion;
    protected double valorBebida;
    protected double porcentajeAdicional;

    public MenuCarta(String nomPla, double valIniMenu, double valGuar,
            double valBebida, double valAdic) {
        super(nomPla);
        valorInicialMenu = valIniMenu;
        valorGuarnicion = valGuar;
        valorBebida = valBebida;
        porcentajeAdicional = valAdic;
    }

    @Override
    public void establecerValorMenu() {
        valorMenu = valorInicialMenu + valorGuarnicion + valorBebida
                + (valorInicialMenu * porcentajeAdicional / 100);
    }

    public void establecerValorInicialMenu(double valIniMenu) {
        valorInicialMenu = valIniMenu;
    }

    public void establecerValorGuarnicion(double valGuar) {
        valorGuarnicion = valGuar;
    }

    public void establecerValorBebida(double valBebida) {
        valorBebida = valBebida;
    }

    public void establecerPorcentajeAdicional(double valAdic) {
        porcentajeAdicional = valAdic;
    }

    public double obtenerValorInicialMenu() {
        return valorInicialMenu;
    }

    public double obtenerValorGuarnicion() {
        return valorGuarnicion;
    }

    public double obtenerValorBebida() {
        return valorBebida;
    }

    public double obtenerPorcentajeAdicional() {
        return porcentajeAdicional;
    }

    @Override
    public String toString() {
        String cadena = String.format("\n**MENÚ A LA CARTA**"
                + "\n-------------------\n"
                + "Nombre del plato: %s\n"
                + "Valor inicial: $ %.2f\n"
                + "Valor de bebida: $ %.2f\n"
                + "Valor de porcion de guarnición: $ %.2f\n"
                + "Porcentaje adicional: %.2f%s ($ %.2f)\n"
                + "Valor del menú: $ %.2f",
                obtenerPlato(), obtenerValorInicialMenu(), obtenerValorBebida(),
                obtenerValorGuarnicion(), obtenerPorcentajeAdicional(), "%",
                (obtenerValorInicialMenu() * obtenerPorcentajeAdicional() / 100),
                obtenerValorMenu());
        return cadena;
    }
}
