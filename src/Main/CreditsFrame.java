/***************************************************************
* File: CreditsFrame.java
* Author: Albert Gil, Cody Nguyen, Ynebin Yin, Matt Musquiz
* Class: CS 245 - Programming Graphical User Interfaces
*
* Assignment: Hangman V1.0
* Date last modified: 10/3/17
*
* Purpose: This class creates a credit frame that displays everybody's name who
* worked on this project.
*
****************************************************************/ 
package Main;

public class CreditsFrame extends javax.swing.JFrame {
    public CreditsFrame() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        name1 = new javax.swing.JLabel();
        creditText = new javax.swing.JLabel();
        name2 = new javax.swing.JLabel();
        name3 = new javax.swing.JLabel();
        name4 = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(600, 400));
        getContentPane().setLayout(null);

        name1.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        name1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        name1.setText("Albert Gil");
        name1.setAlignmentY(0.0F);
        name1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        name1.setIconTextGap(0);
        getContentPane().add(name1);
        name1.setBounds(270, 150, 80, 16);

        creditText.setFont(new java.awt.Font("Tw Cen MT", 0, 36)); // NOI18N
        creditText.setLabelFor(creditText);
        creditText.setText("Credits");
        creditText.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(creditText);
        creditText.setBounds(250, 75, 102, 40);

        name2.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        name2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        name2.setText("Ynebin Yin");
        name2.setAlignmentY(0.0F);
        name2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        name2.setIconTextGap(0);
        getContentPane().add(name2);
        name2.setBounds(260, 210, 100, 16);

        name3.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        name3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        name3.setText("Matt Musquiz");
        name3.setAlignmentY(0.0F);
        name3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        name3.setIconTextGap(0);
        getContentPane().add(name3);
        name3.setBounds(270, 190, 100, 16);

        name4.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        name4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        name4.setText("Cody Nguyen");
        name4.setAlignmentY(0.0F);
        name4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        name4.setIconTextGap(0);
        getContentPane().add(name4);
        name4.setBounds(270, 170, 100, 16);

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        getContentPane().add(backButton);
        backButton.setBounds(30, 310, 73, 23);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //Method: backButtonActionPerformed
    //purpose: brings use back to main menu and closes credits frame
    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        dispose();
        new MainMenuFrame().setVisible(true);
    }//GEN-LAST:event_backButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JLabel creditText;
    private javax.swing.JLabel name1;
    private javax.swing.JLabel name2;
    private javax.swing.JLabel name3;
    private javax.swing.JLabel name4;
    // End of variables declaration//GEN-END:variables

}
