import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null,"Bienvenidx a la veterinaria Sif");

        int bandera = 0;

        do {

            bandera = JOptionPane.showConfirmDialog(null,"Desea agendar una nueva cita?");

            if (bandera == 1) {
                JOptionPane.showMessageDialog(null,"Hasta la proxima!");

            } else {

                // DATOS DUEÑO MASCOTA
                String nombre, telefono, email;
                nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre del dueño de la mascota");
                telefono = JOptionPane.showInputDialog(null, "Ingrese el telefono del dueño de la mascota");
                email = JOptionPane.showInputDialog(null, "Ingrese el correo del dueño de la mascota");
                Duenios objDuenio = new Duenios(nombre, email, telefono);

                // DATOS MASCOTA
                String nombreMascota, especieMascota, razaMascota;
                nombreMascota = JOptionPane.showInputDialog(null, "Ingrese el nombre de la mascota");
                especieMascota = JOptionPane.showInputDialog(null, "Ingrese la especie de la mascota");
                razaMascota = JOptionPane.showInputDialog(null, "Ingrese la raza de la mascota");
                Mascotas objMascota = new Mascotas(nombreMascota, especieMascota, razaMascota);

                // DATOS VETERINARIO
                Veterinarios objVeterinario = new Veterinarios("Malenia", "Medica Veterinaria");

                // DATOS CITA
                String fechaCita, horaCita, motivoCita;
                fechaCita = JOptionPane.showInputDialog(null, "Ingrese la fecha de la cita a asignar");
                horaCita  = JOptionPane.showInputDialog(null, "Ingrese la hora de la cita a asignar");
                motivoCita = JOptionPane.showInputDialog(null, "Ingrese el motivo de la cita a asignar");
                Citas objCita = new Citas(fechaCita,horaCita, motivoCita, objDuenio, objMascota, objVeterinario);
                objCita.mostrarCitaInfo();

                // RESUMEN DE LA FACTURA
                Facturas facturas = objCita.getFactura();
                // Medicamentos de la factura
                int cantidadMedicamentos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de medicamentos"));
                for (int i = 0; i < cantidadMedicamentos; i++){
                    String nombreMedicamento = JOptionPane.showInputDialog("Ingrese el nombre del medicamento");
                    double precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio del medicamento"));
                    int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad del medicamento"));

                    facturas.agregarItem(new Medicamentos(nombreMedicamento, precio, cantidad));
                }
                // Servicios de la factura
                int cantidadServicios = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de servicios"));
                for (int i = 0; i < cantidadServicios; i++) {
                    String nombreServicio = JOptionPane.showInputDialog("Ingrese el nombre del servicio");
                    double costoServicio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el costo del servicio"));

                    facturas.agregarItem(new Servicios(nombreServicio, costoServicio));
                }

                JOptionPane.showMessageDialog(null, objCita.mostrarCitaInfo());
                facturas.mostrarDetalleFactura();
            }

        } while (bandera == 0);

    }
}
