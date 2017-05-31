/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Слави
 */
public class Problem21 {

    private static ArrayList<String> inicializeCardList() {

        ArrayList<String> cardList = new ArrayList<>();
        cardList.add("Jocker");

        String[] cardColor = {"Spatia", "Karo", "Kupa", "Pika"};

        for (int cards = 2; cards <= 10; cards++) {
            for (int color = 0; color < 4; color++) {
                cardList.add(Integer.toString(cards) + " " + cardColor[color]);
            }
        }
        for (int cards = 0; cards <= 4; cards++) {
            for (int color = 0; color < 4; color++) {
                switch (cards) {
                    case 0:
                        cardList.add("Vale " + cardColor[color]);
                        break;
                    case 1:
                        cardList.add("Dama " + cardColor[color]);
                        break;
                    case 2:
                        cardList.add("Pop " + cardColor[color]);
                        break;
                    case 3:
                        cardList.add("Aso " + cardColor[color]);
                        break;
                }
            }
        }
        return cardList;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        do {
            System.out.println("Enter number");
            number = input.nextInt();
        } while (number < 1 || number > 53);

        for (int i = number; i < inicializeCardList().size(); i++) {
            System.out.print(inicializeCardList().get(i) + ",");
        }
    }
}
