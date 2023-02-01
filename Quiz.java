import javax.swing.*;

/**
 * The class Quiz contains a game of
 * 6 questions for the user to play
 */

public class Quiz {
    private String playerName;

    /**
     * The constructer Quiz intializes the
     * name of the player and calls the
     * PopQuiz method to start the game.
     * 
     * @param playerName
     */

    public Quiz(String playerName) {
        this.playerName = playerName;
    }

    /**
     * The copy constructor initializes the object as
     * a copy of another Quiz object.
     * 
     * @param Qobject The object to copy.
     */

    public Quiz(Quiz Qobject) {
        playerName = Qobject.playerName;
    }

    /**
     * A PopQuiz method containing a set of questions
     * with a correct answer
     * 
     * @return An integer variable with the points
     *         the user has gained for each question.
     */

    public int PopQuiz() {
        JOptionPane.showMessageDialog(null,
                "* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *\n" +
                        "             Welcome to Pop Quiz! .|^__^|. \n" +
                        "* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *\n",
                "Pop Quiz", 1);

        JOptionPane.showMessageDialog(null, "To play, all you have to" +
                " do is answer all of the 6 questions!" + "\nFor every correct answer, you earn 1 point.",
                "Pop Quiz", 1);

        int points = 0;

        ImageIcon icon1 = new ImageIcon("q1.jpg");
        ImageIcon icon2 = new ImageIcon("q2.jpg");
        ImageIcon icon3 = new ImageIcon("q3.jpg");

        int choice1, choice2, choice3, choice4, choice5, choice6;

        String[] answer1 = { "30", "15", "10" };
        String[] answer2 = { "30", "15", "10" };
        String[] answer3 = { "49", "46", "37" };
        String[] answer4 = { "Fish", "Birds", "Mammals" };
        String[] answer5 = { "African elephant", "Blue Whale", "Hippopotamus" };
        String[] answer6 = { "Thomas Edison", "Alfred Nobel", "Alexander Graham Bell" };

        // question one prompt
        JOptionPane.showMessageDialog(null, null, "Question 1",
                JOptionPane.PLAIN_MESSAGE, icon1);

        choice1 = JOptionPane.showOptionDialog(null, "Which is your answer?",
                "Select:", 0, 0, null, answer1, answer1[0]);
        if (choice1 == 0) {
            JOptionPane.showMessageDialog(null, "Your answer is correct!", "Pop Quiz", 0);
            points++;
        } else
            JOptionPane.showMessageDialog(null, "Wrong :(\n The correct answer is " + answer1[0], "Pop Quiz", 0);

        JOptionPane.showMessageDialog(null, null, "Question 2",
                JOptionPane.PLAIN_MESSAGE, icon2);

        choice2 = JOptionPane.showOptionDialog(null, "Which is your answer?",
                "Select:", 0, 1, null, answer2, answer2[1]);
        if (choice2 == 1) {
            JOptionPane.showMessageDialog(null, "Your answer is correct!", "Pop Quiz", 0);
            points++;
        } else
            JOptionPane.showMessageDialog(null, "Wrong :(\n The correct answer is " + answer2[1], "Pop Quiz", 0);

        JOptionPane.showMessageDialog(null, null, "Question 3",
                JOptionPane.PLAIN_MESSAGE, icon3);

        choice3 = JOptionPane.showOptionDialog(null, "Which is your answer?",
                "Select:", 0, 2, null, answer3, answer3[1]);
        if (choice3 == 1) {
            JOptionPane.showMessageDialog(null, "Your answer is correct!", "Pop Quiz", 0);
            points++;
        } else
            JOptionPane.showMessageDialog(null, "Wrong :(\n The correct answer is " + answer3[1], "Pop Quiz", 0);

        choice4 = JOptionPane.showOptionDialog(null, "What type of animals are dolphins?",
                "Select:", 0, 3, null, answer4, answer4[2]);

        if (choice4 == 2) {
            JOptionPane.showMessageDialog(null, "Your answer is correct!", "Pop Quiz", 0);
            points++;
        } else
            JOptionPane.showMessageDialog(null, "Wrong :(\n The correct answer is " + answer4[2], "Pop Quiz", 0);

        choice5 = JOptionPane.showOptionDialog(null, "What is the biggest animal that has ever lived?",
                "Select:", 0, 3, null, answer5, answer5[1]);
        if (choice5 == 1) {
            JOptionPane.showMessageDialog(null, "Your answer is correct!", "Pop Quiz", 0);
            points++;
        } else
            JOptionPane.showMessageDialog(null, "Wrong :(\n The correct answer is " + answer5[1], "Pop Quiz", 0);

        choice6 = JOptionPane.showOptionDialog(null, "Who invented the light bulb?",
                "Select:", 0, 3, null, answer6, answer6[0]);
        if (choice6 == 0) {
            JOptionPane.showMessageDialog(null, "Your answer is correct!", "Pop Quiz", 0);
            points++;
        } else
            JOptionPane.showMessageDialog(null, "Wrong :(\n The correct answer is " + answer6[0], "Pop Quiz", 0);

        return points;
    }

    /**
     * toString method
     * @return A string motivational phrase with the player's name
     */

    public String toString() {

        return ("Done with the Pop Quiz! Good job, " + playerName);
    }
}