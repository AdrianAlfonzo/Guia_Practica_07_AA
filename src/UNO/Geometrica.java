package UNO;

/**
 *
 * @author AA
 */
public class Geometrica implements UNO.Clases_Interfaz.Area, UNO.Clases_Interfaz.Perimetro {
    public double _area;
    public double _perimeter;

    @Override
    public double CalcularArea(double altura, double base) {
        return altura * base;
    }

    @Override
    public double CalcularPeri(double ancho, double largo) {
        return 2*(ancho+largo);
    }
}
