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
}
