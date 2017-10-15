
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
    
    
    public HighScoreEngine(String initials,int score){
        this.initials = initials;
        this.score = score;
    }
    
    public void loadScoreFromFile() {
        try {
            Scanner scanner  = new Scanner(new FileReader("Scores.txt"));
            String line;
            HighScoreEngine record;
            
            while (scanner.hasNextLine()){
                line = scanner.nextLine();
                String[] results = line.split(" ");
                
                String initals = results[0];
                int score = Integer.parseInt(results[1]);
                
                record = new HighScoreEngine(initals,score);
                highScoreRecords.add(record);
            }
        } 
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    
    public void writing(String inputData) throws IOException {
    // InputData must be as 'Position Initals Score'. IE " ABC 100"
    BufferedWriter fileInput = new BufferedWriter(new FileWriter(new File("Scores.txt"),true));
    
    fileInput.newLine(); // New line to keep the records straight
    fileInput.write(inputData+" "+getScore());
    fileInput.close();
    
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
    
    public void Sorter() throws IOException{
        BufferedReader reader = new BufferedReader(new FileReader("Scores.txt"));
        ArrayList<HighScoreEngine> scoreRecords = new ArrayList<HighScoreEngine>();
        String currentLine = reader.readLine();
         
        while (currentLine != null){
            String[] studentDetail = currentLine.split(" "); 
            String name = studentDetail[0]; 
            int marks = Integer.valueOf(studentDetail[1]);
            scoreRecords.add(new HighScoreEngine(name, marks)); 
            currentLine = reader.readLine();
        }
        
        Collections.sort(scoreRecords, new marksCompare());
        BufferedWriter writer = new BufferedWriter(new FileWriter("Scores.txt"));
        
            for (HighScoreEngine scores : scoreRecords){
                writer.write(scores.initials);
                writer.write(" "+scores.score);
                writer.write("\n");
            }
            
            
        reader.close();
        writer.close();
    
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
    
    

