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
public class Problem25 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter number ");
        int number = input.nextInt();

        int count = 1;
        int fac = 1;
        while (count <= number) {
            fac *= count;
            count++;
        }
        System.out.println(fac);
    }
}
