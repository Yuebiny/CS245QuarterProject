/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hangman;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Random;
import java.util.TreeSet;
import javax.imageio.ImageIO;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author
 */
public class Hangman extends JFrame implements ActionListener{
    
    

    CardLayout cards;
    TreeSet<Integer> scoreset;

    public static final int HEIGHT = 600;
    public static final int WIDTH = 400;
    Container c;
    JButton b1,b2,b3; 
    JPanel start;
    JPanel bpanel;
    JPanel highscores;
    JPanel creditsWindow;
    JPanel hangman;
    JPanel wpanel;
    public final static int THREE_SECOND = 3000;
    public boolean splashGone = false;
    JLabel [] labels;
    JButton [] lbuttons;
    public static String [] words = {"ABSTRACT", "CEMETERY", "NURSE", "PHARMACY", "CLIMBING"};
    public int current =0;
    public int tried = 0;
    public String curword;
    JLabel [] ropes;
    JLabel [] scorel;
    JLabel points;
    int total_wrong = 0;
    int cur_score = 100;
    public void initWord(){
        wpanel = new JPanel();
        Random rn = new Random();
        int index = rn.nextInt(words.length);
        points = new JLabel("Score: 100");
        hangman.add(points);
        curword = words[index];
        labels = new JLabel[20];
        current = 0;
        tried =0;
        for(int i=0;i<curword.length();i++){
            labels[i] = new JLabel("_____");
            wpanel.add(labels[i]);
            wpanel.add(new JLabel("     "));
        }
        int len = curword.length();
        for(int i = len;i<20;i++){
            labels[i] = new JLabel(" ");
            wpanel.add(labels[i]);
            wpanel.add(new JLabel("     "));
        }
        System.out.println(curword);
        
        hangman.revalidate();
        
    }
    public Hangman() {
        c = getContentPane();
        ropes = new JLabel[100];
        scorel = new JLabel[20];
        scoreset = new TreeSet<Integer>(Collections.reverseOrder());
        cards = new CardLayout(2, 2);
        c.setLayout(cards);
        start = new JPanel(new BorderLayout());
        start.setBackground(Color.BLACK);
        JLabel header = new JLabel("CS 245 Quarter Project");
        header.setFont(new Font("Serif", Font.BOLD, 40));
        header.setForeground(Color.WHITE);
        header.setAlignmentX(100f);
        
        
         JLabel footer = new JLabel("By: Team Name");
        footer.setFont(new Font("Serif", Font.BOLD, 20));
        footer.setForeground(Color.WHITE);
        footer.setAlignmentX(100f);
        start.add(header,BorderLayout.NORTH);
        start.add(footer,BorderLayout.SOUTH);
        bpanel = new JPanel();
        bpanel.setLayout(new BorderLayout());
        
        bpanel.setBackground(Color.BLACK);
        BufferedImage img = null;
        try {
            img = ImageIO.read(new File("src\\bgm.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        JLabel thumb = new JLabel();
        thumb.setSize(600, 400);
        Image dimg = img.getScaledInstance(thumb.getWidth(), thumb.getHeight(),
        Image.SCALE_SMOOTH);
        ImageIcon imageIcon = new ImageIcon(dimg);
        thumb.setIcon(imageIcon);
        bpanel.add(thumb,BorderLayout.NORTH);
        b1 = new JButton("Play");
        b1.setPreferredSize(new Dimension(100, 40));
        
        b2 = new JButton("High Scores");
        b2.setPreferredSize(new Dimension(100, 40));
        b3 = new JButton("Credits");
        b3.setPreferredSize(new Dimension(100, 40));
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        JPanel buttonPanel  = new JPanel();
        buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.Y_AXIS));
        buttonPanel.setBackground(Color.BLACK);
        buttonPanel.setSize(100,100);
        buttonPanel.add(b1);
        buttonPanel.add(b2);
        buttonPanel.add(b3);
        
        bpanel.add(buttonPanel,BorderLayout.CENTER);
        
        
        highscores = new JPanel();
        JPanel scores = new JPanel();
        scores.setLayout(new BoxLayout(scores, BoxLayout.Y_AXIS));
        JLabel label = new JLabel("High Scores");
        scores.add(label);
        for(int i =0;i<10;i++){
            String name = "Name "+i;
            String score = "0000";
            scorel[i] = new JLabel(name+" : "+score);
            scores.add(scorel[i]);
        }
        
        JButton backs = new JButton("Back");
        backs.addActionListener(this);
        scores.add(backs);
        // Scores panel
        
        highscores.add(scores);
        
 
        creditsWindow = new JPanel(new BorderLayout());
        JPanel credits = new JPanel();
        credits.setLayout(new BoxLayout(credits, BoxLayout.Y_AXIS));
        JLabel clabels = new JLabel("Credits");
        credits.add(clabels);
        credits.add(new JLabel("\nName 1"));
        credits.add(new JLabel("\nName 2"));
        credits.add(new JLabel("\nName 3"));
        credits.add(new JLabel("\nName 4"));
        JButton backc = new JButton("Back");
        backc.addActionListener(this);
        credits.add(backc);
        creditsWindow.add(credits,BorderLayout.CENTER);
        
        // Game panel
        hangman = new JPanel();
        hangman.setLayout(new BoxLayout(hangman, BoxLayout.Y_AXIS));
        JLabel time = new JLabel();
        Timer timer2 = new Timer(1, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
                LocalDateTime now = LocalDateTime.now();
                time.setText(dtf.format(now));
            }
        });
        
