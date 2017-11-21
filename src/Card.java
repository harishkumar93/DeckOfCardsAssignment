/**
 * This function mainly clubs both the classes Suit and FaceValue to give the final value of the card.
 */
public class Card 
{
	/**
	 * suit: variable which is taken from the Suit Class which gives the suit value as Hearts/Spades/Diamond/Clubs
	 */
    protected Suit suit;
    
    /**
     * face_value: variable which is taken from the FaceValue Class which gives the value as Ace, Two ... King.
     */
    protected FaceValue face_value;

    /**
     * Card calls the constructor which basically initialize the variables suit and face_value from the above.
     * @param face_value: assigns the face_value from the FaceValue class.
     * @param suit: assigns the suit value from Suit class. 
     */
    public Card(FaceValue face_value, Suit suit)
    {
    	this.face_value = face_value;
        this.suit = suit;
    }
    
    /**
     * This function generally returns the final combined value of both face_value and Suit value and returns it in the form of a string value.
     */
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("\tFaceValue: ").append(this.face_value);
        sb.append("\t\tSuit: ").append(this.suit);
        return sb.toString();
    }
}