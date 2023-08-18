/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shoponlineenum;

/**
 *
 * @author Licha
 */
public class Pantalon extends Producto{
    private int talle;

    public Pantalon(int talle, String desc, double precio, int cod) {
        super(desc, precio, cod);
        this.talle = talle;
    }

    @Override
    public String toString() {
        return "Pantalon: talle: "+talle+", descripcion: "+desc+", precio: "+precio+", codigo: "+cod;
    }

    public double getPrecio() {
        double precioFinal=0;
        if("Oxford".equals(desc)){
            precioFinal =precio+(precio*15/100);
        }else if("Skinny".equals(desc)){
            precioFinal =precio+(precio*25/100);
        }
        else if("Recto".equals(desc)){
            precioFinal =precio-(precio*15/100);
        }

        return precioFinal;
    }
    
    
}
