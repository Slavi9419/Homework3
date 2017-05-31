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
public class Problem19 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;

        do {
            System.out.print("Enter n = ");
            number = input.nextInt();
        } while (number < 10 || number > 99);

        if (number % 2 == 0) {
            number *= 0.5;
        } else {
            number = (number * 3) + 1;
        }

        System.out.println(number);
        while (number > 1) {
            if ((number) % 2 == 0) {
                number *= 0.5;
                System.out.println(number);
            } else {
                number = (number * 3) + 1;
                System.out.println(number);
            }

        }

    }

}
