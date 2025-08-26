public class Veterinarios extends Personas {

    private String especialidad;

    // METODO
    public Veterinarios(String nombre, String especialidad){
        super(nombre);
        this.especialidad = especialidad;
    }

    // METODO (POLIMORFISMO)
    @Override
    public void mostrarInfo(){
        System.out.println("- Nombre: " + this.nombre);
        System.out.println("- Especialidad: " + this.especialidad);
    }

}
