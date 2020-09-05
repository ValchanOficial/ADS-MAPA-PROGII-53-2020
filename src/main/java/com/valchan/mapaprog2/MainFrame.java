package com.valchan.mapaprog2;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

/**
 *
 * UNICESUMAR - Análise e Desenvolvimento de Sistemas
 * MAPA - ADS - PROGRAMAÇÃO II
 * Author: Valeria Padilha de Vargas
 * RA: 1910099-5
 * 
 */
public class MainFrame extends javax.swing.JFrame {
    private static final ArrayList<String> list = new ArrayList<String>();
    
    public MainFrame() {
        initComponents();
    }
    
    private void showAndRemoveItemFromList(List<String> matches, String text) {
        String item = matches.get(0);
        LBLSenhaChamada.setText(item);
        LBLCaixa.setText(text);
        MainFrame.list.removeIf(s -> s.equals(item));
    }
    
    private List<String> findItemsMatches(String categoria) {
        return MainFrame.list.stream().filter(it -> it.contains(categoria)).collect(Collectors.toList());
    }
    
    private void callClient(String categoria, String caixa) {
        List<String> matches = findItemsMatches(categoria);
        if(!matches.isEmpty() && !MainFrame.list.isEmpty()) {
            showAndRemoveItemFromList(matches, caixa);
        } else {
            if(!MainFrame.list.isEmpty()){
                showAndRemoveItemFromList(MainFrame.list, caixa);               
            }
        }
    }
    
    private void generatePasswordAndAddToList(String categoria) {
        Senha senha = new Senha();
        senha.setSenha(MainFrame.list, categoria);
        LBLSenha.setText(senha.toString());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        BTNComum = new javax.swing.JButton();
        BTNRapido = new javax.swing.JButton();
        BTNPrioritario = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        LBLSenha = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        BTNCx1 = new javax.swing.JButton();
        BTNCx2 = new javax.swing.JButton();
        BTNCx3 = new javax.swing.JButton();
        BTNCx4 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        LBLCaixa = new javax.swing.JLabel();
        LBLSenhaChamada = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MAPA ADS PROG II - VALERIA PADILHA DE VARGAS");
        setBackground(new java.awt.Color(214, 217, 223));
        setResizable(false);
        setSize(getPreferredSize());

        jPanel1.setBackground(new java.awt.Color(214, 217, 223));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setText("Escolha seu tipo de atendimento");

        BTNComum.setText("Comum");
        BTNComum.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTNComum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNComumActionPerformed(evt);
            }
        });

        BTNRapido.setText("Rápido");
        BTNRapido.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTNRapido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNRapidoActionPerformed(evt);
            }
        });

        BTNPrioritario.setText("Prioritário");
        BTNPrioritario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTNPrioritario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNPrioritarioActionPerformed(evt);
            }
        });

        jLabel7.setText("Sua senha é:");

        LBLSenha.setBackground(new java.awt.Color(255, 255, 255));
        LBLSenha.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LBLSenha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LBLSenha.setToolTipText("");
        LBLSenha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addComponent(jLabel7)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(BTNComum, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BTNRapido, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BTNPrioritario, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(LBLSenha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTNComum)
                    .addComponent(BTNRapido)
                    .addComponent(BTNPrioritario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LBLSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel2.setText("Para clientes:");

        jPanel2.setBackground(new java.awt.Color(214, 217, 223));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        BTNCx1.setText("Caixa 1");
        BTNCx1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTNCx1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNCx1ActionPerformed(evt);
            }
        });

        BTNCx2.setText("Caixa 2");
        BTNCx2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTNCx2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNCx2ActionPerformed(evt);
            }
        });

        BTNCx3.setText("Caixa 3");
        BTNCx3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTNCx3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNCx3ActionPerformed(evt);
            }
        });

        BTNCx4.setText("Caixa 4");
        BTNCx4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTNCx4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNCx4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BTNCx3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTNCx1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BTNCx4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTNCx2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTNCx1)
                    .addComponent(BTNCx2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTNCx3)
                    .addComponent(BTNCx4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel4.setText("Para caixas:");

        LBLCaixa.setFont(new java.awt.Font("Arial", 1, 45)); // NOI18N
        LBLCaixa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LBLCaixa.setText("Caixa");
        LBLCaixa.setToolTipText("");

        LBLSenhaChamada.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        LBLSenhaChamada.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LBLSenhaChamada.setText("Senha");
        LBLSenhaChamada.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(151, 151, 151))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
            .addComponent(LBLCaixa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(LBLSenhaChamada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LBLSenhaChamada, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LBLCaixa, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTNCx1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNCx1ActionPerformed
        callClient(Categoria.P, "Caixa 1");
    }//GEN-LAST:event_BTNCx1ActionPerformed

    private void BTNComumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNComumActionPerformed
        generatePasswordAndAddToList(Categoria.C);
    }//GEN-LAST:event_BTNComumActionPerformed

    private void BTNRapidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNRapidoActionPerformed
        generatePasswordAndAddToList(Categoria.R);
    }//GEN-LAST:event_BTNRapidoActionPerformed

    private void BTNPrioritarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNPrioritarioActionPerformed
        generatePasswordAndAddToList(Categoria.P);
    }//GEN-LAST:event_BTNPrioritarioActionPerformed

    private void BTNCx2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNCx2ActionPerformed
        callClient(Categoria.R, "Caixa 2");
    }//GEN-LAST:event_BTNCx2ActionPerformed

    private void BTNCx3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNCx3ActionPerformed
        callClient(Categoria.R, "Caixa 3");
    }//GEN-LAST:event_BTNCx3ActionPerformed

    private void BTNCx4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNCx4ActionPerformed
        callClient(Categoria.C, "Caixa 4");
    }//GEN-LAST:event_BTNCx4ActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            new MainFrame().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNComum;
    private javax.swing.JButton BTNCx1;
    private javax.swing.JButton BTNCx2;
    private javax.swing.JButton BTNCx3;
    private javax.swing.JButton BTNCx4;
    private javax.swing.JButton BTNPrioritario;
    private javax.swing.JButton BTNRapido;
    private javax.swing.JLabel LBLCaixa;
    private javax.swing.JLabel LBLSenha;
    private javax.swing.JLabel LBLSenhaChamada;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
