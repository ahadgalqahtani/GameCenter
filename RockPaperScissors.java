import java.util.Random;
import javax.swing.*;
/**
 * This class is Rock-Paper-Scissors game 
 * 
 */

public class RockPaperScissors {//
    
    private  String playerName;
    private boolean bool;
    /**
     * This constructor initializes the name of player and call two methods.
     * explainTheGame method and play method
     * @param name The name of player.
     */
    public RockPaperScissors(String name){       
        playerName = name;
        explainTheGame();
        play();
    }
    /**
     * the copy constructor initializes the object as
     *  a copy of another RockPaperScissors object.
     * @param obj2 The object to copy.
     */
    public RockPaperScissors(RockPaperScissors obj2){
        playerName = obj2.playerName;
        bool = obj2.bool;
    }
    /**
     * This method set a value for each field. 
     * @param playerName The Player Name.
     * @param bool Boolean variable that become true if the 
     * user win else it is false.
     */
    public void set(String playerName, boolean bool){
        this.playerName = playerName;
        this.bool = bool;
    }
    /**
     * This method return the player name
     * @return The payer name.
     */
    public String getPlayerName(){
        return playerName;
    }
    /**
     * This method return true if the user win and false 
     * if the user lose
     * @return Boolean variable become true if the 
     * user win else it is false.
     */
    public boolean getBool(){
        return bool;
    }
    /**
     * This method give simple explanation of the game
     */
    public void explainTheGame(){
        JOptionPane.showMessageDialog(null,
                "In this game you choose either rock, paper or scissors.\n"
                + "Then in turn, the program will choose one of them at random.\n"
                + "The Rules: Rock crushes scissors, "
                + "scissor cut paper and paper covers rock.\n"
                + "You will get one point if you win.",
                "RockPaperScissor",2);
    }
    /**
     * This method play the game
     */
    public void play(){
        //welcome
        JOptionPane.showMessageDialog(null, 
        "* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *\n"+
        "    Welcome to Rock Paper Scissor game .|^__^|.\n" 
        + "* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *\n",
        "RockPaperScissors", 1);
        
        //we use to make the program choose at random rock, paper or scissors
        Random rand = new Random();
        
        //the player choose rock, paper or scissors
        String [] options = {"Rock", "Paper", "Scissor"};
        int input;
        input = JOptionPane.showOptionDialog(null,
                "Please, choose one:",
                "RockPaperScissor", 
                0, 3, null, options, options[0]);
        
        //compare between the program and the player choose and display reslt
        switch(input){
            case 0:
                if(rand.nextInt(3) == 0){
                    JOptionPane.showMessageDialog(null,
                            options[0] + " = " + options[0],
                            "RockPaperScissors", 1);                    
                    JOptionPane.showMessageDialog(null,
                            "It's a draw! Thanks for playing.",
                            "RockPaperScissors", 1);
                    bool = true;
                }                
                else if(rand.nextInt(3) == 1){
                    JOptionPane.showMessageDialog(null,
                            options[0] + " < " + options[1] + 
                            "\nPaper covers the rock.",
                            "RockPaperScissors", 1);                    
                    JOptionPane.showMessageDialog(null,
                            "The computer won :( Thanks for playing.",
                            "RockPaperScissors", 1);
                    bool = false;
                }
                else{
                    JOptionPane.showMessageDialog(null,
                            options[0] + " > " + options[2] +
                            "\nRock crushes scissors.",
                            "RockPaperScissors", 1);
                    JOptionPane.showMessageDialog(null,
                            "You win ^_^! Thanks for playing.",
                            "RockPaperScissors", 1);
                    bool = true;
                }
                break;
                
            case 1:
                if(rand.nextInt(3) == 0){
                    JOptionPane.showMessageDialog(null,
                            options[1] + " > " + options[0] +
                            "\nPaper covers the rock.",
                            "RockPaperScissors", 1);
                    JOptionPane.showMessageDialog(null,
                            "You win ^_^! Thanks for playing.",
                            "RockPaperScissors", 1);
                    bool = true;
                }
                else if(rand.nextInt(3) == 1){
                    JOptionPane.showMessageDialog(null,
                            options[1] + " = " + options[1],
                            "RockPaperScissors", 1);
                    JOptionPane.showMessageDialog(null,
                            "It's a draw! Thanks for playing.",
                            "RockPaperScissors", 1); 
                    bool = true;
                }
                else{
                    JOptionPane.showMessageDialog(null,
                            options[1] + " < " + options[2] +
                            "\nScissors cut paper.",
                            "RockPaperScissors", 1);
                    JOptionPane.showMessageDialog(null,
                            "The computer won :(\n Thanks for playing.",
                            "RockPaperScissors", 1); 
                    bool = false;
                }
                break;
               
            case 2:
                if(rand.nextInt(3) == 0){
                    JOptionPane.showMessageDialog(null,
                            options[2] + " < " + options[0] +
                            "\nRock crushes scissors.",
                            "RockPaperScissors", 1);
                    JOptionPane.showMessageDialog(null,
                            "The computer won :(\n Thanks for playing.",
                            "RockPaperScissors", 1);
                    bool = false;
                }
                else if(rand.nextInt(3) == 1){
                    JOptionPane.showMessageDialog(null,
                            options[2] + " > " + options[1] +
                            "\nScissors cut paper.",
                            "RockPaperScissors", 1);
                    JOptionPane.showMessageDialog(null,
                            "You win ^_^! Thanks for playing.",
                            "RockPaperScissors", 1); 
                    bool = true;
                }
                else{
                    JOptionPane.showMessageDialog(null,
                            options[2] + " = " + options[2]);
                    JOptionPane.showMessageDialog(null,
                            "It's a draw! Thanks for playing.",
                            "RockPaperScissors", 1); 
                    bool = true;
                }
                break;               
        }// end of switch               
    }// end of method play
    
    /**
     * toString method  
     * @return return motivational phrase with the name of player
     *
     */
    public String toString(){
        return ("Done with Rock Paper Scissors! Good job, " + playerName);
    }
}