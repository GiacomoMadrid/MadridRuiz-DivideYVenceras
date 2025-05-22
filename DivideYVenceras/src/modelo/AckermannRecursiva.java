package modelo;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Giacomo
 */
public class AckermannRecursiva {

    public static int calcular(int m, int n) {
        if (m == 0) {
            return n + 1;
        } else if (m > 0 && n == 0) {
            return calcular(m - 1, 1);
        } else {
            return calcular(m - 1, calcular(m, n - 1));
        }
    }
}