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
public class Problem17 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int b;
        char c = '$';
        do {
            System.out.print("Enter b = ");
            b = input.nextInt();
        } while (b < 3 || b > 20);
        int x = b - 2;
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < b; j++) {
                if (i == 0 || i == b - 1) {
                    System.out.print("*");
                } else {
                    System.out.print("*");
                    while (x > 0) {
                        System.out.print(c);
                        x--;
                    }
                    System.out.print("*");
                    x = b - 2;
                    break;

                }
            }
            System.out.println();
        }
    }
}
