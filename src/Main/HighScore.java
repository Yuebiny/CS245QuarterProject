
package Main;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class HighScore <T>{
    
    private int position;
    private int score;
    private String initials;
    
    private final ArrayList<HighScore> highScoreRecords = new ArrayList<>();
    
    
    public HighScore(int position,String initials,int score){
        this.position = position;
        this.initials = initials;
        this.score = score;
    }
    
    public void loadScoreFromFile() {
        try {
            Scanner scanner  = new Scanner(new FileReader("Scores.txt"));
            String line;
            HighScore record;
            
            while (scanner.hasNextLine()){
                line = scanner.nextLine();
                String[] results = line.split(" ");
                
                int position = Integer.parseInt(results[0]);
                String initals = results[1];
                int score = Integer.parseInt(results[2]);
                
                record = new HighScore(position,initals,score);
                highScoreRecords.add(record);
            }
        } 
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    public void writing(String inputData) throws IOException {
    // InputData must be as 'Position Initals Score'. IE "1 ABC 100"
    BufferedWriter fileInput = new BufferedWriter(new FileWriter(new File("Scores.txt"),true));
    fileInput.newLine(); // New line to keep the records straight
    fileInput.write(inputData);
    fileInput.close();
    
    
    
    String inputLine = inputData;
    
    }

 
    @Override
    public String toString(){
        return  position + " " +initials + " " + score ;
    }
    
    public HighScore getRecordNumber(int i){
        return highScoreRecords.get(i);
    }
    
    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
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
    
    

