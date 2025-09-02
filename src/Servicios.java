public class Servicios extends ItemsFacturas {

    // CONSTRUCTOR
    public Servicios(String nombre, double costo) {
        super(nombre, costo);
    }

    @Override
    public double calcularSubtotal() {
        return this.costo;
    }

    @Override
    public String mostrarDetalle() {
        return this.nombre + ": $" + this.costo;
    }


}
