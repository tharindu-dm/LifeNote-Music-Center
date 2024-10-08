/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lifenotemusiccenter_official;

import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRTableModelDataSource;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Tharindu Munasinghe
 */
public class UpdateHistory extends javax.swing.JFrame {

    /**
     * Creates new form CustomerTransactionHistory
     */
    public UpdateHistory() {
        initComponents();
        SearchUodateHistory();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btngrp_Name_PurchaseID = new javax.swing.ButtonGroup();
        BG = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        JRB_DB_TABLE = new javax.swing.JRadioButton();
        JRB_ITEMID = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        JCB_Month = new javax.swing.JComboBox();
        JCB_Date = new javax.swing.JComboBox();
        jButton2 = new javax.swing.JButton();
        txtYear = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        JtblUpdateHistory = new javax.swing.JTable();
        Jbtn_RefreshTable = new javax.swing.JButton();
        btnPrintReport = new javax.swing.JButton();
        btnALLDEL = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("LNMC - Update History");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BG.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Orbitron", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Update History");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)), "Search & Filters", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, new java.awt.Color(255, 204, 0)));
        jPanel1.setOpaque(false);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)), "By DB Table Name / Item ID", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, new java.awt.Color(255, 204, 0)));
        jPanel2.setOpaque(false);

        jTextField1.setText("Enter DB Table Name / Item ID");
        jTextField1.setEnabled(false);
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });

        btngrp_Name_PurchaseID.add(JRB_DB_TABLE);
        JRB_DB_TABLE.setForeground(new java.awt.Color(255, 204, 0));
        JRB_DB_TABLE.setText("DB Table Name");
        JRB_DB_TABLE.setOpaque(false);
        JRB_DB_TABLE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JRB_DB_TABLEActionPerformed(evt);
            }
        });

        btngrp_Name_PurchaseID.add(JRB_ITEMID);
        JRB_ITEMID.setForeground(new java.awt.Color(255, 204, 0));
        JRB_ITEMID.setText("Item ID");
        JRB_ITEMID.setOpaque(false);
        JRB_ITEMID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JRB_ITEMIDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField1)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JRB_DB_TABLE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(JRB_ITEMID)
                .addGap(26, 26, 26))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JRB_DB_TABLE)
                    .addComponent(JRB_ITEMID))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)), "By Date", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, new java.awt.Color(255, 204, 0)));
        jPanel3.setOpaque(false);

        JCB_Month.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Month:", "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }));
        JCB_Month.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCB_MonthActionPerformed(evt);
            }
        });

        JCB_Date.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Date:", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        jButton2.setBackground(new java.awt.Color(0, 255, 0));
        jButton2.setText("Arrange Table");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        txtYear.setText("Year:");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Required");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Required");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(txtYear, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                .addGap(16, 16, 16)
                .addComponent(JCB_Month, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JCB_Date, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(71, 71, 71)
                .addComponent(jLabel4)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JCB_Month, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JCB_Date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        JtblUpdateHistory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "UH ID", "DB Table", "Item ID", "Added Stock", "OC Name", "OC Brand/Author", "OC Type", "OC Unit Price", "Date and Time"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JtblUpdateHistory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JtblUpdateHistoryMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(JtblUpdateHistory);

        Jbtn_RefreshTable.setBackground(new java.awt.Color(0, 255, 0));
        Jbtn_RefreshTable.setText("Refresh Table");
        Jbtn_RefreshTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jbtn_RefreshTableActionPerformed(evt);
            }
        });

        btnPrintReport.setBackground(new java.awt.Color(255, 255, 0));
        btnPrintReport.setText("Print Full Report");
        btnPrintReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintReportActionPerformed(evt);
            }
        });

        btnALLDEL.setBackground(new java.awt.Color(255, 0, 51));
        btnALLDEL.setText("Delete All Update History Entries");
        btnALLDEL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnALLDELActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BGLayout = new javax.swing.GroupLayout(BG);
        BG.setLayout(BGLayout);
        BGLayout.setHorizontalGroup(
            BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BGLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(Jbtn_RefreshTable, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(BGLayout.createSequentialGroup()
                .addGap(227, 227, 227)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 837, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(BGLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(btnALLDEL, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(BGLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(btnPrintReport, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(BGLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 817, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        BGLayout.setVerticalGroup(
            BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BGLayout.createSequentialGroup()
                .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BGLayout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(Jbtn_RefreshTable, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(BGLayout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(btnALLDEL))
                    .addGroup(BGLayout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(btnPrintReport))
                    .addGroup(BGLayout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(BG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 550));

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-853)/2, (screenSize.height-575)/2, 853, 575);
    }// </editor-fold>//GEN-END:initComponents

    private void JRB_DB_TABLEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JRB_DB_TABLEActionPerformed
        if (JRB_DB_TABLE.isSelected()) {
            jTextField1.setEnabled(true);
            jTextField1.setEditable(true);
            jTextField1.setText("");
        } else {
            jTextField1.setEnabled(false);
            jTextField1.setText("Enter Customer Name / Purchase ID");
        }
    }//GEN-LAST:event_JRB_DB_TABLEActionPerformed

    private void JRB_ITEMIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JRB_ITEMIDActionPerformed
        if (JRB_ITEMID.isSelected()) {
            jTextField1.setEnabled(true);
            jTextField1.setEditable(true);
            jTextField1.setText("");
        } else {
            jTextField1.setEnabled(false);
            jTextField1.setText("Enter Customer Name / Purchase ID");
        }
    }//GEN-LAST:event_JRB_ITEMIDActionPerformed

    private void JtblUpdateHistoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JtblUpdateHistoryMouseClicked
        int row = JtblUpdateHistory.getSelectedRow();
    }//GEN-LAST:event_JtblUpdateHistoryMouseClicked

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        if (JRB_DB_TABLE.isSelected()) {
            try {

                DefaultTableModel df = (DefaultTableModel) JtblUpdateHistory.getModel();
                String Search = "SELECT * FROM lifenotemusiccenter.grn where "
                        + "`DB Table` like '" + jTextField1.getText() + "%'";

                ResultSet RSsearch = (ResultSet) MyConn.search(Search);
                df.setRowCount(0);
                while (RSsearch.next()) {
                    Vector v = new Vector();
                    v.add(RSsearch.getString("ID"));
                    v.add(RSsearch.getString("DB Table"));
                    v.add(RSsearch.getString("Item ID"));
                    v.add(RSsearch.getString("Added Stock"));
                    v.add(RSsearch.getString("Other changes_Name"));
                    v.add(RSsearch.getString("Other changese_Brand_Author"));
                    v.add(RSsearch.getString("Other changes_Type"));
                    v.add(RSsearch.getString("Other changes_Unit Price"));
                    v.add(RSsearch.getString("Date and Time"));
                    df.addRow(v);
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        } else if (JRB_ITEMID.isSelected()) {
            try {

                DefaultTableModel df = (DefaultTableModel) JtblUpdateHistory.getModel();
                String Search = "SELECT * FROM lifenotemusiccenter.grn where "
                        + "`Item ID` Like '" + jTextField1.getText() + "%'";

                ResultSet RSsearch = (ResultSet) MyConn.search(Search);
                df.setRowCount(0);
                while (RSsearch.next()) {
                    Vector v = new Vector();
                    v.add(RSsearch.getString("ID"));
                    v.add(RSsearch.getString("DB Table"));
                    v.add(RSsearch.getString("Item ID"));
                    v.add(RSsearch.getString("Added Stock"));
                    v.add(RSsearch.getString("Other changes_Name"));
                    v.add(RSsearch.getString("Other changese_Brand_Author"));
                    v.add(RSsearch.getString("Other changes_Type"));
                    v.add(RSsearch.getString("Other changes_Unit Price"));
                    v.add(RSsearch.getString("Date and Time"));
                    df.addRow(v);
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        } else {
        }
    }//GEN-LAST:event_jTextField1KeyReleased

    private void btnPrintReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintReportActionPerformed
        JOptionPane.showMessageDialog(this, "The report will be consists by the current table values"
                + "\n" + "Do you wish to continue?",
                "For Your Information", JOptionPane.OK_CANCEL_OPTION);
        try {
            JasperReport report = JasperCompileManager.compileReport("UpdateHistroyReport.jrxml");
            DefaultTableModel df = (DefaultTableModel) JtblUpdateHistory.getModel();
            JasperPrint print = JasperFillManager.fillReport(report, null, new JRTableModelDataSource(df));
            JasperViewer.viewReport(print, false);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnPrintReportActionPerformed

    private void btnALLDELActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnALLDELActionPerformed
        SearchUodateHistory();
        int check = JOptionPane.showConfirmDialog(this, "This will delete all the entries so far,"
                + " forever (a very long time)" + "\n" + "Do you wish to continue?",
                "!!! WARNING !!!", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (check == 0) {
             try {
            int count = JtblUpdateHistory.getRowCount();

            while (count > 0) {
                String delete = "Delete from grn where ID = '"
                        + (JtblUpdateHistory.getValueAt(0, 0) + "") + "'";
                MyConn.save(delete);

                count = count - 1;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        } else {
        }      
    }//GEN-LAST:event_btnALLDELActionPerformed

    private void Jbtn_RefreshTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jbtn_RefreshTableActionPerformed
        SearchUodateHistory();
    }//GEN-LAST:event_Jbtn_RefreshTableActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int SelectMonth = JCB_Month.getSelectedIndex();
        int SelectDate = JCB_Date.getSelectedIndex();
        String year = txtYear.getText();
        DefaultTableModel df = (DefaultTableModel) JtblUpdateHistory.getModel();

        boolean month = SelectMonth == 0 || SelectMonth == -1;
        boolean date = SelectDate == 0 || SelectDate == -1;

        if (month) {
            JCB_Month.requestFocusInWindow();
            JOptionPane.showMessageDialog(this, "Select Month", "Month is not identified", JOptionPane.ERROR_MESSAGE);
        } else {
            if (date) {
                //no date given
                try {
                    //SelectMonth++;
                    if (SelectMonth > 9) {
                        String monthTitle = SelectMonth + "";

                        String Searching = year + "-" + monthTitle;
                        String monthsearch = "SELECT*FROM `lifenotemusiccenter`.`grn` where `Date and Time` like '" + Searching + "%'";
                        ResultSet rs = (ResultSet) MyConn.search(monthsearch);
                        df.setRowCount(0);
                        while (rs.next()) {
                            Vector v = new Vector();
                            v.add(rs.getString("ID"));
                            v.add(rs.getString("DB Table"));
                            v.add(rs.getString("Item ID"));
                            v.add(rs.getString("Added Stock"));
                            v.add(rs.getString("Other changes_Name"));
                            v.add(rs.getString("Other changese_Brand_Author"));
                            v.add(rs.getString("Other changes_Type"));
                            v.add(rs.getString("Other changes_Unit Price"));
                            v.add(rs.getString("Date and Time"));
                            df.addRow(v);
                        }
                    } else {
                        String monthTitle = "0" + SelectMonth + "";

                        String Searching = year + "-" + monthTitle;
                        String monthsearch = "SELECT*FROM `lifenotemusiccenter`.`grn` where `Date and Time` like '" + Searching + "%'";
                        ResultSet rs = (ResultSet) MyConn.search(monthsearch);
                        df.setRowCount(0);
                        while (rs.next()) {
                            Vector v = new Vector();
                            v.add(rs.getString("ID"));
                            v.add(rs.getString("DB Table"));
                            v.add(rs.getString("Item ID"));
                            v.add(rs.getString("Added Stock"));
                            v.add(rs.getString("Other changes_Name"));
                            v.add(rs.getString("Other changese_Brand_Author"));
                            v.add(rs.getString("Other changes_Type"));
                            v.add(rs.getString("Other changes_Unit Price"));
                            v.add(rs.getString("Date and Time"));
                            df.addRow(v);
                        }
                    }
                } catch (Exception e) {
                    System.out.println(e);
                }
                //when date was given
            } else {
                try {
                    String dateTitle = SelectDate + "";
                    if (SelectDate >= 10) {
                        if (SelectMonth >= 10) {
                            String monthTitle = SelectMonth + "";
                            String Searching = year + "-" + monthTitle + "-" + dateTitle;

                            String monthsearch = "SELECT*FROM `lifenotemusiccenter`.`grn` where `Date and Time` like '" + Searching + "%'";
                            ResultSet rs = (ResultSet) MyConn.search(monthsearch);
                            df.setRowCount(0);
                            while (rs.next()) {
                                Vector v = new Vector();
                                v.add(rs.getString("ID"));
                                v.add(rs.getString("DB Table"));
                                v.add(rs.getString("Item ID"));
                                v.add(rs.getString("Added Stock"));
                                v.add(rs.getString("Other changes_Name"));
                                v.add(rs.getString("Other changese_Brand_Author"));
                                v.add(rs.getString("Other changes_Type"));
                                v.add(rs.getString("Other changes_Unit Price"));
                                v.add(rs.getString("Date and Time"));
                                df.addRow(v);
                            }
                        } else {
                            String monthTitle = "0" + SelectMonth + "";
                            String Searching = year + "-" + monthTitle + "-" + dateTitle;

                            String monthsearch = "SELECT*FROM `lifenotemusiccenter`.`grn` where `Date and Time` like '" + Searching + "%'";
                            ResultSet rs = (ResultSet) MyConn.search(monthsearch);
                            df.setRowCount(0);
                            while (rs.next()) {
                                Vector v = new Vector();
                                v.add(rs.getString("ID"));
                                v.add(rs.getString("DB Table"));
                                v.add(rs.getString("Item ID"));
                                v.add(rs.getString("Added Stock"));
                                v.add(rs.getString("Other changes_Name"));
                                v.add(rs.getString("Other changese_Brand_Author"));
                                v.add(rs.getString("Other changes_Type"));
                                v.add(rs.getString("Other changes_Unit Price"));
                                v.add(rs.getString("Date and Time"));
                                df.addRow(v);
                            }
                        }
                    } else {
                        dateTitle = "0" + dateTitle + "";
                        if (SelectMonth > 9) {
                            String monthTitle = SelectMonth + "";
                            String Searching = year + "-" + monthTitle + "-" + dateTitle;

                            String monthsearch = "SELECT*FROM `lifenotemusiccenter`.`grn` where `Date and Time` like '" + Searching + "%'";
                            ResultSet rs = (ResultSet) MyConn.search(monthsearch);
                            df.setRowCount(0);
                            while (rs.next()) {
                                Vector v = new Vector();
                                v.add(rs.getString("ID"));
                                v.add(rs.getString("DB Table"));
                                v.add(rs.getString("Item ID"));
                                v.add(rs.getString("Added Stock"));
                                v.add(rs.getString("Other changes_Name"));
                                v.add(rs.getString("Other changese_Brand_Author"));
                                v.add(rs.getString("Other changes_Type"));
                                v.add(rs.getString("Other changes_Unit Price"));
                                v.add(rs.getString("Date and Time"));
                                df.addRow(v);
                            }
                        } else {
                            String monthTitle = "0" + SelectMonth + "";
                            String Searching = year + "-" + monthTitle + "-" + dateTitle;

                            String monthsearch = "SELECT*FROM `lifenotemusiccenter`.`grn` where `Date and Time` like '" + Searching + "%'";
                            ResultSet rs = (ResultSet) MyConn.search(monthsearch);
                            df.setRowCount(0);
                            while (rs.next()) {
                                Vector v = new Vector();
                                v.add(rs.getString("ID"));
                                v.add(rs.getString("DB Table"));
                                v.add(rs.getString("Item ID"));
                                v.add(rs.getString("Added Stock"));
                                v.add(rs.getString("Other changes_Name"));
                                v.add(rs.getString("Other changese_Brand_Author"));
                                v.add(rs.getString("Other changes_Type"));
                                v.add(rs.getString("Other changes_Unit Price"));
                                v.add(rs.getString("Date and Time"));
                                df.addRow(v);
                            }
                        }
                    }

                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void JCB_MonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCB_MonthActionPerformed
        boolean mxd = JCB_Month.getSelectedIndex() == 1
                || JCB_Month.getSelectedIndex() == 3 || JCB_Month.getSelectedIndex()
                == 5 || JCB_Month.getSelectedIndex() == 7
                || JCB_Month.getSelectedIndex() == 8 || JCB_Month.getSelectedIndex()
                == 10 || JCB_Month.getSelectedIndex() == 12;
        boolean lxd =
                JCB_Month.getSelectedIndex() == 4 || JCB_Month.getSelectedIndex()
                == 6 || JCB_Month.getSelectedIndex() == 9
                || JCB_Month.getSelectedIndex() == 11;

        if (JCB_Month.getSelectedIndex() == 2) {
            JCB_Date.removeItemAt(31);
            JCB_Date.removeItemAt(30);
        } else if (lxd) {

            int a = JCB_Date.getItemCount() - 1;

            if (a == 29) {
                JCB_Date.addItem("30");
            } else if (a == 31) {
                JCB_Date.removeItemAt(31);
            }

        } else if (mxd) {

            int a = JCB_Date.getItemCount() - 1;

            if (a == 29) {
                JCB_Date.addItem("30");
                JCB_Date.addItem("31");
            } else if (a == 30) {
                JCB_Date.addItem("31");
            }

        } else {
            JOptionPane.showMessageDialog(this, "Choose a month", "Month Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_JCB_MonthActionPerformed
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
            java.util.logging.Logger.getLogger(UpdateHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new UpdateHistory().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BG;
    private javax.swing.JComboBox JCB_Date;
    private javax.swing.JComboBox JCB_Month;
    private javax.swing.JRadioButton JRB_DB_TABLE;
    private javax.swing.JRadioButton JRB_ITEMID;
    private javax.swing.JButton Jbtn_RefreshTable;
    private javax.swing.JTable JtblUpdateHistory;
    private javax.swing.JButton btnALLDEL;
    private javax.swing.JButton btnPrintReport;
    private javax.swing.ButtonGroup btngrp_Name_PurchaseID;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField txtYear;
    // End of variables declaration//GEN-END:variables

    private void SearchUodateHistory() {
        try {
            DefaultTableModel df = (DefaultTableModel) JtblUpdateHistory.getModel();
            String Search = "SELECT * FROM lifenotemusiccenter.grn";
            ResultSet RSsearch = (ResultSet) MyConn.search(Search);
            df.setRowCount(0);
            while (RSsearch.next()) {
                Vector v = new Vector();
                v.add(RSsearch.getString("ID"));
                v.add(RSsearch.getString("DB Table"));
                v.add(RSsearch.getString("Item ID"));
                v.add(RSsearch.getString("Added Stock"));
                v.add(RSsearch.getString("Other changes_Name"));
                v.add(RSsearch.getString("Other changese_Brand_Author"));
                v.add(RSsearch.getString("Other changes_Type"));
                v.add(RSsearch.getString("Other changes_Unit Price"));
                v.add(RSsearch.getString("Date and Time"));
                df.addRow(v);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
