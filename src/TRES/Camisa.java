package TRES;

/**
 *
 * @author AA2020
 */
public class Camisa extends PrendaVestir implements EstiloCamisa, Tela{
    public Camisa(String camisaTalla, String camisaColor) {
        super(camisaTalla, camisaColor);
    }

    
    @Override
    public String DressUp(){
       return "¡Te quedó bien!";
    }
    

    @Override
    public String TelaType() {
        return "Algodón";
    }
    

    @Override
    public String Style() {
        return "Mangalarga";
    }
}
