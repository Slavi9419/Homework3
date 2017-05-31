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
public class Problem11 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number = ");
        int number = input.nextInt();
        int space = number;
        int s = space;
        int numberStars = 1;
        int numberStars1 = numberStars;
        for (int row = 0; row < number; row++) {
            while (s > 0) {
                System.out.print(" ");
                s--;
            }
            while (numberStars1 > 0) {
                System.out.print("*");
                numberStars1--;
            }
            System.out.println();
            s = --space;
            numberStars += 2;
            numberStars1 = numberStars;

        }
    }
}
