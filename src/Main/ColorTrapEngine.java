/** *************************************************************
 * File: ColorTrapEngine.java
 * Author: Albert Gil, Cody Nguyen, Ynebin Yin, Matt Musquiz
 * Class: CS 245 - Programming Graphical User Interfaces
 *
 * Assignment: Hangman V1.1
 * Date last modified: 10/15/17
 *
 * Purpose: This class is where the game mechanics of the color trap game are
 * calculated and stored.
 *
 *************************************************************** */
package Main;

import java.util.Random;

public final class ColorTrapEngine {
    
    Random random = new Random();
    public int score;
    public int turnsRemaining;
    
    
    public ColorTrapEngine() {
        setScore(0);
        setTurnsRemaining(4);
    }
    
     public int getTurnsRemaining() {
        return turnsRemaining;
    }

    public void setTurnsRemaining(int turnsRemaining) {
        this.turnsRemaining = turnsRemaining;
    }
    
    public boolean isFinished() {
        if(turnsRemaining == 0){
            return true;
        }
        return false;
    }
    
    public int getScore() {
        return score;
    }

   
    public void setScore(int score) {
        this.score = score;
       
    }

   
    
}
