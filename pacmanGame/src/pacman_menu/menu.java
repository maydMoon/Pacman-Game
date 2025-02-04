/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacman_menu;

import javax.swing.JFrame;
import pacmangame.GameEngine;

/**
 *
 * @author Cass.Nero
 */
public class menu extends javax.swing.JPanel {

    private GameEngine gameEngine;
    private JFrame Game;
    public menu() {
        initComponents();
        initComponents();
        this.Game = new JFrame();
        this.gameEngine = new GameEngine();
        this.Game.add(gameEngine);
        this.Game.setTitle("Pacman");
        this.Game.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.Game.pack();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background_3 = new javax.swing.JPanel();
        incon_image2 = new javax.swing.JLabel();
        start_button2 = new javax.swing.JButton();
        controls_button = new javax.swing.JButton();
        info_button = new javax.swing.JButton();
        exit_button = new javax.swing.JButton();
        ranking_button = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(900, 600));

        background_3.setBackground(new java.awt.Color(0, 0, 0));
        background_3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        background_3.setMaximumSize(new java.awt.Dimension(900, 600));

        incon_image2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/noname-crop.png"))); // NOI18N

        start_button2.setBackground(new java.awt.Color(0, 0, 0));
        start_button2.setFont(new java.awt.Font("CrackMan", 0, 24)); // NOI18N
        start_button2.setForeground(new java.awt.Color(118, 203, 218));
        start_button2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/play_button.png"))); // NOI18N
        start_button2.setText("START GAME");
        start_button2.setToolTipText("");
        start_button2.setBorder(null);
        start_button2.setBorderPainted(false);
        start_button2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        start_button2.setDefaultCapable(false);
        start_button2.setFocusPainted(false);
        start_button2.setFocusable(false);
        start_button2.setMargin(null);
        start_button2.setPreferredSize(new java.awt.Dimension(103, 23));
        start_button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                start_button2ActionPerformed(evt);
            }
        });

        controls_button.setBackground(new java.awt.Color(0, 0, 0));
        controls_button.setFont(new java.awt.Font("CrackMan", 0, 24)); // NOI18N
        controls_button.setForeground(new java.awt.Color(252, 199, 64));
        controls_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/controls_button.png"))); // NOI18N
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
        info_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/about_button.png"))); // NOI18N
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
        ranking_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/ranking_button.png"))); // NOI18N
        ranking_button.setToolTipText("");
        ranking_button.setBorder(null);
        ranking_button.setBorderPainted(false);
        ranking_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ranking_button.setDefaultCapable(false);
        ranking_button.setFocusPainted(false);
        ranking_button.setFocusable(false);
        ranking_button.setLabel("RANKING");
        ranking_button.setMargin(null);
        ranking_button.setPreferredSize(new java.awt.Dimension(103, 23));
        ranking_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ranking_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout background_3Layout = new javax.swing.GroupLayout(background_3);
        background_3.setLayout(background_3Layout);
        background_3Layout.setHorizontalGroup(
            background_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, background_3Layout.createSequentialGroup()
                .addContainerGap(102, Short.MAX_VALUE)
                .addComponent(incon_image2, javax.swing.GroupLayout.PREFERRED_SIZE, 766, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
            .addGroup(background_3Layout.createSequentialGroup()
                .addGap(319, 319, 319)
                .addGroup(background_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(start_button2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ranking_button, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(info_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(controls_button, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                    .addComponent(exit_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        background_3Layout.setVerticalGroup(
            background_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(background_3Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(incon_image2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(start_button2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ranking_button, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(controls_button, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(info_button, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(exit_button, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(90, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background_3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background_3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void start_button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_start_button2ActionPerformed
       this.Game.setResizable(false);
        this.Game.setLocationRelativeTo(null);
        this.setVisible(false);
        this.Game.setVisible(true);
        this.gameEngine.start();
    }//GEN-LAST:event_start_button2ActionPerformed

    private void controls_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_controls_buttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_controls_buttonActionPerformed

    private void info_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_info_buttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_info_buttonActionPerformed

    private void exit_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit_buttonActionPerformed
        System.exit(0); //fecha a execução
    }//GEN-LAST:event_exit_buttonActionPerformed

    private void ranking_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ranking_buttonActionPerformed
        new ranking().setVisible(true);
    }//GEN-LAST:event_ranking_buttonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background_01;
    private javax.swing.JPanel background_2;
    private javax.swing.JPanel background_3;
    private javax.swing.JButton controls_button;
    private javax.swing.JButton exit_button;
    private javax.swing.JLabel incon_image;
    private javax.swing.JLabel incon_image1;
    private javax.swing.JLabel incon_image2;
    private javax.swing.JButton info_button;
    private javax.swing.JButton ranking_button;
    private javax.swing.JButton start_button;
    private javax.swing.JButton start_button1;
    private javax.swing.JButton start_button2;
    // End of variables declaration//GEN-END:variables
}
