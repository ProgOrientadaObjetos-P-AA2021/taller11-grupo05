package taller11;

public class MenuDia extends Menu{
    
    public double valorPostre;
    public double valorBebida;   

    public MenuDia(String nombre,double vIM, double vP,
            double vB) {
        super(nombre, vIM);
        valorPostre = vP;
        valorBebida = vB;
    }
    
    
    
        
    @Override
    public void setValorMenu(){
        valorMenu = valorPostre + valorBebida + valorInicialMenu;
    }
    
    
    
    public void setValorPostre(double x){
        valorPostre = x;
    }       
    
    
    
    public double getValorPostre(){
        return valorPostre;
    }
    
    
    
    public void setValorBebida(double x){
        valorBebida = x;
    }       
    
    
    
    public double getValorBebida(){
        return valorBebida;
    }
    
    
    
    @Override
    public String toString(){
        String cadena = String.format("\nMenu del dia.-\n"
                + "Nombre del plato: %s\n"                
                + "Valor inicial del menu: %.2f\n"
                + "Valor de postre: %.2f\n"
                + "Valor de bebida: %.2f\n"
                + "Valor del menu: %.2f\n",
                getNombrePlato(),getValorInicialMenu(),getValorPostre(),
                getValorBebida(),getValorMenu());
        
        return cadena;
    }
}