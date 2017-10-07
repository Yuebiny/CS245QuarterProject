/***************************************************************
* file: GameFrame.java
* author: Albert Gil, Cody Nguyen, Ynebin Yin, Matt Musquiz
* class: CS 245 - Programming Graphical User Interfaces
*
* assignment: Hangman V1.0
* date last modified: 10/3/17
*
* purpose: This class creates the frame where the hangman game is played, as
* well as all calculations that relate to the game.
****************************************************************/ 

package Main;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.Line2D;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import javax.swing.JLabel;
import javax.swing.Timer;
public class GameGUI extends javax.swing.JFrame {
    
    GameEngine game = new GameEngine();
    
    public GameGUI() {
        initComponents();
        showDateAndTime();
       
    }
    //Method: goback
    //purpose: this method brings the user back the main menu.
    public void goback(){
       dispose();
       new MainMenuFrame().setVisible(true);
    }
    
    //Method: drawLetterLines
    //purpose: this method draws the lines that will appear when the game starts, indicating to the player how many
    //letters are in the answer
    private void drawLetterLines(Graphics g){  
        super.paint(g);
        int numberOfLetters = game.getWordLength();
        int x1 = 70;
        int x2 = 110;
        int y = 270;
        
        for(int i = 0; i< numberOfLetters; i++){
            x1 = x2+5;
            x2 += 50;
            int test = (x1+x2)/2;
            g.drawLine(x1+5,y,x2,y);
            System.out.println(x1+5 +" "+ y +" "+ " " + x2+ " "+y);
        }
    }
    
