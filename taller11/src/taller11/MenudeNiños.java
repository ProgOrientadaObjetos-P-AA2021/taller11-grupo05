package taller11;

public class MenudeNiños extends Menu{
    private double valorHelado;
    private double valorPastel;

    public MenudeNiños(String nombre,double vIM, double vP,
            double vB) {
        super(nombre, vIM);
        valorHelado = vP;
        valorPastel = vB;
    }

    
    
    @Override
    public void setValorMenu(){
        valorMenu = valorHelado + valorPastel + valorInicialMenu;
    }
    
    
    
    public double obtenerValorHelado() {
        return valorHelado;
    }
    
    

    public void establecerValorHelado(double vH) {
        valorHelado = vH;
    }

    
    
    public double obtenerValorPastel() {
        return valorPastel;
    }

    
    
    public void establecerValorPastel(double vP) {
        valorPastel = vP;
    }

    
    
    @Override
    public String toString(){
        String cadena = String.format("\nMenu del niños.-\n"
                + "Nombre del plato: %s\n"                
                + "Valor inicial del menu: %.2f\n"
                + "Valor de porcion de helado: %.2f\n"
                + "Valor de porcion de pastel: %.2f\n"
                + "Valor del menu: %.2f\n",
                getNombrePlato(),getValorInicialMenu(),obtenerValorHelado(),
                obtenerValorPastel(),getValorMenu());
        
        return cadena;
    }
}
