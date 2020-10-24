/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lifenotemusiccenter_official;

import lifenotemusiccenter_official.Accessories;
import lifenotemusiccenter_official.AdminRegistration;
import lifenotemusiccenter_official.BasicCalculator;
import lifenotemusiccenter_official.Books;
import lifenotemusiccenter_official.CustomerTransactionHistory;
import lifenotemusiccenter_official.Customers;
import lifenotemusiccenter_official.Instruments;
import lifenotemusiccenter_official.Purchase;
import lifenotemusiccenter_official.UpdateHistory;
import lifenotemusiccenter_official.About;

/**
 *
 * @author lenovo
 */
public class Dashboard extends javax.swing.JFrame {

    Accessories A = new Accessories();
    Books B = new Books();
    Instruments I = new Instruments();
    Purchase P = new Purchase();
    
    public Dashboard() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        JbtnInstruments = new javax.swing.JButton();
        JbtnAccessories = new javax.swing.JButton();
        JbtnBooks = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        JbtnDeliveries = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        JbtnAdministrator = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        JbtnAbout = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        JbtnPurchase = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        JbtnCustomerHistory = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        JbtnBasicCal = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        JbtnInitiateCustomer = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Life Note Music Center - Dashboard");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Item / Stock / Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Ice kingdom", 0, 12))); // NOI18N

        JbtnInstruments.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lifenotemusiccenter/Instruments icon.png"))); // NOI18N
        JbtnInstruments.setBorder(null);
        JbtnInstruments.setContentAreaFilled(false);
        JbtnInstruments.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        JbtnInstruments.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbtnInstrumentsActionPerformed(evt);
            }
        });

        JbtnAccessories.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lifenotemusiccenter/accessories icon.png"))); // NOI18N
        JbtnAccessories.setBorder(null);
        JbtnAccessories.setContentAreaFilled(false);
        JbtnAccessories.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        JbtnAccessories.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbtnAccessoriesActionPerformed(evt);
            }
        });

        JbtnBooks.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lifenotemusiccenter/book icon.png"))); // NOI18N
        JbtnBooks.setBorder(null);
        JbtnBooks.setContentAreaFilled(false);
        JbtnBooks.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        JbtnBooks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbtnBooksActionPerformed(evt);
            }
        });

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Instruments");
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Accessories");
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Books");
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Update History");
        jLabel12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        JbtnDeliveries.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lifenotemusiccenter/Instruments icon.png"))); // NOI18N
        JbtnDeliveries.setBorder(null);
        JbtnDeliveries.setContentAreaFilled(false);
        JbtnDeliveries.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        JbtnDeliveries.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbtnDeliveriesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(JbtnInstruments, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(JbtnAccessories, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JbtnBooks, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JbtnDeliveries, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JbtnInstruments, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JbtnAccessories, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JbtnBooks, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(JbtnDeliveries, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(311, 94, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 204, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)), "Administrator", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Ice kingdom", 0, 12))); // NOI18N

        JbtnAdministrator.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lifenotemusiccenter/admin icon.png"))); // NOI18N
        JbtnAdministrator.setBorder(null);
        JbtnAdministrator.setContentAreaFilled(false);
        JbtnAdministrator.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        JbtnAdministrator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbtnAdministratorActionPerformed(evt);
            }
        });

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Administrator");
        jLabel8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        JbtnAbout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lifenotemusiccenter/about icon.png"))); // NOI18N
        JbtnAbout.setBorder(null);
        JbtnAbout.setContentAreaFilled(false);
        JbtnAbout.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        JbtnAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbtnAboutActionPerformed(evt);
            }
        });

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("About");
        jLabel11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JbtnAdministrator, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 150, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(JbtnAbout, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(JbtnAdministrator, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(JbtnAbout, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(361, 253, -1, -1));

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Customer", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Ice kingdom", 0, 12))); // NOI18N

        JbtnPurchase.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lifenotemusiccenter/purchase icon.png"))); // NOI18N
        JbtnPurchase.setBorder(null);
        JbtnPurchase.setContentAreaFilled(false);
        JbtnPurchase.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        JbtnPurchase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbtnPurchaseActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Purchase");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        JbtnCustomerHistory.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lifenotemusiccenter/customer history icon.png"))); // NOI18N
        JbtnCustomerHistory.setBorder(null);
        JbtnCustomerHistory.setContentAreaFilled(false);
        JbtnCustomerHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbtnCustomerHistoryActionPerformed(evt);
            }
        });

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Transaction History");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        JbtnBasicCal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lifenotemusiccenter/basic calculator icon.png"))); // NOI18N
        JbtnBasicCal.setBorder(null);
        JbtnBasicCal.setContentAreaFilled(false);
        JbtnBasicCal.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        JbtnBasicCal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbtnBasicCalActionPerformed(evt);
            }
        });

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Basic Calculator");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        JbtnInitiateCustomer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lifenotemusiccenter/initiate customer icon.png"))); // NOI18N
        JbtnInitiateCustomer.setBorder(null);
        JbtnInitiateCustomer.setContentAreaFilled(false);
        JbtnInitiateCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbtnInitiateCustomerActionPerformed(evt);
            }
        });

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Customer");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JbtnPurchase, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JbtnBasicCal, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(128, 128, 128))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JbtnInitiateCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JbtnCustomerHistory, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(94, 94, 94))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(JbtnBasicCal, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(JbtnPurchase, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(JbtnCustomerHistory, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(JbtnInitiateCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)))
                .addContainerGap())
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 94, 295, 301));

        jLabel9.setFont(new java.awt.Font("Ice kingdom", 0, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 204, 0));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("DASHBOARD");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 797, 83));

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 810, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 420, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 420));

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-816)/2, (screenSize.height-449)/2, 816, 449);
    }// </editor-fold>//GEN-END:initComponents

    private void JbtnPurchaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbtnPurchaseActionPerformed
        P.setVisible(true);
    }//GEN-LAST:event_JbtnPurchaseActionPerformed

    private void JbtnBasicCalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbtnBasicCalActionPerformed
        new BasicCalculator().setVisible(true);
    }//GEN-LAST:event_JbtnBasicCalActionPerformed

    private void JbtnBooksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbtnBooksActionPerformed
        new Books().setVisible(true);
    }//GEN-LAST:event_JbtnBooksActionPerformed

    private void JbtnInstrumentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbtnInstrumentsActionPerformed
        new Instruments().setVisible(true);
    }//GEN-LAST:event_JbtnInstrumentsActionPerformed

    private void JbtnAccessoriesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbtnAccessoriesActionPerformed
        new Accessories().setVisible(true);
    }//GEN-LAST:event_JbtnAccessoriesActionPerformed

    private void JbtnAdministratorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbtnAdministratorActionPerformed
        new AdminRegistration().setVisible(true);
    }//GEN-LAST:event_JbtnAdministratorActionPerformed

    private void JbtnAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbtnAboutActionPerformed
        new About().setVisible(true);
    }//GEN-LAST:event_JbtnAboutActionPerformed

    private void JbtnDeliveriesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbtnDeliveriesActionPerformed
        new UpdateHistory().setVisible(true);
    }//GEN-LAST:event_JbtnDeliveriesActionPerformed

    private void JbtnInitiateCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbtnInitiateCustomerActionPerformed
        new Customers().setVisible(true);
    }//GEN-LAST:event_JbtnInitiateCustomerActionPerformed

    private void JbtnCustomerHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbtnCustomerHistoryActionPerformed
        new CustomerTransactionHistory().setVisible(true);
    }//GEN-LAST:event_JbtnCustomerHistoryActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JbtnAbout;
    private javax.swing.JButton JbtnAccessories;
    private javax.swing.JButton JbtnAdministrator;
    private javax.swing.JButton JbtnBasicCal;
    private javax.swing.JButton JbtnBooks;
    private javax.swing.JButton JbtnCustomerHistory;
    private javax.swing.JButton JbtnDeliveries;
    private javax.swing.JButton JbtnInitiateCustomer;
    private javax.swing.JButton JbtnInstruments;
    private javax.swing.JButton JbtnPurchase;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
