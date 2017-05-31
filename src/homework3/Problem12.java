/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework3;

/**
 *
 * @author Слави
 */
public class Problem12 {

    public static void main(String[] args) {
        int a, b, b1, c;

        for (int i = 100; i < 1000; i++) {
            a = i / 100;
            c = i % 10;
            b1 = i / 10;
            b = b1 % 10;

            if (a != b || b != c) {
                continue;
            }
            System.out.print(i + ",");
        }
    }
}
