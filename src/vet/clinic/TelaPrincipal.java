/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vet.clinic;
import javax.swing.*;
import java.awt.*;
/**
 *
 * @author zzsjzz
 */
public class TelaPrincipal extends javax.swing.JFrame {
    CardLayout cardLayout;
    JPanel container;
    private Sistema sistema = new Sistema();

    public TelaPrincipal() {
        super("Clínica Veterinária");
        initComponents();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Define o layout principal como CardLayout
        getContentPane().setLayout(new CardLayout());

        // Adiciona as telas ao CardLayout
        getContentPane().add(new TelaLogin(this), "telaLogin");
        getContentPane().add(new TelaMenu(this), "telaMenu");
        getContentPane().add(new TelaCadTutor(this), "telaCadTutor");
        getContentPane().add(new TelaCadAnimal(this), "telaCadAnimal");

        // Exibe a primeira tela
        mostrarTela("telaLogin");
        setLocationRelativeTo(null); // centraliza na tela
    }

    public void mostrarTela(String nomeTela) {
        CardLayout cl = (CardLayout)(getContentPane().getLayout());
        cl.show(getContentPane(), nomeTela);
        
        if (nomeTela.equals("telaLogin")) {
             setJMenuBar(null);
        } else {
            setJMenuBar(jMenuBar1);
        }
        
        revalidate();
    }
    
    public Sistema getSistema(){
        return sistema;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("Cadastros");

        jMenuItem1.setText("Tutor");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Animal");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Funcionário");
        jMenu1.add(jMenuItem3);

        jMenuItem4.setText("Vacina");
        jMenu1.add(jMenuItem4);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Agendamento");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Consultas");
        jMenuBar1.add(jMenu3);

        jMenu4.setText("Vacinas");
        jMenuBar1.add(jMenu4);

        jMenu5.setText("Cobrança");
        jMenuBar1.add(jMenu5);

        jMenu6.setText("Relatórios");
        jMenuBar1.add(jMenu6);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 502, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 275, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        this.mostrarTela("telaCadTutor");
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        this.mostrarTela("telaCadAnimal");
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    // End of variables declaration//GEN-END:variables
}
