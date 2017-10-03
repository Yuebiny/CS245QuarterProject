/***************************************************************
* file: TitleFrame.java
* author: 
* class: CS 245 – Computer Graphics
*
* assignment: Quarter Project
* date last modified: 9/27/17
*
* purpose: 
*      
****************************************************************/
package Main;
import java.util.Timer;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MainMenuFrame extends javax.swing.JFrame {
    
    public MainMenuFrame() { 
        
        initComponents();
    }
    
    public void creditsButtonPress(){
       dispose();
       new CreditsFrame().setVisible(true);
    }
    
    public void highScoreButtonPress(){
       dispose();
       new HighScoreFrame().setVisible(true);
    }
    
    public void gameFrameButtonPress(){
       dispose();
       new test().setVisible(true);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        creditsButton = new javax.swing.JButton();
        playButton = new javax.swing.JButton();
        highscoreButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(600, 400));
        setMinimumSize(new java.awt.Dimension(600, 400));
        setPreferredSize(new java.awt.Dimension(600, 400));
        getContentPane().setLayout(null);

        creditsButton.setFont(new java.awt.Font("Tw Cen MT", 0, 11)); // NOI18N
        creditsButton.setText("Credits");
        creditsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                creditsButtonActionPerformed(evt);
            }
        });
        getContentPane().add(creditsButton);
        creditsButton.setBounds(390, 250, 90, 21);

        playButton.setFont(new java.awt.Font("Tw Cen MT", 1, 11)); // NOI18N
        playButton.setText("Play !");
        playButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playButtonActionPerformed(evt);
            }
        });
        getContentPane().add(playButton);
        playButton.setBounds(370, 180, 130, 30);

        highscoreButton.setFont(new java.awt.Font("Tw Cen MT", 0, 11)); // NOI18N
        highscoreButton.setText("HighScores");
        highscoreButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                highscoreButtonActionPerformed(evt);
            }
        });
        getContentPane().add(highscoreButton);
        highscoreButton.setBounds(390, 220, 90, 21);

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 48)); // NOI18N
        jLabel1.setText("Hangman");
        jLabel1.setToolTipText("");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(280, 70, 280, 70);

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Main/BackGround.jpg"))); // NOI18N
        Background.setText("Background");
        getContentPane().add(Background);
        Background.setBounds(0, 0, 872, 476);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void playButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playButtonActionPerformed
        gameFrameButtonPress();
    }//GEN-LAST:event_playButtonActionPerformed

    private void creditsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_creditsButtonActionPerformed
        creditsButtonPress();
    }//GEN-LAST:event_creditsButtonActionPerformed

    private void highscoreButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_highscoreButtonActionPerformed
        highScoreButtonPress();// TODO add your handling cod here:
    }//GEN-LAST:event_highscoreButtonActionPerformed

    public static void main(String args[]) {
        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JButton creditsButton;
    private javax.swing.JButton highscoreButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton playButton;
    // End of variables declaration//GEN-END:variables

  
}
