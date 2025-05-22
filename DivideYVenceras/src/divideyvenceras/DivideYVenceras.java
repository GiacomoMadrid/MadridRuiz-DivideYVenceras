/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package divideyvenceras;

import java.util.Scanner;
import modelo.AckermannIterativa;
import modelo.AckermannRecursiva;
import modelo.MedidorTiempo;

/**
 *
 * @author Giacomo
 */
public class DivideYVenceras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el valor de m: ");
        int m = scanner.nextInt();

        System.out.print("Ingrese el valor de n: ");
        int n = scanner.nextInt();

        System.out.println("\n****** Función de Ackermann ******");

        MedidorTiempo.medir(() -> {
            try {
                int resultado = AckermannRecursiva.calcular(m, n);
                System.out.println("Resultado recursivo: " + resultado);
            } catch (StackOverflowError e) {
                System.out.println("¡Desbordamiento de pila en la versión recursiva!");
            }
        }, "Recursiva");

        MedidorTiempo.medir(() -> {
            int resultado = AckermannIterativa.calcular(m, n);
            System.out.println("Resultado iterativa: " + resultado);
        }, "Iterativa");
    }
    
}
