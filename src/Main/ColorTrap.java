/** *************************************************************
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
 *************************************************************** */
package Main;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridBagConstraints;
import java.awt.PopupMenu;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import static java.lang.Math.random;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;

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
        removeButtons();
        randomAddButtons();
    }

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
    
    private void randomAddButtons(){
        //Gets a random number from 0-4 to determine the hiddenWord.
        for(int i=0;i<10;i++){
            int number = rand.nextInt(9);
            System.out.println(i);
            switch(number) {
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
                default:
                    System.out.println("Somehow we got an error");
                    break;
            }
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

    private void setWordColor() {
        int randNum = rand.nextInt(5);
        switch (randNum) {
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
                colorLabel.setForeground(Color.ORANGE);
                break;
            case 4:
                colorLabel.setForeground(Color.MAGENTA);
                break;
            default:
                System.out.println();

        }
    }

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
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
    }

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

        RECOLOR = new javax.swing.JButton();
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

        RECOLOR.setText("MIX!");
        RECOLOR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RECOLORActionPerformed(evt);
            }
        });
        getContentPane().add(RECOLOR);
        RECOLOR.setBounds(140, 10, 80, 20);

        jPanel1.setMaximumSize(new java.awt.Dimension(600, 250));
        jPanel1.setMinimumSize(new java.awt.Dimension(600, 250));
        jPanel1.setPreferredSize(new java.awt.Dimension(60, 60));
        jPanel1.setLayout(new java.awt.GridLayout(3, 3));

        purpleButton.setForeground(new java.awt.Color(255, 255, 255));
        purpleButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Res/purpleUnpressed.png"))); // NOI18N
        purpleButton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        purpleButton.setContentAreaFilled(false);
        purpleButton.setDefaultCapable(false);
        purpleButton.setFocusPainted(false);
        purpleButton.setMaximumSize(new java.awt.Dimension(110, 110));
        purpleButton.setMinimumSize(new java.awt.Dimension(110, 110));
        purpleButton.setPreferredSize(new java.awt.Dimension(110, 110));
        purpleButton.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Res/purplePressed.png"))); // NOI18N
        purpleButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                purpleButtonMouseEntered(evt);
            }
        });
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
        redButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                redButtonMouseEntered(evt);
            }
        });
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
        greenButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                greenButtonMouseEntered(evt);
            }
        });
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
        blueButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                blueButtonMouseEntered(evt);
            }
        });
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
        yellowButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                yellowButtonMouseEntered(evt);
            }
        });
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

        scoreLabel.setText("Score :");
        getContentPane().add(scoreLabel);
        scoreLabel.setBounds(10, 10, 34, 14);

        scorePlaceHolderLabel.setText("scorePlaceHolder");
        getContentPane().add(scorePlaceHolderLabel);
        scorePlaceHolderLabel.setBounds(50, 10, 70, 14);

        colorLabel.setFont(new java.awt.Font("Tw Cen MT", 1, 36)); // NOI18N
        colorLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        colorLabel.setText("COLOR");
        getContentPane().add(colorLabel);
        colorLabel.setBounds(180, 0, 250, 40);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void yellowButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yellowButtonActionPerformed
        System.out.println("YELLOW");
    }//GEN-LAST:event_yellowButtonActionPerformed

    private void blueButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blueButtonActionPerformed
        System.out.println("BLUE");
    }//GEN-LAST:event_blueButtonActionPerformed

    private void greenButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_greenButtonActionPerformed
        System.out.println("GREEN");
    }//GEN-LAST:event_greenButtonActionPerformed

    private void redButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_redButtonActionPerformed
        System.out.println("RED");
    }//GEN-LAST:event_redButtonActionPerformed

    private void purpleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_purpleButtonActionPerformed
        System.out.println("PRUPLE");
    }//GEN-LAST:event_purpleButtonActionPerformed

    private void purpleButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_purpleButtonMouseEntered
        System.out.println("HOVERING PURPLE");
    }//GEN-LAST:event_purpleButtonMouseEntered

    private void greenButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_greenButtonMouseEntered
        System.out.println("HOVERING GREEN");
    }//GEN-LAST:event_greenButtonMouseEntered

    private void redButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_redButtonMouseEntered
       System.out.println("HOVERING RED");
    }//GEN-LAST:event_redButtonMouseEntered

    private void yellowButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_yellowButtonMouseEntered
        System.out.println("HOVERING YELLOW");
    }//GEN-LAST:event_yellowButtonMouseEntered

    private void blueButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_blueButtonMouseEntered
        System.out.println("HOVERING BLUE");
    }//GEN-LAST:event_blueButtonMouseEntered

    private void RECOLORActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RECOLORActionPerformed
        setWord();
        setWordColor();
        removeButtons();
        randomAddButtons();
       
    }//GEN-LAST:event_RECOLORActionPerformed

    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton RECOLOR;
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
