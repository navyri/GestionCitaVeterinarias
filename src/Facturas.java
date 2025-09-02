import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Facturas {

    private double costoBase;
    private List<ItemsFacturas> items;

    // CONSTRUCTOR
    public Facturas() {
        this.costoBase = 3000;
        this.items = new ArrayList<>();
    }

    // METODO
    public double getCostoBase() {
        return this.costoBase;
    }

    public void agregarItem(ItemsFacturas item){
        this.items.add(item);
    }

    public double calcularTotal(){
        double total = this.costoBase;
        for (ItemsFacturas item : items){
            total += item.calcularSubtotal();
        }
        return total;
    }

    public void mostrarDetalleFactura(){
        String mensaje = "\n";
        for (ItemsFacturas item : items){
            mensaje += item.mostrarDetalle();
        }
        JOptionPane.showMessageDialog(null, "RESUMEN DE LA FACTURA\n" + mensaje);
    }

}
