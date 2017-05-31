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
public class Problem6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number = ");
        int number = input.nextInt();
        int sum = 0;

        for (int i = 1; i < number; i++) {
            sum += i;
        }
        System.out.println("The sum is = " + sum);
    }
}
