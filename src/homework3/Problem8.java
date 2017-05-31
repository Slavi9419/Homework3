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
public class Problem8 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number = ");
        int number = input.nextInt();
        int n = number - 1;
        for (int i = 0; i < number; i++) {

            for (int j = 0; j < number; j++) {
                System.out.print(n);
            }
            n += 2;
            System.out.println();
        }
    }
}
