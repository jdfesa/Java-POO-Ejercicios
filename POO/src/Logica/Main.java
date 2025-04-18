package Logica;

// Esta clase Main tiene el método principal (main)
// que se encarga de ejecutar el programa.
//
// En este caso, vamos a crear objetos de tipo Alumno,
// y vamos a utilizar los constructores, setters y getters
// para establecer y obtener los valores de sus atributos.

public class Main {
    public static void main(String[] args) {

        // Crear un alumno usando el constructor vacío (sin pasar datos)
        Alumno alu1 = new Alumno();

        // Crear un alumno usando el constructor con parámetros (pasando id, nombre y apellido)
        Alumno alu2 = new Alumno(5, "Pepe", "Sanchez");

        // Mostrar los datos del alumno 2 utilizando los métodos getters
        System.out.println("La ID del alumno 2 es: " + alu2.getId());
        System.out.println("El nombre es: " + alu2.getNombre());
        System.out.println("El apellido es: " + alu2.getApellido());

        // Asignar valores al alumno 1 usando los métodos setters
        alu1.setId(8);
        alu1.setNombre("Juan");
        alu1.setApellido("Gómez");

        // Modificar el apellido del alumno 2
        alu2.setApellido("Perez");

        System.out.println("-----------------------------");

        // Mostrar los datos del alumno 1
        System.out.println("La ID del alumno 1 es: " + alu1.getId());
        System.out.println("El nombre del alumno 1 es: " + alu1.getNombre());
        System.out.println("El apellido del alumno 1 es: " + alu1.getApellido());

        System.out.println("-----------------------------");

        // Cambiar la ID del alumno 2 (modificando su valor actual)
        alu2.setId(35); // Estoy cambiando el valor de ID

        // Mostrar nuevamente los datos actualizados del alumno 2
        System.out.println("La ID del alumno 2 es: " + alu2.getId());
        System.out.println("El nombre es: " + alu2.getNombre());
        System.out.println("El apellido es: " + alu2.getApellido());
    }
}
