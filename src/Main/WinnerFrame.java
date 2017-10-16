/***************************************************************
* file: WinnerFrame.java
* author: Albert Gil, Cody Nguyen, Ynebin Yin, Matt Musquiz
* class: CS 245 - Programming Graphical User Interfaces
*
* assignment: Hangman V1.0
* date last modified: 10/9/17
*
* purpose: This class creates the frame to show the player that they have won 
* the game as well as displays their score and gives them an option to return 
* to the main menu
****************************************************************/ 
package Main;

/**
 *
 * @author Computer
 */
public class WinnerFrame extends javax.swing.JFrame {

    /**
     *
     * @param x
     */
    public WinnerFrame(int x) {
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

        scoreLabel = new javax.swing.JLabel();
        scoreNum = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        backGround = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(600, 400));
        setResizable(false);
        getContentPane().setLayout(null);

        scoreLabel.setFont(new java.awt.Font("Tw Cen MT", 3, 18)); // NOI18N
        scoreLabel.setText("SCORE :");
        getContentPane().add(scoreLabel);
        scoreLabel.setBounds(250, 300, 60, 21);

        scoreNum.setFont(new java.awt.Font("Tw Cen MT", 3, 19)); // NOI18N
        scoreNum.setText("num");
        getContentPane().add(scoreNum);
        scoreNum.setBounds(320, 300, 90, 20);

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel1.setForeground(new java.awt.Color(0, 51, 51));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 274, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 34, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(160, 290, 280, 40);

        jButton1.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jButton1.setText("End");
        jButton1.setToolTipText("Restart");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(463, 340, 100, 23);

        backGround.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Res/Winner.jpg"))); // NOI18N
        backGround.setText("jLabel1");
        getContentPane().add(backGround);
        backGround.setBounds(0, -30, 630, 440);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        restartGame();
    }//GEN-LAST:event_jButton1ActionPerformed

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backGround;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel scoreLabel;
    private javax.swing.JLabel scoreNum;
    // End of variables declaration//GEN-END:variables
}
