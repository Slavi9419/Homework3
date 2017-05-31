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
public class Problem7 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number = ");
        int number = input.nextInt();

        for (int i = 3; i <= number * 3; i++) {
            if (i % 3 != 0) {
                continue;
            }
            System.out.print(i + ",");
        }
    }
}
