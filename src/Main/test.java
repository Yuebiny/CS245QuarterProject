
package Main;
import java.awt.*;
import java.awt.event.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.Timer;
public class test extends javax.swing.JFrame {

   
    public test() {
        initComponents();
        showDate();
        showTime();
    }
    
    private void showTime() {
        //
        //testing testing 
        new Timer(0, (ActionEvent e) -> {
            Date d = new Date();
            SimpleDateFormat s = new SimpleDateFormat("hh:mm:ss a");
            timePlaceHolder.setFont(new Font("Tw Cen MT", Font.PLAIN, 12));
            timePlaceHolder.setText(s.format(d));
            int x =1;
        }).start();
         
    }

    private void showDate() {
        Date d = new Date();
        SimpleDateFormat s = new SimpleDateFormat("  MMMM dd yyyy");
        datePlaceHolder.setFont(new Font("Tw Cen MT", Font.PLAIN, 12));
        datePlaceHolder.setText(s.format(d));
       
    }
   
    
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gamePanel = new javax.swing.JPanel();
        namePlaceHolder = new javax.swing.JLabel();
        datePlaceHolder = new javax.swing.JLabel();
        timePlaceHolder = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jToolBar1 = new javax.swing.JToolBar();
        keysPanel = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(600, 400));
        getContentPane().setLayout(null);

        gamePanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        gamePanel.setLayout(null);

        namePlaceHolder.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        namePlaceHolder.setText("HANGMAN");
        gamePanel.add(namePlaceHolder);
        namePlaceHolder.setBounds(2, 2, 55, 14);

        datePlaceHolder.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        datePlaceHolder.setText("DATEPLACEHOLDER");
        gamePanel.add(datePlaceHolder);
        datePlaceHolder.setBounds(430, 0, 100, 14);

        timePlaceHolder.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        timePlaceHolder.setText("TIMEPLACEHOLDER");
        gamePanel.add(timePlaceHolder);
        timePlaceHolder.setBounds(530, 0, 70, 14);
        gamePanel.add(jSeparator1);
        jSeparator1.setBounds(290, 80, 0, 2);

        jToolBar1.setRollover(true);
        gamePanel.add(jToolBar1);
        jToolBar1.setBounds(220, 0, 13, 2);

        getContentPane().add(gamePanel);
        gamePanel.setBounds(0, 0, 600, 260);

        keysPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        keysPanel.setLayout(new java.awt.GridLayout(1, 0));

        jButton1.setText("jButton1");
        keysPanel.add(jButton1);

        jButton2.setText("jButton2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        keysPanel.add(jButton2);

        getContentPane().add(keysPanel);
        keysPanel.setBounds(0, 260, 580, 140);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel datePlaceHolder;
    private javax.swing.JPanel gamePanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JPanel keysPanel;
    private javax.swing.JLabel namePlaceHolder;
    private javax.swing.JLabel timePlaceHolder;
    // End of variables declaration//GEN-END:variables

    
}
