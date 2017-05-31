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
public class Problem14 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        do {
            System.out.print("Enter number = ");
            number = input.nextInt();
        } while (number < 10 || number > 200);

        for (int i = number; i > 0; i--) {
            if (i % 7 == 0) {
                System.out.print(i + ",");
            }
        }
    }
}
