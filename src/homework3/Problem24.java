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
public class Problem24 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        do {
            System.out.println("Enter number in the space [10 .. 30000]");
            number = input.nextInt();
        } while (number < 10 || number > 30000);

        int n = number;
        int revers = 0;
        int dig;
        while (number > 0) {
            dig = number % 10;
            revers = revers * 10 + dig;
            number = number / 10;
        }
        if (n == revers) {
            System.out.println("Polinom " + revers);
        } else {
            System.out.println("Ne e polionom " + revers);
        }
    }
}
