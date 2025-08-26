public class Citas {

    private String fecha;
    private String hora;
    private String motivo;
    private Duenios duenios;
    private Mascotas mascotas;
    private Veterinarios veterinarios;
    private Facturas facturas;

    // CONSTRUCTOR
    public Citas(String fecha, String hora, String motivo, Duenios duenios, Mascotas mascotas, Veterinarios veterinarios) {
        this.fecha = fecha;
        this.hora = hora;
        this.motivo = motivo;
        this.duenios = duenios;
        this.mascotas = mascotas;
        this.veterinarios = veterinarios;
        this.facturas = new Facturas();
    }

    // METODOS
    public Facturas getFactura(){
        return facturas;
    }

    public void mostrarCitaInfo(){
        System.out.println("INFORMACION DE LA CITA:");
        System.out.println("- Fecha: " + this.fecha);
        System.out.println("- Hora: " + this.hora);
        System.out.println("- Motivo: " + this.motivo);
        duenios.mostrarInfo();
        mascotas.mostrarInfo();
        veterinarios.mostrarInfo();
        System.out.println(" ");
        getFactura();
    }

}
