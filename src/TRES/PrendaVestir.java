package TRES;

/**
 *
 * @author WIN10
 */
public abstract class PrendaVestir{
    public String talla;
    public String color;

    
    public PrendaVestir(){
    
    }
    
    
    public PrendaVestir(String talla, String color) {
        this.talla = talla;
        this.color = color;
    }
    
    
    public abstract String DressUp();
}
