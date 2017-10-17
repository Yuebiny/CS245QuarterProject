/***************************************************************
* file: MainMenuFrame.java
* author: Albert Gil, Cody Nguyen, Ynebin Yin, Matt Musquiz
* class: CS 245 - Programming Graphical User Interfaces
*
* assignment: Hangman V1.0
* date last modified: 10/15/17
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
import java.util.logging.Logger;

public final class ColorTrapEngine {
    
    Random random = new Random();
    
    
   
    private boolean finished;
    public int score;
    public int turnsRemaining;

    public int getTurnsRemaining() {
        return turnsRemaining;
    }

    public void setTurnsRemaining(int turnsRemaining) {
        this.turnsRemaining = turnsRemaining;
    }
    
    
    public ColorTrapEngine() {
        setScore(0);
        setTurnsRemaining(4);
    }
    
    public boolean isFinished() {
        if(turnsRemaining == 0){
            return true;
        }
        return false;
    }

    public void setFinished(boolean finished) {
        this.finished = finished;
    }
    
    public int getScore() {
        return score;
    }

   
    public void setScore(int score) {
        this.score = score;
       
    }

   
    
}
