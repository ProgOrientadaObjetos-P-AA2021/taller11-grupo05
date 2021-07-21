package taller11;

public class MenuEconomico extends Menu{
    
    private double porcentajeDescuento;
    
    
    public MenuEconomico(String nombre,double vIM) {
        super(nombre, vIM);               
    }
    
    

    @Override
    public void setValorMenu(){
        valorMenu = valorInicialMenu - porcentajeDescuento;
    }
    
    

    public double getPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    
    
    public void setPorcentajeDescuento(){
        porcentajeDescuento = valorInicialMenu * 0.10;
    }

    
    
    @Override
    public String toString(){
        String cadena = String.format("\nMenu economico.-\n"
                + "Nombre del plato: %s\n"                
                + "Valor inicial del menu: %.2f\n"
                + "Porcentaje de descuento: %.2f\n"
                + "Valor del menu: %.2f\n",
                getNombrePlato(),getValorInicialMenu(),getPorcentajeDescuento(),
                getValorMenu());        
        return cadena;
    }
}