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
    
    private String hiddenWord;
    private int guessesRemaining;
    private boolean solved;
    
    public int score;
    private ArrayList lettersUsed = new ArrayList();
    
    public GameEngine() {
        setHiddenWord();
        setGuessesRemaining(6);
        setScore(100);
    }

    public boolean isSolved() {
        return solved;
    }

    public void setSolved(boolean solved) {
        this.solved = solved;
    }

     public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
       
    }
    public int getGuessesRemaining() {
        return guessesRemaining;
    }

    public void setGuessesRemaining(int guessesRemaining) {
        this.guessesRemaining = guessesRemaining;
    }
    
    //Method: setHiddenWord
    //purpose: this method creates a random number generator to randomly
    // select one of the 5 words and set it to hiddenWord.
    private void setHiddenWord(){
        Random rand = new Random(System.currentTimeMillis());
        //Gets a random number from 0-4 to determine the hiddenWord.
        int number = random.nextInt(5);
        
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
        if (hiddenWord.indexOf(guess) != -1){
            return true;
        } 
        else {
            guessesRemaining--;
            if(score>0){
                score -=10;
            }
            return false;
        }
    }
        
    public String getWord(){
     return hiddenWord;
    } 
    
    //method: getWordLength
    //purpose: returns the hiddenwords length+
    public int getWordLength(){
        int wordLength = hiddenWord.length();
        return wordLength;
    }
    

    public boolean[] getIndexes(char guess){
        boolean[] indexAt = new boolean[hiddenWord.length()];
        for(int i = 0; i < hiddenWord.length(); i++){
            if(guess == hiddenWord.charAt(i)){
                indexAt[i] = true;
            } else {
                indexAt[i] = false;
            }
        }
        return indexAt;
    }
    
    private boolean wordIsComplete() {
		for (int i = 0; i < hiddenWord.length(); i++) {
			char cr = hiddenWord.charAt(i);
			if ( hiddenWord.indexOf(cr) == -1 ) {
				return false;
			}
		}
		return true;
	}
}
