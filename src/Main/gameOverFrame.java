/***************************************************************
* file: gameOverFrame.java
* author: Albert Gil, Cody Nguyen, Ynebin Yin, Matt Musquiz
* class: CS 245 - Programming Graphical User Interfaces
*
* assignment: Hangman V1.0
* date last modified: 10/15/17
*
* purpose: This class is to contain the game over frame once the game is finished but a 
* high score was not reached.
****************************************************************/ 
package Main;

import java.util.logging.Logger;

/**
 *
 * @author Owner
 */
public class gameOverFrame extends javax.swing.JFrame {
    
    public gameOverFrame(int x) {
        initComponents();
        String num = Integer.toString(x);
        scoreNum.setText(num);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scoreLabel = new javax.swing.JLabel();
        scoreNum = new javax.swing.JLabel();
        endButton = new javax.swing.JButton();
        backGroundImg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximumSize(new java.awt.Dimension(600, 400));
        setMinimumSize(new java.awt.Dimension(600, 400));
        setPreferredSize(new java.awt.Dimension(600, 400));
        setResizable(false);
        getContentPane().setLayout(null);

        scoreLabel.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        scoreLabel.setText("Score:");
        getContentPane().add(scoreLabel);
        scoreLabel.setBounds(420, 190, 44, 21);

        scoreNum.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        scoreNum.setForeground(new java.awt.Color(255, 0, 0));
        scoreNum.setText("num");
        getContentPane().add(scoreNum);
        scoreNum.setBounds(470, 190, 70, 20);

        endButton.setText("End");
        endButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        endButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                endButtonActionPerformed(evt);
            }
        });
        getContentPane().add(endButton);
        endButton.setBounds(463, 300, 110, 21);

        backGroundImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Res/GameOver.png"))); // NOI18N
        backGroundImg.setPreferredSize(new java.awt.Dimension(600, 400));
        getContentPane().add(backGroundImg);
        backGroundImg.setBounds(0, -40, 1296, 443);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void endButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_endButtonActionPerformed
        dispose();
        new MainMenuFrame().setVisible(true);
    }//GEN-LAST:event_endButtonActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backGroundImg;
    private javax.swing.JButton endButton;
    private javax.swing.JLabel scoreLabel;
    private javax.swing.JLabel scoreNum;
    // End of variables declaration//GEN-END:variables
    private static final Logger LOG = Logger.getLogger(gameOverFrame.class.getName());

}
