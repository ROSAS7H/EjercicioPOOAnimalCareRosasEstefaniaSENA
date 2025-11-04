package veterinaria;

public class Asistente extends Persona{

    //Atributos
    private int turnosTrabajados;
    private double pagoPorTurno;

    //Constructor
    public Asistente(String nombre, String identificacion, int edad, int turnosTrabajados, double pagoPorTurno) {
        super(nombre, identificacion, edad);
        this.turnosTrabajados = turnosTrabajados;
        this.pagoPorTurno = pagoPorTurno;
    }

    @Override
    public String describir() {
        return "Soy un Asistente veterinario.";
    }

    @Override
    public double calcularPago() {
        return turnosTrabajados * pagoPorTurno;

    }

    public String prepararEquipo(){
        return "El Asistente preparò el equipo mèdico";
    }
}
