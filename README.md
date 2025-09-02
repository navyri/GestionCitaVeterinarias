<p align='center'> 
  <img src="https://capsule-render.vercel.app/api?type=waving&height=200&color=80354A&text=Sistema%20de%20Gestion%20de%20Veterinaria&fontColor=FFFFFF&fontSize=50&fontAlignY=38" /> 
</p>
<p align='center'>
    <img 
        src="https://i.imgur.com/WiZqj0H.png" width="" height="" alt="Salida programa"
    />
</p>
<p align='center'>
    <img
        src="https://readme-typing-svg.demolab.com/?font=Iosevka&size=16&pause=1000&color=FFFFFF&center=true&vCenter=true&width=435&lines=Ejemplo+de+salida!" alt="Typing SVG"
    />
    <img 
        src="https://capsule-render.vercel.app/api?type=rect&height=5&color=80354A&reversal=false&fontAlignY=40&fontColor=FFFFFF&fontSize=60"
    />
</p>


### Descripción

Sistema orientado a objetos para la **gestión de una veterinaria**, donde se pueden:
- Registrar los dueños de las mascotas, mascotas y agendar citas.
- Asociar medicamentos y servicios veterinarios a cada factura.
- Calcular subtotales y total de cada factura de acuerdo a los ítems agregados.

Todo el flujo es interactivo mediante **ventanas emergentes (JOptionPane)** y los datos se solicitan al usuario en cada operación.

---

### Estructura principal

El proyecto está organizado en los siguientes archivos y clases dentro de la carpeta `src`:

- `Main`: Clase principal, punto de inicio del sistema.
- `Citas`: Gestiona la información de cada cita asignada (fecha, hora, motivo, y asociaciones).
- `Duenios`: Representa al dueño de la mascota, hereda de `Personas`.
- `Mascotas`: Contiene los datos básicos de cada mascota.
- `Veterinarios`: Contiene los datos del profesional veterinario encargado, hereda de `Personas`.
- `Facturas`: Maneja la creación y desglose de la factura, agrupando medicamentos y servicios.
- `ItemsFacturas`: Clase abstracta base para todo ítem de factura.
- `Medicamentos`: Hereda de `ItemsFacturas`, representa los medicamentos recetados, su cantidad y costo.
- `Servicios`: Hereda de `ItemsFacturas`, representa los servicios o procedimientos realizados.
- `Personas`: Clase base o de apoyo para modelar entidades generales (como dueño y veterinario).

---

### Características principales

- Registro interactivo de clientes, mascotas, y datos de la cita.
- Permite al usuario agregar cualquier cantidad de medicamentos y servicios a la factura.
- Los medicamentos y servicios se muestran agrupados, junto a sus respectivos subtotales y el total general.
- El sistema calcula automáticamente el subtotal de cada grupo y el total de la cuenta, incluyendo un costo base de atención.
- Toda interacción y resultados visibles para el usuario mediante JOptionPane.

---

### Ejemplo de Flujo

1. Selección en menú: ¿Agendar una nueva cita?
2. Ingreso de datos:
    - Nombre, teléfono y correo del dueño.
    - Nombre, especie y raza de la mascota.
    - Fecha, hora y motivo de la cita.
3. Ingreso de medicamentos y servicios:
    - Nombre, cantidad y precio unitario de cada medicamento.
    - Nombre y costo de cada servicio veterinario.
4. Visualización resumen final:
    - Muestra todos los datos de la cita.
    - Enumera medicamentos con subtotales, luego servicios con subtotales y el total final de la factura.
<p align='center'>
    <img 
        src="https://capsule-render.vercel.app/api?type=rect&height=5&color=80354A&reversal=false&fontAlignY=40&fontColor=FFFFFF&fontSize=60"
    />
</p>
