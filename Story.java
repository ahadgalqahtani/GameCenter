import javax.swing.*;

/**
 * The class Story is
 * a game of story telling
 * and a quiz
 */

public class Story {
        private String name;

        /**
         * This constructor initializes the names of players and call two methods.
         * explainTheGame method and play method
         * 
         * @param name The player name.
         */
        public Story(String name) {
                this.name = name;
                explainTheGame();
                tomSawer();
        }

        /**
         * the copy constructor initializes the object as
         * a copy of another TicTacToe object.
         * 
         * @param obj2 The object to copy.
         */
        public Story(Story obj2) {
                name = obj2.name;
        }

        /**
         * This method est value for this field
         * 
         * @param name The player name
         */
        public void setName(String name) {
                this.name = name;
        }

        /**
         * This method return player name
         * 
         * @return Player name.
         */
        public String getName() {
                return name;
        }

        /**
         * This method give simple explanation of the game
         */
        public void explainTheGame() {
                JOptionPane.showMessageDialog(null,
                                "In this game you will read the story "
                                                + "and anwser the questions.\n"
                                                + "And for each correct answer, you will earn one point!",
                                "Story", 2);
        }

        /**
         * This method show Tom Sawer story
         */
        public void tomSawer() {

                // All images we use in the story
                ImageIcon image1 = new ImageIcon("story1.jpg");
                ImageIcon image2 = new ImageIcon("story2.jpg");
                ImageIcon image3 = new ImageIcon("story3.jpg");
                ImageIcon image4 = new ImageIcon("story4.jpg");
                ImageIcon image5 = new ImageIcon("story5.jpg");
                // welcome
                JOptionPane.showMessageDialog(null,
                                "* * * * * * * * * * * * * * * * * * * * * * * * \n" +
                                                "  TOM SAWYER STORY .|^__^|. \n" +
                                                "* * * * * * * * * * * * * * * * * * * * * * * * \n",
                                "Story", 1);
                // Part1
                JOptionPane.showMessageDialog(null,
                                "\"I know you didn't go to school today,\" "
                                                + "said Aunt Polly. \"And that's not Okay.\" "
                                                + " \"Tomorrow you are going to paint the fence.\"\n"
                                                + "\"But tomorrow is Saturday. It's my time to play!\""
                                                + " said Tom.\n"
                                                + "However, Aunt Polly was determined."
                                                + " She wanted to teach Tom a lesson.",
                                "Story", JOptionPane.PLAIN_MESSAGE,
                                image1);
                // Part2
                JOptionPane.showMessageDialog(null,
                                "Saturday came, and it was a beautiful sunny day."
                                                + " Tom look at the fence thoughtfully.\n"
                                                + "Thirty yards of fence nine feet high! "
                                                + "It seemed to him that life wasn't worth living...",
                                "Story", JOptionPane.PLAIN_MESSAGE, image2);
                // Part3
                JOptionPane.showMessageDialog(null,
                                "Suddenly, Ben came dancing out  of the gate with a red apple. "
                                                + "and Tom had an idea.\n"
                                                + "He took the brush and went calmly to work.\n"
                                                + "\"What? Do you like it?\"asked Ben.\n"
                                                + "Tom answered,\" Like it? I love it! "
                                                + "It's not every day that a boy"
                                                + " gets to paint a fence.\"\n"
                                                + "\"I say, Tom, let me paint a little!\" Ben said.\n"
                                                + "\"No, no, I can't. My aunt said only I could do that."
                                                + "\" said Tom.\n"
                                                + "\"Come on, Tom. I'll give you my apple!\" Ben said.",
                                "Story",
                                JOptionPane.PLAIN_MESSAGE, image3);
                // Part4
                JOptionPane.showMessageDialog(null,
                                "Then a little later, John walked by. "
                                                + "\"Hello Tom. What are you doing?\"\n"
                                                + "Tom said, \"Hi John. I am having a great time painting "
                                                + "the fance.\"\n"
                                                + "\"Can I paint?\" asked John.\n"
                                                + "\"My aunt said only I could paint the fence. I was "
                                                + "nice enough to let Ben try, "
                                                + "But now I want to paint again.\" \n"
                                                + "\"Please, Tom. jast a little."
                                                + " I'll give you my marbles!\"\n ",
                                "Story",
                                JOptionPane.PLAIN_MESSAGE, image4);
                // Part5
                JOptionPane.showMessageDialog(null,
                                "By the end of the day, many of Tom's friends had helped"
                                                + " paint the fence.\n"
                                                + "Tom tricked them all into thinking it was fun.\n"
                                                + "Tom said to himself that life "
                                                + "was worth living after all.\n"
                                                + "He had discover great law of human behaviour:\n"
                                                + "In order to make a man or boy desire a thing,\n "
                                                + "it is only necessary to make"
                                                + " the thing difficult to obtain",
                                "Story",
                                JOptionPane.PLAIN_MESSAGE, image5);
        }

        /**
         * simple quiz and points for the quiz and return the points
         * 
         * @return The points.
         */
        public int quizAndPoints() {
                int points = 0;// one point for each right anwser
                int input;// the player answer
                // options for each question
                String[] options1 = { "An Apple", "Marbles", "Ball" };
                String[] options2 = { "Yes", "No" };
                String[] options3 = { "He wanted to do that", "He didn't go to school",
                                "He did bad in exam" };
                // the question num1
                input = JOptionPane.showOptionDialog(null,
                                "What does Ben give Tom to "
                                                + "let him paint the fence?",
                                "Story",
                                0, 3, null,
                                options1, options1[0]);
                // check the answer
                if (input == 0) {
                        ++points;

                }
                // the question num2
                input = JOptionPane.showOptionDialog(null,
                                "Does Tom paint the fence? ", "Story",
                                0, 3, null,
                                options2, options2[0]);
                // check the answer
                if (input == 1) {
                        ++points;
                }
                // the question num3
                input = JOptionPane.showOptionDialog(null,
                                "Why does Tom have to paint the fence?"
                                                + "\nbecause...",
                                "Story",
                                0, 3, null,
                                options3, options3[0]);
                // check the answer
                if (input == 1) {
                        ++points;
                }

                return points;
        }

        /**
         * toString method
         * 
         * @return return motivational phrase with the name of player
         *
         */
        public String toString() {
                return ("Done with the Story! Good job, " + name);
        }
}