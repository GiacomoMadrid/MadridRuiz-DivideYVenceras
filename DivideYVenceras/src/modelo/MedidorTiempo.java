/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Giacomo
 */
public class MedidorTiempo {

    public static void medir(Runnable tarea, String nombre) {
        long inicio = System.nanoTime();
        tarea.run();
        long fin = System.nanoTime();
        long duracion = (fin - inicio) / 1000000; // ms

        System.out.println("Tiempo de ejecución (" + nombre + "): " + duracion + " ms");
    }
}