/** *************************************************************
 * File: ColorTrap.java
 * Author: Albert Gil, Cody Nguyen, Ynebin Yin, Matt Musquiz
 * Class: CS 245 - Programming Graphical User Interfaces
 *
 * Assignment: Hangman V1.1
 * Date last modified: 10/15/17
 *
 * purpose: This class designs the User interface for the Color Trap Game. This
 * Does not include the engine of the game itself.
 *
 *************************************************************** */
package Main;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import javax.swing.AbstractAction;
import javax.swing.JComponent;
import javax.swing.KeyStroke;
import javax.swing.Timer;

public final class ColorTrap extends javax.swing.JFrame {

    Random rand = new Random();
    ColorTrapEngine CTE = new ColorTrapEngine();
    private final HighScoreEngine hiScoreRecords = new HighScoreEngine("0", 0);
    int score;
    private String wordColor = null;
    
    public ColorTrap(int x) {
        hiScoreRecords.loadScoreFromFile();
        setScore(x);
        initComponents();
        showDateAndTime();
        escapeListener();
        setWord();
        setWordColor();
        //resetBoard();
    }
    
    public int getScore() {
        return score;
    }
    
    public void setScore(int score) {
        this.score = score;
    }
    
    
    //Method: resetBoard
    //purpose: this method resets the board to a new states and also
    //checks if the game is finished and is a highscore.
    public void resetBoard() {
        
        if (CTE.isFinished() == true) {
            dispose();
            System.out.println(CTE.getScore()+getScore());
            if (hiScoreRecords.isHighScore(CTE.getScore()+getScore()) == true) { // If score is greater than a score in score.txt
                new ScoreInput(CTE.getScore()+getScore()).setVisible(true);
            } 
            else {
                new WinnerFrame(CTE.getScore()+getScore()).setVisible(true); // If not then just move to the game overscreen
            }
        }
        
        //Sets the jlabel for the score at the top to the current running score.
        String scoreNumber = Integer.toString(CTE.getScore()+getScore());
        scorePlaceHolderLabel.setText(scoreNumber);

        
        setWord();
        setWordColor();
        
        removeButtons();
        randomAddButtons();

    }

    //Method: removeButtons
    //purpose: this method removes all the buttons from the panel
    //used right before adding the buttons back randomly.
    private void removeButtons() {
        jPanel1.remove(purpleButton);
        jPanel1.remove(redButton);
        jPanel1.remove(yellowButton);
        jPanel1.remove(greenButton);
        jPanel1.remove(blueButton);
        jPanel1.remove(empty1);
        jPanel1.remove(empty2);
        jPanel1.remove(empty3);
        jPanel1.remove(empty4);
    }

