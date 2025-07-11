/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vet.clinic;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author zzsjzz
 */
public class TelaVacinas extends javax.swing.JPanel {   
    private TelaPrincipal telaPrincipal;
    
    public TelaVacinas(TelaPrincipal telaPrincipal) {
        this.telaPrincipal = telaPrincipal;
        initComponents();
        
        this.addComponentListener(new java.awt.event.ComponentAdapter() {
            @Override
            public void componentShown(java.awt.event.ComponentEvent e) {
                preencherCombos();
            }
        });
    }
    
    private void preencherCombos(){
        ArrayList<Vacina> lista = telaPrincipal.getSistema().getVacinas();
        ArrayList<Animal> animais = telaPrincipal.getSistema().getAnimais();

        DefaultComboBoxModel<String> modelV = new DefaultComboBoxModel<>();
        for (Vacina v : lista) {
            modelV.addElement(v.getNome());
        }
        
        DefaultComboBoxModel<String> modelA = new DefaultComboBoxModel<>();
        for (Animal a : animais) {
            modelA.addElement(a.getNome());
        }
        
        cxVacina.setModel(modelV);
        cxAnimal.setModel(modelA);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        cxVacina = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cxAnimal = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        cxDia = new javax.swing.JTextField();
        cxMes = new javax.swing.JTextField();
        cxAno = new javax.swing.JTextField();
        cxAplicar = new javax.swing.JButton();

        cxVacina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxVacinaActionPerformed(evt);
            }
        });

        jLabel1.setText("Vacina:");

        jLabel2.setText("Animal");

        cxAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxAnimalActionPerformed(evt);
            }
        });

        jLabel3.setText("Data de aplicação:");

        cxDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxDiaActionPerformed(evt);
            }
        });

        cxMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxMesActionPerformed(evt);
            }
        });

        cxAplicar.setText("Aplicar");
        cxAplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxAplicarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cxDia, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cxMes, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cxAno, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3)
                    .addComponent(cxAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(cxVacina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(214, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cxAplicar)
                .addGap(30, 30, 30))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cxAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cxVacina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cxDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cxMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cxAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cxAplicar)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        cxVacina.getAccessibleContext().setAccessibleName("");

        jTabbedPane1.addTab("Aplicar", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cxVacinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxVacinaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxVacinaActionPerformed

    private void cxAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxAnimalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxAnimalActionPerformed

    private void cxDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxDiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxDiaActionPerformed

    private void cxMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxMesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxMesActionPerformed

    private void cxAplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxAplicarActionPerformed
        String diaStr = cxDia.getText().trim();
        String mesStr = cxMes.getText().trim();
        String anoStr = cxAno.getText().trim();

        if (diaStr.isEmpty() || mesStr.isEmpty() || anoStr.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Preencha dia, mês e ano.");
            return;
        }

        int dia, mes, ano;
        try {
            dia = Integer.parseInt(diaStr);
            mes = Integer.parseInt(mesStr);
            ano = Integer.parseInt(anoStr);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Data inválida: apenas números.");
            return;
        }

        // Validação de data real
        try {
            LocalDate.of(ano, mes, dia);
        } catch (DateTimeException e) {
            JOptionPane.showMessageDialog(this, "Data inválida: " + e.getMessage());
            return;
        }
        
         // Verifica se um animal foi selecionado
        if (cxAnimal.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(this, "Selecione um animal.");
            return;
        }
        
        if (cxVacina.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(this, "Selecione uma vacina.");
            return;
        }
        
        String nomeSelecionado1 = (String) cxAnimal.getSelectedItem();

        Animal animalSelecionado = null;
        for (Animal a : telaPrincipal.getSistema().getAnimais()) {
            if (a.getNome().equals(nomeSelecionado1)) {
                animalSelecionado = a;
                break;
            }
        }    
        
        String nomeSelecionado2 = (String) cxVacina.getSelectedItem();

        Vacina vacSelecionada = null;
        for (Vacina v : telaPrincipal.getSistema().getVacinas()) {
            if (v.getNome().equals(nomeSelecionado2)) {
                vacSelecionada = v;
                break;
            }
        }        
            
        LocalDate diaAplicou = LocalDate.of(ano, mes, dia);
        LocalDate diaVence = diaAplicou.plusMonths(vacSelecionada.getMesesVencer());       
        
        VacinacaoAnimal vacinacaoAnimal = new VacinacaoAnimal(diaAplicou, diaVence, vacSelecionada);
        animalSelecionado.getCartaoVacina().add(vacinacaoAnimal);                        
              
        cxAnimal.setSelectedIndex(-1);  
        cxVacina.setSelectedIndex(-1); 
        cxDia.setText("");
        cxMes.setText("");
        cxAno.setText("");

        JOptionPane.showMessageDialog(this,
            "Vacina aplicada com sucesso!",
            "Concluído",
            JOptionPane.INFORMATION_MESSAGE);
        telaPrincipal.mostrarTela("telaMenu");
    }//GEN-LAST:event_cxAplicarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cxAnimal;
    private javax.swing.JTextField cxAno;
    private javax.swing.JButton cxAplicar;
    private javax.swing.JTextField cxDia;
    private javax.swing.JTextField cxMes;
    private javax.swing.JComboBox<String> cxVacina;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
