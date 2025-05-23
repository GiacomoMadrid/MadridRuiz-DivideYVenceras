/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.Stack;

/**
 *
 * @author Giacomo
 */
public class AckermannIterativa {

    public static int calcular(int m, int n) {
        Stack<Integer> stack = new Stack<>();

        stack.push(m);

        while (!stack.isEmpty()) {
            m = stack.pop();

            if (m == 0) {
                n = n + 1;
            } else if (n == 0) {
                stack.push(m - 1);
                n = 1;
            } else {
                stack.push(m - 1);
                stack.push(m);
                n = n - 1;
            }
        }

        return n;
    }
}