    //Method: randomAddButtons
    //purpose: this method inserts the buttons in random orders
    //which will place them in different spots in the gridlayout
    private void randomAddButtons() {
        //sets a random preset "random location" for the button 
           int number = rand.nextInt(9);
            switch (number) {
                case 0:
                    jPanel1.add(purpleButton);
                    jPanel1.add(redButton);
                    jPanel1.add(empty4);
                    jPanel1.add(yellowButton);
                    jPanel1.add(greenButton);
                    jPanel1.add(empty1);
                    jPanel1.add(blueButton);
                    jPanel1.add(empty2);
                    jPanel1.add(empty3);
                    break;
                case 1:
                    jPanel1.add(empty3);
                    jPanel1.add(empty4);
                    jPanel1.add(purpleButton);
                    jPanel1.add(redButton);
                    jPanel1.add(empty1);
                    jPanel1.add(yellowButton);
                    jPanel1.add(greenButton);
                    jPanel1.add(empty2);
                    jPanel1.add(blueButton);
                    break;
                case 2:
                    jPanel1.add(empty3);
                    jPanel1.add(purpleButton);
                    jPanel1.add(empty4);
                    jPanel1.add(redButton);
                    jPanel1.add(yellowButton);
                    jPanel1.add(greenButton);
                    jPanel1.add(blueButton);
                    jPanel1.add(empty1);
                    jPanel1.add(empty2);
                    break;
                case 3:
                    jPanel1.add(empty4);
                    jPanel1.add(purpleButton);
                    jPanel1.add(redButton);
                    jPanel1.add(empty3);
                    jPanel1.add(yellowButton);
                    jPanel1.add(empty2);
                    jPanel1.add(greenButton);
                    jPanel1.add(blueButton);
                    jPanel1.add(empty1);

                    break;
                case 4:
                    jPanel1.add(empty3);
                    jPanel1.add(purpleButton);
                    jPanel1.add(empty4);
                    jPanel1.add(redButton);
                    jPanel1.add(yellowButton);
                    jPanel1.add(empty2);
                    jPanel1.add(greenButton);
                    jPanel1.add(empty1);
                    jPanel1.add(blueButton);
                    break;
                case 5:
                    jPanel1.add(empty4);
                    jPanel1.add(redButton);
                    jPanel1.add(empty3);
                    jPanel1.add(yellowButton);
                    jPanel1.add(empty1);
                    jPanel1.add(blueButton);
                    jPanel1.add(purpleButton);
                    jPanel1.add(empty2);
                    jPanel1.add(greenButton);
                    break;
                case 6:
                    jPanel1.add(blueButton);
                    jPanel1.add(greenButton);
                    jPanel1.add(empty1);
                    jPanel1.add(empty2);
                    jPanel1.add(redButton);
                    jPanel1.add(empty3);
                    jPanel1.add(yellowButton);
                    jPanel1.add(empty4);
                    jPanel1.add(purpleButton);

                    break;
                case 7:
                    jPanel1.add(blueButton);
                    jPanel1.add(greenButton);
                    jPanel1.add(yellowButton);
                    jPanel1.add(empty1);
                    jPanel1.add(empty2);
                    jPanel1.add(redButton);
                    jPanel1.add(empty3);
                    jPanel1.add(empty4);
                    jPanel1.add(purpleButton);
                    break;
                case 8:
                    jPanel1.add(empty2);
                    jPanel1.add(empty3);

                    jPanel1.add(blueButton);
                    jPanel1.add(empty1);
                    jPanel1.add(purpleButton);
                    jPanel1.add(greenButton);
                    jPanel1.add(empty4);
                    jPanel1.add(yellowButton);
                    jPanel1.add(redButton);
                    break;
                case 9:
                    jPanel1.add(purpleButton);
                    jPanel1.add(greenButton);
                    jPanel1.add(blueButton);
                    jPanel1.add(empty1);
                    jPanel1.add(empty2);
                    jPanel1.add(empty3);
                    jPanel1.add(empty4);
                    jPanel1.add(yellowButton);
                    jPanel1.add(redButton);
                    break;
                case 10:
                    jPanel1.add(blueButton);
                    jPanel1.add(empty4);
                    jPanel1.add(greenButton);
                    jPanel1.add(empty1);
                    jPanel1.add(empty2);
                    jPanel1.add(purpleButton);
                    jPanel1.add(empty3);
                    jPanel1.add(yellowButton);
                    jPanel1.add(redButton);
                    break;
                case 11:
                    jPanel1.add(empty1);
                    jPanel1.add(empty2);
                    jPanel1.add(empty3);
                    jPanel1.add(purpleButton);
                    jPanel1.add(greenButton);
                    jPanel1.add(blueButton);
                    jPanel1.add(redButton);
                    jPanel1.add(empty4);
                    jPanel1.add(yellowButton);
                    break;
                case 12:
                    jPanel1.add(empty1);
                    jPanel1.add(empty2);
                    jPanel1.add(yellowButton);
                    jPanel1.add(redButton);
                    jPanel1.add(blueButton);
                    jPanel1.add(empty3);
                    jPanel1.add(empty4);
                    jPanel1.add(purpleButton);
                    jPanel1.add(greenButton);
                    break;
                default:
                    System.out.println("Somehow we got an error");
                    break;
            }
        
    }

    //Method: showDateAndTime
    //purpose: this method starts the date and time components for the jlabel
    private void showDateAndTime() {
        timeComponent();
        dateComponent();
    }

