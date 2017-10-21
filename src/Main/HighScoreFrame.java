/** *************************************************************
 * File: HighScoreFrame.java
 * Author: Albert Gil, Cody Nguyen, Ynebin Yin, Matt Musquiz
 * Class: CS 245 - Programming Graphical User Interfaces
 *
 * Assignment: Hangman V1.0
 * Date last modified: 10/3/17
 *
 * Purpose: This class creates the frame that shows the high scores for the game
 *
 *************************************************************** */
package Main;

import java.io.IOException;

public final class HighScoreFrame extends javax.swing.JFrame {

    private final HighScoreEngine hiScoreRecords = new HighScoreEngine("0", 0);

    public HighScoreFrame() throws IOException {
        initComponents();
        hiScoreRecords.loadScoreFromFile();
        setHighScoresOnJlabels();
    }

    public void setHighScoresOnJlabels() throws IOException {
        hiScoreRecords.SorterAndRewrite();
        hiScoreEntry1.setText(hiScoreRecords.getRecordNumber(0).getInitials() + "...." + hiScoreRecords.getRecordNumber(0).getScore());
        hiScoreEntry2.setText(hiScoreRecords.getRecordNumber(1).getInitials() + "...." + hiScoreRecords.getRecordNumber(1).getScore());
        hiScoreEntry3.setText(hiScoreRecords.getRecordNumber(2).getInitials() + "...." + hiScoreRecords.getRecordNumber(2).getScore());
        hiScoreEntry4.setText(hiScoreRecords.getRecordNumber(3).getInitials() + "...." + hiScoreRecords.getRecordNumber(3).getScore());
        hiScoreEntry5.setText(hiScoreRecords.getRecordNumber(4).getInitials() + "...." + hiScoreRecords.getRecordNumber(4).getScore());
        hiScoreEntry6.setText(hiScoreRecords.getRecordNumber(5).getInitials() + "...." + hiScoreRecords.getRecordNumber(5).getScore());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        creditsLabel = new javax.swing.JLabel();
        hiScoreEntry1 = new javax.swing.JLabel();
        hiScoreEntry2 = new javax.swing.JLabel();
        hiScoreEntry3 = new javax.swing.JLabel();
        hiScoreEntry4 = new javax.swing.JLabel();
        hiScoreEntry5 = new javax.swing.JLabel();
        hiScoreEntry6 = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(600, 400));

        creditsLabel.setFont(new java.awt.Font("Tw Cen MT", 0, 36)); // NOI18N
        creditsLabel.setText("HIGHSCORES");

        hiScoreEntry1.setText("ABC.....000");

        hiScoreEntry2.setText("ABC.....000");

        hiScoreEntry3.setText("ABC.....000");

        hiScoreEntry4.setText("ABC.....000");

        hiScoreEntry5.setText("ABC.....000");

        hiScoreEntry6.setText("ABC.....000");

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(215, 215, 215)
                        .addComponent(creditsLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(275, 275, 275)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(hiScoreEntry5)
                            .addComponent(hiScoreEntry4)
                            .addComponent(hiScoreEntry3)
                            .addComponent(hiScoreEntry2)
                            .addComponent(hiScoreEntry1)
                            .addComponent(hiScoreEntry6))))
                .addContainerGap(197, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(creditsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(hiScoreEntry1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(hiScoreEntry2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(hiScoreEntry3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(hiScoreEntry4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(hiScoreEntry5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(hiScoreEntry6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addComponent(backButton)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        dispose();
        new MainMenuFrame().setVisible(true);
    }//GEN-LAST:event_backButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JLabel creditsLabel;
    private javax.swing.JLabel hiScoreEntry1;
    private javax.swing.JLabel hiScoreEntry2;
    private javax.swing.JLabel hiScoreEntry3;
    private javax.swing.JLabel hiScoreEntry4;
    private javax.swing.JLabel hiScoreEntry5;
    private javax.swing.JLabel hiScoreEntry6;
    // End of variables declaration//GEN-END:variables
}
