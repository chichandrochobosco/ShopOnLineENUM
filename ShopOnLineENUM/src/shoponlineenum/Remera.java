
package shoponlineenum;

/**
 *
 * @author Licha
 */
public class Remera extends Producto{
    private String talle;

    public Remera(String talle, String desc, double precio, int cod) {
        super(desc, precio, cod);
        this.talle = talle;
    }

    @Override
    public String toString() {
        return "Remera: talle: "+talle+", descripcion: "+desc+", precio: "+precio+", codigo: "+cod;
    }

    @Override
    public double getPrecio() {
        double precioFinal=0;
        if("S".equals(talle)){
            precioFinal=precio+(precio*5/100);
        }else if("M".equals(talle)){
            precioFinal=precio+(precio*10/100);
        }
        else if("L".equals(talle)){
            precioFinal=precio+(precio*15/100);
        }else if("XL".equals(talle)){
            precioFinal=precio+(precio*20/100);
        }

        return precioFinal;
    }
    
    
    
    
}
