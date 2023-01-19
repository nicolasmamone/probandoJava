package persona;
public class Persona {

    private String nombre;
    private int edad;
    private static int cantidadDePersonas;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.cantidadDePersonas ++;
    }

    public void sumatoriaDepersonas(){
         this.cantidadDePersonas ++;
    }
    public static int getCantidadDePersonas() {

        return cantidadDePersonas;
    }


    public String getNombre() { return nombre; }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
