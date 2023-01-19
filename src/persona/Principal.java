package persona;

public class Principal {

    public static void main(String[] args) {
        Persona persona1 = new Persona("pepe", 34);
        Persona persona2 = new Persona("juan", 34);
        Persona persona3 = new Persona("felipe", 34);

        Empleado empleado1 = new Empleado("Maria", 43, "00001");
        Cliente cliente1 = new Cliente("Pedro", 45, "Calle falsa 123");

        System.out.println(persona2.getCantidadDePersonas());
        System.out.println(Persona.getCantidadDePersonas());
    }
}
