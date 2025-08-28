public class Mascotas {

    private String nombre;
    private String especie;
    private String raza;

    // CONSTRUCTOR
    public Mascotas(String nombre, String especie, String raza){
        this.nombre = nombre;
        this.especie = especie;
        this.raza = raza;
    }

    // METODOS GETTERS
    public String getNombre() {
        return this.nombre;
    }

    public String getEspecie() {
        return this.especie;
    }

    public String getRaza() {
        return this.raza;
    }

    // SETTERS

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    // METODO
    public String mostrarInfo(){
        return "Datos mascota: \n"
                + "- Nombre: " + this.nombre + "\n"
                + "- Especie: " + this.especie + "\n"
                + "- Raza: " + this.raza + "\n";
    }
}
