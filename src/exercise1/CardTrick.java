package exercise1;


/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card.
 * To be used as starting code in Exercise
 *
 * @author dancye
 * @author Meet Suthar 
 * @date 26 May 2023
 */


import java.util.Random;
import java.util.Scanner;

public class CardTrick {
    
    public static void main(String[] args) {
        
        Card[] hand = new Card[7];
        Random random = new Random();
        
        for (int i = 0; i < hand.length; i++) {
            Card card = new Card();
            card.setValue(random.nextInt(13) + 1);
            card.setSuit(Card.SUITS[random.nextInt(4)]);
            hand[i] = card;
        }

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Pick a card (enter value 1-13): ");
        int userValue = scanner.nextInt();
        
        System.out.print("Pick a card (enter suit 0-3): ");
        int userSuit = scanner.nextInt();
        
        Card userCard = new Card();
        userCard.setValue(userValue);
        userCard.setSuit(Card.SUITS[userSuit]);
        
        boolean foundMatch = false;
        
        for (Card card : hand) {
            if (card.getValue() == userCard.getValue() && card.getSuit().equals(userCard.getSuit())) {
                foundMatch = true;
                break;
            }
        }
        
        if (foundMatch) {
            printInfo();
        } else {
            System.out.println("Your card is not in the hand.");
        }
    }

    private static void printInfo() {
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is Meet");
        System.out.println();
        
        System.out.println("My career ambitions:");
        System.out.println("-- Hacker");
        System.out.println();
        
        System.out.println("My hobbies:");
        System.out.println("-- Hacking");
        System.out.println();
    }
}
