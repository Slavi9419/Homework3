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
public class Problem9 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter A = ");
        int min = input.nextInt();
        System.out.print("Enter B = ");
        int max = input.nextInt();

        int sum = 0;
        for (int i = min; i < max; i++) {
            if (i % 3 == 0) {
                System.out.print("Skip" + i + ",");
                continue;
            }
            sum += i;
            if (sum > 200) {
                break;
            }
            System.out.print(i * i + ",");
        }

    }
}
