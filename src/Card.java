
public class Card {
    protected int rank;
    protected Suit suit;
    protected FaceValue face_value;

    public Card(FaceValue face_value, Suit suit){
    	this.face_value = face_value;
        this.suit = suit;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("\tFaceValue: ").append(this.face_value);
        sb.append("\t\tSuit: ").append(this.suit);
        return sb.toString();
    }
}