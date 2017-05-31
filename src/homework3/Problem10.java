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
public class Problem10 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number = ");
        int number = input.nextInt();
        boolean isJust = true;
        for (int i = 2; i < 10; i++) {
            if (i == number) {
                continue;
            }
            if (number % i == 0) {
                isJust = false;
                break;
            }
        }
        if (isJust) {
            System.out.println("Prosto e");
        } else {
            System.out.println("Ne e prosto");
        }

    }
}
