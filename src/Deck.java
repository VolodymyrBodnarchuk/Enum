import java.util.*;

public class Deck {

    private static Card[] cards = new Card[52];

    public Deck() {
        int i =0;
        for (Card.Suit suit : Card.Suit.values()) {
            for (Card.Rank rank : Card.Rank.values()) {
                cards[i++] = new Card(rank,suit);
            }
        }
    }
}
