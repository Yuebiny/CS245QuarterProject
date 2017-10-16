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

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.KeyStroke;
import javax.swing.Timer;


public final class ColorTrap extends javax.swing.JFrame {
    Random rand = new Random();
    
  
    public ColorTrap() {
        
        initComponents();
        showDateAndTime();
        escapeListener();
        //initMyComponents();
    }
    
    
    
    //Method: showDateAndTime
    //purpose: this method starts the date and time components for the jlabel
    private void showDateAndTime(){
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
            int x =1;
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
    
    @Override
     public void paint(Graphics g) {
       super.paint(g);
       Graphics2D g2 = (Graphics2D) g;
       g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
    }
     
    public final void escapeListener(){
         getRootPane().getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(
        KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), "Cancel");
        getRootPane().getActionMap().put("Cancel", new AbstractAction(){ 

            public void actionPerformed(ActionEvent e){
                System.exit(0);
            }
       });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        datePlaceHolder = new javax.swing.JLabel();
        timePlaceHolder = new javax.swing.JLabel();
        purpleButton = new javax.swing.JButton();
        redButton = new javax.swing.JButton();
        yellowButton = new javax.swing.JButton();
        greenButton = new javax.swing.JButton();
        blueButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(600, 400));
        setMinimumSize(new java.awt.Dimension(600, 400));
        setPreferredSize(new java.awt.Dimension(600, 400));
        getContentPane().setLayout(null);

        datePlaceHolder.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        datePlaceHolder.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        datePlaceHolder.setText("DATEPLACEHOLDER");
        getContentPane().add(datePlaceHolder);
        datePlaceHolder.setBounds(410, 10, 100, 14);

        timePlaceHolder.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        timePlaceHolder.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        timePlaceHolder.setText("TIMEPLACEHOLDER");
        getContentPane().add(timePlaceHolder);
        timePlaceHolder.setBounds(510, 10, 70, 14);

        purpleButton.setForeground(new java.awt.Color(255, 255, 255));
        purpleButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Res/PurpleButton.png"))); // NOI18N
        purpleButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        purpleButton.setBorderPainted(false);
        purpleButton.setContentAreaFilled(false);
        purpleButton.setDefaultCapable(false);
        purpleButton.setFocusPainted(false);
        purpleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                purpleButtonActionPerformed(evt);
            }
        });
        getContentPane().add(purpleButton);
        purpleButton.setBounds(130, 250, 110, 110);

        redButton.setForeground(new java.awt.Color(255, 255, 255));
        redButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Res/RedButton.png"))); // NOI18N
        redButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        redButton.setBorderPainted(false);
        redButton.setContentAreaFilled(false);
        redButton.setDefaultCapable(false);
        redButton.setFocusPainted(false);
        redButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                redButtonActionPerformed(evt);
            }
        });
        getContentPane().add(redButton);
        redButton.setBounds(350, 250, 110, 110);

        yellowButton.setForeground(new java.awt.Color(255, 255, 255));
        yellowButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Res/YellowButton.png"))); // NOI18N
        yellowButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        yellowButton.setBorderPainted(false);
        yellowButton.setContentAreaFilled(false);
        yellowButton.setDefaultCapable(false);
        yellowButton.setFocusPainted(false);
        yellowButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yellowButtonActionPerformed(evt);
            }
        });
        getContentPane().add(yellowButton);
        yellowButton.setBounds(460, 250, 110, 110);

        greenButton.setForeground(new java.awt.Color(255, 255, 255));
        greenButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Res/GreenButton.png"))); // NOI18N
        greenButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        greenButton.setBorderPainted(false);
        greenButton.setContentAreaFilled(false);
        greenButton.setDefaultCapable(false);
        greenButton.setFocusPainted(false);
        greenButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                greenButtonActionPerformed(evt);
            }
        });
        getContentPane().add(greenButton);
        greenButton.setBounds(20, 250, 110, 110);

        blueButton4.setForeground(new java.awt.Color(255, 255, 255));
        blueButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Res/BlueButton.png"))); // NOI18N
        blueButton4.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        blueButton4.setBorderPainted(false);
        blueButton4.setContentAreaFilled(false);
        blueButton4.setDefaultCapable(false);
        blueButton4.setFocusPainted(false);
        blueButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blueButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(blueButton4);
        blueButton4.setBounds(240, 250, 110, 110);

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 0, 24)); // NOI18N
        jLabel1.setText("Color Trap!");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 10, 130, 20);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void purpleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_purpleButtonActionPerformed
        System.out.println("Hi");
    }//GEN-LAST:event_purpleButtonActionPerformed

    private void redButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_redButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_redButtonActionPerformed

    private void yellowButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yellowButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yellowButtonActionPerformed

    private void greenButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_greenButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_greenButtonActionPerformed

    private void blueButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blueButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_blueButton4ActionPerformed
    
    public void initMyComponents(){
        
    }
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton blueButton4;
    private javax.swing.JLabel datePlaceHolder;
    private javax.swing.JButton greenButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton purpleButton;
    private javax.swing.JButton redButton;
    private javax.swing.JLabel timePlaceHolder;
    private javax.swing.JButton yellowButton;
    // End of variables declaration//GEN-END:variables
}
