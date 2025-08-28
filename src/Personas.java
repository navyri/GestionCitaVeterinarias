public class Personas {

    protected String nombre;

    // CONSTRUCTOR
    public Personas(String nombre) {
        this.nombre = nombre;
    }

    // METODO
    public String mostrarInfo(){
        return "Mi nombre es: " + this.nombre;
    }

}
