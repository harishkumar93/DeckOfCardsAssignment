import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main 
{
	/**
	 * Initialize an input scanner to take a value from the options given in the Array List.
	 */
    private static Scanner sc = new Scanner(System.in);
    
    /**
     * List with the 3 main actions within an array to use the actions specified.
     */
    private static final List<Integer> AVAILABLE_ACTIONS = Arrays.asList(1,2,3);
    
/**
 * This is the main function for the total program which mainly deals the card.
 * @param args: Takes an input parameter.
 */
    public static void main(String[] args) 
    {
        Deck deck = new Deck();
        int action = 0;
        do{
            displayInstruction();
            action = sc.nextInt();
            if(AVAILABLE_ACTIONS.contains(action))
            {
                executeAction(action, deck);
            }
            else
            {
                System.out.println("Please enter valid actions:" + AVAILABLE_ACTIONS);
            }
        }while(action != 3);
        System.out.println("Quit.......");
    }
/**
 * This function basically performs the actions by taking the input from the above main program and from the Deck class to execute the action.
 * @param action: takes the input value from the above program as 1, 2 or 3 and performs the action specified.
 * @param deck: takes the value from the deck class and deals with the action specified in the deck.
 */
    private static void executeAction(int action, Deck deck)
    {
        Card card = null;
        switch (action)
        {
            case 1:
                deck.shuffle();
                displayCards(deck.getCards());
                break;
            case 2:
                card = deck.deal(1);
                System.out.println("DEAL CARD: " + card + "\n");
                break;
            default:
                break;
        }
    }
/**
 * Displays the final card which has been dealt when we perform Action 2 from the above Main function.
 * @param cards: takes the input as cards from the given List.
 */
    private static void displayCards(List<Card> cards)
    {
        for(Card c : cards)
        {
            System.out.println(c);
        }
        System.out.println();
    }

/**
 * This function displays the instructions which we should perform after running the main program
 * mainly it would be like Shuffling the Cards, Deal One Card or else quit the program.
 */
    private static void displayInstruction()
    {
        System.out.println("Please choose one of the actions:");
        System.out.println("==================================");
        System.out.println("1. Shuffle The Whole Deck");
        System.out.println("2. Deal One Card");
        System.out.println("3. QUIT");
        System.out.println("==================================");
    }
}