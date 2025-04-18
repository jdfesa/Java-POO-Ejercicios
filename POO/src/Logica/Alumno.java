package Logica;

// Esta clase representa un alumno con sus datos básicos.
// Contiene atributos (id, nombre, apellido), constructores,
// y métodos para mostrar su nombre y saber si aprobó.
// También incluye los métodos getters y setters.

// Por convención, el nombre de la clase debe comenzar con mayúscula
// y estar en singular, ya que representa un solo objeto (instancia).

public class Alumno {
    // Atributos de la clase (características del alumno)
    int id;
    String nombre;
    String apellido;

    // Constructor vacío: no recibe parámetros.
    // Se usa cuando queremos crear un objeto sin asignar datos en el momento.
    public Alumno() {
    }

    // Constructor con parámetros: permite inicializar los atributos al crear el objeto.
    //
    // Las variables que recibe el constructor son locales a este método.
    // Los atributos (variables de clase) son accesibles en toda la clase.
    // Se usa la palabra clave 'this' para diferenciar entre ambas cuando tienen el mismo nombre.
    public Alumno(int id, String nombre, String apellido){
        this.id = id;             // Asigna el valor recibido al atributo de la clase
        this.nombre = nombre;
        this.apellido = apellido;
    }

    // Por convención, los getters y setters se colocan después de los constructores
    // y antes de los métodos personalizados.

    // Get = Obtener
    // Set = Establecer
    //
    // Estos métodos permiten acceder y modificar los atributos de una clase
    // desde fuera de ella, especialmente cuando los atributos son privados (no es el caso aquí, pero es buena práctica).
    //
    // ¿Por qué usar setters si ya podemos asignar valores en el constructor?
    // Porque podemos usar el constructor vacío, o querer modificar los valores después.

    // Método getter para 'id'
    // Devuelve el valor actual del atributo 'id'
    public int getId(){
        return id;
    }

    // Método setter para 'id'
    // Recibe un valor por parámetro y lo asigna al atributo
    public void setId(int id){
        this.id = id;
    }

    // Getter y setter para 'nombre'
    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    // Getter y setter para 'apellido'
    public String getApellido(){
        return apellido;
    }

    public void setApellido(String apellido){
        this.apellido = apellido;
    }

    // Método personalizado
    // Por convención, los métodos comienzan en minúscula y usan lowerCamelCase.
    // Este método muestra un mensaje en consola.
    public void mostrarNombre(){
        System.out.println("Hola, soy un alumno y sé decir mi nombre");
    }

    // Método personalizado que recibe una calificación
    // e indica si el alumno aprobó o no.
    public void saberAprobado(double calificacion){
        if(calificacion >= 6){
            System.out.println("Aprobé la materia");
        } else {
            System.out.println("Uy, ¡no aprobé!");
        }
    }
}
