import java.io.*;
import javax.swing.*;

public class GameCenter {

    public static void main(String[] args) throws IOException {

        int numPlayers;
        String inputStr;
        int points;
        int input;
        int again = 0;
        String[] options = { "Yes", "No" };
        String[] names;
        int[] pointsList;
        String date;

        new MyFrame();

        Players play = new Players();

        // information about us and this project
        ProjectInfo myProject = new ProjectInfo("Game Center",
                "\nThis program was made to help people, mostly children, to improve\n"
                        + "their problem-solving skills by playing fun games."
                        + "\n\nThis is a project for the Object Oriented Programming course.",
                "Dr. Ibtihal Al-Saqqaf");

        StudentInfo myInfo = new StudentInfo("\nAhad Ghazi\t\t\t\t\t\t\t 2113641\t\t\t\t\t\t\t 2113641@uj.edu.sa",
                "\nLina Ali\t\t\t\t\t\t\t\t\t\t\t\t\t 2216609\t\t\t\t\t\t\t 2216609@uj.edu.sa");

        Information theInfo = new Information(myProject, myInfo);

        JOptionPane.showMessageDialog(null, theInfo, "What is This?", 0);

        // numbsrs of players
        numPlayers = play.getNumOfPlayers();

        // two lists for names and points
        names = new String[numPlayers];
        pointsList = new int[numPlayers];

        // names of players
        int i;
        for (i = 0; i < numPlayers; ++i) {
            names[i] = JOptionPane.showInputDialog(
                    "Enter the name for player " + (i + 1) + ":");
        }

        //
        for (int j = 0; j < numPlayers; ++j) {
            play.welcome(names[j]);
            again = 0;
            //
            while (again == 0) {
                points = 0;
                // choosing game
                inputStr = play.getGame();
                switch (inputStr) {

                    case "1. Rock Paper Scissors":
                        RockPaperScissors startGame1 = new RockPaperScissors(names[j]);
                        if (startGame1.getBool()) {
                            ++points;
                        }
                        JOptionPane.showMessageDialog(null, startGame1.toString());
                        break;

                    case "2. Story":
                        Story startGame2 = new Story(names[j]);
                        points += startGame2.quizAndPoints();
                        JOptionPane.showMessageDialog(null, startGame2.toString());
                        break;

                    case "3. Tic Tac Toe (Note: need 2 players)":
                        if (numPlayers == 1) {
                            JOptionPane.showMessageDialog(null,
                                    "You can't play it alone.",
                                    "Error", 0);
                            break;
                        }
                        inputStr = (String) JOptionPane.showInputDialog(
                                null, "Choose The Player:", "Players",
                                JOptionPane.QUESTION_MESSAGE, null, names,
                                names[0]);

                        if (inputStr.equals(names[j])) {
                            JOptionPane.showMessageDialog(null,
                                    "You can't play against yourself.",
                                    "Error", 0);
                            break;
                        }

                        TicTacToe startGame3 = new TicTacToe(names[j], inputStr);
                        System.out.println(startGame3.toString());
                        if (startGame3.checkWinner().equals(names[j])) {
                            points += 6;
                        } else if (startGame3.checkWinner().equals("Draw")) {
                            points += 3;
                            for (i = 0; i < numPlayers; i++) {
                                if (startGame3.checkWinner().equals(names[i])) {
                                    pointsList[i] += 3;
                                }
                            }
                        } else {
                            for (i = 0; i < numPlayers; i++) {
                                if (startGame3.checkWinner().equals(names[i])) {
                                    pointsList[i] += 6;
                                }
                            }
                        }
                        break;

                    case "4. Pop Quiz":
                        Quiz startGame4 = new Quiz(names[j]);
                        points += startGame4.PopQuiz();
                        JOptionPane.showMessageDialog(null, startGame4.toString());
                        break;

                    case "5. Hangman":
                        Hangman startGame5 = new Hangman();
                        points += startGame5.points();
                        JOptionPane.showMessageDialog(null, startGame5.toString(names[j]));
                        break;

                }
                pointsList[j] += points;

                again = JOptionPane.showOptionDialog(null,
                        "Do you want to play in the game center again?", "Again",
                        0, 3, null,
                        options, options[0]);
            }
        }

        play.setArray(pointsList, names);
        String output = play.printDetails();

        JOptionPane.showMessageDialog(null, output, "results", 1);
        date = JOptionPane.showInputDialog(
                "All information will be saved in a file called \"Results.txt\"."
                        + "\nPlease, enter the date:"
                        + "\n    day/month/year");
        play.file(date);

        play.goodBye();
        System.exit(0);
    }

}