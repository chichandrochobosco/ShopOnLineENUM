
package shoponlineenum;

/**
 *
 * @author Licha
 */
public abstract class Producto {
    protected String desc;
    protected int cod;
    protected double precio;

    public Producto(String desc, double precio, int cod) {
        this.desc = desc;
        this.precio = precio;
        this.cod = cod;
    }

    @Override
    public String toString() {
        return this.desc + "........ $ " + this.precio;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public abstract double getPrecio();

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCod() {
        return cod;
    }
    
    
    
}
