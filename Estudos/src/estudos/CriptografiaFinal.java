package estudos;

/**
 *
 * @author rodrigo Leandro
 */
public class CriptografiaFinal extends javax.swing.JFrame {

    public CriptografiaFinal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        BTNcriptografar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        TXTdeslocamento = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TXTcriptografar = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        TXTcriptografado = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        TXTdescriptografado = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Criptografia");
        jLabel1.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        BTNcriptografar.setBackground(new java.awt.Color(153, 0, 0));
        BTNcriptografar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        BTNcriptografar.setForeground(new java.awt.Color(255, 255, 255));
        BTNcriptografar.setText("Criptografar");
        BTNcriptografar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BTNcriptografar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNcriptografarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("Texto a ser criptografado:");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("Texto criptografado:");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setText("Chave de deslocamento:");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setText("Texto descriptografado:");

        TXTdeslocamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTdeslocamentoActionPerformed(evt);
            }
        });

        TXTcriptografar.setColumns(20);
        TXTcriptografar.setRows(5);
        jScrollPane1.setViewportView(TXTcriptografar);

        TXTcriptografado.setColumns(20);
        TXTcriptografado.setRows(5);
        jScrollPane2.setViewportView(TXTcriptografado);

        TXTdescriptografado.setColumns(20);
        TXTdescriptografado.setRows(5);
        jScrollPane3.setViewportView(TXTdescriptografado);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(311, 311, 311)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
                            .addComponent(jScrollPane3)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3)
                                .addComponent(jLabel5)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(TXTdeslocamento, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(280, 280, 280)
                                    .addComponent(BTNcriptografar, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane2))))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TXTdeslocamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(20, 20, 20)
                .addComponent(BTNcriptografar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTNcriptografarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNcriptografarActionPerformed

        int tamanhoTexto;
        String texto = TXTcriptografar.getText();
        int chave = Integer.parseInt(TXTdeslocamento.getText());
        StringBuilder textoCifrado = new StringBuilder();
        tamanhoTexto = texto.length();
        for (int c = 0; c < tamanhoTexto; c++) {
            int letraCifradaASCII = ((int) texto.charAt(c)) + chave;
            while (letraCifradaASCII > 126) {
                letraCifradaASCII -= 94;
            }
            textoCifrado.append((char) letraCifradaASCII);
        }
        TXTcriptografado.setText(String.valueOf(textoCifrado));
        //Descriptografar
        texto = textoCifrado.toString();
        tamanhoTexto = texto.length();
        textoCifrado = new StringBuilder();
        for (int c = 0; c < tamanhoTexto; c++) {
            int letraCifradaASCII = ((int) texto.charAt(c)) - chave;
            while (letraCifradaASCII > 126) {
                letraCifradaASCII += 94;
            }
            textoCifrado.append((char) letraCifradaASCII);
        }
        TXTdescriptografado.setText(textoCifrado.toString());


    }//GEN-LAST:event_BTNcriptografarActionPerformed

    private void TXTdeslocamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTdeslocamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTdeslocamentoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CriptografiaFinal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CriptografiaFinal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CriptografiaFinal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CriptografiaFinal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CriptografiaFinal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNcriptografar;
    private javax.swing.JTextArea TXTcriptografado;
    private javax.swing.JTextArea TXTcriptografar;
    private javax.swing.JTextArea TXTdescriptografado;
    private javax.swing.JTextField TXTdeslocamento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
