package veterinaria;

public class Veterinario extends Persona implements Reportable{

    //Atributos
    private String especialidad;
    private double salarioBase;

    //Constructor
    public Veterinario(String nombre, String identificacion, int edad, String especialidad, double salarioBase) {
        super(nombre, identificacion, edad);
        this.especialidad = especialidad;
        this.salarioBase = salarioBase;
    }

    @Override
    public String describir(){
        return "Soy un Veterinario especializado en " + especialidad + ".";
    }

    @Override
    public double calcularPago(){
        return salarioBase * 1.10;
    }

    public String atenderMascota(String nombreMascota){
        return "El veterinario atendiò a: " + nombreMascota + ".";
    }

    @Override
    public String generarReporte(){
        return "Reporte Veterinario: nombre = " + getNombre() + ", identificacion = " + getIdentificacion() + ", edad = " + getEdad() + ", especialidad = " + especialidad + ", salarioBase = " + salarioBase;
    }
}
