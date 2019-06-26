/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.clinica.view;

import br.com.clinica.control.MainControl;

/**
 *
 * @author Luiza Mistro
 */
public class TelaPrincipal extends javax.swing.JFrame {

    MainControl control;

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
        initComponents();
        control = new MainControl();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        menuCadastro = new javax.swing.JMenu();
        menuPaciente = new javax.swing.JMenuItem();
        menuFuncionario = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(java.awt.Color.white);

        javax.swing.GroupLayout painelLayout = new javax.swing.GroupLayout(painel);
        painel.setLayout(painelLayout);
        painelLayout.setHorizontalGroup(
            painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        painelLayout.setVerticalGroup(
            painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 451, Short.MAX_VALUE)
        );

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Aspek.jpg"))); // NOI18N

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/notepad (1).png"))); // NOI18N
        jMenu1.setText("Agendamento");

        MenuAgendaConsulta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/stethoscope.png"))); // NOI18N
        MenuAgendaConsulta.setText("Consultas");
        MenuAgendaConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuAgendaConsultaActionPerformed(evt);
            }
        });
        jMenu1.add(MenuAgendaConsulta);

        MenuAgendaExame.setIcon(new javax.swing.ImageIcon(getClass().getResource("/time.png"))); // NOI18N
        MenuAgendaExame.setText("Exames");
        MenuAgendaExame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuAgendaExameActionPerformed(evt);
            }
        });
        jMenu1.add(MenuAgendaExame);

        MenuAgendaVacina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/syringe (1).png"))); // NOI18N
        MenuAgendaVacina.setText("Vacinas");
        MenuAgendaVacina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuAgendaVacinaActionPerformed(evt);
            }
        });
        jMenu1.add(MenuAgendaVacina);

        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/doctor (1).png"))); // NOI18N
        jMenu2.setText("Médico");

        MenuMedicoProntuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/medical-history (2).png"))); // NOI18N
        MenuMedicoProntuario.setText("Prontuários");
        MenuMedicoProntuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuMedicoProntuarioActionPerformed(evt);
            }
        });
        jMenu2.add(MenuMedicoProntuario);

        MenuMedicoExame.setIcon(new javax.swing.ImageIcon(getClass().getResource("/report.png"))); // NOI18N
        MenuMedicoExame.setText("Exames");
        MenuMedicoExame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuMedicoExameActionPerformed(evt);
            }
        });
        jMenu2.add(MenuMedicoExame);

        MenuMedicoReceita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cure (1).png"))); // NOI18N
        MenuMedicoReceita.setText("Receitas");
        jMenu2.add(MenuMedicoReceita);

        jMenuBar1.add(jMenu2);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/syringe (2).png"))); // NOI18N
        jMenu3.setText("Vacinas");

        MenuVacinaAplicacao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vaccine.png"))); // NOI18N
        MenuVacinaAplicacao.setText("Aplicação");
        jMenu3.add(MenuVacinaAplicacao);

        jMenuBar1.add(jMenu3);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/medical-history.png"))); // NOI18N
        jMenu4.setText("Consultas");

        MenuConsultaEmergencia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ambulance.png"))); // NOI18N
        MenuConsultaEmergencia.setText("Emergência");
        jMenu4.add(MenuConsultaEmergencia);

        MenuConsultaExame.setIcon(new javax.swing.ImageIcon(getClass().getResource("/health-check.png"))); // NOI18N
        MenuConsultaExame.setText("Exames");
        jMenu4.add(MenuConsultaExame);

        MenuConsultaReservaSala.setIcon(new javax.swing.ImageIcon(getClass().getResource("/surgery-room.png"))); // NOI18N
        MenuConsultaReservaSala.setText("Reserva de salas");
        jMenu4.add(MenuConsultaReservaSala);

        jMenuBar1.add(jMenu4);

        menuCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital.png"))); // NOI18N
        menuCadastro.setText("Cadastro");

        menuPaciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/patient.png"))); // NOI18N
        menuPaciente.setText("Paciente");
        menuPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuPacienteActionPerformed(evt);
            }
        });
        menuCadastro.add(menuPaciente);

        menuFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/doctor (1).png"))); // NOI18N
        menuFuncionario.setText("Funcionário");
        menuFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuFuncionarioActionPerformed(evt);
            }
        });
        menuCadastro.add(menuFuncionario);

        jMenuBar1.add(menuCadastro);

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/first-aid-kit (1).png"))); // NOI18N
        jMenu5.setText("Plantão");
        jMenu5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu5ActionPerformed(evt);
            }
        });

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/medical-history (2).png"))); // NOI18N
        jMenuItem2.setText("Listar");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem2);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 864, Short.MAX_VALUE)
            .addComponent(painel)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(painel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MenuAgendaExameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuAgendaExameActionPerformed

    }//GEN-LAST:event_MenuAgendaExameActionPerformed

    private void MenuMedicoProntuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuMedicoProntuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MenuMedicoProntuarioActionPerformed

    private void MenuMedicoExameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuMedicoExameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MenuMedicoExameActionPerformed

    private void MenuAgendaVacinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuAgendaVacinaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MenuAgendaVacinaActionPerformed

    private void MenuAgendaConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuAgendaConsultaActionPerformed
        control.chamarTelaAgendamentoConsultas();
    }//GEN-LAST:event_MenuAgendaConsultaActionPerformed

    private void menuPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPacienteActionPerformed

    }//GEN-LAST:event_menuPacienteActionPerformed

    private void menuFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuFuncionarioActionPerformed
        control.chamarTelaCadastroFuncionario();
    }//GEN-LAST:event_menuFuncionarioActionPerformed

    private void jMenu5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu5ActionPerformed

    }//GEN-LAST:event_jMenu5ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        control.chamarTelaPlantao();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static final javax.swing.JMenuItem MenuAgendaConsulta = new javax.swing.JMenuItem();
    public static final javax.swing.JMenuItem MenuAgendaExame = new javax.swing.JMenuItem();
    public static final javax.swing.JMenuItem MenuAgendaVacina = new javax.swing.JMenuItem();
    public static final javax.swing.JMenuItem MenuConsultaEmergencia = new javax.swing.JMenuItem();
    public static final javax.swing.JMenuItem MenuConsultaExame = new javax.swing.JMenuItem();
    public static final javax.swing.JMenuItem MenuConsultaReservaSala = new javax.swing.JMenuItem();
    public static final javax.swing.JMenuItem MenuMedicoExame = new javax.swing.JMenuItem();
    public static final javax.swing.JMenuItem MenuMedicoProntuario = new javax.swing.JMenuItem();
    public static final javax.swing.JMenuItem MenuMedicoReceita = new javax.swing.JMenuItem();
    public static final javax.swing.JMenuItem MenuVacinaAplicacao = new javax.swing.JMenuItem();
    public static final javax.swing.JLabel jLabel1 = new javax.swing.JLabel();
    public static final javax.swing.JMenu jMenu1 = new javax.swing.JMenu();
    public static final javax.swing.JMenu jMenu2 = new javax.swing.JMenu();
    public static final javax.swing.JMenu jMenu3 = new javax.swing.JMenu();
    public static final javax.swing.JMenu jMenu4 = new javax.swing.JMenu();
    private javax.swing.JMenu jMenu5;
    public static final javax.swing.JMenuBar jMenuBar1 = new javax.swing.JMenuBar();
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenu menuCadastro;
    private javax.swing.JMenuItem menuFuncionario;
    private javax.swing.JMenuItem menuPaciente;
    public static final javax.swing.JDesktopPane painel = new javax.swing.JDesktopPane();
    // End of variables declaration//GEN-END:variables
}
