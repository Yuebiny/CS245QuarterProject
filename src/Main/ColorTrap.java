
package Main;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import javax.swing.AbstractAction;
import javax.swing.JComponent;
import javax.swing.KeyStroke;
import javax.swing.Timer;


public class ColorTrap extends javax.swing.JFrame {
    Random rand = new Random();
    
    public ColorTrap() {
        initComponents();
        showDateAndTime();
        escapeListener();
    }
    
    //Method: showDateAndTime
    //purpose: this method starts the date and time components for the jlabel
    private void showDateAndTime(){
        timeComponent();
        dateComponent();
    }
    
    //Method: timeComponent
    //purpose: this method starts recording system time and places replaces a jlabel with it.
    private void timeComponent() {
        new Timer(0, (ActionEvent e) -> {
            Date d = new Date();
            SimpleDateFormat s = new SimpleDateFormat("hh:mm:ss a");
            timePlaceHolder.setFont(new Font("Tw Cen MT", Font.PLAIN, 12));
            timePlaceHolder.setText(s.format(d));
            int x =1;
        }).start();
    }
    
    //Method: dateComponent
    //purpose: this method starts recording system time and places replaces a jlabel with it.
    private void dateComponent() {
        Date d = new Date();
        SimpleDateFormat s = new SimpleDateFormat("  MMMM dd yyyy");
        datePlaceHolder.setFont(new Font("Tw Cen MT", Font.PLAIN, 12));
        datePlaceHolder.setText(s.format(d));
    }
    
    @Override
     public void paint(Graphics g) {
       super.paint(g);
       Graphics2D g2 = (Graphics2D) g;
       g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
       
       //setWord();
       //setWordColor();
       //drawRandomCircles(g);       
         
    }
     
    public void drawRandomCircles(Graphics g){
        boolean circlePresent = false;
        
        for(int i = 0; i < 5; i++){
            int randNum = rand.nextInt(500);
            setColor(g);
            g.fillOval(i+50, i+200, 100, 100);
        }
        
    }
    private void setColor(Graphics g){
        int randNum = rand.nextInt(5);
        switch(randNum){
            case 0:
                g.setColor(Color.GREEN);
                break;
            case 1:
                g.setColor(Color.RED);
                break;
            case 2:
                g.setColor(Color.BLUE);
                break;
            case 3:
                 g.setColor(Color.YELLOW);
                break;
            case 4:
                 g.setColor(Color.MAGENTA);
                break;
            default:
                 System.out.println();
        }
    }
    private void setWordColor(){
       int randNum = rand.nextInt(5);
        switch(randNum){
            case 0:
                colorLabel.setForeground(Color.GREEN);
                break;
            case 1:
                colorLabel.setForeground(Color.BLUE);
                break;
            case 2:
               colorLabel.setForeground(Color.RED);
                break;
            case 3:
                 colorLabel.setForeground(Color.YELLOW);
                break;
            case 4:
                 colorLabel.setForeground(Color.MAGENTA);
                break;
            default:
                 System.out.println();
                
        
        }
    }
    private void setWord(){
         int randNum = rand.nextInt(7);
        switch(randNum){
            case 0:
                colorLabel.setText("GREEN");
                break;
            case 1:
                colorLabel.setText("RED");
                break;
            case 2:
                colorLabel.setText("YELLOW");
                break;
            case 3:
                 colorLabel.setText("BLUE");
                break;
            case 4:
                 colorLabel.setText("MAGENTA");
         
                 break;
            default:
                 System.out.println();
                
        
        }
    }
    public final void escapeListener(){
         getRootPane().getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(
        KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), "Cancel");
        getRootPane().getActionMap().put("Cancel", new AbstractAction(){ 

            public void actionPerformed(ActionEvent e){
                System.exit(0);
            }
       });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        colorLabel = new javax.swing.JLabel();
        datePlaceHolder = new javax.swing.JLabel();
        timePlaceHolder = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        colorLabel.setBackground(new java.awt.Color(255, 51, 0));
        colorLabel.setFont(new java.awt.Font("Tw Cen MT", 0, 50)); // NOI18N
        colorLabel.setText("colorLabel");

        datePlaceHolder.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        datePlaceHolder.setText("DATEPLACEHOLDER");

        timePlaceHolder.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        timePlaceHolder.setText("TIMEPLACEHOLDER");

        jButton1.setText("Repaint");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(358, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(datePlaceHolder, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(timePlaceHolder, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(colorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(30, 30, 30))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(datePlaceHolder)
                    .addComponent(timePlaceHolder))
                .addGap(45, 45, 45)
                .addComponent(colorLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 221, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(31, 31, 31))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        repaint();
    }//GEN-LAST:event_jButton1ActionPerformed

 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel colorLabel;
    private javax.swing.JLabel datePlaceHolder;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel timePlaceHolder;
    // End of variables declaration//GEN-END:variables
}
