package veterinaria;

public class Pasante  extends Persona{

    //Atributos
    private int horasDePractica;

    //Constructor

    public Pasante(String nombre, String identificacion, int edad, int horasDePractica) {
        super(nombre, identificacion, edad);
        this.horasDePractica = horasDePractica;
    }

    @Override
    public String describir() {
        return "Soy un Pasante en formaciòn en la clìnica AnimalCare.";
    }

    @Override
    public double calcularPago(){
        return horasDePractica * 8000;
    }
}