    //Method: drawAnswers
    //purpose: this method sets up jlabels above drawnlines for replacing text with after a correct answer is guessed.
    private void drawAnswers(){
        final int y = 40;
        JLabel lb1 = new JLabel();
        JLabel lb2 = new JLabel();
        JLabel lb3 = new JLabel();
        JLabel lb4 = new JLabel();
        JLabel lb5 = new JLabel();
        JLabel lb6 = new JLabel();
        JLabel lb7 = new JLabel();
        JLabel lb8 = new JLabel();
        
        textPanel.add(lb1);
            lb1.setSize(10,10);
            lb1.setText("A");
        textPanel.add(lb2);
            lb2.setSize(10,10);
            lb2.setText("B");
        textPanel.add(lb3);
            lb3.setSize(10,10);
            lb3.setText("C");
        textPanel.add(lb4);
            lb4.setSize(10,10);
        textPanel.add(lb5);
            lb5.setSize(10,10);
        textPanel.add(lb6);
            lb6.setSize(10,10);
        textPanel.add(lb7);
            lb7.setSize(10,10);
        textPanel.add(lb8);
            lb8.setSize(10,10);
        
        lb1.setLocation(120,y);
        lb2.setLocation(170,y);
        lb3.setLocation(220,y);
        lb4.setLocation(270,y);
        lb5.setLocation(320,y);
        lb6.setLocation(370,y);
        lb7.setLocation(420,y);
        lb8.setLocation(470,y);     
    }
    @Override
    public void paint(Graphics g) {
        drawLetterLines(g);
        drawAnswers();
    
   
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
    //Method: helpButton
    //purpose: this method diposes the current frame and opens the Help menu, used for game instructions.
    private void helpButton(){
        dispose();
        new HelpFrame().setVisible(true);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gamePanel = new javax.swing.JPanel();
        namePlaceHolder = new javax.swing.JLabel();
        datePlaceHolder = new javax.swing.JLabel();
        timePlaceHolder = new javax.swing.JLabel();
        hangPanel = new javax.swing.JPanel();
        textPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        AButton = new javax.swing.JButton();
        BButton = new javax.swing.JButton();
        CButton = new javax.swing.JButton();
        DButton = new javax.swing.JButton();
        EButton = new javax.swing.JButton();
        FButton = new javax.swing.JButton();
        GButton = new javax.swing.JButton();
        HButton = new javax.swing.JButton();
        IButton = new javax.swing.JButton();
        JButton = new javax.swing.JButton();
        KButton = new javax.swing.JButton();
        LButton = new javax.swing.JButton();
        MButton = new javax.swing.JButton();
        NButton = new javax.swing.JButton();
        OButton = new javax.swing.JButton();
        PButton = new javax.swing.JButton();
        QButton = new javax.swing.JButton();
        RButton = new javax.swing.JButton();
        SButton = new javax.swing.JButton();
        TButton = new javax.swing.JButton();
        UButton = new javax.swing.JButton();
        VButton = new javax.swing.JButton();
        WButton = new javax.swing.JButton();
        YButton = new javax.swing.JButton();
        XButton = new javax.swing.JButton();
        ZButton = new javax.swing.JButton();
        helpButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setPreferredSize(new java.awt.Dimension(600, 400));
        setResizable(false);
        getContentPane().setLayout(null);

        gamePanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        gamePanel.setPreferredSize(new java.awt.Dimension(600, 200));
        gamePanel.setLayout(null);

        namePlaceHolder.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        namePlaceHolder.setText("HANGMAN");
        gamePanel.add(namePlaceHolder);
        namePlaceHolder.setBounds(2, 2, 55, 14);

        datePlaceHolder.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        datePlaceHolder.setText("DATEPLACEHOLDER");
        gamePanel.add(datePlaceHolder);
        datePlaceHolder.setBounds(400, 0, 100, 14);

        timePlaceHolder.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        timePlaceHolder.setText("TIMEPLACEHOLDER");
        gamePanel.add(timePlaceHolder);
        timePlaceHolder.setBounds(510, 0, 70, 14);

        hangPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        gamePanel.add(hangPanel);
        hangPanel.setBounds(10, 20, 580, 170);

        textPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        textPanel.setLayout(null);
        gamePanel.add(textPanel);
        textPanel.setBounds(10, 190, 580, 60);

        getContentPane().add(gamePanel);
        gamePanel.setBounds(0, 0, 600, 260);

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(new java.awt.GridLayout(2, 0, 0, 5));

        AButton.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        AButton.setText("A");
        AButton.setToolTipText("A button");
        AButton.setAlignmentY(0.0F);
        AButton.setFocusPainted(false);
        AButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AButtonActionPerformed(evt);
            }
        });
        jPanel1.add(AButton);

        BButton.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        BButton.setText(" B");
        BButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BButtonActionPerformed(evt);
            }
        });
        jPanel1.add(BButton);

        CButton.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        CButton.setText("C");
        CButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CButtonActionPerformed(evt);
            }
        });
        jPanel1.add(CButton);

        DButton.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        DButton.setText("D");
        jPanel1.add(DButton);

        EButton.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        EButton.setText("E");
        jPanel1.add(EButton);

        FButton.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        FButton.setText("F");
        jPanel1.add(FButton);

        GButton.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        GButton.setText("G");
        jPanel1.add(GButton);

        HButton.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        HButton.setText(" H");
        jPanel1.add(HButton);

        IButton.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        IButton.setText("I");
        jPanel1.add(IButton);

        JButton.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        JButton.setText("J");
        jPanel1.add(JButton);

        KButton.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        KButton.setText("K");
        jPanel1.add(KButton);

        LButton.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        LButton.setText("L");
        LButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LButtonActionPerformed(evt);
            }
        });
        jPanel1.add(LButton);

        MButton.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        MButton.setText("M");
        jPanel1.add(MButton);

        NButton.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        NButton.setText("N");
        jPanel1.add(NButton);

        OButton.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        OButton.setText("O");
        jPanel1.add(OButton);

        PButton.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        PButton.setText("P");
        jPanel1.add(PButton);

        QButton.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        QButton.setText("Q");
        jPanel1.add(QButton);

        RButton.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        RButton.setText("R");
        jPanel1.add(RButton);

        SButton.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        SButton.setText("S");
        jPanel1.add(SButton);

        TButton.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        TButton.setText("T");
        jPanel1.add(TButton);

        UButton.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        UButton.setText("U");
        jPanel1.add(UButton);

        VButton.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        VButton.setText("V");
        jPanel1.add(VButton);

        WButton.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        WButton.setText("w");
        WButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WButtonActionPerformed(evt);
            }
        });
        jPanel1.add(WButton);

        YButton.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        YButton.setText("Y");
        YButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YButtonActionPerformed(evt);
            }
        });
        jPanel1.add(YButton);

        XButton.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        XButton.setText("X");
        XButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                XButtonActionPerformed(evt);
            }
        });
        jPanel1.add(XButton);

        ZButton.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        ZButton.setText("Z");
        ZButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ZButtonActionPerformed(evt);
            }
        });
        jPanel1.add(ZButton);

        helpButton.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        helpButton.setText("?");
        helpButton.setPreferredSize(new java.awt.Dimension(20, 20));
        helpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helpButtonActionPerformed(evt);
            }
        });
        jPanel1.add(helpButton);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 260, 600, 110);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void helpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_helpButtonActionPerformed
           helpButton();        // TODO add your handling code here:
    }//GEN-LAST:event_helpButtonActionPerformed

    private void WButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_WButtonActionPerformed

    private void YButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_YButtonActionPerformed

    private void CButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CButtonActionPerformed

    private void LButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LButtonActionPerformed

    private void AButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AButtonActionPerformed
       game.guessLetter('a');
       AButton.setEnabled(false);
    }//GEN-LAST:event_AButtonActionPerformed

    private void ZButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ZButtonActionPerformed
        // TODO add your handling code here:
         ZButton.setEnabled(false);
    }//GEN-LAST:event_ZButtonActionPerformed

    private void XButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_XButtonActionPerformed
        // TODO add your handling code here:
         XButton.setEnabled(false);
    }//GEN-LAST:event_XButtonActionPerformed

    private void BButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BButtonActionPerformed
        // TODO add your handling code here:
         BButton.setEnabled(false);
    }//GEN-LAST:event_BButtonActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AButton;
    private javax.swing.JButton BButton;
    private javax.swing.JButton CButton;
    private javax.swing.JButton DButton;
    private javax.swing.JButton EButton;
    private javax.swing.JButton FButton;
    private javax.swing.JButton GButton;
    private javax.swing.JButton HButton;
    private javax.swing.JButton IButton;
    private javax.swing.JButton JButton;
    private javax.swing.JButton KButton;
    private javax.swing.JButton LButton;
    private javax.swing.JButton MButton;
    private javax.swing.JButton NButton;
    private javax.swing.JButton OButton;
    private javax.swing.JButton PButton;
    private javax.swing.JButton QButton;
    private javax.swing.JButton RButton;
    private javax.swing.JButton SButton;
    private javax.swing.JButton TButton;
    private javax.swing.JButton UButton;
    private javax.swing.JButton VButton;
    private javax.swing.JButton WButton;
    private javax.swing.JButton XButton;
    private javax.swing.JButton YButton;
    private javax.swing.JButton ZButton;
    private javax.swing.JLabel datePlaceHolder;
    private javax.swing.JPanel gamePanel;
    private javax.swing.JPanel hangPanel;
    private javax.swing.JButton helpButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel namePlaceHolder;
    private javax.swing.JPanel textPanel;
    private javax.swing.JLabel timePlaceHolder;
    // End of variables declaration//GEN-END:variables

    
}
