class Player {

    String name;
    int score;
    Card card;

    Player(String name) {
        this.name = name;
        score = 0;
    }

    public void drawCard(Deck deck) {
        card = deck.drawCard();
    }

    public String toString() {
        return name + " Score: " + score;
    }
}