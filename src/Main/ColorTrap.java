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
        setWord();
        setWordColor();
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
     private void setWordColor(){
       int randNum = rand.nextInt(5);
        switch(randNum){
            case 0:
                colorLabel.setForeground(Color.GREEN);
                break;
            case 1:
                colorLabel.setForeground(Color.BLUE);
                break;
            case 2:
               colorLabel.setForeground(Color.RED);
                break;
            case 3:
                 colorLabel.setForeground(Color.YELLOW);
                break;
            case 4:
                 colorLabel.setForeground(Color.MAGENTA);
                break;
            default:
                 System.out.println();
                
        
        }
    }
    private void setWord(){
         int randNum = rand.nextInt(7);
        switch(randNum){
            case 0:
                colorLabel.setText("GREEN");
                break;
            case 1:
                colorLabel.setText("RED");
                break;
            case 2:
                colorLabel.setText("YELLOW");
                break;
            case 3:
                 colorLabel.setText("BLUE");
                break;
            case 4:
                 colorLabel.setText("MAGENTA");
         
                 break;
            default:
                 System.out.println();
                
        
        }
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
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        purpleButton = new javax.swing.JButton();
        redButton = new javax.swing.JButton();
        yellowButton = new javax.swing.JButton();
        greenButton = new javax.swing.JButton();
        blueButton4 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        colorLabel = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        scoreLabel = new javax.swing.JLabel();
        scorePlaceHolderLabel = new javax.swing.JLabel();

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

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 0, 24)); // NOI18N
        jLabel1.setText("Color Trap!");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 10, 130, 20);

        jPanel1.setLayout(new java.awt.GridLayout(2, 2));

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
        jPanel1.add(purpleButton);

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
        jPanel1.add(redButton);

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
        jPanel1.add(yellowButton);

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
        jPanel1.add(greenButton);

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
        jPanel1.add(blueButton4);

        colorLabel.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        colorLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        colorLabel.setText("COLOR");
        colorLabel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton1.setText("Resize");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Resize");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(colorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addGap(19, 19, 19))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(colorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 40, 600, 330);

        scoreLabel.setText("Score :");
        getContentPane().add(scoreLabel);
        scoreLabel.setBounds(220, 10, 34, 14);

        scorePlaceHolderLabel.setText("scorePlaceHolder");
        getContentPane().add(scorePlaceHolderLabel);
        scorePlaceHolderLabel.setBounds(270, 10, 70, 14);

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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       jPanel1.setLayout(new java.awt.GridLayout(3, 2));
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jPanel1.setLayout(new java.awt.GridLayout(2, 2));
    }//GEN-LAST:event_jButton2ActionPerformed
    
    public void initMyComponents(){
        
    }
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton blueButton4;
    private javax.swing.JLabel colorLabel;
    private javax.swing.JLabel datePlaceHolder;
    private javax.swing.JButton greenButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton purpleButton;
    private javax.swing.JButton redButton;
    private javax.swing.JLabel scoreLabel;
    private javax.swing.JLabel scorePlaceHolderLabel;
    private javax.swing.JLabel timePlaceHolder;
    private javax.swing.JButton yellowButton;
    // End of variables declaration//GEN-END:variables
}
