package pacman_menu;

public class info extends javax.swing.JFrame {

    public info() {
        initComponents();
        this.setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background_info = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        button_back = new javax.swing.JButton();
        ghosts_background = new javax.swing.JPanel();
        blinky = new javax.swing.JLabel();
        inky = new javax.swing.JLabel();
        clyde = new javax.swing.JLabel();
        pinky = new javax.swing.JLabel();
        rules_background = new javax.swing.JPanel();
        rules_title_text = new javax.swing.JLabel();
        text_rules1 = new javax.swing.JLabel();
        text_rules2 = new javax.swing.JLabel();
        text_rules3 = new javax.swing.JLabel();
        text_rules4 = new javax.swing.JLabel();
        text_rules5 = new javax.swing.JLabel();
        text_rules6 = new javax.swing.JLabel();
        text_rules7 = new javax.swing.JLabel();
        text_rules8 = new javax.swing.JLabel();
        text_rules9 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        text_rules10 = new javax.swing.JLabel();
        credits_background = new javax.swing.JPanel();
        Credits_title_text = new javax.swing.JLabel();
        text_credits1 = new javax.swing.JLabel();
        text_credits2 = new javax.swing.JLabel();
        text_credits3 = new javax.swing.JLabel();
        text_credits4 = new javax.swing.JLabel();
        text_credits5 = new javax.swing.JLabel();
        text_credits6 = new javax.swing.JLabel();
        text_credits7 = new javax.swing.JLabel();
        text_credits8 = new javax.swing.JLabel();
        text_credits9 = new javax.swing.JLabel();
        text_credits10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pacman Info");
        setBackground(new java.awt.Color(0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/menu_images/incon_page.png")).getImage());

        background_info.setBackground(new java.awt.Color(0, 0, 0));
        background_info.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(118, 203, 218)));

        jLabel1.setFont(new java.awt.Font("CrackMan", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(118, 203, 218));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menu_images/about_button.png"))); // NOI18N
        jLabel1.setText("INFO");

        button_back.setBackground(new java.awt.Color(0, 0, 0));
        button_back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menu_images/back_blue.png"))); // NOI18N
        button_back.setText("jButton1");
        button_back.setActionCommand("Back");
        button_back.setBorderPainted(false);
        button_back.setDefaultCapable(false);
        button_back.setFocusPainted(false);
        button_back.setFocusable(false);
        button_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_backActionPerformed(evt);
            }
        });

        ghosts_background.setBackground(new java.awt.Color(0, 0, 0));
        ghosts_background.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(118, 203, 218)));

        blinky.setFont(new java.awt.Font("CrackMan", 0, 36)); // NOI18N
        blinky.setForeground(new java.awt.Color(216, 35, 40));
        blinky.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menu_images/blinky.png"))); // NOI18N
        blinky.setText("Blinky");

        inky.setFont(new java.awt.Font("CrackMan", 0, 36)); // NOI18N
        inky.setForeground(new java.awt.Color(40, 164, 217));
        inky.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menu_images/inky.png"))); // NOI18N
        inky.setText("Inky");

        clyde.setFont(new java.awt.Font("CrackMan", 0, 36)); // NOI18N
        clyde.setForeground(new java.awt.Color(229, 128, 36));
        clyde.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menu_images/clyde.png"))); // NOI18N
        clyde.setText("Clyde");

        pinky.setFont(new java.awt.Font("CrackMan", 0, 36)); // NOI18N
        pinky.setForeground(new java.awt.Color(232, 153, 175));
        pinky.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menu_images/pinky.png"))); // NOI18N
        pinky.setText("Pinky");

        javax.swing.GroupLayout ghosts_backgroundLayout = new javax.swing.GroupLayout(ghosts_background);
        ghosts_background.setLayout(ghosts_backgroundLayout);
        ghosts_backgroundLayout.setHorizontalGroup(
            ghosts_backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(blinky, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
            .addComponent(clyde, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pinky, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(inky, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        ghosts_backgroundLayout.setVerticalGroup(
            ghosts_backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ghosts_backgroundLayout.createSequentialGroup()
                .addComponent(blinky)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inky, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(clyde)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pinky)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        rules_background.setBackground(new java.awt.Color(0, 0, 0));
        rules_background.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(118, 203, 218)));

        rules_title_text.setFont(new java.awt.Font("CrackMan", 0, 24)); // NOI18N
        rules_title_text.setForeground(new java.awt.Color(255, 255, 255));
        rules_title_text.setText("rules");

        text_rules1.setFont(new java.awt.Font("Comic Sans MS", 3, 11)); // NOI18N
        text_rules1.setForeground(new java.awt.Color(255, 255, 255));
        text_rules1.setText("Your goal is to get the highest score, ");

        text_rules2.setFont(new java.awt.Font("Comic Sans MS", 3, 11)); // NOI18N
        text_rules2.setForeground(new java.awt.Color(255, 255, 255));
        text_rules2.setText("you can do this by eating all the existing ");

        text_rules3.setFont(new java.awt.Font("Comic Sans MS", 3, 11)); // NOI18N
        text_rules3.setForeground(new java.awt.Color(255, 255, 255));
        text_rules3.setText("tablets on the map without being reached ");

        text_rules4.setFont(new java.awt.Font("Comic Sans MS", 3, 11)); // NOI18N
        text_rules4.setForeground(new java.awt.Color(255, 255, 255));
        text_rules4.setText("by the ghosts.");

        text_rules5.setFont(new java.awt.Font("CrackMan", 3, 14)); // NOI18N
        text_rules5.setForeground(new java.awt.Color(255, 255, 255));
        text_rules5.setText("Some important points:");

        text_rules6.setFont(new java.awt.Font("Comic Sans MS", 3, 11)); // NOI18N
        text_rules6.setForeground(new java.awt.Color(255, 255, 255));
        text_rules6.setText("Each ghost has a different pattern of chase,");

        text_rules7.setFont(new java.awt.Font("Comic Sans MS", 3, 11)); // NOI18N
        text_rules7.setForeground(new java.awt.Color(255, 255, 255));
        text_rules7.setText("watch out!");

        text_rules8.setFont(new java.awt.Font("Comic Sans MS", 3, 11)); // NOI18N
        text_rules8.setForeground(new java.awt.Color(255, 255, 255));
        text_rules8.setText("You can \"eat\" the ghosts after eating a ");

        text_rules9.setFont(new java.awt.Font("Comic Sans MS", 3, 11)); // NOI18N
        text_rules9.setForeground(new java.awt.Color(255, 255, 255));
        text_rules9.setText("super pill, 5 of them are distributed");

        jLabel16.setFont(new java.awt.Font("Comic Sans MS", 3, 11)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("around the map.");

        text_rules10.setFont(new java.awt.Font("CrackMan", 3, 24)); // NOI18N
        text_rules10.setForeground(new java.awt.Color(255, 255, 255));
        text_rules10.setText("Have    fun!");

        javax.swing.GroupLayout rules_backgroundLayout = new javax.swing.GroupLayout(rules_background);
        rules_background.setLayout(rules_backgroundLayout);
        rules_backgroundLayout.setHorizontalGroup(
            rules_backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rules_backgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(rules_backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(rules_backgroundLayout.createSequentialGroup()
                        .addGroup(rules_backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(rules_backgroundLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(text_rules1))
                            .addComponent(text_rules6)
                            .addGroup(rules_backgroundLayout.createSequentialGroup()
                                .addGap(73, 73, 73)
                                .addComponent(text_rules4)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(rules_backgroundLayout.createSequentialGroup()
                        .addGroup(rules_backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(text_rules3)
                            .addComponent(text_rules2))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(rules_backgroundLayout.createSequentialGroup()
                .addGroup(rules_backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(rules_backgroundLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(text_rules5))
                    .addGroup(rules_backgroundLayout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(text_rules7))
                    .addGroup(rules_backgroundLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(rules_backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(text_rules8)
                            .addGroup(rules_backgroundLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(rules_backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(text_rules9)
                                    .addGroup(rules_backgroundLayout.createSequentialGroup()
                                        .addGap(19, 19, 19)
                                        .addComponent(text_rules10))))))
                    .addGroup(rules_backgroundLayout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jLabel16))
                    .addGroup(rules_backgroundLayout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(rules_title_text)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        rules_backgroundLayout.setVerticalGroup(
            rules_backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rules_backgroundLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(rules_title_text)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(text_rules1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(text_rules2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(text_rules3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(text_rules4)
                .addGap(18, 18, 18)
                .addComponent(text_rules5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(text_rules6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(text_rules7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(text_rules8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(text_rules9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16)
                .addGap(18, 18, 18)
                .addComponent(text_rules10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        credits_background.setBackground(new java.awt.Color(0, 0, 0));
        credits_background.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(118, 203, 218)));

        Credits_title_text.setFont(new java.awt.Font("CrackMan", 0, 24)); // NOI18N
        Credits_title_text.setForeground(new java.awt.Color(255, 255, 255));
        Credits_title_text.setText("CRedits");

        text_credits1.setFont(new java.awt.Font("Comic Sans MS", 3, 11)); // NOI18N
        text_credits1.setForeground(new java.awt.Color(255, 255, 255));
        text_credits1.setText("All rights reserved to Namco");

        text_credits2.setFont(new java.awt.Font("Comic Sans MS", 3, 11)); // NOI18N
        text_credits2.setForeground(new java.awt.Color(255, 255, 255));
        text_credits2.setText("and the game developer Tōru Iwatani.");

        text_credits3.setFont(new java.awt.Font("CrackMan", 3, 18)); // NOI18N
        text_credits3.setForeground(new java.awt.Color(255, 255, 255));
        text_credits3.setText("game  Programmers:");

        text_credits4.setFont(new java.awt.Font("Comic Sans MS", 3, 11)); // NOI18N
        text_credits4.setForeground(new java.awt.Color(255, 255, 255));
        text_credits4.setText("Mateus Valerio : computer science student ");

        text_credits5.setFont(new java.awt.Font("Comic Sans MS", 3, 11)); // NOI18N
        text_credits5.setForeground(new java.awt.Color(255, 255, 255));
        text_credits5.setText("Maylla Krislainy : computer science student ");

        text_credits6.setFont(new java.awt.Font("Comic Sans MS", 3, 11)); // NOI18N
        text_credits6.setForeground(new java.awt.Color(255, 255, 255));
        text_credits6.setText("both from the 4th semester.");

        text_credits7.setFont(new java.awt.Font("Comic Sans MS", 3, 11)); // NOI18N
        text_credits7.setForeground(new java.awt.Color(255, 255, 255));
        text_credits7.setText("This game was developed as a final ");

        text_credits8.setFont(new java.awt.Font("Comic Sans MS", 3, 11)); // NOI18N
        text_credits8.setForeground(new java.awt.Color(255, 255, 255));
        text_credits8.setText("project in the field of ");

        text_credits9.setFont(new java.awt.Font("Comic Sans MS", 3, 11)); // NOI18N
        text_credits9.setForeground(new java.awt.Color(255, 255, 255));
        text_credits9.setText("Programming Techniques 1. ");

        text_credits10.setFont(new java.awt.Font("CrackMan", 3, 24)); // NOI18N
        text_credits10.setForeground(new java.awt.Color(255, 255, 255));
        text_credits10.setText("2020/2");

        javax.swing.GroupLayout credits_backgroundLayout = new javax.swing.GroupLayout(credits_background);
        credits_background.setLayout(credits_backgroundLayout);
        credits_backgroundLayout.setHorizontalGroup(
            credits_backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(credits_backgroundLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(text_credits6)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, credits_backgroundLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(credits_backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, credits_backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, credits_backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, credits_backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(text_credits3)
                                .addGroup(credits_backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, credits_backgroundLayout.createSequentialGroup()
                                        .addComponent(Credits_title_text)
                                        .addGap(82, 82, 82))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, credits_backgroundLayout.createSequentialGroup()
                                        .addComponent(text_credits1)
                                        .addGap(56, 56, 56))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, credits_backgroundLayout.createSequentialGroup()
                                        .addComponent(text_credits2)
                                        .addGap(29, 29, 29))))
                            .addGroup(credits_backgroundLayout.createSequentialGroup()
                                .addComponent(text_credits4)
                                .addContainerGap()))
                        .addGroup(credits_backgroundLayout.createSequentialGroup()
                            .addComponent(text_credits5)
                            .addContainerGap()))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, credits_backgroundLayout.createSequentialGroup()
                        .addComponent(text_credits7)
                        .addGap(32, 32, 32))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, credits_backgroundLayout.createSequentialGroup()
                        .addComponent(text_credits8)
                        .addGap(68, 68, 68))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, credits_backgroundLayout.createSequentialGroup()
                        .addComponent(text_credits10)
                        .addGap(84, 84, 84))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, credits_backgroundLayout.createSequentialGroup()
                        .addComponent(text_credits9)
                        .addGap(51, 51, 51))))
        );
        credits_backgroundLayout.setVerticalGroup(
            credits_backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(credits_backgroundLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(Credits_title_text)
                .addGap(18, 18, 18)
                .addComponent(text_credits1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(text_credits2)
                .addGap(18, 18, 18)
                .addComponent(text_credits3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(text_credits4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(text_credits5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(text_credits6)
                .addGap(18, 18, 18)
                .addComponent(text_credits7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(text_credits8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(text_credits9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(text_credits10)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout background_infoLayout = new javax.swing.GroupLayout(background_info);
        background_info.setLayout(background_infoLayout);
        background_infoLayout.setHorizontalGroup(
            background_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(background_infoLayout.createSequentialGroup()
                .addGap(367, 367, 367)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(button_back, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(background_infoLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(rules_background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(ghosts_background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(credits_background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(24, 24, 24))
        );
        background_infoLayout.setVerticalGroup(
            background_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, background_infoLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(background_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(button_back, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addGroup(background_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ghosts_background, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rules_background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(credits_background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(86, Short.MAX_VALUE))
        );

        button_back.getAccessibleContext().setAccessibleName("Back");
        button_back.getAccessibleContext().setAccessibleDescription("go back to menu");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background_info, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background_info, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void button_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_backActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_button_backActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows Classic".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new info().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Credits_title_text;
    private javax.swing.JPanel background_info;
    private javax.swing.JLabel blinky;
    private javax.swing.JButton button_back;
    private javax.swing.JLabel clyde;
    private javax.swing.JPanel credits_background;
    private javax.swing.JPanel ghosts_background;
    private javax.swing.JLabel inky;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel pinky;
    private javax.swing.JPanel rules_background;
    private javax.swing.JLabel rules_title_text;
    private javax.swing.JLabel text_credits1;
    private javax.swing.JLabel text_credits10;
    private javax.swing.JLabel text_credits2;
    private javax.swing.JLabel text_credits3;
    private javax.swing.JLabel text_credits4;
    private javax.swing.JLabel text_credits5;
    private javax.swing.JLabel text_credits6;
    private javax.swing.JLabel text_credits7;
    private javax.swing.JLabel text_credits8;
    private javax.swing.JLabel text_credits9;
    private javax.swing.JLabel text_rules1;
    private javax.swing.JLabel text_rules10;
    private javax.swing.JLabel text_rules2;
    private javax.swing.JLabel text_rules3;
    private javax.swing.JLabel text_rules4;
    private javax.swing.JLabel text_rules5;
    private javax.swing.JLabel text_rules6;
    private javax.swing.JLabel text_rules7;
    private javax.swing.JLabel text_rules8;
    private javax.swing.JLabel text_rules9;
    // End of variables declaration//GEN-END:variables
}
