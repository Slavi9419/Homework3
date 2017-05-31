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
public class Problem5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter min = ");
        int min = input.nextInt();
        System.out.print("Enter max = ");
        int max = input.nextInt();
        System.out.println("\n \n");
        for (int i = min; i <= max; i++) {
            System.out.print(i + ",");
        }
    }
}
