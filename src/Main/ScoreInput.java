/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Main;

public class ScoreInput extends javax.swing.JFrame {
    
private final HighScore hiScoreRecords = new HighScore(0,"0", 0);

    public ScoreInput(int x) {
        initComponents();
        String num = Integer.toString(x);
        score.setText(num);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        initalsJlabel = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        saveButton = new javax.swing.JButton();
        score = new javax.swing.JLabel();
        scoreNumLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        initalsJlabel.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        initalsJlabel.setText("Enter Initals: \"AAA\"");

        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 0, 36)); // NOI18N
        jLabel1.setText("High Score!");

        saveButton.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        saveButton.setText("Save!");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        score.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        score.setText("Score :");

        scoreNumLabel.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        scoreNumLabel.setText("scorePlaceHolder");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(32, 32, 32))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(saveButton)
                        .addGap(90, 90, 90))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(initalsJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(score)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(scoreNumLabel)))
                        .addGap(54, 54, 54))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(score)
                    .addComponent(scoreNumLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(initalsJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(saveButton)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
       jLabel1.setText(initalsJlabel.getText()); 
       initalsJlabel.setText("");// Reset Text Field  back to empty
    }//GEN-LAST:event_saveButtonActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField initalsJlabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton saveButton;
    private javax.swing.JLabel score;
    private javax.swing.JLabel scoreNumLabel;
    // End of variables declaration//GEN-END:variables

}
