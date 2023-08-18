
package shoponlineenum;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Licha
 */
public class Venta {
    private static int nroFact = 1090;
    private ArrayList<Producto> listProd;
    private Cliente cliente;
    private LocalDate fecha;
    
    public Venta(LocalDate fecha, Cliente cliente){
        this.fecha = fecha;
        this.cliente = cliente;
        this.listProd = new ArrayList();
    }
    
    public void sumarNro(){
        nroFact +=1;
    }
    public void agregarProducto(Producto producto){
        listProd.add(producto);
    }
    public double calcularImporteTotal(){
        double importe = 0;
        
        for(int i =0;i<listProd.size(); i++){
        System.out.println("precio: "+listProd.get(i).getPrecio());
        importe += listProd.get(i).getPrecio() ;
        }
        
        System.out.println("importe: "+importe);
        return importe;
    }
    public void imprimirFactura(){
        sumarNro();
        System.out.println("Factura N° "+nroFact+" - " + fecha);
        for(int i =0;i<listProd.size(); i++){
        
        System.out.println(listProd.get(i).toString());  
    }
        System.out.println("Total a pagar: .....$"+calcularImporteTotal());
    }
    
}

