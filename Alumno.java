package Ejercicio_Notas;

import java.util.ArrayList;

public class Alumno {
    private String nombreCompleto;
    private long legajo;
    private ArrayList<Nota> notas;

    public Alumno(String nombreCompleto, long legajo) {
        this.nombreCompleto = nombreCompleto;
        this.legajo = legajo;
        this.notas = new ArrayList<>();
    }

    public void agregarNota(Nota nota) {
        notas.add(nota);
    }

    public double calcularPromedio() {
        double suma = 0;
        for (Nota nota : notas) {
            suma += nota.getNotaExamen();
        }
        return notas.isEmpty() ? 0 : suma / notas.size();
    }

    @Override
    public String toString() {
        return "Alumno: " + nombreCompleto + ", Legajo: " + legajo +
                ", Promedio: " + calcularPromedio() + "\nNotas: " + notas;
    }
}
