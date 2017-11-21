import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    private static final List<Integer> AVAILABLE_ACTIONS = Arrays.asList(1,2,3);

    public static void main(String[] args) {
        Deck deck = new Deck();

        int action = 0;
        do{
            displayInstruction();
            action = sc.nextInt();
            if(AVAILABLE_ACTIONS.contains(action)){
                executeAction(action, deck);
            }else{
                System.out.println("Please enter valid actions:" + AVAILABLE_ACTIONS);
            }
        }while(action != 3);
        System.out.println("Quit...");
    }


    private static void executeAction(int action, Deck deck){
        Card card = null;

        switch (action){
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

    private static void displayCards(List<Card> cards){
        for(Card c : cards){
            System.out.println(c);
        }
        System.out.println();
    }
    
    private static void displayInstruction(){
        System.out.println("Please choose one of the actions:");
        System.out.println("1. shuffle the deck");
        System.out.println("2. deal with a card");
        System.out.println("3. quit");
    }
}