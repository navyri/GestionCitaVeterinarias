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
        return this.facturas;
    }

    public String mostrarCitaInfo(){
        return "INFORMACION DE LA CITA:\n"
                + "- Fecha: " + this.fecha + "\n"
                + "- Hora: " + this.hora + "\n"
                + "- Motivo: " + this.motivo + "\n\n"
                + duenios.mostrarInfo() + "\n"
                + mascotas.mostrarInfo() + "\n"
                + veterinarios.mostrarInfo();
    }

}
