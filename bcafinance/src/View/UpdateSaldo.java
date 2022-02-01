/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Config.ConfigSession;
import Hibernate.Saldo;
import java.util.Iterator;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author GEMBUL
 */
public class UpdateSaldo extends javax.swing.JDialog {

    /**
     * Creates new form UpdateSaldo
     */
    Saldo b = new Saldo();
    public UpdateSaldo(java.awt.Frame parent, boolean modal, String id_saldo) {
        super(parent, modal);
        try {
            Session session = ConfigSession.getSessionFactory().openSession();
            session.beginTransaction();
            Query query = session.createQuery("from Saldo where id_saldo = :id_saldo");
            query.setParameter("id_saldo", id_saldo);
            List ls = query.list();
            Iterator it = ls.iterator();
            while (it.hasNext()) {
                b = (Saldo) it.next();
            }
            session.getTransaction().commit();
        } catch (HibernateException he) {
            he.printStackTrace();
        }
        initComponents();

        jid_saldoUpsa.setText(b.getId_saldo());
        jnamaUpsa.setText(b.getPemilik_saldo());
        jtotalUpsa.setText(String.valueOf(b.getTotal_saldo()));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jid_saldoUpsa = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jnamaUpsa = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jtotalUpsa = new javax.swing.JTextField();
        backSaldo = new javax.swing.JButton();
        clearSaldo = new javax.swing.JButton();
        updateSaldo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("UPDATE SALDO");

        jLabel2.setText("ID NASABAH");

        jLabel3.setText("NAMA");

        jLabel4.setText("TOTAL SALDO");

        backSaldo.setText("BACK");
        backSaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backSaldoActionPerformed(evt);
            }
        });

        clearSaldo.setText("CLEAR");
        clearSaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearSaldoActionPerformed(evt);
            }
        });

        updateSaldo.setText("UPDATE");
        updateSaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateSaldoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jid_saldoUpsa)
                                    .addComponent(jnamaUpsa)
                                    .addComponent(jtotalUpsa, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(clearSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(updateSaldo)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jid_saldoUpsa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jnamaUpsa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtotalUpsa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateSaldo)
                    .addComponent(clearSaldo)
                    .addComponent(backSaldo))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backSaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backSaldoActionPerformed
        new MainMenu().setVisible(true);
        this.dispose();            // TODO add your handling code here:
    }//GEN-LAST:event_backSaldoActionPerformed

    private void clearSaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearSaldoActionPerformed
        jid_saldoUpsa.setText(null);
        jnamaUpsa.setText(null);
        jtotalUpsa.setText(null);       // TODO add your handling code here:                                    // TODO add your handling code here:
    }//GEN-LAST:event_clearSaldoActionPerformed

    private void updateSaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateSaldoActionPerformed
        try {
            Session session = ConfigSession.getSessionFactory().openSession();
            session.beginTransaction();
            b.setId_saldo(jid_saldoUpsa.getText());
            b.setPemilik_saldo(jnamaUpsa.getText());
            b.setTotal_saldo(Float.parseFloat(jtotalUpsa.getText()));
            session.update(b);
            session.getTransaction().commit();
            JOptionPane.showMessageDialog(this, "Ubah Berhasil");
        } catch (HibernateException he) {
            JOptionPane.showMessageDialog(this, "Ubah Gagal");
            he.printStackTrace();
        }       // TODO add your handling code here:
    }//GEN-LAST:event_updateSaldoActionPerformed

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
            java.util.logging.Logger.getLogger(UpdateSaldo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateSaldo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateSaldo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateSaldo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
       /* java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                UpdateSaldo dialog = new UpdateSaldo(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        }); */
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backSaldo;
    private javax.swing.JButton clearSaldo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jid_saldoUpsa;
    private javax.swing.JTextField jnamaUpsa;
    private javax.swing.JTextField jtotalUpsa;
    private javax.swing.JButton updateSaldo;
    // End of variables declaration//GEN-END:variables
}