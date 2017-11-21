import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * An object of Card Deck.  Simulate shuffle/deal with cards
 */
public class Deck {
    private final static int NUMBER_OF_CARDS = 13;
    private List<Card> cards;
    private Random random;

    public Deck(){
        random = new Random();
        cards = generateCards();
    }

    private List<Card> generateCards(){
        List<Card> tmp = new ArrayList<>();

        for(Suit suit : Suit.values()){
            
                for(int i = 1; i <= NUMBER_OF_CARDS; i++){
                    Card card = new Card(i, suit);
                    tmp.add(card);
                
            }
        }
        return  tmp;
    }
    public void shuffle(){

        if(cards.size() == 0){
            System.out.println("No available cards on the deck, now shuffle all cards");
            cards = generateCards();
        }

        for (int i = cards.size() - 1; i >= 0; i--) {
            int j = random.nextInt(i + 1);

            Card card = cards.get(i);
            cards.set(i, cards.get(j));
            cards.set(j, card);
        }
    }

    public Card deal(int numberOfCardsToDeal){

        int i = 0;
        while(!cards.isEmpty() && i < numberOfCardsToDeal ){
            i++;
            return cards.remove(0);
        }
        return null;
    }

    public List<Card> getCards(){
        return cards;
    }
}