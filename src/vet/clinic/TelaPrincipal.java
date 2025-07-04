/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vet.clinic;
import javax.swing.*;
import java.awt.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

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
        getContentPane().add(new TelaListaTutor(this), "telaListaTutor");
        getContentPane().add(new TelaListaAnimal(this), "telaListaAnimal");
        getContentPane().add(new TelaCadFuncionario(this), "telaCadFuncionario");

        // Exibe a primeira tela
        mostrarTela("telaLogin");
        setLocationRelativeTo(null); // centraliza na tela
    }

    public void mostrarTela(String nomeTela) {
        CardLayout cl = (CardLayout)(getContentPane().getLayout());
        cl.show(getContentPane(), nomeTela);

        pack();                       // recalcula tamanho do frame
        setLocationRelativeTo(null);  // entraliza na tela

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
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        miEditarTutor = new javax.swing.JMenuItem();
        miExcluirTutor = new javax.swing.JMenuItem();
        jMenuItemListarTutor = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("Cadastros");

        jMenuItem3.setText("Funcionário");
        jMenu1.add(jMenuItem3);

        jMenuItem4.setText("Vacina");
        jMenu1.add(jMenuItem4);

        jMenu7.setText("Tutor");

        jMenuItem5.setText("Novo");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem5);

        miEditarTutor.setText("Editar");
        miEditarTutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miEditarTutorActionPerformed(evt);
            }
        });
        jMenu7.add(miEditarTutor);

        miExcluirTutor.setText("Excluir");
        miExcluirTutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miExcluirTutorActionPerformed(evt);
            }
        });
        jMenu7.add(miExcluirTutor);
        jMenuItem3.setText("Funcionário");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItemListarTutor.setText("Listar");
        jMenuItemListarTutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemListarTutorActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItemListarTutor);

        jMenu1.add(jMenu7);

        jMenu8.setText("Animal");

        jMenuItem6.setText("Novo");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem6);

        jMenuItem7.setText("Editar");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem7);

        jMenuItem8.setText("Excluir");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem8);

        jMenuItem9.setText("Listar");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem9);

        jMenu1.add(jMenu8);

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

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        this.mostrarTela("telaCadTutor");
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void miExcluirTutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miExcluirTutorActionPerformed
        ArrayList<Tutor> tutorL = sistema.getTutores();
        if (tutorL.isEmpty()) {
            JOptionPane.showMessageDialog(this, 
                "Não há tutores cadastrados.", 
                "Excluir Tutor", 
                JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        // converte para array de opções
        Tutor[] opcoes = tutorL.toArray(new Tutor[0]);

        // exibe diálogo com combo
        Tutor selecionado = (Tutor) JOptionPane.showInputDialog(
            this,
            "Selecione o tutor para excluir:",
            "Excluir Tutor",
            JOptionPane.QUESTION_MESSAGE,
            null,
            opcoes,
            opcoes[0]
        );

        if (selecionado == null) return; // cancelou

        // remove e avisa
        tutorL.remove(selecionado);
        JOptionPane.showMessageDialog(this,
            "Tutor \"" + selecionado.getNome() + "\" excluído.",
            "Concluído",
            JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_miExcluirTutorActionPerformed

    private void miEditarTutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miEditarTutorActionPerformed
        ArrayList<Tutor> lista = sistema.getTutores();
        if (lista.isEmpty()) {
            JOptionPane.showMessageDialog(this,
                "Não há tutores cadastrados.",
                "Editar Tutor",
                JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        // Seleciona quem editar
        Tutor[] options = lista.toArray(new Tutor[0]);
        Tutor sel = (Tutor) JOptionPane.showInputDialog(
            this,
            "Escolha o tutor a editar:",
            "Editar Tutor",
            JOptionPane.QUESTION_MESSAGE,
            null,
            options,
            options[0]
        );
        if (sel == null) return; // cancelou

        // Monta o mini‐form
        JTextField cxNome = new JTextField(sel.getNome(), 20);
        JTextField cxCpf = new JTextField(sel.getCpf(), 20);
        JTextField cxEmail = new JTextField(sel.getEmail(), 20);
        JTextField cxTel = new JTextField(sel.getTelefone(), 20);
        JTextField cxEnd = new JTextField(sel.getEndereco(), 20);

        JPanel panel = new JPanel(new GridLayout(0,1));
        panel.add(new JLabel("Nome:"));   panel.add(cxNome);
        panel.add(new JLabel("CPF:"));    panel.add(cxCpf);
        panel.add(new JLabel("Email:"));  panel.add(cxEmail);
        panel.add(new JLabel("Telefone:")); panel.add(cxTel);
        panel.add(new JLabel("Endereço:")); panel.add(cxEnd);

        // Pergunta se quer salvar
        int resp = JOptionPane.showConfirmDialog(
            this,
            panel,
            "Editar Tutor",
            JOptionPane.OK_CANCEL_OPTION,
            JOptionPane.PLAIN_MESSAGE
        );
        if (resp != JOptionPane.OK_OPTION) return;

        // Aplica alterações no objeto
        sel.setNome(cxNome.getText().trim());
        sel.setCpf(cxCpf.getText().trim());
        sel.setEmail(cxEmail.getText().trim());
        sel.setTelefone(cxTel.getText().trim());
        sel.setEndereco(cxEnd.getText().trim());

        JOptionPane.showMessageDialog(this,
            "Dados do tutor atualizados com sucesso!",
            "Concluído",
            JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_miEditarTutorActionPerformed

    private void jMenuItemListarTutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemListarTutorActionPerformed
        this.mostrarTela("telaListaTutor");
    }//GEN-LAST:event_jMenuItemListarTutorActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        // captura a lista de animais
        ArrayList<Animal> lista = sistema.getAnimais();
        if (lista.isEmpty()) {
            JOptionPane.showMessageDialog(
                this,
                "Não há animais cadastrados.",
                "Excluir Animal",
                JOptionPane.INFORMATION_MESSAGE
            );
            return;
        }

        // converte em array para o combo
        Animal[] opcoes = lista.toArray(new Animal[0]);

        // exibe o dialog com combo
        Animal selecionado = (Animal) JOptionPane.showInputDialog(
            this,
            "Selecione o animal para excluir:",
            "Excluir Animal",
            JOptionPane.QUESTION_MESSAGE,
            null,
            opcoes,
            opcoes[0]
        );
        if (selecionado == null) {
            // usuário cancelou
            return;
        }

        // remove e notifica
        lista.remove(selecionado);
        JOptionPane.showMessageDialog(
            this,
            "Animal \"" + selecionado.getNome() + "\" excluído com sucesso!",
            "Concluído",
            JOptionPane.INFORMATION_MESSAGE
        );
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        this.mostrarTela("telaListaAnimal");
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        this.mostrarTela("telaCadAnimal");
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // Pega a lista de animais
        ArrayList<Animal> lista = sistema.getAnimais();
        if (lista.isEmpty()) {
            JOptionPane.showMessageDialog(
                this,
                "Não há animais cadastrados.",
                "Editar Animal",
                JOptionPane.INFORMATION_MESSAGE
            );
            return;
        }

        // De AnimalList para um array de opções
        Animal[] opcoes = lista.toArray(new Animal[0]);

        // Pergunta qual animal editar
        Animal sel = (Animal) JOptionPane.showInputDialog(
            this,
            "Escolha o animal a editar:",
            "Editar Animal",
            JOptionPane.QUESTION_MESSAGE,
            null,
            opcoes,
            opcoes[0]
        );
        if (sel == null) return; // Cancelou

        // Cria os campos já populados
        JTextField cxNome      = new JTextField(sel.getNome(), 20);
        JTextField cxRaca      = new JTextField(sel.getRaca(), 20);
        JTextField cxDataNasc      = new JTextField(sel.getDataNasc(), 20);
        
        // Combo de tutores
        DefaultComboBoxModel<Tutor> tutorModel = new DefaultComboBoxModel<>();
        for (Tutor t : sistema.getTutores()) {
            tutorModel.addElement(t);
        }
        JComboBox<Tutor> cxTutor = new JComboBox<>(tutorModel);
        cxTutor.setSelectedItem(sel.getTutor());

        // Monta o painel
        JPanel panel = new JPanel(new GridLayout(0,1));
        panel.add(new JLabel("Nome:"));              panel.add(cxNome);
        panel.add(new JLabel("Raça:"));              panel.add(cxRaca);
        panel.add(new JLabel("Data de Nascimento:"));panel.add(cxDataNasc);
        panel.add(new JLabel("Tutor:"));             panel.add(cxTutor);

        // Exibe o dialog de confirmação
        int resp = JOptionPane.showConfirmDialog(
            this,
            panel,
            "Editar Animal",
            JOptionPane.OK_CANCEL_OPTION,
            JOptionPane.PLAIN_MESSAGE
        );
        if (resp != JOptionPane.OK_OPTION) return;  // não salvou

        // 7) Guarda de volta no objeto
        sel.setNome(cxNome.getText().trim());
        sel.setRaca(cxRaca.getText().trim());
        sel.setDataNasc(cxDataNasc.getText().trim());
        sel.setTutor((Tutor) cxTutor.getSelectedItem());

        // Avisa o usuário
        JOptionPane.showMessageDialog(
            this,
            "Animal atualizado com sucesso!",
            "Concluído",
            JOptionPane.INFORMATION_MESSAGE
        );
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        this.mostrarTela("telaCadFuncionario");
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JMenuItem jMenuItemListarTutor;
    private javax.swing.JMenuItem miEditarTutor;
    private javax.swing.JMenuItem miExcluirTutor;
    // End of variables declaration//GEN-END:variables
}
