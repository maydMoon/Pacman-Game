package pacman_menu;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import pacmangame.GameEngine;
import pacmangame.Sound;

public class menu extends javax.swing.JFrame {
    private GameEngine gameEngine;
    public static JFrame Game;
    private int volume;
    Sound menuMusic;
    
    public menu(){
        initComponents();
        this.volume = 2;
        this.setResizable(false);
        this.menuMusic = new Sound("/music/menu_music.wav");
        this.menuMusic.setVolume(0.5);
        //volume_bar.setValue(50);
        this.menuMusic.loop();
        
        this.Game = new JFrame();
        this.gameEngine = new GameEngine();
        this.Game.add(gameEngine);
        this.Game.setTitle("Pacman");
        this.Game.setIconImage(new javax.swing.ImageIcon(getClass().getResource("/menu_images/incon_page.png")).getImage());
        this.Game.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.Game.pack();
    }
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background_01 = new javax.swing.JPanel();
        incon_image = new javax.swing.JLabel();
        start_button = new javax.swing.JButton();
        controls_button = new javax.swing.JButton();
        info_button = new javax.swing.JButton();
        exit_button = new javax.swing.JButton();
        ranking_button = new javax.swing.JButton();
        volume_button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pacman");
        setBackground(new java.awt.Color(0, 0, 0));
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/menu_images/incon_page.png")).getImage());

        background_01.setBackground(new java.awt.Color(0, 0, 0));
        background_01.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        background_01.setMaximumSize(new java.awt.Dimension(900, 600));

        incon_image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menu_images/noname-crop.png"))); // NOI18N

