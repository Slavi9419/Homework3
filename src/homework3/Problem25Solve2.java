/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework3;

import java.util.Scanner;

/**
 *
 * @author Слави
 */
public class Problem25Solve2 {

    static int fact = 1;

    private static int factorial(int n) {

        if (n < 1) {
            return fact;
        }
        fact *= n;
        return factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number ");

        System.out.println(factorial(input.nextInt()));
    }
}
