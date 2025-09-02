public class Medicamentos extends ItemsFacturas {

    private int cantidad;

    // CONSTRUCTOR
    public Medicamentos(String nombre, double costo, int cantidad){
        super(nombre, costo);
        this.cantidad = cantidad;
    }

    @Override
    public double calcularSubtotal() {
        return this.costo * this.cantidad;
    }

    @Override
    public String mostrarDetalle() {
        return this.nombre +
                " x" + this.cantidad +
                " | Precio unitario: $" + this.costo;
    }
}
