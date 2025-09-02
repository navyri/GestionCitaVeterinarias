import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Facturas {

    private double costoBase;
    private List<ItemsFacturas> items;

    // CONSTRUCTOR
    public Facturas() {
        this.costoBase = 30000;
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

    public void mostrarDetalleFactura() {
        String medicamentos = "";
        String servicios = "";

        double subtotalMedicamentos = 0;
        double subtotalServicios = 0;

        for (ItemsFacturas item : items) {
            if (item instanceof Medicamentos) {
                medicamentos += "- " + item.mostrarDetalle() + "\n";
                subtotalMedicamentos += item.calcularSubtotal();
            } else if (item instanceof Servicios) {
                servicios += "- " + item.mostrarDetalle() + "\n";
                subtotalServicios += item.calcularSubtotal();
            }
        }

        double total = this.costoBase + subtotalMedicamentos + subtotalServicios;

        String mensaje = "Medicamentos:\n" + medicamentos +
                "Subtotal medicamentos: $" + subtotalMedicamentos + "\n\n" +
                "Servicios:\n" + servicios +
                "Subtotal servicios: $" + subtotalServicios + "\n\n" +
                "Costo base de la cita: $" + this.costoBase + "\n\n" +
                "TOTAL FACTURA: $" + total;

        JOptionPane.showMessageDialog(null, "RESUMEN DE LA FACTURA\n" + mensaje);
    }




}
