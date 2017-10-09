/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

/**
 *
 * @author Computer
 */
public class gameOverFrame extends javax.swing.JFrame {

    
    public gameOverFrame() {
        initComponents();
    }
    
    private void restartGame(){
        dispose();
        new GameGUI().setVisible(true);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        playAgainButton = new javax.swing.JButton();
        backGroundImg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximumSize(new java.awt.Dimension(600, 400));
        setMinimumSize(new java.awt.Dimension(600, 400));
        setPreferredSize(new java.awt.Dimension(600, 400));
        setResizable(false);
        getContentPane().setLayout(null);

        playAgainButton.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        playAgainButton.setText("Play Again?");
        playAgainButton.setToolTipText("If you dare.");
        playAgainButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray));
        playAgainButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playAgainButtonActionPerformed(evt);
            }
        });
        getContentPane().add(playAgainButton);
        playAgainButton.setBounds(490, 310, 110, 23);

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
    // End of variables declaration//GEN-END:variables
}
