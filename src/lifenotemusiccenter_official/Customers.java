/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lifenotemusiccenter_official;

import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import lifenotemusiccenter_official.MyConn;

/**
 *
 * @author lenovo
 */
public class Customers extends javax.swing.JFrame {

    /**
     * Creates new form Purchase
     */
    public Customers() {
        initComponents();
        search_customer();
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
        jLabel2 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtContact1 = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaAddress1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAreaAddress2 = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtContact2 = new javax.swing.JTextField();
        JbtnDelete = new javax.swing.JButton();
        JbtnUpdate = new javax.swing.JButton();
        JbtnInsert = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Life Note Music Center - Customer");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)), "Customer Info", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, new java.awt.Color(255, 204, 0)));
        jPanel1.setOpaque(false);

        jLabel2.setForeground(new java.awt.Color(255, 204, 0));
        jLabel2.setText("ID");

        txtContact1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContact1ActionPerformed(evt);
            }
        });

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNameKeyReleased(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(255, 204, 0));
        jLabel4.setText("Name");

        jLabel5.setForeground(new java.awt.Color(255, 204, 0));
        jLabel5.setText("Contact 1");

        jLabel7.setForeground(new java.awt.Color(255, 204, 0));
        jLabel7.setText("Address 1");

        txtAreaAddress1.setColumns(20);
        txtAreaAddress1.setLineWrap(true);
        txtAreaAddress1.setRows(5);
        jScrollPane1.setViewportView(txtAreaAddress1);

        txtAreaAddress2.setColumns(20);
        txtAreaAddress2.setLineWrap(true);
        txtAreaAddress2.setRows(5);
        jScrollPane2.setViewportView(txtAreaAddress2);

        jLabel8.setForeground(new java.awt.Color(255, 204, 0));
        jLabel8.setText("Address 2");

        jLabel6.setForeground(new java.awt.Color(255, 204, 0));
        jLabel6.setText("Contact 2");

        txtContact2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContact2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jScrollPane1))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtContact1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jScrollPane2)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtContact2, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtContact1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtContact2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 45, -1, -1));

        JbtnDelete.setBackground(new java.awt.Color(255, 0, 0));
        JbtnDelete.setText("Delete");
        JbtnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbtnDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(JbtnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 404, 67, 30));

        JbtnUpdate.setBackground(new java.awt.Color(51, 255, 51));
        JbtnUpdate.setText("Update");
        JbtnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbtnUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(JbtnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 355, -1, 34));

        JbtnInsert.setBackground(new java.awt.Color(51, 255, 51));
        JbtnInsert.setText("Insert");
        JbtnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbtnInsertActionPerformed(evt);
            }
        });
        getContentPane().add(JbtnInsert, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 311, 67, 30));

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator1.setToolTipText("");
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(453, 0, -1, 445));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Contact 1", "Contact 2", "Address 1", "Address 2"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable1);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(461, 11, -1, 423));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        jLabel3.setFont(new java.awt.Font("Orbitron", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 204, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Initiate Customer");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(493, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(427, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -10, 950, 480));

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-939)/2, (screenSize.height-484)/2, 939, 484);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyReleased
   }//GEN-LAST:event_txtNameKeyReleased

    private void JbtnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbtnDeleteActionPerformed
        try {
            String DEL_Customer = "delete from customer where ID = '" + txtId.getText() + "'";
            MyConn.save(DEL_Customer);
            search_customer();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_JbtnDeleteActionPerformed

    private void JbtnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbtnUpdateActionPerformed
        try {
            //String Up_Customer_find = "select all from customer where ID = '" + txtId.getText() + "'";
            String UP_Customer = "update customer set Name = '" + txtName.getText() + "',"
                    + "`Contact 1` = '" + txtContact1.getText() + "',"
                    + "`Contact 2` = '" + txtContact2.getText() + "',"
                    + "`Address 1`='" + txtAreaAddress1.getText() + "',"
                    + "`Address 2`='" + txtAreaAddress2.getText() + "' where ID = '" + txtId.getText() + "'";
            MyConn.save(UP_Customer);
            search_customer();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_JbtnUpdateActionPerformed

    private void JbtnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbtnInsertActionPerformed
        try {
            String c1 = txtContact1.getText();
            String c2 = txtContact2.getText();

            String CustomerCheckName = "select*from customer where `Name` = '" + txtName.getText() + "'";
            String CustomerCheckContact1 = "select*from customer where `Contact 1` = '" + c1 + "'";
            String CustomerCheckContact2 = "select*from customer where `Contact 2` = '" + c2 + "'";

            boolean contactcheck = (CustomerCheckContact1.equals(c1) || CustomerCheckContact1.equals(c2))
                    || (CustomerCheckContact2.equals(c1) || CustomerCheckContact2.equals(c2));

            if (txtName.getText().equals(CustomerCheckName) && contactcheck) {
                JOptionPane.showMessageDialog(this, "Customer is already initialized", "", JOptionPane.ERROR_MESSAGE);
            } else {
                String Insert = "insert into customer(Name,`Contact 1`,`Contact 2`,`Address 1`,`Address 2`,`Date Initialized`)"
                        + "values('" + txtName.getText() + "','"
                        + txtContact1.getText() + "','" + txtContact2.getText()
                        + "','" + txtAreaAddress1.getText() + "','"
                        + txtAreaAddress2.getText() + "',current_timestamp)";
                MyConn.save(Insert);
                showSearchedCustomer();
                JOptionPane.showMessageDialog(this, "Customer Initialized");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_JbtnInsertActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int row = jTable1.getSelectedRow();

        String ID = jTable1.getValueAt(row, 0) + "";
        txtId.setText(ID);

        String Name = jTable1.getValueAt(row, 1) + "";
        txtName.setText(Name);

        String Cont1 = jTable1.getValueAt(row, 2) + "";
        txtContact1.setText(Cont1);

        String Cont2 = jTable1.getValueAt(row, 3) + "";
        txtContact2.setText(Cont2);

        String Add1 = jTable1.getValueAt(row, 4) + "";
        txtAreaAddress1.setText(Add1);

        String Add2 = jTable1.getValueAt(row, 5) + "";
        txtAreaAddress2.setText(Add2);
    }//GEN-LAST:event_jTable1MouseClicked

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        txtContact1.requestFocusInWindow();
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtContact1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContact1ActionPerformed
        txtContact2.requestFocusInWindow();
    }//GEN-LAST:event_txtContact1ActionPerformed

    private void txtContact2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContact2ActionPerformed
        txtAreaAddress1.requestFocusInWindow();
    }//GEN-LAST:event_txtContact2ActionPerformed

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
            java.util.logging.Logger.getLogger(Customers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Customers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Customers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Customers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Customers().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JbtnDelete;
    private javax.swing.JButton JbtnInsert;
    private javax.swing.JButton JbtnUpdate;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea txtAreaAddress1;
    private javax.swing.JTextArea txtAreaAddress2;
    private javax.swing.JTextField txtContact1;
    private javax.swing.JTextField txtContact2;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables

    private void search_customer() {
        try {
            String search = "select*from lifenotemusiccenter.customer";
            ResultSet rs = MyConn.search(search);
            DefaultTableModel df = (DefaultTableModel) jTable1.getModel();
            df.setRowCount(0);
            while (rs.next()) {
                //df.removeRow(0);
                Vector v = new Vector();
                v.add(rs.getString("ID"));
                v.add(rs.getString("Name"));
                v.add(rs.getString("Contact 1"));
                v.add(rs.getString("Contact 2"));
                v.add(rs.getString("Address 1"));
                v.add(rs.getString("Address 2"));
                df.addRow(v);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void showSearchedCustomer() {
        try {
            String search = "select*from customer where Name='" + txtName.getText() + "'";
            ResultSet rs = MyConn.search(search);
            DefaultTableModel df = (DefaultTableModel) jTable1.getModel();
            df.setRowCount(0);
            while (rs.next()) {
                Vector v = new Vector();
                v.add(rs.getString("ID"));
                v.add(rs.getString("Name"));
                v.add(rs.getString("Contact 1"));
                v.add(rs.getString("Contact 2"));
                v.add(rs.getString("Address 1"));
                v.add(rs.getString("Address 2"));
                df.addRow(v);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
