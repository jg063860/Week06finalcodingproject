package week06;




public class App {

public static void main(String[] args) {
Deck deck = new Deck();
deck.shuffle();

        Player player1 = new Player("1");
        Player player2 = new Player("2");
       
        for (int i = 0; i < 52; i++) {
            if ( i % 2 == 0) {
                player1.draw(deck);
            } else {
                player2.draw(deck);
            }
        }

        for (int i = 0; i < 26; i++) {
            Card player1Card = player1.flip();
            Card player2Card = player2.flip();
            if (player1Card.getValue() > player2Card.getValue()) {
                player1.incrementScore();
            } else if (player1Card.getValue() < player2Card.getValue()) {
                player2.incrementScore();
            }
        }

       
        System.out.printf("Player1 score = %d\n", player1.getScore());
        System.out.printf("Player2 score = %d\n", player2.getScore());
           if (player1.getScore() > player2.getScore()) {
              System.out.println("Player1 is the winner!");
        } else if (player1.getScore() < player2.getScore()) {
              System.out.println("Player2 is the winner!");
        } else {
              System.out.println("It is a Draw!");
        }


    }


}

