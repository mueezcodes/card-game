public class Game {

    Deck deck = new Deck();
    Player player[];

    Game(String names[]) {
        player = new Player[names.length];

        for(int i = 0; i < names.length; i++) {
            player[i] = new Player(names[i]);
        }

        deck.shuffle();
    }

    public void startGame(int rounds) {

        for(int r = 1; r <= rounds; r++) {

            System.out.println("\nRound " + r);

            int highest = -1;
            int winnerIndex = -1;
            boolean tie = false;

            for(int i = 0; i < player.length; i++) {

                player[i].drawCard(deck);

                System.out.println(player[i].name + " drew " + player[i].card);

                int value = player[i].card.getValue();

                if(value > highest) {
                    highest = value;
                    winnerIndex = i;
                    tie = false;
                }
                else if(value == highest) {
                    tie = true;
                }
            }

            if(!tie) {
                player[winnerIndex].score++;
                System.out.println("Winner: " + player[winnerIndex].name);
            }
            else {
                System.out.println("Round Tie!");
            }
        }

        showWinner();
    }

    public void showWinner() {

        System.out.println("\nFinal Scores");

        int highest = -1;
        Player winner = null;

        for(Player p : player) {
            System.out.println(p);

            if(p.score > highest) {
                highest = p.score;
                winner = p;
            }
        }

        System.out.println("\nGame Winner: " + winner.name);
    }
}