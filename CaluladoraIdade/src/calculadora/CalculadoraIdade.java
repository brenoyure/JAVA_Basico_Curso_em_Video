package calculadora;

public class CalculadoraIdade extends javax.swing.JFrame {

    
    public CalculadoraIdade() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblAno = new javax.swing.JLabel();
        lblAnoAtual = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        seletorAno = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        calcularIdade = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        lblidadeFinal = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora de Idade");
        setLocation(new java.awt.Point(800, 400));
        setResizable(false);

        lblAno.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblAno.setText("Ano");

        lblAnoAtual.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblAnoAtual.setForeground(new java.awt.Color(0, 51, 255));
        lblAnoAtual.setText("----");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Ano de Nascimento");

        seletorAno.setModel(new javax.swing.SpinnerNumberModel(2000, 1900, 2022, 1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/User-Icon.png"))); // NOI18N

        calcularIdade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Calculadora1.png"))); // NOI18N
        calcularIdade.setText("Calcular");
        calcularIdade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcularIdadeActionPerformed(evt);
            }
        });

        jLabel3.setText("Ao final desse ano, sua idade será de");

        lblidadeFinal.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblidadeFinal.setForeground(new java.awt.Color(255, 0, 102));
        lblidadeFinal.setText("???");

        jLabel5.setText("anos.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblidadeFinal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblAno)
                            .addGap(18, 18, 18)
                            .addComponent(lblAnoAtual, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(calcularIdade)
                                .addComponent(jLabel1))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(seletorAno, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAno, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAnoAtual, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(seletorAno, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(calcularIdade)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(39, 39, 39)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(lblidadeFinal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void calcularIdadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcularIdadeActionPerformed
        CapturarAno ano = new CapturarAno();
        //Capturar Ano do Sistema e exibir no campo lblAnoAtual
        int anoNascimento = Integer.parseInt(seletorAno.getValue().toString());
        var anoAtual = ano.getAnoAtual();
        
//        //Chamado o método da classe CapturarAno.anoAtual para exibir o ano atual
          
 
        //Variável para cálculo do ano de nascimento
        var idadeFinal = (anoAtual - anoNascimento);      
        lblidadeFinal.setText(Integer.toString(idadeFinal));
        
    }//GEN-LAST:event_calcularIdadeActionPerformed

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
            java.util.logging.Logger.getLogger(CalculadoraIdade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculadoraIdade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculadoraIdade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculadoraIdade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculadoraIdade().setVisible(true);
                
                
            }
        });
        
        
        
    }
/*
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton calcularIdade;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblAno;
    private javax.swing.JLabel lblAnoAtual;
    private javax.swing.JLabel lblidadeFinal;
    private javax.swing.JSpinner seletorAno;
    // End of variables declaration//GEN-END:variables
*/
    private javax.swing.JButton calcularIdade;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblAno;
    public static javax.swing.JLabel lblAnoAtual;
    private javax.swing.JLabel lblidadeFinal;
    private javax.swing.JSpinner seletorAno;
}