    //Method: timeComponent
    //purpose: this method starts recording system time and places replaces a jlabel with it.
    private void timeComponent() {
        new Timer(0, (ActionEvent e) -> {
            Date d = new Date();
            SimpleDateFormat s = new SimpleDateFormat("hh:mm:ss a");
            timePlaceHolder.setFont(new Font("Tw Cen MT", Font.PLAIN, 12));
            timePlaceHolder.setText(s.format(d));
            int x = 1;
        }).start();
    }

    //Method: dateComponent
    //purpose: this method starts recording system time and places replaces a jlabel with it.
    private void dateComponent() {
        Date d = new Date();
        SimpleDateFormat s = new SimpleDateFormat("  MMMM dd yyyy");
        datePlaceHolder.setFont(new Font("Tw Cen MT", Font.PLAIN, 12));
        datePlaceHolder.setText(s.format(d));
    }

    //Method: setWordColor
    //purpose: sets the jlabel for the word at the top of the game a random color.
    private void setWordColor() {
        int randNum = rand.nextInt(5);
        switch (randNum) {
            case 0:
                colorLabel.setForeground(Color.GREEN);
                wordColor = "GREEN";
                break;
            case 1:
                colorLabel.setForeground(Color.BLUE);
                wordColor = "BLUE";
                break;
            case 2:
                colorLabel.setForeground(Color.RED);
                wordColor = "RED";
                break;
            case 3:
                colorLabel.setForeground(Color.ORANGE);
                wordColor = "ORANGE";
                break;
            case 4:
                colorLabel.setForeground(Color.MAGENTA);
                wordColor = "PURPLE";
                break;
            default:
                System.out.println();

        }
    }

    //Method: setWord
    //purpose: sets the jlabel for the word at the top of the game a certain word
    private void setWord() {
        int randNum = rand.nextInt(4);
        switch (randNum) {
            case 0:
                colorLabel.setText("GREEN");
                break;
            case 1:
                colorLabel.setText("RED");

                break;
            case 2:
                colorLabel.setText("ORANGE");
                break;
            case 3:
                colorLabel.setText("BLUE");
                break;
            case 4:
                colorLabel.setText("PURPLE");

                break;
            default:
                System.out.println();

        }
    }

