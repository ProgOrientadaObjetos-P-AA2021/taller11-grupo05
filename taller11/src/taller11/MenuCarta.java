package taller11;

public class MenuCarta extends Menu{
    
    public double valorGuarnicion;
    public double valorBebida;
    public double porcentajeAdicional;

    public MenuCarta(String nombre,double vIM, double vg,
            double vb) {
        super(nombre,vIM);
        valorGuarnicion = vg;
        valorBebida = vb;
    }
    
    
    
    
    
    @Override
    public void setValorMenu(){
        valorMenu = valorGuarnicion + valorBebida + porcentajeAdicional +
                valorInicialMenu;
    } 
    
    
    
            
    public void setValorGuarnicion(double x){
        valorGuarnicion = x;
    }      
    
    
    
    
    public double getValorGuarnicion(){
        return valorGuarnicion;
    }
    
    
    
    
    public void setValorBebida(double x){
        valorBebida = x;
    }       
    
    
    
    public double getValorBebida(){
        return valorBebida;
    }
    
    
    
    
    public void setPorcentajeAdicional(){
        porcentajeAdicional = valorInicialMenu * 0.10;
    }   


    
    
    public double getPorcentajeAdicional(){
        return porcentajeAdicional;
    }
    
    
    
    
    @Override
    public String toString(){
        String cadena = String.format("\nMenu a la carta.-\n"
                + "Nombre del plato: %s\n"                
                + "Valor inicial del menu: %.2f\n"
                + "Valor porcion de guarnicion: %.2f\n"
                + "Valor de bebida: %.2f\n"
                + "Porcentaje adicional por servicio: %.2f\n"
                + "Valor del menu: %.2f\n",
                getNombrePlato(),getValorInicialMenu(),getValorGuarnicion(),
                getValorBebida(),getPorcentajeAdicional(),getValorMenu());
        
        return cadena;
    }    
}