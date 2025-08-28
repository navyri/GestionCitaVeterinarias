public class Veterinarios extends Personas {

    private String especialidad;

    // CONSTRUCTOR
    public Veterinarios(String nombre, String especialidad){
        super(nombre);
        this.especialidad = especialidad;
    }

    // METODO (POLIMORFISMO)
    @Override
    public String mostrarInfo(){
        return "Datos veterinari@: \n"
                + "- Nombre: " + this.nombre + "\n"
                + "- Especialidad: " + this.especialidad + "\n";
    }

}
