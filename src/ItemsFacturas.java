abstract class ItemsFacturas {

    protected String nombre;
    protected double costo;

    // METODOS
    public ItemsFacturas(String nombre, double costo) {
        this.nombre = nombre;
        this.costo = costo;
    }

    public abstract double calcularSubtotal();

    public abstract String mostrarDetalle();




}
