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
        getContentPane().add(new TelaAgendamento(this), "telaAgendamento");
        getContentPane().add(new TelaCadEspecialidade(this), "telaCadEspecialidade");
        getContentPane().add(new TelaCadVacina(this), "telaCadVacina");

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
        jMenu9 = new javax.swing.JMenu();
        cxNovo = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenu10 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenu11 = new javax.swing.JMenu();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenuItem18 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem19 = new javax.swing.JMenuItem();
        jMenuItem20 = new javax.swing.JMenuItem();
        jMenuItem21 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("Cadastros");

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

        jMenu9.setText("Funcionário");

        cxNovo.setText("Novo");
        cxNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxNovoActionPerformed(evt);
            }
        });
        jMenu9.add(cxNovo);

        jMenuItem2.setText("Editar");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu9.add(jMenuItem2);

        jMenuItem10.setText("Excluir");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu9.add(jMenuItem10);

        jMenu1.add(jMenu9);

        jMenu10.setText("Especialidade");

        jMenuItem3.setText("Nova");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu10.add(jMenuItem3);

        jMenuItem4.setText("Editar");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu10.add(jMenuItem4);

        jMenuItem12.setText("Excluir");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu10.add(jMenuItem12);

        jMenu1.add(jMenu10);

        jMenu11.setText("Vacina");

        jMenuItem11.setText("Nova");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu11.add(jMenuItem11);

        jMenuItem13.setText("Editar");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu11.add(jMenuItem13);

        jMenuItem14.setText("Excluir");
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        jMenu11.add(jMenuItem14);

        jMenu1.add(jMenu11);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Agendamento");

        jMenuItem15.setText("Novo");
        jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxNovoActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem15);

        jMenuItem16.setText("Excluir");
        jMenu2.add(jMenuItem16);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Consultas");

        jMenuItem17.setText("Registrar");
        jMenu3.add(jMenuItem17);

        jMenuItem18.setText("Prontuário");
        jMenu3.add(jMenuItem18);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Vacinas");

        jMenuItem19.setText("Aplicar");
        jMenu4.add(jMenuItem19);

        jMenuItem20.setText("Histórico");
        jMenu4.add(jMenuItem20);

        jMenuItem21.setText("Vencimento");
        jMenu4.add(jMenuItem21);

        jMenuBar1.add(jMenu4);

        jMenu5.setText("Cobrança");
        jMenu5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu5ActionPerformed(evt);
            }
        });

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("Emitir");
        jCheckBoxMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem1ActionPerformed(evt);
            }
        });
        jMenu5.add(jCheckBoxMenuItem1);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 546, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 313, Short.MAX_VALUE)
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

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        this.mostrarTela("telaCadFuncionario");
    }                                          

    private void cxNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxNovoActionPerformed
        // TODO add your handling code here:
        this.mostrarTela("telaAgendamento");
    }//GEN-LAST:event_cxNovoActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // obtém a lista de funcionários (inclui veterinários)
        ArrayList<Funcionario> lista = sistema.getFuncionarios();
        if (lista.isEmpty()) {
            JOptionPane.showMessageDialog(
                this,
                "Não há funcionários cadastrados.",
                "Editar Funcionário",
                JOptionPane.INFORMATION_MESSAGE
            );
            return;
        }

        // transforma em array e exibe combo para escolher
        Funcionario[] options = lista.toArray(new Funcionario[0]);
        Funcionario sel = (Funcionario) JOptionPane.showInputDialog(
            this,
            "Escolha o funcionário a editar:",
            "Editar Funcionário",
            JOptionPane.QUESTION_MESSAGE,
            null,
            options,
            options[0]
        );
        if (sel == null) return;  // cancelou

        // monta campos com os valores atuais
        JTextField cxNome   = new JTextField(sel.getNome(), 20);
        JTextField cxCpf    = new JTextField(sel.getCpf(), 20);
        JTextField cxEmail  = new JTextField(sel.getEmail(), 20);
        JTextField cxTel    = new JTextField(sel.getTelefone(), 20);
        JTextField cxTurno  = new JTextField(sel.getTurnoTrab(), 20);

        // componentes extras para Veterinário
        JTextField cxCrmv = new JTextField(20);
        DefaultComboBoxModel<Especialidade> espModel = new DefaultComboBoxModel<>();
        for (Especialidade e : sistema.getEspecialidades()) {
            espModel.addElement(e);
        }
        JComboBox<Especialidade> cbEsp = new JComboBox<>(espModel);

        boolean isVet = sel instanceof Veterinario;
        if (isVet) {
            Veterinario v = (Veterinario) sel;
            cxCrmv.setText(v.getNumCFMV());
            cbEsp.setSelectedItem(v.getEspecialidade());
        }

        // empacota tudo num painel dinâmico
        JPanel panel = new JPanel(new GridLayout(0,1));
        panel.add(new JLabel("Nome:"));      panel.add(cxNome);
        panel.add(new JLabel("CPF:"));       panel.add(cxCpf);
        panel.add(new JLabel("Email:"));     panel.add(cxEmail);
        panel.add(new JLabel("Telefone:"));  panel.add(cxTel);
        panel.add(new JLabel("Turno:"));     panel.add(cxTurno);
        panel.add(new JLabel("CRMV:"));      panel.add(cxCrmv);
        panel.add(new JLabel("Especialidade:")); panel.add(cbEsp);

        // mostra/esconde extras conforme o tipo
        cxCrmv.setVisible(isVet);
        cbEsp.setVisible(isVet);

        // exibe diálogo de confirmação
        int resp = JOptionPane.showConfirmDialog(
            this,
            panel,
            "Editar Funcionário",
            JOptionPane.OK_CANCEL_OPTION,
            JOptionPane.PLAIN_MESSAGE
        );
        if (resp != JOptionPane.OK_OPTION) return;

        // aplica alterações aos campos comuns
        sel.setNome(cxNome.getText().trim());
        sel.setCpf(cxCpf.getText().trim());
        sel.setEmail(cxEmail.getText().trim());
        sel.setTelefone(cxTel.getText().trim());
        sel.setTurnoTrab(cxTurno.getText().trim());

        // se for Veterinário, atualiza CRMV e Especialidade
        if (sel instanceof Veterinario) {
            Veterinario v = (Veterinario) sel;
            v.setNumCFMV(cxCrmv.getText().trim());
            v.setEspecialidade((Especialidade) cbEsp.getSelectedItem());
        }

        // feedback ao usuário
        JOptionPane.showMessageDialog(
            this,
            "Dados do funcionário atualizados com sucesso!",
            "Concluído",
            JOptionPane.INFORMATION_MESSAGE
        );
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        this.mostrarTela("telaCadEspecialidade");
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        // obtém a lista de funcionários (inclui veterinários)
        ArrayList<Funcionario> lista = sistema.getFuncionarios();
        if (lista.isEmpty()) {
            JOptionPane.showMessageDialog(
                this,
                "Não há funcionários cadastrados.",
                "Excluir Funcionário",
                JOptionPane.INFORMATION_MESSAGE
            );
            return;
        }

        // converte em array para usar no combo
        Funcionario[] opcoes = lista.toArray(new Funcionario[0]);

        // exibe o diálogo com JComboBox interno
        Funcionario selecionado = (Funcionario) JOptionPane.showInputDialog(
            this,
            "Selecione o funcionário para excluir:",
            "Excluir Funcionário",
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
            "Funcionário \"" + selecionado.getNome() + "\" excluído com sucesso!",
            "Concluído",
            JOptionPane.INFORMATION_MESSAGE
        );
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // obtém a lista de especialidades
        ArrayList<Especialidade> lista = sistema.getEspecialidades();
        if (lista.isEmpty()) {
            JOptionPane.showMessageDialog(
                this,
                "Não há especialidades cadastradas.",
                "Editar Especialidade",
                JOptionPane.INFORMATION_MESSAGE
            );
            return;
        }

        // converte em array para o combo
        Especialidade[] options = lista.toArray(new Especialidade[0]);
        Especialidade sel = (Especialidade) JOptionPane.showInputDialog(
            this,
            "Escolha a especialidade a editar:",
            "Editar Especialidade",
            JOptionPane.QUESTION_MESSAGE,
            null,
            options,
            options[0]
        );
        if (sel == null) {
            // cancelou
            return;
        }

        // cria campos já preenchidos
        JTextField cxTipo = new JTextField(sel.getTipo(), 20);

        // Recria o mesmo DefaultFormatterFactory do cadastro
        JFormattedTextField cxValor = new JFormattedTextField(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));
        cxValor.setColumns(10);
        cxValor.setValue(sel.getValorEspec());

        // monta o painel
        JPanel panel = new JPanel(new GridLayout(0, 1));
        panel.add(new JLabel("Tipo:"));  panel.add(cxTipo);
        panel.add(new JLabel("Valor:")); panel.add(cxValor);

        // exibe o diálogo de confirmação
        int resp = JOptionPane.showConfirmDialog(
            this,
            panel,
            "Editar Especialidade",
            JOptionPane.OK_CANCEL_OPTION,
            JOptionPane.PLAIN_MESSAGE
        );
        if (resp != JOptionPane.OK_OPTION) {
            return;
        }

        // aplica as alterações no objeto
        sel.setTipo(cxTipo.getText().trim());
        Object val = cxValor.getValue();
        if (val instanceof Number) {
            sel.setValorEspec(((Number) val).doubleValue());
        }

        JOptionPane.showMessageDialog(
            this,
            "Especialidade atualizada com sucesso!",
            "Concluído",
            JOptionPane.INFORMATION_MESSAGE
        );
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        // obtém a lista de especialidades
        ArrayList<Especialidade> lista = sistema.getEspecialidades();
        if (lista.isEmpty()) {
            JOptionPane.showMessageDialog(
                this,
                "Não há especialidades cadastradas.",
                "Excluir Especialidade",
                JOptionPane.INFORMATION_MESSAGE
            );
            return;
        }

        // converte em array para o combo
        Especialidade[] opcoes = lista.toArray(new Especialidade[0]);

        // exibe o diálogo com JComboBox interno
        Especialidade selecionada = (Especialidade) JOptionPane.showInputDialog(
            this,
            "Selecione a especialidade para excluir:",
            "Excluir Especialidade",
            JOptionPane.QUESTION_MESSAGE,
            null,
            opcoes,
            opcoes[0]
        );
        if (selecionada == null) {
            // usuário cancelou
            return;
        }

        // remove e notifica
        lista.remove(selecionada);
        JOptionPane.showMessageDialog(
            this,
            "Especialidade \"" + selecionada.getTipo() + "\" excluída com sucesso!",
            "Concluído",
            JOptionPane.INFORMATION_MESSAGE
        );
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        this.mostrarTela("telaCadVacina");
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        // obtém a lista de vacinas
        ArrayList<Vacina> lista = sistema.getVacinas();
        if (lista.isEmpty()) {
            JOptionPane.showMessageDialog(
                this,
                "Não há vacinas cadastradas.",
                "Editar Vacina",
                JOptionPane.INFORMATION_MESSAGE
            );
            return;
        }

        // converte em array para o combo
        Vacina[] options = lista.toArray(new Vacina[0]);
        Vacina sel = (Vacina) JOptionPane.showInputDialog(
            this,
            "Escolha a vacina a editar:",
            "Editar Vacina",
            JOptionPane.QUESTION_MESSAGE,
            null,
            options,
            options[0]
        );
        if (sel == null) {
            // usuário cancelou
            return;
        }

        // cria campos pré-preenchidos
        JTextField cxNome = new JTextField(sel.getNome(), 20);

        JFormattedTextField cxValor = new JFormattedTextField(
            new javax.swing.text.DefaultFormatterFactory(
                new javax.swing.text.NumberFormatter()
            )
        );
        cxValor.setColumns(10);
        cxValor.setValue(sel.getValor());

        // monta o painel de edição
        JPanel panel = new JPanel(new GridLayout(0, 1));
        panel.add(new JLabel("Nome:"));  
        panel.add(cxNome);
        panel.add(new JLabel("Valor:")); 
        panel.add(cxValor);

        // exibe diálogo de confirmação
        int resp = JOptionPane.showConfirmDialog(
            this,
            panel,
            "Editar Vacina",
            JOptionPane.OK_CANCEL_OPTION,
            JOptionPane.PLAIN_MESSAGE
        );
        if (resp != JOptionPane.OK_OPTION) {
            return;
        }

        // aplica as alterações no objeto
        sel.setNome(cxNome.getText().trim());
        Object val = cxValor.getValue();
        if (val instanceof Number) {
            sel.setValor(((Number) val).doubleValue());
        }

        // feedback
        JOptionPane.showMessageDialog(
            this,
            "Vacina atualizada com sucesso!",
            "Concluído",
            JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
        ArrayList<Vacina> lista = sistema.getVacinas();
        if (lista.isEmpty()) {
            JOptionPane.showMessageDialog(
                this,
                "Não há vacinas cadastradas.",
                "Excluir Vacina",
                JOptionPane.INFORMATION_MESSAGE
            );
            return;
        }

        // converte em array para o combo
        Vacina[] opcoes = lista.toArray(new Vacina[0]);

        // exibe diálogo de seleção
        Vacina sel = (Vacina) JOptionPane.showInputDialog(
            this,
            "Selecione a vacina para excluir:",
            "Excluir Vacina",
            JOptionPane.QUESTION_MESSAGE,
            null,
            opcoes,
            opcoes[0]
        );
        if (sel == null) {
            // cancelou
            return;
        }

        // remove e notifica
        lista.remove(sel);
        JOptionPane.showMessageDialog(
            this,
            "Vacina \"" + sel.getNome() + "\" excluída com sucesso!",
            "Concluído",
            JOptionPane.INFORMATION_MESSAGE
        );
    }//GEN-LAST:event_jMenuItem14ActionPerformed

    private void jMenu5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu5ActionPerformed

    private void jCheckBoxMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem1ActionPerformed
        // TODO add your handling code here:
        ArrayList<Animal> lista = sistema.getAnimais();
        if (lista.isEmpty()) {
            JOptionPane.showMessageDialog(
                this,
                "Não há animais cadastrados.",
                "Emitir Cobrança",
                JOptionPane.INFORMATION_MESSAGE
            );
            return;
        }

        // converte em array para o combo
        Animal[] opcoes = lista.toArray(new Animal[0]);

        // exibe o dialog com combo
        Animal selecionado = (Animal) JOptionPane.showInputDialog(
            this,
            "Selecione o animal para emitir cobrança:",
            "Emitir Cobrança",
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
//        lista.remove(selecionado);
        JOptionPane.showMessageDialog(
            this,
            "Valor total: " + selecionado.emitirCobranca(),
            "Concluído",
            JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jCheckBoxMenuItem1ActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem cxNovo;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem19;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem20;
    private javax.swing.JMenuItem jMenuItem21;
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