        timer2.start();
        hangman.add(time);
        initWord();
        hangman.add(new JLabel(" "));
        JButton skip = new JButton("Skip");
        skip.addActionListener(this);
        hangman.add(skip);
        hangman.add(new JLabel("               _______________"));
        for(int i =0;i<10;i++) {
            ropes[i] = new JLabel("               |                                 ");
            hangman.add(ropes[i]);
        }
        hangman.add(new JLabel("______________________________"));
   
        hangman.add(wpanel);
        String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        lbuttons = new JButton[26];
        int i =0;
        JPanel p = new JPanel();
        for(char c : letters.toCharArray()) {
            lbuttons[i] = new JButton(c+"");
            lbuttons[i].addActionListener(this);
            p.add(lbuttons[i]);
            i++;
            
        }
        hangman.add(p);
        JButton backg = new JButton("Back");
        backg.addActionListener(this);
        hangman.add(backg);
        c.add("start",start);
        c.add("bpanel",bpanel);
        c.add("scores",highscores);
        c.add("credits",creditsWindow);
        c.add("game",hangman);
        Timer timer = new Timer(THREE_SECOND, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cards.next(c);
                splashGone = true;
            }
        });
        timer.start();
        timer.setRepeats(false);
        if(splashGone){
            timer.stop();
        }
        
    }

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Hangman hm = new Hangman();
        hm.setSize(600, 600);
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((dimension.getWidth() - hm.getWidth()) / 2);
        int y = (int) ((dimension.getHeight() - hm.getHeight()) / 2);
        hm.setLocation(x, y);
        hm.setVisible(true);
        hm.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getActionCommand() == "High Scores") {
            System.out.println("Scores");
            cards.show(c, "scores");
        }
        if (e.getActionCommand() == "Credits") {
            cards.show(c, "credits");
        }
        if(e.getActionCommand() == "Play") {
            cards.show(c, "game");
        }
        if(e.getActionCommand() == "Back") {
            int index = (new Random()).nextInt(words.length);
            
            curword = words[index];
            System.out.println(curword);
            for(int i=0;i<20;i++){
                labels[i].setText(" ");
            }
            for(int i = 0;i<curword.length();i++){
                labels[i].setText("____");
            }
            tried  = 0;
            cur_score = 100;
            points.setText("Score: "+cur_score);
            current = 0;
            for(int i=0;i<26;i++) {
                lbuttons[i].setEnabled(true);
            }
            Iterator<Integer> it = scoreset.iterator();
            for(int i =0;i<scoreset.size();i++){
                scorel[i].setText("Score "+(1+i)+" : "+it.next());
            }
            cards.show(c, "bpanel");
        }
        if(e.getActionCommand() =="Skip"){
            JOptionPane.showMessageDialog(c, "Skipping the Game.\nCurrent Score is: "+cur_score);
            cards.show(c, "bpanel");
        }
        String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        if(letters.contains(e.getActionCommand())) {
            System.out.println(e.getActionCommand());
            String s =e.getActionCommand();
            if(curword.contains(s)) {
                for(int i=0;i<curword.length();i++){
                    if(curword.substring(i,i+1).equals(s)){
                        labels[i].setText(s);
                        current++;
                    }
                    lbuttons[(int)(s.toCharArray()[0]-'A')].setEnabled(false);
                }
                
                if(current == curword.length()) {
                    scoreset.add(cur_score);
                    System.out.println("Hooray. You win");
                }
                tried = 0;
            }
            else {
                cur_score = cur_score - 10;
                if(cur_score < 0) cur_score = 0;
                points.setText("Score: "+cur_score);
                tried++;
                ropes[total_wrong++].setText("               |                                 |");
                System.out.println("Wrong guess. Try again");
            }
        }
        
    }
    
}
