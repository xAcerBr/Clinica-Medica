/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.clinica.view;

import br.com.clinica.control.FuncionariosControl;
import br.com.clinica.util.Utils;
import javax.swing.JFrame;

/**
 *
 * @author Henrique Baron
 */
public class FuncionariosInternalFrame extends javax.swing.JInternalFrame {

    /**
     * Creates new form FuncionariosInternalFrame
     */
    private FuncionariosControl control;

    public FuncionariosInternalFrame(JFrame pai) {
        initComponents();
        control = new FuncionariosControl(this, pai);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        groupB = new javax.swing.ButtonGroup();
        rbMedico = new javax.swing.JRadioButton();
        rbEnfermeira = new javax.swing.JRadioButton();
        rbAtendente = new javax.swing.JRadioButton();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        tfPesquisar = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        lblFuncionario = new javax.swing.JLabel();
        tabelaFuncionario = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setTitle("Gerenciamento de Funcionarios");
        setMinimumSize(new java.awt.Dimension(679, 498));
        setPreferredSize(new java.awt.Dimension(679, 498));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        groupB.add(rbMedico);
        rbMedico.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        rbMedico.setText("Médico");
        rbMedico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                rbMedicoMouseReleased(evt);
            }
        });
        rbMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbMedicoActionPerformed(evt);
            }
        });
        getContentPane().add(rbMedico, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 110, -1));

        groupB.add(rbEnfermeira);
        rbEnfermeira.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        rbEnfermeira.setText("Enfermeira");
        rbEnfermeira.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                rbEnfermeiraMouseReleased(evt);
            }
        });
        rbEnfermeira.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbEnfermeiraActionPerformed(evt);
            }
        });
        getContentPane().add(rbEnfermeira, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, 130, -1));

        groupB.add(rbAtendente);
        rbAtendente.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        rbAtendente.setText("Atendente");
        rbAtendente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                rbAtendenteMouseReleased(evt);
            }
        });
        rbAtendente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbAtendenteActionPerformed(evt);
            }
        });
        getContentPane().add(rbAtendente, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 10, 130, -1));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/doctor (1).png"))); // NOI18N
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, -1));

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nurse.png"))); // NOI18N
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, -1, -1));

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/avatar.png"))); // NOI18N
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 10, -1, -1));

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/id-card.png"))); // NOI18N
        jLabel13.setText("Funcionario:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, -1, -1));

        btAdicionarPaciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital.png"))); // NOI18N
        btAdicionarPaciente.setToolTipText("Adicionar paciente");
        btAdicionarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAdicionarPacienteActionPerformed(evt);
            }
        });
        getContentPane().add(btAdicionarPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 48, 70, 50));

        tfPesquisar.setEditable(false);
        tfPesquisar.setForeground(new java.awt.Color(102, 102, 102));
        tfPesquisar.setText("Pesquisar funcionário");
        tfPesquisar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfPesquisarFocusGained(evt);
            }
        });
        tfPesquisar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfPesquisarKeyReleased(evt);
            }
        });
        getContentPane().add(tfPesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 44));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cross.png"))); // NOI18N
        jButton3.setToolTipText("Excluir Sala Selecionada");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(594, 407, -1, -1));

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edit (1).png"))); // NOI18N
        jButton5.setToolTipText("Editar Sala Selecionada");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(536, 407, -1, -1));

        lblFuncionario.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        getContentPane().add(lblFuncionario, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 407, 385, 36));

        tabelaFuncionario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabelaFuncionario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tabelaFuncionarioMouseReleased(evt);
            }
        });
        jScrollPane3.setViewportView(tabelaFuncionario);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 646, 295));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbMedicoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbMedicoMouseReleased
        control.selectRadioButton();        // TODO add your handling code here:
    }//GEN-LAST:event_rbMedicoMouseReleased

    private void rbMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbMedicoActionPerformed
        control.selectRadioButton();        // TODO add your handling code here:
    }//GEN-LAST:event_rbMedicoActionPerformed

    private void rbEnfermeiraMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbEnfermeiraMouseReleased
        control.selectRadioButton();        // TODO add your handling code here:
    }//GEN-LAST:event_rbEnfermeiraMouseReleased

    private void rbEnfermeiraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbEnfermeiraActionPerformed
        control.selectRadioButton();        // TODO add your handling code here:
    }//GEN-LAST:event_rbEnfermeiraActionPerformed

    private void rbAtendenteMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbAtendenteMouseReleased
        control.selectRadioButton();        // TODO add your handling code here:
    }//GEN-LAST:event_rbAtendenteMouseReleased

    private void btAdicionarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAdicionarPacienteActionPerformed
        control.adicionarNovoAction();
    }//GEN-LAST:event_btAdicionarPacienteActionPerformed

    private void tfPesquisarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfPesquisarKeyReleased
        control.sendKeysTfListener();        // TODO add your handling code here:
    }//GEN-LAST:event_tfPesquisarKeyReleased

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        control.deleteAction();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        control.editAction();       // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void rbAtendenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbAtendenteActionPerformed
        control.selectRadioButton();        // TODO add your handling code here:
    }//GEN-LAST:event_rbAtendenteActionPerformed

    private void tabelaFuncionarioMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaFuncionarioMouseReleased
        control.mouseListenerTable();        // TODO add your handling code here:
    }//GEN-LAST:event_tabelaFuncionarioMouseReleased

    private void tfPesquisarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfPesquisarFocusGained
        Utils.campoPesquisa(tfPesquisar);
    }//GEN-LAST:event_tfPesquisarFocusGained


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static final javax.swing.JButton btAdicionarPaciente = new javax.swing.JButton();
    public javax.swing.ButtonGroup groupB;
    public javax.swing.JButton jButton3;
    public javax.swing.JButton jButton5;
    public static final javax.swing.JLabel jLabel13 = new javax.swing.JLabel();
    public javax.swing.JLabel jLabel20;
    public javax.swing.JLabel jLabel21;
    public javax.swing.JLabel jLabel24;
    public static final javax.swing.JScrollPane jScrollPane3 = new javax.swing.JScrollPane();
    public javax.swing.JLabel lblFuncionario;
    public javax.swing.JRadioButton rbAtendente;
    public javax.swing.JRadioButton rbEnfermeira;
    public javax.swing.JRadioButton rbMedico;
    public javax.swing.JTable tabelaFuncionario;
    public javax.swing.JTextField tfPesquisar;
    // End of variables declaration//GEN-END:variables
}
