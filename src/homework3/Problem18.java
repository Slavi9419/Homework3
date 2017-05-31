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
public class Problem18 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        int m;
        do {
            System.out.print("Enter n = ");
            n = input.nextInt();
        } while (n < 1 || n > 9);
        do {
            System.out.print("Enter m = ");
            m = input.nextInt();
        } while (m < 1 || m > 9);

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                System.out.println(i + "*" + j + " = " + (i * j));
            }
        }
    }
}
