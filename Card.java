public class Card {
    private final String SUIT;
    private final String RANK;

    Card(String suit, String rank) {
        this.SUIT = suit;
        this.RANK = rank;
    }

    public String getSUIT() {
        return SUIT;
    }

    public String getRANK() {
        return RANK;
    }

    public int getValue() {
        switch(RANK){
            case "Ace": return 14;
            case "King": return 13;
            case "Queen": return 12;
            case "Jack": return 11;
            default: return Integer.parseInt(RANK);
        }
    }

    public String toString(){
        return String.format("%s of %s", RANK, SUIT);
    }
}