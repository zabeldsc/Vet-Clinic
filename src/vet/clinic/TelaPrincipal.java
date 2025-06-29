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

    public TelaPrincipal() {
        setTitle("Sistema Exemplo");
        setSize(500, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        cardLayout = new CardLayout();
        container = new JPanel(cardLayout);

        // Adiciona as telas no container
        container.add(new TelaLogin(this), "login");
        container.add(new TelaMenu(this), "menu");
//        container.add(new TelaCadastro(this), "cadastro");
//        container.add(new TelaConfiguracoes(this), "config");

        add(container);
        cardLayout.show(container, "login");
    }

    public void mostrarTela(String nome) {
        cardLayout.show(container, nome);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
