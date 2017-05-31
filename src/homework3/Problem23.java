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
public class Problem23 {

    public static void main(String[] args) {

        int count = 0;
        int startNum = 1;
        int num = startNum;
        while (count < 10) {
            while (num < 10) {
                System.out.print(startNum + "*" + num + " ,");
                num++;
            }
            num = ++startNum;
            count++;
            System.out.println();
        }
    }
}
