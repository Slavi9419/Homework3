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
public class Problem16 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        int m;
        do {
            System.out.print("Enter n = ");
            n = input.nextInt();
        } while (n < 10 || n > 5555);
        do {
            System.out.print("Enter m = ");
            m = input.nextInt();
        } while ((m < 10 || m > 5555) || m < n);

        for (int i = m; i > n; i--) {
            if (i % 50 == 0) {
                System.out.print(i + ",");
            }
        }
    }
}
