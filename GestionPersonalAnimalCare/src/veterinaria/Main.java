package veterinaria;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Ingrese el nombre del Veterinario: ");
            String nombreV = sc.nextLine();
            System.out.println("Ingrese la identificaciòn del Veterinario: ");
            String identificacionV = sc.nextLine();
            System.out.println("Ingrese la edad del Veterinario: ");
            int edadV = Integer.parseInt(sc.nextLine());
            System.out.println("Ingrese la especialidad del Veterinario: ");
            String especialidad = sc.nextLine();
            System.out.println("Ingrese el salario del Veterinario:");
            double salarioBase = Double.parseDouble(sc.nextLine());

            Veterinario v1 = new Veterinario(nombreV, identificacionV, edadV, especialidad, salarioBase) {
                @Override
                public double calcularPago(){
                  return salarioBase * 1.2;
                }
            };

            System.out.println("Ingrese el nombre del Asistente: ");
            String nombreA = sc.nextLine();
            System.out.println("Ingrese la identificaciòn del Asistente: ");
            String identificacionA = sc.nextLine();
            System.out.println("Ingrese la edad del Asistente: ");
            int edadA = Integer.parseInt(sc.nextLine());
            System.out.println("Ingrese los turnos trabajados por el Asistente: ");
            int turnosTrabajadosA = Integer.parseInt(sc.nextLine());
            System.out.println("Ingrese el pago por turno al Asistente: ");
            double pagoPorTurnoA = Double.parseDouble(sc.nextLine());

            Asistente a1 = new Asistente(nombreA, identificacionA, edadA, turnosTrabajadosA, pagoPorTurnoA);

            System.out.println("Ingrese el nombre del Pasante: ");
            String nombreP = sc.nextLine();
            System.out.println("Ingrese la identificaciòn del Pasante: ");
            String identificacionP = sc.nextLine();
            System.out.println("Ingresse la edad del Pasante: ");
            int edadP = Integer.parseInt(sc.nextLine());
            System.out.println("Ingrese las horas de pràctica del Pasante: ");
            int horasDePracticaP = Integer.parseInt(sc.nextLine());

            Pasante p1 = new Pasante(nombreP, identificacionP, edadP, horasDePracticaP);

            System.out.println(v1.toString());
            System.out.println(a1.toString());
            System.out.println(p1.toString());

            Persona[] personas = new Persona[]{v1, a1, p1};
            for (Persona p : personas) {
                System.out.println(p.describir());
                System.out.println("Pago = " + p.calcularPago());
            }

            System.out.println(((Reportable)v1).generarReporte());
            System.out.println("Reporte" + (a1 instanceof Reportable));

        }
    }
}
