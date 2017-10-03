/***************************************************************
* file: TitleFrame.java
* author: 
* class: CS 245 – Computer Graphics
*
* assignment: Quarter Project
* date last modified: 9/27/17
*
* purpose: 
*      
****************************************************************/
package Main;
import java.util.Timer;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

public class StartFrame extends javax.swing.JFrame {
    
    final int STALLDELAY = 3;
    
    public StartFrame() {
        initComponents();
    }
    
    public void run(){
        StartFrame titleScreen = new StartFrame();  
        titleScreen.setVisible(true);
        stall(STALLDELAY);
        titleScreen.dispose();
        new MainMenuFrame().setVisible(true);
    }
      
    public void stall(int num){
        try {
            TimeUnit.SECONDS.sleep(num);
            System.out.println("stall sucessful");
        } catch (InterruptedException ex) {
            Logger.getLogger(StartFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Title = new javax.swing.JLabel();
        TeamName = new javax.swing.JLabel();
        BackGround = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(600, 400));
        getContentPane().setLayout(null);

        Title.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        Title.setText("CS 245 Quarter Project");
        getContentPane().add(Title);
        Title.setBounds(340, 50, 200, 14);

        TeamName.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        TeamName.setText("Team Diamond Dogs");
        getContentPane().add(TeamName);
        TeamName.setBounds(400, 70, 150, 16);

        BackGround.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Main/BackGround.jpg"))); // NOI18N
        BackGround.setText("jLabel1");
        BackGround.setMaximumSize(new java.awt.Dimension(600, 400));
        BackGround.setMinimumSize(new java.awt.Dimension(100, 40));
        BackGround.setPreferredSize(new java.awt.Dimension(600, 400));
        getContentPane().add(BackGround);
        BackGround.setBounds(0, 0, 600, 400);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        StartFrame Main = new StartFrame();
        Main.run();  
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackGround;
    private javax.swing.JLabel TeamName;
    private javax.swing.JLabel Title;
    // End of variables declaration//GEN-END:variables

  
}
