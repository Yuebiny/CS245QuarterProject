
package Main;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import static java.lang.Math.random;
import java.util.Random;
import javax.swing.AbstractAction;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.KeyStroke;


public class ColorTrap extends javax.swing.JFrame {
    Random rand = new Random();
    
    public ColorTrap() {
        initComponents();
        escapeListener();
        
    }
    
    @Override
     public void paint(Graphics g) {
       super.paint(g);
       setWord();
       drawCircles(g);       
         
    }
     
    public void drawCircles(Graphics g){
        setColor(g);
        g.fillOval(50, 50, 100,100);
        setColor(g);
        g.fillOval(100, 100, 100,100);
        setColor(g);
        g.fillOval(150, 150, 100,100);
        setColor(g);
        g.fillOval(200, 200, 100,100);
        setColor(g);
        g.fillOval(250, 250, 100,100);
        setColor(g);
        g.fillOval(300,300, 100,100);
        setColor(g);
        g.fillOval(350,350, 100,100);  
    }
    private void setColor(Graphics g){
        int randNum = rand.nextInt(7);
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
                 g.setColor(Color.PINK);
                break;
            case 5:
                 g.setColor(Color.ORANGE);
                break;
            case 6:
                 g.setColor(Color.darkGray);
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
                 colorLabel.setText("PINK");
                break;
            case 4:
                 colorLabel.setText("ORANGE");
                break;
            case 5:
                 colorLabel.setText("POTATO");
                break;
            case 6:
                 colorLabel.setText("GREY");
                 break;
            default:
                 System.out.println();
                
        
        }
    }
    public void escapeListener(){
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        colorLabel.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        colorLabel.setText("COLORPLACEHOLDER");
        colorLabel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(217, 217, 217)
                .addComponent(colorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(203, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(colorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(264, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel colorLabel;
    // End of variables declaration//GEN-END:variables
}
