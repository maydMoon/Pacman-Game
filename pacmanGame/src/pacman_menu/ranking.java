package pacman_menu;
import java.awt.Color;
import java.awt.Font;
import javax.swing.table.DefaultTableModel;
import java.io.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class ranking extends javax.swing.JFrame implements FileManage {
    ArrayList nicknames;
    ArrayList scores;
    
    public ranking() throws IOException {
        nicknames = new ArrayList();
        scores = new ArrayList();
        initComponents();
        this.setResizable(false);
        readFile(nicknames, scores);
           
        table_rankingStyle(); //define table style settings
        DefaultTableModel ranking_model = new DefaultTableModel(new Object[]{"", ""}, 0);
        for (int i = 0; i < nicknames.size(); i++) { //runs theought the array
                //creates the line object and inserts the data on the line for all players (one per line)
                Object line [] = new Object[]{nicknames.get(i).toString(), scores.get(i).toString()};
                //add the line to the model
                ranking_model.addRow(line);
            }
        tableRanking.setModel(ranking_model);
        tableRanking.setEnabled(false);
    }
    
    @Override
    public void readFile(ArrayList nicknames, ArrayList scores) throws IOException {
        FileManage.super.readFile(nicknames, scores);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        background_ranking = new javax.swing.JPanel();
        title_ranking = new javax.swing.JLabel();
        button_back = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableRanking = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pacman Ranking");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/menu_images/incon_page.png")).getImage());
        setName("Pacman Ranking"); // NOI18N

        background_ranking.setBackground(new java.awt.Color(0, 0, 0));
        background_ranking.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(238, 43, 42)));
        background_ranking.setMaximumSize(new java.awt.Dimension(900, 600));

        title_ranking.setFont(new java.awt.Font("CrackMan", 0, 48)); // NOI18N
        title_ranking.setForeground(new java.awt.Color(238, 43, 42));
        title_ranking.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menu_images/ranking_button.png"))); // NOI18N
        title_ranking.setText("RANKING");

        button_back.setBackground(new java.awt.Color(0, 0, 0));
        button_back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menu_images/back_red.png"))); // NOI18N
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

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(238, 43, 42)));
        jPanel1.setFocusable(false);

        tableRanking.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NAME:", "SCORE:"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableRanking.setOpaque(false);
        jScrollPane1.setViewportView(tableRanking);
        if (tableRanking.getColumnModel().getColumnCount() > 0) {
            tableRanking.getColumnModel().getColumn(0).setResizable(false);
            tableRanking.getColumnModel().getColumn(1).setResizable(false);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 696, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("CrackMan", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("NAME:");

        jLabel2.setFont(new java.awt.Font("CrackMan", 3, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("SCORE:");

        javax.swing.GroupLayout background_rankingLayout = new javax.swing.GroupLayout(background_ranking);
        background_ranking.setLayout(background_rankingLayout);
        background_rankingLayout.setHorizontalGroup(
            background_rankingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(background_rankingLayout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addGroup(background_rankingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(background_rankingLayout.createSequentialGroup()
                        .addGap(219, 219, 219)
                        .addComponent(title_ranking)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(button_back, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(background_rankingLayout.createSequentialGroup()
                        .addGroup(background_rankingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, background_rankingLayout.createSequentialGroup()
                                .addGap(106, 106, 106)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(173, 173, 173)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 86, Short.MAX_VALUE)))
                .addContainerGap())
        );
        background_rankingLayout.setVerticalGroup(
            background_rankingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(background_rankingLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(background_rankingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(title_ranking, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(button_back, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(60, 60, 60)
                .addGroup(background_rankingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        button_back.getAccessibleContext().setAccessibleName("Back");
        button_back.getAccessibleContext().setAccessibleDescription("go back to menu");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background_ranking, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(background_ranking, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private void table_rankingStyle(){
        tableRanking.setRowHeight(45);
        
        tableRanking.setShowGrid(true);
        tableRanking.setGridColor(Color.red);

        tableRanking.setBackground(Color.BLACK);
        tableRanking.setForeground(Color.WHITE);
        
        tableRanking.setSelectionBackground(Color.WHITE);
        tableRanking.setSelectionForeground(Color.BLACK);
        
        tableRanking.setFont(new Font("Comic Sans MS", Font.ITALIC, 24)); 
    }    
    
    private void button_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_backActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_button_backActionPerformed

    public static void main(String args[]) {
        /* Set the Windows Classic look and feel */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows Classic".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ranking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ranking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ranking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ranking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new ranking().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(ranking.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });   
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background_ranking;
    private javax.swing.JButton button_back;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable tableRanking;
    private javax.swing.JLabel title_ranking;
    // End of variables declaration//GEN-END:variables
    
    //unnused method
    @Override
    public void saveFile() {
        
    }

  

}
