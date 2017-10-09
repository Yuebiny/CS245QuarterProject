/***************************************************************
* file: MainMenuFrame.java
* author: Albert Gil, Cody Nguyen, Ynebin Yin, Matt Musquiz
* class: CS 245 - Programming Graphical User Interfaces
*
* assignment: Hangman V1.0
* date last modified: 10/5/17
*
* purpose: This class is to contain the word that needs to be guess,
* the letters that have been revealed, and the remaining guesses. This
* class does not deal with user input and calls other classes to handle
* user input.
*
****************************************************************/ 
package Main;

import java.util.Random;
import java.util.ArrayList;     
/**
 *
 * @author matthhew
 */
public class GameEngine {
    
    Random random = new Random();
    StringBuffer misses = new StringBuffer("");
    final int attempts = 6;
    boolean solved;
    private final String[] wordArray = {"abstract", "cemetery", "nurse","pharmacy","climbing" };
    
    
    private String hiddenWord;
    private int guessesRemaining;
    private boolean gameOver;
    
    //Needed to redraw which letters are used.
    private ArrayList lettersUsed = new ArrayList();
    
    public GameEngine() {
        //According to project the user loses after 6 incorrect guesses.
        guessesRemaining = 5;
        setHiddenWord();  
        gameOver = false;
    }
    
    //Method: setHiddenWord
    //purpose: this method creates a random number generator to randomly
    // select one of the 5 words and set it to hiddenWord.
    private void setHiddenWord(){
        Random rand = new Random(System.currentTimeMillis());
        //Gets a random number from 0-4 to determine the hiddenWord.
        int number = rand.nextInt(5);
        switch(number) {
            case 0:
                hiddenWord = "abstract";
                break;
            case 1:
                hiddenWord = "cemetery";
                break;
            case 2:
                hiddenWord = "nurse";
                break;
            case 3:
                hiddenWord = "pharmacy";
                break;
            case 4:
                hiddenWord = "climbing";
                break;
            default:
                hiddenWord = "INVALID";
                System.out.println("Somehow we got an error");
                System.out.println(number);
                break;
        }
        
    }
    
    //method: guessLetter
    //purpose: Adds the letter to letters guessed and checks to see if 
    //This letter was in the word.
        public boolean guessLetter(char guess){
        //says the letter has been used.
        lettersUsed.add(guess);
        //returns the first index of the letter
        if (hiddenWord.indexOf(guess) >= -1){
            return true;
        } 
        else {
            guessesRemaining--;
            
            if (guessesRemaining == 0){
            gameOver = true;
            }
        return false;
        }
    }
    
    //method: getWord
    //purpose: returns the hidden word.
    public String getWord(){
        return hiddenWord;
    }
    
    //method: getWordLength
    //purpose: returns the hiddenwords length+
    public int getWordLength(){
        int wordLength = hiddenWord.length();
        return wordLength;
    }
    
}
