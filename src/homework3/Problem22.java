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
public class Problem22 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number, count = 1;
        do {
            System.out.println("Enter number = ");
            number = input.nextInt();
        } while (number < 1 || number > 999);

        while (count <= 10) {
            if (number % 2 == 0 || number % 3 == 0 || number % 5 == 0) {
                System.out.print(count + ":" + number+" ,");
                count++;
                number++;
            } else {
                number++;
            }
        }
    }
}
