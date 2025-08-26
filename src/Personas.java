public class Personas {

    protected String nombre;

    // CONSTRUCTOR
    public Personas(String nombre) {
        this.nombre = nombre;
    }

    // METODO
    public void mostrarInfo(){
        System.out.printf("Mi nombre es: " + this.nombre);
    }

}
