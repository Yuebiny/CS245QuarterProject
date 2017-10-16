/***************************************************************
* file: ScoreInput.java
* author: Albert Gil, Cody Nguyen, Ynebin Yin, Matt Musquiz
* class: CS 245 - Programming Graphical User Interfaces
*
* assignment: Hangman V1.0
* date last modified: 10/15/17
*
* purpose: This class was made for score input after losing or winning the game.
*
****************************************************************/ 
package Main;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Computer
 */
public class ScoreInput extends javax.swing.JFrame {
    
private final HighScoreEngine hiScoreRecords = new HighScoreEngine("0", 0);

    public int score;
    
    public ScoreInput(int x) {
        initComponents();
        String num = Integer.toString(x);
        scoreNumLabel.setText(num);
        setScore(x);
        hiScoreRecords.loadScoreFromFile();
    }
    
    public void setScore(int score) {
        this.score = score;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        initialsJTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        saveButton = new javax.swing.JButton();
        scoreNameLabel = new javax.swing.JLabel();
        scoreNumLabel = new javax.swing.JLabel();
        mainMenuButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        initialsJTextField.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        initialsJTextField.setText("AAA");
        initialsJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                initialsJTextFieldActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("High Score!");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setIconTextGap(1);
        jLabel1.setInheritsPopupMenu(false);

        saveButton.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        saveButton.setText("Save!");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        scoreNameLabel.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        scoreNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        scoreNameLabel.setText("Score :");
        scoreNameLabel.setAutoscrolls(true);

        scoreNumLabel.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        scoreNumLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        scoreNumLabel.setText("scorePlaceHolder");
        scoreNumLabel.setAutoscrolls(true);
        scoreNumLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        scoreNumLabel.setRequestFocusEnabled(false);

        mainMenuButton.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        mainMenuButton.setText("Main Menu");
        mainMenuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainMenuButtonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jLabel2.setText("Enter Initals:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                .addGap(2, 2, 2))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(initialsJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGap(0, 0, Short.MAX_VALUE)
                            .addComponent(scoreNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(scoreNumLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGap(18, 18, 18))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(saveButton)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(mainMenuButton)
                            .addContainerGap(10, Short.MAX_VALUE)))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(initialsJTextField)
                    .addComponent(jLabel2))
                .addGap(43, 43, 43))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(69, 69, 69)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(scoreNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(scoreNumLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(saveButton)
                        .addComponent(mainMenuButton))
                    .addContainerGap()))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        jLabel1.setText("Saved!");
       initialsJTextFieldActionPerformed(evt);
       initialsJTextField.setText("");// Reset Text Field  back to empty
   
    }//GEN-LAST:event_saveButtonActionPerformed

    private void mainMenuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainMenuButtonActionPerformed
        dispose();
        new MainMenuFrame().setVisible(true);
    }//GEN-LAST:event_mainMenuButtonActionPerformed

    private void initialsJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_initialsJTextFieldActionPerformed
        initialsJTextField.getText();
        try {
            hiScoreRecords.setScore(score);
            hiScoreRecords.writing(initialsJTextField.getText());
        } 
        catch (IOException ex) {
            Logger.getLogger(ScoreInput.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_initialsJTextFieldActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField initialsJTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton mainMenuButton;
    private javax.swing.JButton saveButton;
    private javax.swing.JLabel scoreNameLabel;
    private javax.swing.JLabel scoreNumLabel;
    // End of variables declaration//GEN-END:variables

}
