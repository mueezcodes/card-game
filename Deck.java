import java.util.Random;

public class Deck {

    Card[] cards;
    int top = 0;

    private String suits[] = {"Spades", "Clubs", "Hearts", "Diamonds"};
    private String ranks[] = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10",
                              "Jack", "Queen", "King"};

    Deck() {
        cards = new Card[52];
        int counter = 0;

        for(int i = 0; i < suits.length; i++) {
            for(int j = 0; j < ranks.length; j++) {
                cards[counter++] = new Card(suits[i], ranks[j]);
            }
        }
    }

    public void shuffle() {
        Random random = new Random();
        for (int i = 0; i < 1000; i++) {
            int index = random.nextInt(52);

            Card temp = cards[0];
            cards[0] = cards[index];
            cards[index] = temp;
        }
    }

    public Card drawCard() {
        if(top < cards.length) {
            return cards[top++];
        }
        return null;
    }
}