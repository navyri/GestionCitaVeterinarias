public class Duenios extends Personas {

    private String email;
    private String telefono;

    // CONSTRUCTOR
    public Duenios(String nombre, String email, String telefono){
        super(nombre);
        this.email = email;
        this.telefono = telefono;
    }

    // METODO (POLIMORFISMO)
    @Override
    public String mostrarInfo(){
        return "Datos dueñ@: \n"
                + "- Nombre: " + this.nombre + "\n"
                + "- Email: " + this.email + "\n"
                + "- Teléfono: " + this.telefono + "\n";
    }

}
