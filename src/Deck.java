import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * An object of Card Deck.  Simulate shuffle/deal with cards
 */
public class Deck
{
	
	/**
	 * List of cards that are in the whole deck.
	 */
    private List<Card> cards;
    
    /**
     * Random variable to get the random values when shuffled.
     */
    private Random random;
    
/**
 * Constructor to initialize the variables and the List declared in the above class. 
 */
    public Deck()
    {
        random = new Random();
        cards = generateCards();
    }
    
/**
 * Generates the cards one after the other from a Specific Suit with a Specific Face Value each time.
 */
    private List<Card> generateCards(){
        List<Card> tmp = new ArrayList<>();
        for(Suit suit : Suit.values())
        {
        	for (FaceValue face_value : FaceValue.values()) 
        	{
        		Card card = new Card(face_value, suit);
        		tmp.add(card);
        	}
        } 
        return  tmp;
    }
    
/**
 * Shuffle function generally shuffles the values in the deck to any random order by using random function.
 */
    public void shuffle()
    {
        if(cards.size() == 0)
        {
            System.out.println("No available cards on the deck, now shuffle all cards");
            cards = generateCards();
        }
        for (int i = cards.size() - 1; i >= 0; i--) 
        {
            int j = random.nextInt(i + 1);
            Card card = cards.get(i);
            cards.set(i, cards.get(j));
            cards.set(j, card);
        }
    }
    
/**
 * Deal Function mainly deals with one card at a time and removes the card which is dealt and goes on upto 52 cards and then throws null value on the 53rd attempt.
 * @param numberOfCardsToDeal: takes input one at a time and deal with it.
 * @return the FaceValue and Suit of the card if we deal with a card. Or else after 52nd attempt it may throw null value.
 */
    public Card deal(int numberOfCardsToDeal)
    {
        int i = 0;
        while(!cards.isEmpty() && i < numberOfCardsToDeal )
        {
            i++;
            return cards.remove(0);
        }
        System.out.println("==============================================================");
        System.out.println("No Card is Dealt, Please use the first option to shuffle.");
        System.out.println("==============================================================");
        return null;
    }

/**
 * getCards function generally takes one card at a time from the list of cards.
 * @return the value of the cards.
 */
    public List<Card> getCards()
    {
        return cards;
    }
}