abstract class ItemsFacturas {

    protected String nombre;
    protected double costo;

    /* ATRIBUTOS DE LA CLASE ANTERIOR
    private String nombre;
    private int cantidad;
    private double precioU;
    private double subtotal; */

    // METODOS
    public ItemsFacturas(String nombre, double costo) {
        this.nombre = nombre;
        this.costo = costo;
    }

    public abstract double calcularSubtotal();

    public abstract String mostrarDetalle();




}
