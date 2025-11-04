package veterinaria;

public abstract class Persona {

    //Atributos
    private String nombre;
    private String identificacion;
    private int edad;

    //Constructor

    public Persona(String nombre, String identificacion, int edad) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.edad = edad;
    }

    //Getters y Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    //Mètodo Abstract String
    public abstract String describir();

    //Mètodo Abstracy Double
    public abstract double calcularPago();


}
