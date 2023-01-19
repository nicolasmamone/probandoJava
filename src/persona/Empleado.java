package persona;
public class Empleado extends Persona{
    private String legajo;

    public Empleado(String nombre, int edad, String legajo) {
        super(nombre, edad);
        this.legajo = legajo;
    }


    public String getLegajo() {
        return legajo;

    }

    public void setLegajo(String legajo) {
        this.legajo = legajo;
    }
}
