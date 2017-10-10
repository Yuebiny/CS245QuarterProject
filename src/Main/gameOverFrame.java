/***************************************************************
* file: gameOverFrame.java
* author: Albert Gil, Cody Nguyen, Ynebin Yin, Matt Musquiz
* class: CS 245 - Programming Graphical User Interfaces
*
* assignment: Hangman V1.0
* date last modified: 10/3/17
*
* purpose: This class creates the frame to show the player that they have lost 
* the game as well as displays their score and gives them an option to return 
* to the main menu
****************************************************************/ 
package Main;

public class gameOverFrame extends javax.swing.JFrame {
    
    public gameOverFrame(int x) {
        int score = x;
        initComponents();
        String num = Integer.toString(x);
        scoreNum.setText(num);
    }
    
    private void restartGame(){
        dispose();
        new MainMenuFrame().setVisible(true);
    }
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        playAgainButton = new javax.swing.JButton();
        scoreLabel = new javax.swing.JLabel();
        scoreNum = new javax.swing.JLabel();
        backGroundImg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximumSize(new java.awt.Dimension(600, 400));
        setMinimumSize(new java.awt.Dimension(600, 400));
        setPreferredSize(new java.awt.Dimension(600, 400));
        setResizable(false);
        getContentPane().setLayout(null);

        playAgainButton.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        playAgainButton.setText("End");
        playAgainButton.setToolTipText("If you dare.");
        playAgainButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray));
        playAgainButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playAgainButtonActionPerformed(evt);
            }
        });
        getContentPane().add(playAgainButton);
        playAgainButton.setBounds(490, 310, 110, 23);

        scoreLabel.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        scoreLabel.setText("Score:");
        getContentPane().add(scoreLabel);
        scoreLabel.setBounds(420, 190, 44, 21);

        scoreNum.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        scoreNum.setForeground(new java.awt.Color(255, 0, 0));
        scoreNum.setText("num");
        getContentPane().add(scoreNum);
        scoreNum.setBounds(470, 190, 70, 20);

        backGroundImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Main/gameOver.png"))); // NOI18N
        backGroundImg.setPreferredSize(new java.awt.Dimension(600, 400));
        getContentPane().add(backGroundImg);
        backGroundImg.setBounds(0, -40, 1296, 443);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void playAgainButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playAgainButtonActionPerformed
        restartGame();
    }//GEN-LAST:event_playAgainButtonActionPerformed

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backGroundImg;
    private javax.swing.JButton playAgainButton;
    private javax.swing.JLabel scoreLabel;
    private javax.swing.JLabel scoreNum;
    // End of variables declaration//GEN-END:variables
}
