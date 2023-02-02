public class Card {
    private  Rank rank;
    private  Suit suit;

    // Kinds of suits
    public enum Suit{
        DIAMONDS ,
        CLUBS ,
        HEARTS,
        SPADES
    }

    // Kinds of ranks
    public enum Rank{
        ACE, DEUCE, THREE, FOUR, FIVE, SIX,
        SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING
    }
    public Card(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public Suit getSuit() {
        return suit;
    }
    public void setSuit(Suit suit) {
        this.suit = suit;
    }
    public Rank getRank() {
        return rank;
    }
    public void setRank(Rank rank) {
        this.rank = rank;
    }


    public static void main(String[] args) {

    }
}

