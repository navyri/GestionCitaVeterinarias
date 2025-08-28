import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        String nombre, telefono, email;
        nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre del dueño de la mascota");
        telefono = JOptionPane.showInputDialog(null, "Ingrese el telefono del dueño de la mascota");
        email = JOptionPane.showInputDialog(null, "Ingrese el correo del dueño de la mascota");

        Duenios objDuenio = new Duenios("Mary", "mary@gmail.com", "12345678");
        Mascotas objMascota = new Mascotas("Tinta", "Gato", "Criollo");
        Veterinarios objVeterinario = new Veterinarios("Mikaela", "Cirujana");

        Citas objCita = new Citas("28/08/2025","7:03 am", "Revision", objDuenio, objMascota, objVeterinario);
        objCita.mostrarCitaInfo();

        JOptionPane.showMessageDialog(null, objCita.mostrarCitaInfo());

    }
}
