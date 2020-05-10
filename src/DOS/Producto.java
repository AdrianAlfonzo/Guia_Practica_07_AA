package DOS;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author AA2020
 */
public class Producto implements Caducidad, Impuesto{
    public double _costo;
    public String _fechaCaduca;
    public double _IVA;
    public Double _total;
    
    
    public Producto(){
    
    }
    
    
    @Override
    public double CalcularIVA(double costo){
       return costo * 0.13;
    }

    
    @Override
    public double CalcularTotal(double costo){
       return this._costo + this._IVA;
    }

    
    @Override
    public String FechaCaduca(){
        Date dateObj = new Date();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MMM/YYYY");
        return formatoFecha.format(dateObj);
    }
}
