// Jeriko
public class Game {
    private Player player1, player2;
    
    public Game(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    private class Round {
        String move1, move2;
        Player winner;

        Round() {
            move1 = player1.makeMove();
            move2 = player2.makeMove();
            System.out.println(player1.getName() + " memilih " + move1);
            System.out.println(player2.getName() + " memilih " + move2);
            determineWinner();
        }

        void determineWinner() {
            if (move1.equals(move2)) {
                System.out.println("Seri!");
                return;
            }
         if ((move1.equals("batu") && move2.equals("gunting")) ||
                (move1.equals("gunting") && move2.equals("kertas")) ||
                (move1.equals("kertas") && move2.equals("batu"))) {
                winner = player1;
            } else {
                winner = player2;
            }
            System.out.println("Pemenang ronde: " + winner.getName());
        }
    }

    public void play() {
        int score1 = 0, score2 = 0;
        for (int i = 0; i < 3; i++) {
            System.out.println("\nRonde " + (i+1) + ":");
            Round round = new Round();
            if (round.winner == player1) score1++;
            else if (round.winner == player2) score2++;
        }
        System.out.println("\nHasil Akhir: " + player1.getName() + ": " + score1 + ", " +
                           player2.getName() + ": " + score2);
        if (score1 > score2) System.out.println("Pemenang: " + player1.getName());
        else if (score2 > score1) System.out.println("Pemenang: " + player2.getName());
        else System.out.println("Permainan berakhir seri!");
    }
}
