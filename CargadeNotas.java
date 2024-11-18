package Ejercicio_Notas;

import java.util.ArrayList;
import java.util.Scanner;

public class CargadeNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Alumno> alumnos = new ArrayList<>();

        System.out.println("Ingrese la cantidad de alumnos:");
        int cantidadAlumnos = scanner.nextInt();
        scanner.nextLine(); // Consumir salto de línea

        for (int i = 0; i < cantidadAlumnos; i++) {
            System.out.println("Ingrese el nombre completo del alumno:");
            String nombre = scanner.nextLine();
            System.out.println("Ingrese el legajo del alumno:");
            long legajo = scanner.nextLong();
            scanner.nextLine(); // Consumir salto de línea

            Alumno alumno = new Alumno(nombre, legajo);

            System.out.println("Ingrese la cantidad de notas del alumno:");
            int cantidadNotas = scanner.nextInt();
            scanner.nextLine(); // Consumir salto de línea

            for (int j = 0; j < cantidadNotas; j++) {
                System.out.println("Ingrese el nombre de la cátedra:");
                String catedra = scanner.nextLine();
                System.out.println("Ingrese la nota del examen:");
                double nota = scanner.nextDouble();
                scanner.nextLine(); // Consumir salto de línea

                alumno.agregarNota(new Nota(catedra, nota));
            }
            alumnos.add(alumno);
        }

        System.out.println("\n--- Información de los Alumnos ---");
        for (Alumno alumno : alumnos) {
            System.out.println(alumno);
        }

        scanner.close();
    }
}
