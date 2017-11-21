
public class Card {
    protected int rank;
    protected Suit suit;

    public Card(int rank, Suit suit){
        this.rank = rank;
        this.suit = suit;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("rank:").append(this.rank);
        sb.append(",");
        sb.append("suit:").append(this.suit);
        return sb.toString();
    }
}