package pacman_menu;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import pacmangame.GameEngine;

public class saveScore extends javax.swing.JFrame implements FileManage {
    
    public saveScore() {
        //menu.Game.setVisible(false);
        this.setResizable(false);
        menu.Game.dispose();
        initComponents();
        background2.setVisible(false); //set invisible this jpanel 
    }
    

    @Override
    public void saveFile() {
        String nickname = setNickname.getText(); //receceives the player's nickname
        String score = Integer.toString(GameEngine.score); //and your score
        FileManage.DIRECTORY.setWritable(true); //allows writing the writing of the file

        try {
            FileOutputStream output = new FileOutputStream(FileManage.DIRECTORY, FileManage.ATTACH); //if true add new text at the end of the file
            BufferedWriter bw = new BufferedWriter(
                    new OutputStreamWriter(output));
                    String playerScores = nickname + "_" + score + "\n"; //now has nickname and score in a single String, both are separated by ""
                    bw.write(playerScores); //write "playerScores" data to the file
                    bw.close(); 
        } catch (IOException ex) {
            Logger.getLogger(saveScore.class.getName()).log(Level.SEVERE, null, ex);
        }

        FileManage.DIRECTORY.setReadOnly(); //sets the file to read-only mode
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background1 = new javax.swing.JPanel();
        title1 = new javax.swing.JLabel();
        ttitle2 = new javax.swing.JLabel();
        no_button = new javax.swing.JButton();
        yes_button = new javax.swing.JButton();
        background2 = new javax.swing.JPanel();
        text = new javax.swing.JLabel();
        setNickname = new javax.swing.JTextField();
        save_button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pacman");
        setBackground(new java.awt.Color(0, 0, 0));
        setForeground(new java.awt.Color(0, 0, 0));
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/menu_images/incon_page.png")).getImage());

        background1.setBackground(new java.awt.Color(0, 0, 0));
        background1.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(255, 255, 255)));

        title1.setFont(new java.awt.Font("CrackMan", 0, 48)); // NOI18N
        title1.setForeground(new java.awt.Color(255, 255, 255));
        title1.setText("do you want");

        ttitle2.setFont(new java.awt.Font("CrackMan", 0, 48)); // NOI18N
        ttitle2.setForeground(new java.awt.Color(255, 255, 255));
        ttitle2.setText("to save your score?");

        no_button.setBackground(new java.awt.Color(0, 0, 0));
        no_button.setFont(new java.awt.Font("CrackMan", 0, 36)); // NOI18N
        no_button.setForeground(new java.awt.Color(238, 43, 42));
        no_button.setText("NO!");
        no_button.setAutoscrolls(true);
        no_button.setBorderPainted(false);
        no_button.setDefaultCapable(false);
        no_button.setFocusPainted(false);
        no_button.setFocusable(false);
        no_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                no_buttonActionPerformed(evt);
            }
        });

        yes_button.setBackground(new java.awt.Color(0, 0, 0));
        yes_button.setFont(new java.awt.Font("CrackMan", 0, 36)); // NOI18N
        yes_button.setForeground(new java.awt.Color(118, 203, 218));
        yes_button.setText("YES!");
        yes_button.setAutoscrolls(true);
        yes_button.setBorderPainted(false);
        yes_button.setDefaultCapable(false);
        yes_button.setFocusPainted(false);
        yes_button.setFocusable(false);
        yes_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yes_buttonActionPerformed(evt);
            }
        });

        background2.setBackground(new java.awt.Color(0, 0, 0));
        background2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        text.setFont(new java.awt.Font("CrackMan", 0, 36)); // NOI18N
        text.setForeground(new java.awt.Color(255, 255, 255));
        text.setText(" type your nickname:");

        setNickname.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        setNickname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setNicknameActionPerformed(evt);
            }
        });

        save_button.setBackground(new java.awt.Color(0, 0, 0));
        save_button.setFont(new java.awt.Font("CrackMan", 0, 36)); // NOI18N
        save_button.setForeground(new java.awt.Color(252, 199, 64));
        save_button.setText("SAVE");
        save_button.setAutoscrolls(true);
        save_button.setBorderPainted(false);
        save_button.setDefaultCapable(false);
        save_button.setFocusPainted(false);
        save_button.setFocusable(false);
        save_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout background2Layout = new javax.swing.GroupLayout(background2);
        background2.setLayout(background2Layout);
        background2Layout.setHorizontalGroup(
            background2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(background2Layout.createSequentialGroup()
                .addGroup(background2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(background2Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(text))
                    .addGroup(background2Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(setNickname, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(background2Layout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addComponent(save_button, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        background2Layout.setVerticalGroup(
            background2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(background2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(text)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(setNickname, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(save_button, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        setNickname.getAccessibleContext().setAccessibleDescription("type your nick here!");

        javax.swing.GroupLayout background1Layout = new javax.swing.GroupLayout(background1);
        background1.setLayout(background1Layout);
        background1Layout.setHorizontalGroup(
            background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(background1Layout.createSequentialGroup()
                .addGroup(background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(background1Layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addGroup(background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(background1Layout.createSequentialGroup()
                                .addComponent(yes_button, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(no_button, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(140, 140, 140))
                            .addComponent(ttitle2, javax.swing.GroupLayout.PREFERRED_SIZE, 595, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(background1Layout.createSequentialGroup()
                        .addGap(281, 281, 281)
                        .addComponent(title1))
                    .addGroup(background1Layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(background2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(128, Short.MAX_VALUE))
        );
        background1Layout.setVerticalGroup(
            background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(background1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(title1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ttitle2)
                .addGap(40, 40, 40)
                .addGroup(background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yes_button, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(no_button, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addComponent(background2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(86, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void no_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_no_buttonActionPerformed
        this.setVisible(false);
        new menu().setVisible(true); //just go back to menu
    }//GEN-LAST:event_no_buttonActionPerformed

    private void yes_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yes_buttonActionPerformed
        background2.setVisible(true); //set visible this jpanel whit its components        
    }//GEN-LAST:event_yes_buttonActionPerformed

    private void save_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save_buttonActionPerformed
        saveFile(); //call the method for saving rank
        this.setVisible(false);
        new menu().setVisible(true); //now go back to menu
    }//GEN-LAST:event_save_buttonActionPerformed

    private void setNicknameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setNicknameActionPerformed

    }//GEN-LAST:event_setNicknameActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows Classic".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(saveScore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(saveScore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(saveScore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(saveScore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new saveScore().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background1;
    private javax.swing.JPanel background2;
    private javax.swing.JButton no_button;
    private javax.swing.JButton save_button;
    private javax.swing.JTextField setNickname;
    private javax.swing.JLabel text;
    private javax.swing.JLabel title1;
    private javax.swing.JLabel ttitle2;
    private javax.swing.JButton yes_button;
    // End of variables declaration//GEN-END:variables


}
