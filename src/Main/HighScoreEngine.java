/***************************************************************
* File: HighScoreEngine.java
* Author: Albert Gil, Cody Nguyen, Ynebin Yin, Matt Musquiz
* Class: CS 245 - Programming Graphical User Interfaces
*
* Assignment: Hangman V1.0
* Date last modified: 10/9/17
*
* Purpose: This code Calculates and stores the High Scores of the games. This
* Does not include the UI of the High Score Screen.
****************************************************************/ 
package Main;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class HighScoreEngine <T>{
    
    private int score;
    private String initials;
    private final ArrayList<HighScoreEngine> highScoreRecords = new ArrayList<>();
    
    //Default constructor for the highscore engine
    public HighScoreEngine(String initials,int score){
        this.initials = initials;
        this.score = score;
    }
    
    /*Method: loadScoreFromFile
    purpose: Loads the score from the file and places them into a record arraylist for reading back from later*/ 
    public void loadScoreFromFile() {
        try {
            Scanner scanner  = new Scanner(new FileReader("Scores.txt"));
            String line;
            HighScoreEngine record;
           
            if(scanner.nextLine()!= ""){
                 while (scanner.hasNextLine()){
                    line = scanner.nextLine();
                    String[] results = line.split(" ");
                    String initals = results[0];
                    int score = Integer.parseInt(results[1]);
                    record = new HighScoreEngine(initals,score);
                    highScoreRecords.add(record);
                }
            } 
           
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    /*Method: SorterAndRewrite
    purpose: this method sorts the scores based on the value and places them into a new text file*/ 
    public void SorterAndRewrite() throws IOException{
        BufferedReader reader = new BufferedReader(new FileReader("SortedScores.txt"));
        BufferedWriter writer = new BufferedWriter(new FileWriter("SortedScores.txt"));
        Collections.sort(highScoreRecords, new marksCompare());
        
        //Rewrites the new sorted scores in order based on Greatest to lowest
            for(int i = 0; i < highScoreRecords.size(); i++){
                writer.write(highScoreRecords.get(i).initials+" "+highScoreRecords.get(i).score);
                writer.newLine();
            }
        reader.close();
        writer.close();   
    }
    
   /*Method: writing
    purpose: this method is used to input initials and score into the textfile*/ 
    public void writing(String inputData) throws IOException {
        // File saved as 'Initals, Score'. IE " ABC 100"
        try ( 
            BufferedWriter fileInput = new BufferedWriter(new FileWriter(new File("Scores.txt"),true))) {
            fileInput.newLine(); // New line to keep the records straight
            fileInput.write(inputData+" "+getScore());
        }
    }
    
    /*Method: isHighScore
    purpose: this method is used to check if the score obtained is greated than one already on record in the textfile*/
    public boolean isHighScore(int hiScore){
      for(int i = 0; i < getNumberOfRecords(); i++){
          if(hiScore > highScoreRecords.get(i).score){
              return true;
          }
      }
      // hiscore was lower
        return false;    
    }
    
    class nameCompare implements Comparator<HighScoreEngine>{
        @Override
        public int compare(HighScoreEngine s1, HighScoreEngine s2)
        {
            return s1.initials.compareTo(s2.initials);
        }
    }
    
    class marksCompare implements Comparator<HighScoreEngine>{
        @Override
        public int compare(HighScoreEngine s1, HighScoreEngine s2)
        {
            return s2.score - s1.score;
        }
    }
    
    
    
    
    @Override
    public String toString(){
        return  initials + " " + score ;
    }
    
    public HighScoreEngine getRecordNumber(int i){
        return highScoreRecords.get(i);
    }
    
    public int getScore() {
        return score;
    }
    
    public void setScore(int score) {
        this.score = score;
    }
    
    public String getInitials() {
        return initials;
    }
    
    public void setInitials(String initials) {
        this.initials = initials;
    }
    
    public int getNumberOfRecords() {
        return highScoreRecords.size();
    }
    
}
    
    

