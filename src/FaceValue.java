/**
 * The standard face values of playing cards which are taken in the order specified in the Assignment.
 */
public enum FaceValue {
    ACE(1),
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5),
    SIX(6),
    SEVEN(7),
    EIGHT(8),
    NINE(9),
    TEN(10),
    JACK(11),
    QUEEN(12),
    KING(13);
	
	/**
	 * numberValue is the value of the particular face card. Ace = 1, Two = 2, ...Jack = 11, Queen = 12, King = 13.
	 */
    private int numberValue;
    
    /**
     * This Function generally assigns the value from the above numberValue to a particular FaceValue.
     * @param numberValue
     */
    private FaceValue(int numberValue) {
        this.numberValue = numberValue;
    }
    
    /**
     * This function generally gets the numberValue from each and every card.
     * @return
     */
    public int getNumberValue() {
        return numberValue;
    }
}
