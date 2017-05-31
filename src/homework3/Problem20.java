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
public class Problem20 {

    public static void main(String[] args) {

        int n = 10;
        int count = 0;
        int startDigit = 1;
        int currentDigit = startDigit;
        for (int i = 0; i < n; i++) {
            while (count < 10) {
                System.out.print(currentDigit);
                count++;
                currentDigit++;
                if (currentDigit == 10) {
                    currentDigit = 0;
                }
            }
            if (i > 7) {
                startDigit = 0;
                currentDigit = startDigit;
            } else {
                startDigit += 1;
                currentDigit = startDigit;
            }
            count = 0;
            System.out.println();
        }
    }
}