    //Method: paint
    //purpose: used to make smoother lines
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
    }
    
    //Method: escapeListener
    //purpose: this method is used to close the program whenever 'ESC' is pressed.
    public final void escapeListener() {
        getRootPane().getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(
                KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), "Cancel");
        getRootPane().getActionMap().put("Cancel", new AbstractAction() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        purpleButton = new javax.swing.JButton();
        redButton = new javax.swing.JButton();
        greenButton = new javax.swing.JButton();
        blueButton = new javax.swing.JButton();
        yellowButton = new javax.swing.JButton();
        empty1 = new javax.swing.JButton();
        empty2 = new javax.swing.JButton();
        empty3 = new javax.swing.JButton();
        empty4 = new javax.swing.JButton();
        datePlaceHolder = new javax.swing.JLabel();
        timePlaceHolder = new javax.swing.JLabel();
        scoreLabel = new javax.swing.JLabel();
        scorePlaceHolderLabel = new javax.swing.JLabel();
        colorLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(600, 400));
        setMinimumSize(new java.awt.Dimension(600, 400));
        setPreferredSize(new java.awt.Dimension(600, 400));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setMaximumSize(new java.awt.Dimension(600, 250));
        jPanel1.setMinimumSize(new java.awt.Dimension(600, 250));
        jPanel1.setPreferredSize(new java.awt.Dimension(60, 60));
        jPanel1.setLayout(new java.awt.GridLayout(3, 3));

        purpleButton.setForeground(new java.awt.Color(255, 255, 255));
        purpleButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Res/purpleUnpressed.png"))); // NOI18N
        purpleButton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        purpleButton.setBorderPainted(false);
        purpleButton.setContentAreaFilled(false);
        purpleButton.setDefaultCapable(false);
        purpleButton.setFocusPainted(false);
        purpleButton.setMaximumSize(new java.awt.Dimension(110, 110));
        purpleButton.setMinimumSize(new java.awt.Dimension(110, 110));
        purpleButton.setPreferredSize(new java.awt.Dimension(110, 110));
        purpleButton.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Res/purplePressed.png"))); // NOI18N
        purpleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                purpleButtonActionPerformed(evt);
            }
        });
        jPanel1.add(purpleButton);

        redButton.setForeground(new java.awt.Color(255, 255, 255));
        redButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Res/redButtonUnpressed.png"))); // NOI18N
        redButton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        redButton.setBorderPainted(false);
        redButton.setContentAreaFilled(false);
        redButton.setDefaultCapable(false);
        redButton.setFocusPainted(false);
        redButton.setMaximumSize(new java.awt.Dimension(110, 110));
        redButton.setMinimumSize(new java.awt.Dimension(110, 110));
        redButton.setPreferredSize(new java.awt.Dimension(110, 110));
        redButton.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Res/redButtonPressed.png"))); // NOI18N
        redButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                redButtonActionPerformed(evt);
            }
        });
        jPanel1.add(redButton);

        greenButton.setForeground(new java.awt.Color(255, 255, 255));
        greenButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Res/greenUnpressed.png"))); // NOI18N
        greenButton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        greenButton.setBorderPainted(false);
        greenButton.setContentAreaFilled(false);
        greenButton.setDefaultCapable(false);
        greenButton.setFocusPainted(false);
        greenButton.setMaximumSize(new java.awt.Dimension(110, 110));
        greenButton.setMinimumSize(new java.awt.Dimension(110, 110));
        greenButton.setPreferredSize(new java.awt.Dimension(110, 110));
        greenButton.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Res/greenPressed.png"))); // NOI18N
        greenButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                greenButtonActionPerformed(evt);
            }
        });
        jPanel1.add(greenButton);

        blueButton.setForeground(new java.awt.Color(255, 255, 255));
        blueButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Res/blueUnpressed.png"))); // NOI18N
        blueButton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        blueButton.setBorderPainted(false);
        blueButton.setContentAreaFilled(false);
        blueButton.setDefaultCapable(false);
        blueButton.setFocusPainted(false);
        blueButton.setMaximumSize(new java.awt.Dimension(110, 110));
        blueButton.setMinimumSize(new java.awt.Dimension(110, 110));
        blueButton.setPreferredSize(new java.awt.Dimension(110, 110));
        blueButton.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Res/bluePressed.png"))); // NOI18N
        blueButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blueButtonActionPerformed(evt);
            }
        });
        jPanel1.add(blueButton);

        yellowButton.setForeground(new java.awt.Color(255, 255, 255));
        yellowButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Res/yellowButtonUnpressed.png"))); // NOI18N
        yellowButton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        yellowButton.setBorderPainted(false);
        yellowButton.setContentAreaFilled(false);
        yellowButton.setDefaultCapable(false);
        yellowButton.setFocusPainted(false);
        yellowButton.setMaximumSize(new java.awt.Dimension(110, 110));
        yellowButton.setMinimumSize(new java.awt.Dimension(110, 110));
        yellowButton.setPreferredSize(new java.awt.Dimension(110, 110));
        yellowButton.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Res/yellowButtonPressed.png"))); // NOI18N
        yellowButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yellowButtonActionPerformed(evt);
            }
        });
        jPanel1.add(yellowButton);

        empty1.setForeground(new java.awt.Color(255, 255, 255));
        empty1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        empty1.setBorderPainted(false);
        empty1.setContentAreaFilled(false);
        empty1.setDefaultCapable(false);
        empty1.setFocusPainted(false);
        jPanel1.add(empty1);

        empty2.setForeground(new java.awt.Color(255, 255, 255));
        empty2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        empty2.setBorderPainted(false);
        empty2.setContentAreaFilled(false);
        empty2.setDefaultCapable(false);
        empty2.setFocusPainted(false);
        jPanel1.add(empty2);

        empty3.setForeground(new java.awt.Color(255, 255, 255));
        empty3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        empty3.setBorderPainted(false);
        empty3.setContentAreaFilled(false);
        empty3.setDefaultCapable(false);
        empty3.setFocusPainted(false);
        jPanel1.add(empty3);

        empty4.setForeground(new java.awt.Color(255, 255, 255));
        empty4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        empty4.setBorderPainted(false);
        empty4.setContentAreaFilled(false);
        empty4.setDefaultCapable(false);
        empty4.setFocusPainted(false);
        jPanel1.add(empty4);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 40, 600, 330);

        datePlaceHolder.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        datePlaceHolder.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        datePlaceHolder.setText("DATEPLACEHOLDER");
        getContentPane().add(datePlaceHolder);
        datePlaceHolder.setBounds(410, 0, 100, 14);

        timePlaceHolder.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        timePlaceHolder.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        timePlaceHolder.setText("TIMEPLACEHOLDER");
        getContentPane().add(timePlaceHolder);
        timePlaceHolder.setBounds(520, 0, 70, 14);

        scoreLabel.setFont(new java.awt.Font("Tw Cen MT", 0, 11)); // NOI18N
        scoreLabel.setText("Score :");
        getContentPane().add(scoreLabel);
        scoreLabel.setBounds(10, 20, 50, 13);

        scorePlaceHolderLabel.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        scorePlaceHolderLabel.setText("scorePlaceHolder");
        getContentPane().add(scorePlaceHolderLabel);
        scorePlaceHolderLabel.setBounds(60, 20, 70, 14);

        colorLabel.setFont(new java.awt.Font("Tw Cen MT", 1, 36)); // NOI18N
        colorLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        colorLabel.setText("COLOR");
        getContentPane().add(colorLabel);
        colorLabel.setBounds(180, 0, 250, 40);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void yellowButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yellowButtonActionPerformed
        if (wordColor == "ORANGE") {
            CTE.setScore(CTE.getScore() + 100);
        }
        resetBoard();
        CTE.setTurnsRemaining(CTE.getTurnsRemaining() - 1);
    }//GEN-LAST:event_yellowButtonActionPerformed

    private void blueButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blueButtonActionPerformed
        if (wordColor == "BLUE") {
            CTE.setScore(CTE.getScore() + 100);
        }
        resetBoard();
        CTE.setTurnsRemaining(CTE.getTurnsRemaining() - 1);
    }//GEN-LAST:event_blueButtonActionPerformed

    private void greenButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_greenButtonActionPerformed
        if (wordColor == "GREEN") {
            CTE.setScore(CTE.getScore() + 100);
        }
        resetBoard();
        CTE.setTurnsRemaining(CTE.getTurnsRemaining() - 1);
    }//GEN-LAST:event_greenButtonActionPerformed

    private void redButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_redButtonActionPerformed
        if (wordColor == "RED") {
            CTE.setScore(CTE.getScore() + 100);
        }
        resetBoard();
        CTE.setTurnsRemaining(CTE.getTurnsRemaining() - 1);
    }//GEN-LAST:event_redButtonActionPerformed

    private void purpleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_purpleButtonActionPerformed
        if (wordColor == "PURPLE") {
            CTE.setScore(CTE.getScore() + 100);
        }
        resetBoard();
        CTE.setTurnsRemaining(CTE.getTurnsRemaining() - 1);
    }//GEN-LAST:event_purpleButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton blueButton;
    private javax.swing.JLabel colorLabel;
    private javax.swing.JLabel datePlaceHolder;
    private javax.swing.JButton empty1;
    private javax.swing.JButton empty2;
    private javax.swing.JButton empty3;
    private javax.swing.JButton empty4;
    private javax.swing.JButton greenButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton purpleButton;
    private javax.swing.JButton redButton;
    private javax.swing.JLabel scoreLabel;
    private javax.swing.JLabel scorePlaceHolderLabel;
    private javax.swing.JLabel timePlaceHolder;
    private javax.swing.JButton yellowButton;
    // End of variables declaration//GEN-END:variables
}
