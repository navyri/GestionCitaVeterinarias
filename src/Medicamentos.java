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
        return "El medicamento " + this.nombre + " esta recetado en una cantidad de: " + this.cantidad + " por un costo de $" + this.costo;
    }
}
