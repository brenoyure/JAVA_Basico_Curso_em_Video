package operadores_relacionais;

public class Operadores_Tela extends javax.swing.JFrame {


    public Operadores_Tela() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_Ano_de_Nascimento = new javax.swing.JLabel();
        txt_field_do_lbl_Ano_de_Nascimento = new javax.swing.JTextField();
        btn_Calcular = new javax.swing.JButton();
        lbl_Idade = new javax.swing.JLabel();
        result_lbl_Idade = new javax.swing.JLabel();
        lbl_Situação = new javax.swing.JLabel();
        result_lbl_Situacao = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calcular Idade");
        setLocation(new java.awt.Point(800, 400));
        setResizable(false);

        lbl_Ano_de_Nascimento.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbl_Ano_de_Nascimento.setText("Ano de Nascimento");

        txt_field_do_lbl_Ano_de_Nascimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_field_do_lbl_Ano_de_NascimentoActionPerformed(evt);
            }
        });

        btn_Calcular.setText("Calcular");
        btn_Calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CalcularActionPerformed(evt);
            }
        });

        lbl_Idade.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbl_Idade.setText("Idade");

        result_lbl_Idade.setText("0");

        lbl_Situação.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbl_Situação.setText("Situação");

        result_lbl_Situacao.setText("<vazio>");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_Ano_de_Nascimento)
                        .addGap(18, 18, 18)
                        .addComponent(txt_field_do_lbl_Ano_de_Nascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lbl_Idade, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_Situação, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_Calcular)
                            .addComponent(result_lbl_Idade, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(result_lbl_Situacao))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Ano_de_Nascimento)
                    .addComponent(txt_field_do_lbl_Ano_de_Nascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btn_Calcular)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Idade)
                    .addComponent(result_lbl_Idade))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Situação)
                    .addComponent(result_lbl_Situacao))
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_field_do_lbl_Ano_de_NascimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_field_do_lbl_Ano_de_NascimentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_field_do_lbl_Ano_de_NascimentoActionPerformed

    private void btn_CalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CalcularActionPerformed
        
        
        //Variável "ano" recebe o ano de nascimento do usuário
        int ano = Integer.parseInt(txt_field_do_lbl_Ano_de_Nascimento.getText());
        //anoAtual, método para "capturar" o ano atual do sistema
        var anoAtual = CapturarAno.anoAtual();
        
        //Cálculo e exibição na tela da idade do usuário
        int idade = anoAtual - ano;
        result_lbl_Idade.setText(Integer.toString(idade));
        
        //Condição if/else para definir "situação" do usuário
        if (idade >= 0 && idade <12 ) {
              result_lbl_Situacao.setText("Você é uma criança");
        }else if (idade >= 12 && idade < 18)    {
              result_lbl_Situacao.setText("Você é um adolecente");  
        }else if (idade >= 18 && idade < 65) {
              result_lbl_Situacao.setText("Você é um Adulto");      
        }else{
              result_lbl_Situacao.setText("Você é um idoso"); 
    }
        
 
    }//GEN-LAST:event_btn_CalcularActionPerformed

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
            java.util.logging.Logger.getLogger(Operadores_Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Operadores_Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Operadores_Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Operadores_Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Operadores_Tela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Calcular;
    private javax.swing.JLabel lbl_Ano_de_Nascimento;
    private javax.swing.JLabel lbl_Idade;
    private javax.swing.JLabel lbl_Situação;
    private javax.swing.JLabel result_lbl_Idade;
    private javax.swing.JLabel result_lbl_Situacao;
    private javax.swing.JTextField txt_field_do_lbl_Ano_de_Nascimento;
    // End of variables declaration//GEN-END:variables
}
