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
public class Problem13 {

    public static void main(String[] args) {
        int a, b, b1, c;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number = ");
        int number = input.nextInt();

        for (int i = 100; i < 1000; i++) {
            a = i / 100;
            c = i % 10;
            b1 = i / 10;
            b = b1 % 10;

            if ((a + b + c) == number) {
                System.out.print(i+",");
            }
        }
    }
}
