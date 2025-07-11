/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vet.clinic;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author isabel
 */
public class TelaAgendamento extends javax.swing.JPanel {
    TelaPrincipal telaPrincipal;
    /**
     * Creates new form TelaAgendamento
     */
    public TelaAgendamento(TelaPrincipal telaPrincipal) {
        this.telaPrincipal = telaPrincipal;
        initComponents();
        
        // Quando o painel for exibido, recarrega os animais e especialidades
        this.addComponentListener(new java.awt.event.ComponentAdapter() {
            @Override
            public void componentShown(java.awt.event.ComponentEvent e) {
                preencherComboAnimais();
                preencherComboEspecialidades();
            }
        });
    }
    
    private void preencherComboAnimais() {
        ArrayList<Animal> lista = telaPrincipal.getSistema().getAnimais();
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
        for (Animal a : lista) {
            model.addElement(a.getNome());
        }
        cbAnimal.setModel(model);
    }
    
    private void preencherComboEspecialidades() {
        ArrayList<Especialidade> lista = telaPrincipal.getSistema().getEspecialidades();
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
        for (Especialidade e : lista) {
            model.addElement(e.getTipo());
        }
        cbEspecialidade.setModel(model);
    }
    
    private void preencherComboHorarios() {
        // Lê a data
        Date d = (Date) ftfData.getValue();
        if (d == null) {
            cbHora.setModel(new DefaultComboBoxModel<>());
            return;
        }
        
        LocalDate data = d.toInstant()
                          .atZone(ZoneId.systemDefault())
                          .toLocalDate();

        // Gera todos os slots de 20 min
        ArrayList<LocalTime> slots = new ArrayList<>();
        
        // 8h - 12h
        LocalTime t = LocalTime.of(8, 0);
        while (t.isBefore(LocalTime.of(12, 0))) {
            slots.add(t);
            t = t.plusMinutes(20);
        }
        
        // 14h - 18h
        t = LocalTime.of(14, 0);
        while (t.isBefore(LocalTime.of(18, 0))) {
            slots.add(t);
            t = t.plusMinutes(20);
        }

        // Coleta todos os horários já agendados nesse dia
        ArrayList<Agendamento> ags = telaPrincipal.getSistema().getAgendamentos();
        ArrayList<LocalTime> ocupados = new ArrayList<>();
        for (Agendamento a : ags) {
            if (a.getStatus() == Agendamento.Status.AGENDADO
             && a.getDataHora().toLocalDate().equals(data)) {
                ocupados.add(a.getDataHora().toLocalTime());
            }
        }

        // Preenche o combo só com os que NÃO estão ocupados
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("HH:mm");
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
        for (LocalTime slot : slots) {
            if (!ocupados.contains(slot)) {
                model.addElement(slot.format(fmt));
            }
        }
        cbHora.setModel(model);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cbAnimal = new javax.swing.JComboBox<>();
        cbEspecialidade = new javax.swing.JComboBox<>();
        cbHora = new javax.swing.JComboBox<>();
        ftfData = new javax.swing.JFormattedTextField();
        jButton2 = new javax.swing.JButton();

        jLabel3.setText("Data:");

        jButton1.setText("Agendar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Animal:");

        jLabel2.setText("Especialidade:");

        jLabel4.setText("Hora:");

        cbAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAnimalActionPerformed(evt);
            }
        });

        ftfData.setColumns(10);
        ftfData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));
        ftfData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ftfDataActionPerformed(evt);
            }
        });

        jButton2.setText("Atualizar Horários");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(241, 241, 241)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(cbHora, javax.swing.GroupLayout.Alignment.LEADING, 0, 112, Short.MAX_VALUE)
                            .addComponent(cbAnimal, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ftfData, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(cbEspecialidade, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(6, 6, 6)
                .addComponent(cbEspecialidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ftfData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(13, 13, 13)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(19, 19, 19))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Lê valores da tela
        String nomeAnimal    = (String) cbAnimal.getSelectedItem();
        String tipoEsp       = (String) cbEspecialidade.getSelectedItem();
        String txtHora       = (String) cbHora.getSelectedItem();
        Date   d             = (Date)   ftfData.getValue();

        // Valida campos obrigatórios
        if (nomeAnimal == null || tipoEsp == null || d == null || txtHora == null) {
            JOptionPane.showMessageDialog(
                this,
                "Selecione animal, especialidade, data e horário.",
                "Dados incompletos",
                JOptionPane.WARNING_MESSAGE
            );
            return;
        }

        // Converte data e hora
        LocalDate data = d.toInstant()
                          .atZone(ZoneId.systemDefault())
                          .toLocalDate();
        
        LocalTime hora = LocalTime.parse(
            txtHora,
            DateTimeFormatter.ofPattern("HH:mm")
        );
        LocalDateTime dataHora = LocalDateTime.of(data, hora);

        // Mapeia nome → Animal
        Animal animal = null;
        for (Animal a : telaPrincipal.getSistema().getAnimais()) {
            if (a.getNome().equals(nomeAnimal)) {
                animal = a;
                break;
            }
        }

        // Mapeia tipo → Especialidade
        Especialidade esp = null;
        for (Especialidade e : telaPrincipal.getSistema().getEspecialidades()) {
            if (e.getTipo().equals(tipoEsp)) {
                esp = e;
                break;
            }
        }

        if (animal == null || esp == null) {
            JOptionPane.showMessageDialog(
                this,
                "Erro interno ao localizar Animal ou Especialidade.",
                "Erro",
                JOptionPane.ERROR_MESSAGE
            );
            return;
        }
        
        // Verifica se já existe agendamento no mesmo dia e hora
        for (Agendamento a : telaPrincipal.getSistema().getAgendamentos()) {
            if (a.getDataHora().equals(dataHora)
             && a.getStatus() == Agendamento.Status.AGENDADO) {
                JOptionPane.showMessageDialog(
                    this,
                    "Já existe um agendamento para esse horário.",
                    "Horário Ocupado",
                    JOptionPane.WARNING_MESSAGE
                );
                return;
            }
        }

        // Cria e salva o agendamento
        Agendamento ag = new Agendamento(animal, dataHora, esp);
        telaPrincipal.getSistema().getAgendamentos().add(ag);

        
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm", Locale.of("pt", "BR"));
        
        // Feedback e limpeza
        JOptionPane.showMessageDialog(
            this,
            "Consulta agendada:\n" + dataHora.format(fmt),
            "Sucesso",
            JOptionPane.INFORMATION_MESSAGE
        );

        cbAnimal.setSelectedIndex(-1);
        cbEspecialidade.setSelectedIndex(-1);
        ftfData.setValue(null);
        cbHora.setModel(new DefaultComboBoxModel<>());
        
        telaPrincipal.mostrarTela("telaMenu");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cbAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAnimalActionPerformed
        
    }//GEN-LAST:event_cbAnimalActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.preencherComboHorarios();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void ftfDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ftfDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ftfDataActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbAnimal;
    private javax.swing.JComboBox<String> cbEspecialidade;
    private javax.swing.JComboBox<String> cbHora;
    private javax.swing.JFormattedTextField ftfData;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
