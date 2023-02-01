import javax.swing.JOptionPane;

/**
 * The class Hangman is a game
 * of word guessing
 */

public class Hangman {

    private static String[] words = { "rice", "banana", "computer", "cow", "rain", "water" }; // array of words to guess
    private static String word; // word that will be guessed
    private static String asterisk; // to hide the word
    private static int count; // to count how many times user has guessed wrong
    int points; // points to win the game

    /**
     * The constructer Hangman intializes the
     * previous variables to be used in the game
     */

    public Hangman() {
        count = 0; // start the count at 0
        points = 0; // start the points at 0
        word = words[(int) (Math.random() * words.length)];

        asterisk = new String(new char[word.length()]).replace("\0", "*"); // to replace the letters with asterisk to
                                                                           // hide it

        // welcome window
        JOptionPane.showMessageDialog(null,
                "* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *\n" +
                        "    Welcome to the Hangman Game! .|^__^|. \n" +
                        "* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *\n",
                "Hangman", 1);

        // explanation of how to play the game
        JOptionPane.showMessageDialog(null, "To play this game you have to guess a word that \n"
                + "the computer has generated for you by guessing the letters in it.");
        JOptionPane.showMessageDialog(null, "For every wrong guess, a picture will be drawn. \n"
                + "If the picture is completed then you have lost.");

        while (count < 6 && asterisk.contains("*")) {
            String guess;
            JOptionPane.showMessageDialog(null, asterisk); // the game starts here by showing the asterisk with the word
                                                           // hidden
            guess = JOptionPane.showInputDialog("Guess only one letter in the word: "); // to take input from user of
                                                                                        // the guessed letter
            hang(guess); // call to method hang
        }

    }

    /**
     * a void Method
     * The hang method tests the letter entered by user
     * to see if it matches any of the letter
     * in the original word.
     * 
     * @param guess the letter guessed by user input
     */

    public void hang(String guess) {
        String newasterisk = "";
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == guess.charAt(0)) {
                newasterisk += guess.charAt(0);
            } else if (asterisk.charAt(i) != '*') {
                newasterisk += word.charAt(i);
            } else {
                newasterisk += "*";
            }
        }

        if (asterisk.equals(newasterisk)) { // if the user guesses wrong
            count++; // the count is incremented
            hangmanImage(); // and a call to method hangmanImage to draw the image
        } else {
            asterisk = newasterisk;
        }
        if (asterisk.equals(word)) { // if the user guesses the whole word, a praisal window is shown
            JOptionPane.showMessageDialog(null, "Correct! You win! The word was " + word);
            points = 6; // winning points intialized to 6
        }

    }

    /**
     * A void method
     * the hangmanImage method works on the incremented count,
     * each time it's incremented the image is
     * completed, and when the count gets to
     * 6 then the user have lost
     */

    public void hangmanImage() {
        if (count == 1) {
            JOptionPane.showMessageDialog(null, "Wrong guess, try again\n" +
                    "\n" + "\n" + "\n" + "\n" + "___|___" + "\n");
        }
        if (count == 2) {
            JOptionPane.showMessageDialog(null, "Wrong guess, try again\n" +
                    "     |\n" + "     |\n" + "     |\n" + "     |\n" + "     |\n" + "___|___");
        }
        if (count == 3) {
            JOptionPane.showMessageDialog(null, "Wrong guess, try again\n" +
                    "     __________\n" +
                    "     |\n" +
                    "     |\n" +
                    "     |\n" +
                    "     |\n" +
                    "     |\n" +
                    "     |\n" +
                    "     |\n" +
                    "___|___");
        }
        if (count == 4) {
            JOptionPane.showMessageDialog(null, "Wrong guess, try again\n" +
                    "     ___________\n" +
                    "     |            _|_\n" +
                    "     |           /   \\ \n" +
                    "     |          |      |\n" +
                    "     |          \\_ _/\n" +
                    "     |             |\n" +
                    "     |             |\n" +
                    "     |\n" +
                    "___|___");
        }
        if (count == 5) {
            JOptionPane.showMessageDialog(null, "Wrong guess, try again" +
                    "\n   ____________\n" +
                    "     |            _|_\n" +
                    "     |           /   \\ \n" +
                    "     |          |      |\n" +
                    "     |          \\_ _/\n" +
                    "     |             |\n" +
                    "     |             |\n" +
                    "     |            / \\ \n" +
                    "___|___     /   \\");
        }
        if (count == 6) {
            JOptionPane.showMessageDialog(null, "Wrong guess, try again\n" +
                    "     ___________\n" +
                    "     |           _|_\n" +
                    "     |          /   \\ \n" +
                    "     |         |      |\n" +
                    "     |         \\_ _/\n" +
                    "     |           _|_ \n" +
                    "     |          / | \\ \n" +
                    "     |           / \\ \n" +
                    "___|___    /   \\ \n" +
                    "GAME OVER! The word was " + word);
        }
    }

    /**
     * An int method
     * The points method is used
     * to return the amount of points
     * the user has gained
     * 
     * @return points earned by user
     */

    public int points() {
        if (points == 6) {
            return points;
        } else {
            return 0;
        }
    }

    /**
     * A toString method
     * 
     * @param playerName the name of the player
     * @return A string motivational phrase with the player's name
     */

    public String toString(String playerName) {

        return ("Done with Hangman! Good job, " + playerName);
    }
}