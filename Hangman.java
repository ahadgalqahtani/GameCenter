import javax.swing.JOptionPane;

public class Hangman{

    private static String[] words = { "terminator", "banana", "computer", "cow", "rain", "water" }; // array of words to guess
    private static String word = words[(int) (Math.random() * words.length)];
    private static String asterisk = new String(new char[word.length()]).replace("\0", "*");
    private static int count = 0;

    public Hangman(){
        JOptionPane.showMessageDialog(null, "WELCOME TO HANGMAN!");
        JOptionPane.showMessageDialog(null, "To play this game you have to guess a word that" 
        + "the computer has generated for you by guessing the letters in it.");
        JOptionPane.showMessageDialog(null, "For every wrong guess, a picture will be drawn." 
        + "If the picture is completed then you have lost.");

        while (count < 7 && asterisk.contains("*")) {
            String guess;
            guess = JOptionPane.showInputDialog("Guess any letter in the word");
            JOptionPane.showMessageDialog(null, asterisk);
            hang(guess);
        }
    }

    public void hang(String guess){
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

        if (asterisk.equals(newasterisk)) {
            count++;
            hangmanImage();
        } else {
            asterisk = newasterisk;
        }
        if (asterisk.equals(word)){
            JOptionPane.showMessageDialog(null, "Correct! You win! The word was " + word);
        }
    }

    public void hangmanImage() {
        if (count == 1) {
            JOptionPane.showMessageDialog(null,"Wrong guess, try again" +
            "\n" + "\n" + "\n" + "\n" + "___|___" + "\n");
        }
        if (count == 2) {
            JOptionPane.showMessageDialog(null,"Wrong guess, try again" +
            "|\n" + "|\n" + "|\n" + "|\n" + "|\n" + "___|___");
        }
        if (count == 3) {
            JOptionPane.showMessageDialog(null,"Wrong guess, try again" +
            "   ____________" + "   |\n" + "   |\n" + "   |\n" + "   |\n" + "   |\n" + "   |\n" +"   |\n" + "___|___");
        }
        if (count == 4) {
            JOptionPane.showMessageDialog(null,"Wrong guess, try again" +
            "   ____________" + 
            "   |\n" + 
            "   |\n" + 
            "   |\n" + 
            "   |\n" + 
            "   |\n" + 
            "   |\n" +
            "   |\n" + 
            "___|___");
        }
        if (count == 5) {
            JOptionPane.showMessageDialog(null,"Wrong guess, try again" +
            "   ____________" +
            "   |          _|_\n" + 
            "   |         /   \\ \n" +
            "   |        |     |\n" +
            "   |         \\_ _/\n" +
            "   |           |\n" +
            "   |           |\n" +
            "   |\n" +
            "___|___");
        }
        if (count == 6) {
            JOptionPane.showMessageDialog(null,"Wrong guess, try again" +
            "   ____________" +
            "   |          _|_\n" + 
            "   |         /   \\ \n" +
            "   |        |     |\n" +
            "   |         \\_ _/\n" +
            "   |           |\n" +
            "   |           |\n" +
            "   |          / \\ \n" +
            "___|___      /   \\");
        }
        if (count == 7) {
            JOptionPane.showMessageDialog(null,"Wrong guess, try again" +
            "   ____________" +
            "   |          _|_\n" + 
            "   |         /   \\ \n" +
            "   |        |     |\n" +
            "   |         \\_ _/\n" +
            "   |          _|_ \n" +
            "   |         / | \\ \n" +
            "   |          / \\ \n" +
            "___|___      /   \\ \n" + 
            "GAME OVER! The word was " + word);
        }
    }
}