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
                String nombre, telefono, email;
                nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre del dueño de la mascota");
                telefono = JOptionPane.showInputDialog(null, "Ingrese el telefono del dueño de la mascota");
                email = JOptionPane.showInputDialog(null, "Ingrese el correo del dueño de la mascota");

                Duenios objDuenio = new Duenios("Mary", "mary@gmail.com", "12345678");
                Mascotas objMascota = new Mascotas("Tinta", "Gato", "Criollo");
                Veterinarios objVeterinario = new Veterinarios("Malenia", "Cirujana");

                Citas objCita = new Citas("28/08/2025","7:03 am", "Revision", objDuenio, objMascota, objVeterinario);
                objCita.mostrarCitaInfo();

                Facturas facturas = objCita.getFactura();

                int cantidadMedicamentos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de medicamentos"));

                for (int i = 0; i < cantidadMedicamentos; i++){
                    String nombreMedicamento = JOptionPane.showInputDialog("Ingrese el nombre del medicamento");
                    double precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio del medicamento"));
                    int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad del medicamento"));

                    facturas.agregarItem(new Medicamentos(nombreMedicamento, precio, cantidad));
                }

                JOptionPane.showMessageDialog(null, objCita.mostrarCitaInfo());
                facturas.mostrarDetalleFactura();
            }

        } while (bandera == 0);



    }
}