        start_button.setBackground(new java.awt.Color(0, 0, 0));
        start_button.setFont(new java.awt.Font("CrackMan", 0, 24)); // NOI18N
        start_button.setForeground(new java.awt.Color(118, 203, 218));
        start_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menu_images/play_button.png"))); // NOI18N
        start_button.setText("START GAME");
        start_button.setToolTipText("");
        start_button.setBorder(null);
        start_button.setBorderPainted(false);
        start_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        start_button.setDefaultCapable(false);
        start_button.setFocusPainted(false);
        start_button.setFocusable(false);
        start_button.setMargin(null);
        start_button.setNextFocusableComponent(background_01);
        start_button.setPreferredSize(new java.awt.Dimension(103, 23));
        start_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                start_buttonActionPerformed(evt);
            }
        });

        controls_button.setBackground(new java.awt.Color(0, 0, 0));
        controls_button.setFont(new java.awt.Font("CrackMan", 0, 24)); // NOI18N
        controls_button.setForeground(new java.awt.Color(252, 199, 64));
        controls_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menu_images/controls_button.png"))); // NOI18N
        controls_button.setText("CONTROLS");
        controls_button.setBorderPainted(false);
        controls_button.setDefaultCapable(false);
        controls_button.setFocusPainted(false);
        controls_button.setFocusable(false);
        controls_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                controls_buttonActionPerformed(evt);
            }
        });

        info_button.setBackground(new java.awt.Color(0, 0, 0));
        info_button.setFont(new java.awt.Font("CrackMan", 0, 24)); // NOI18N
        info_button.setForeground(new java.awt.Color(118, 203, 218));
        info_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menu_images/about_button.png"))); // NOI18N
        info_button.setText("INFO");
        info_button.setBorderPainted(false);
        info_button.setDefaultCapable(false);
        info_button.setFocusPainted(false);
        info_button.setFocusable(false);
        info_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                info_buttonActionPerformed(evt);
            }
        });

        exit_button.setBackground(new java.awt.Color(0, 0, 0));
        exit_button.setFont(new java.awt.Font("CrackMan", 0, 24)); // NOI18N
        exit_button.setForeground(new java.awt.Color(238, 43, 42));
        exit_button.setText(" EXIT");
        exit_button.setBorderPainted(false);
        exit_button.setDefaultCapable(false);
        exit_button.setFocusPainted(false);
        exit_button.setFocusable(false);
        exit_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit_buttonActionPerformed(evt);
            }
        });

        ranking_button.setBackground(new java.awt.Color(0, 0, 0));
        ranking_button.setFont(new java.awt.Font("CrackMan", 0, 24)); // NOI18N
        ranking_button.setForeground(new java.awt.Color(238, 43, 42));
        ranking_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menu_images/ranking_button.png"))); // NOI18N
        ranking_button.setToolTipText("");
        ranking_button.setBorder(null);
        ranking_button.setBorderPainted(false);
        ranking_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ranking_button.setDefaultCapable(false);
        ranking_button.setFocusPainted(false);
        ranking_button.setFocusable(false);
        ranking_button.setLabel("RANKING");
        ranking_button.setMargin(null);
        ranking_button.setNextFocusableComponent(background_01);
        ranking_button.setPreferredSize(new java.awt.Dimension(103, 23));
        ranking_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ranking_buttonActionPerformed(evt);
            }
        });

        volume_button.setBackground(new java.awt.Color(0, 0, 0));
        volume_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menu_images/volume_2.png"))); // NOI18N
        volume_button.setBorderPainted(false);
        volume_button.setFocusable(false);
        volume_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volume_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout background_01Layout = new javax.swing.GroupLayout(background_01);
        background_01.setLayout(background_01Layout);
        background_01Layout.setHorizontalGroup(
            background_01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(background_01Layout.createSequentialGroup()
                .addGroup(background_01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(background_01Layout.createSequentialGroup()
                        .addGap(313, 313, 313)
                        .addGroup(background_01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ranking_button, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(start_button, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(controls_button, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(info_button, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(exit_button, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(background_01Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(volume_button, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, background_01Layout.createSequentialGroup()
                .addGap(0, 68, Short.MAX_VALUE)
                .addComponent(incon_image, javax.swing.GroupLayout.PREFERRED_SIZE, 766, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
        );
        background_01Layout.setVerticalGroup(
            background_01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(background_01Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(volume_button)
                .addGap(8, 8, 8)
                .addComponent(incon_image)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(start_button, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ranking_button, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(controls_button, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(info_button, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(exit_button, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        start_button.getAccessibleContext().setAccessibleDescription("Press here to start the game");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background_01, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background_01, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void start_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_start_buttonActionPerformed
        this.menuMusic.stop();
        this.Game.setResizable(false);
        this.Game.setLocationRelativeTo(null);
        this.setVisible(false);
        this.Game.setVisible(true);
        this.gameEngine.start();

    }//GEN-LAST:event_start_buttonActionPerformed

    private void controls_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_controls_buttonActionPerformed
        new controls().setVisible(true); //set visible the jframe controls 
    }//GEN-LAST:event_controls_buttonActionPerformed

    private void info_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_info_buttonActionPerformed
        new info().setVisible(true); //set visible the jframe info 
    }//GEN-LAST:event_info_buttonActionPerformed
 
    private void exit_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit_buttonActionPerformed
        System.exit(0); //ends execution
    }//GEN-LAST:event_exit_buttonActionPerformed

    private void ranking_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ranking_buttonActionPerformed
        try {
            new ranking().setVisible(true); //set visible the jframe ranking 
        } catch (IOException ex) {
            Logger.getLogger(menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ranking_buttonActionPerformed

    private void volume_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volume_buttonActionPerformed
        switch (this.volume) {
            case 0 -> {
                this.menuMusic.stop();
                this.menuMusic.setVolume(1);
                this.menuMusic.resume();
                this.volume = 3;
                volume_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menu_images/volume_3.png")));
            }
            case 1 -> {
                this.menuMusic.stop();
                this.menuMusic.setVolume(0);
                this.menuMusic.resume();
                this.volume = 0;
                volume_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menu_images/volume_0.png")));
            }
            case 2 -> {
                this.menuMusic.stop();
                this.menuMusic.setVolume(0.3);
                this.menuMusic.resume();
                this.volume = 1;
                volume_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menu_images/volume_1.png")));
            }
            case 3 -> {
                this.menuMusic.stop();
                this.menuMusic.setVolume(0.5);
                this.menuMusic.resume();
                this.volume = 2;
                volume_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menu_images/volume_2.png")));
            }
            default -> {
            }
        }
        //System.out.println(volume);
    }//GEN-LAST:event_volume_buttonActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows Classic".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() { 
                new menu().setVisible(true);
                
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background_01;
    private javax.swing.JButton controls_button;
    private javax.swing.JButton exit_button;
    private javax.swing.JLabel incon_image;
    private javax.swing.JButton info_button;
    private javax.swing.JButton ranking_button;
    private javax.swing.JButton start_button;
    private javax.swing.JButton volume_button;
    // End of variables declaration//GEN-END:variables
}
