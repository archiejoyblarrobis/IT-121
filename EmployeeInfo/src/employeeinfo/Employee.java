/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeeinfo;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.*;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
/**
 *
 * @author ARCHIE JOY B. LARROBIS
 */
public class Employee extends javax.swing.JFrame {
    
    public static Connection connection;
    
    public Employee() {
        initComponents();
        employeeTable();
        employeeData();
        
        tblEmployee.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON1) {
                    if (e.getClickCount() == 2) {
                        int row = tblEmployee.getSelectedRow();

                        txtIDNo.setText(tblEmployee.getValueAt(row, 0).toString());
                        txtFName.setText(tblEmployee.getValueAt(row, 1).toString());
                        txtMName.setText(tblEmployee.getValueAt(row, 2).toString());
                        txtLName.setText(tblEmployee.getValueAt(row, 3).toString());
                        txtPosition.setText(tblEmployee.getValueAt(row, 4).toString());
                        txtDepartment.setText(tblEmployee.getValueAt(row, 5).toString());
                        
                        txtIDNo.setEnabled(false);
                    }
                }
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtIDNo = new javax.swing.JTextField();
        txtLName = new javax.swing.JTextField();
        txtFName = new javax.swing.JTextField();
        txtMName = new javax.swing.JTextField();
        txtPosition = new javax.swing.JTextField();
        txtDepartment = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEmployee = new javax.swing.JTable();
        btnCancel = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("IT 121 Project");

        jLabel1.setText("ID No.");

        jLabel2.setText("Lastname");

        jLabel3.setText("Firstname");

        jLabel4.setText("Middlename");

        jLabel5.setText("Position");

        jLabel6.setText("Department");

        txtIDNo.setNextFocusableComponent(txtLName);

        txtLName.setNextFocusableComponent(txtFName);
        txtLName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLNameActionPerformed(evt);
            }
        });

        txtFName.setNextFocusableComponent(txtMName);
        txtFName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFNameActionPerformed(evt);
            }
        });

        txtMName.setNextFocusableComponent(txtPosition);
        txtMName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMNameActionPerformed(evt);
            }
        });

        txtPosition.setNextFocusableComponent(txtDepartment);
        txtPosition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPositionActionPerformed(evt);
            }
        });

        txtDepartment.setNextFocusableComponent(btnSave);
        txtDepartment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDepartmentActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("EMPLOYEE INFORMATION");

        btnSave.setText("Save");
        btnSave.setNextFocusableComponent(btnUpdate);
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.setNextFocusableComponent(btnDelete);
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.setNextFocusableComponent(btnCancel);
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        tblEmployee.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblEmployee);

        btnCancel.setText("Cancel");
        btnCancel.setNextFocusableComponent(txtIDNo);
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        jLabel8.setText("#archiejoyblarrobis-it121");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel7)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel3))
                                .addGap(19, 19, 19))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtIDNo, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtLName, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtFName, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                                    .addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtMName, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnCancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(txtPosition, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel1))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtIDNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSave))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtLName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtFName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtMName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtPosition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtLNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLNameActionPerformed

    private void txtFNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFNameActionPerformed

    private void txtMNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMNameActionPerformed

    private void txtPositionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPositionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPositionActionPerformed

    private void txtDepartmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDepartmentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDepartmentActionPerformed
    
    
    
    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        if(txtIDNo.getText().length() == 0 || txtLName.getText().length() == 0 || txtFName.getText().length() == 0 || txtMName.getText().length() == 0 || txtPosition.getText().length() == 0 || txtDepartment.getText().length() == 0){
            JOptionPane.showMessageDialog(null,"Fill-up all fields..."); 
        }else{
            countRecords();
            if(tCounts > 0){
                JOptionPane.showMessageDialog(null,"Employee ID already exist...");
            }else{
                addEmployee();
            }
        }        
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        updateEmployee();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        deleteEmployee();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        clearFields();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void addEmployee() {
        try {
            PreparedStatement sqlStmt;

            Employee.databaseConnection();
            sqlStmt = Employee.connection.prepareStatement("insert into employee(EmpID, Lastname, Firstname, Middlename, Position, Department) "
                    + " values (?,?,?,?,?,?)");
            sqlStmt.setString(1, txtIDNo.getText().trim());
            sqlStmt.setString(2, txtLName.getText().trim());
            sqlStmt.setString(3, txtFName.getText().trim());
            sqlStmt.setString(4, txtMName.getText().trim());
            sqlStmt.setString(5, txtPosition.getText().trim());
            sqlStmt.setString(6, txtDepartment.getText().trim());
 
            sqlStmt.execute();
            sqlStmt.close();

            JOptionPane.showMessageDialog(rootPane, "Employee Added Sucessfully.", "Information", JOptionPane.INFORMATION_MESSAGE);
            
            employeeData();
            clearFields();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private void updateEmployee() {
        try {
            PreparedStatement sqlStmt;

            Employee.databaseConnection();
            sqlStmt = Employee.connection.prepareStatement("update employee set Lastname=?, Firstname=?, Middlename=?, Position=?, Department=? where EmpID=?");
            sqlStmt.setString(1, txtLName.getText().trim());
            sqlStmt.setString(2, txtFName.getText().trim());
            sqlStmt.setString(3, txtMName.getText().trim());
            sqlStmt.setString(4, txtPosition.getText().trim());
            sqlStmt.setString(5, txtDepartment.getText().trim());
            sqlStmt.setString(6, txtIDNo.getText().trim());
 
            sqlStmt.execute();
            sqlStmt.close();

            JOptionPane.showMessageDialog(rootPane, "Employee Updated Sucessfully.", "Information", JOptionPane.INFORMATION_MESSAGE);
            
            employeeData();
            clearFields();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private void deleteEmployee() {
        try {
            PreparedStatement sqlStmt;

            Employee.databaseConnection();
            sqlStmt = Employee.connection.prepareStatement("delete from employee where EmpID=?");
            sqlStmt.setString(1, txtIDNo.getText().trim());
 
            sqlStmt.execute();
            sqlStmt.close();

            JOptionPane.showMessageDialog(rootPane, "Employee Deleted Sucessfully.", "Information", JOptionPane.INFORMATION_MESSAGE);
            
            employeeData();
            clearFields();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private void clearFields(){
        txtIDNo.setEnabled(true);
        txtIDNo.setText("");
        txtLName.setText("");
        txtFName.setText("");
        txtMName.setText("");
        txtPosition.setText("");
        txtDepartment.setText("");
        txtIDNo.requestFocus();
    }
    
    public static int tCounts;
    private void countRecords(){
        try {
            PreparedStatement sqlStmt;
            ResultSet rset;

            Employee.databaseConnection();
            sqlStmt = Employee.connection.prepareStatement("select count(EmpID) as tRecords from employee where EmpID=?");
            sqlStmt.setString(1, txtIDNo.getText().trim());
            
            rset = sqlStmt.executeQuery();
            rset.next();
            
            tCounts = rset.getInt("tRecords");

            sqlStmt.close();

            //JOptionPane.showMessageDialog(rootPane, "total records found: " + tCounts, "Information", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    DefaultTableModel employeeTableModel = new DefaultTableModel() {

        public Class getColumnClass(int col) {
            if (col == 1) {
                return Object.class;
            } else {
                return Object.class;
            }
        }

        public boolean isCellEditable(int row, int col) {
            if (col == 1) {
                return false;
            } else {
                return false;
            }
        }
    };
    
    private void employeeTable() {
        String[] columnNames = {"EmpID", "Firstname", "Middlename", "Lastname", "Position", "Department"};
        tblEmployee = new javax.swing.JTable(employeeTableModel);
        tblEmployee.setAutoResizeMode(tblEmployee.AUTO_RESIZE_ALL_COLUMNS);
        tblEmployee.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        tblEmployee.setRowSelectionAllowed(true);
        tblEmployee.setShowGrid(true);
        tblEmployee.setRowHeight(25);
        this.tblEmployee.setGridColor(Color.GRAY);
        this.tblEmployee.setShowVerticalLines(true);
        JTableHeader hd = tblEmployee.getTableHeader();
        hd.setForeground(Color.BLACK);
        hd.setBackground(Color.WHITE);
        hd.setReorderingAllowed(false);
        hd.setFont(new java.awt.Font("Tahoma", 1, 12));
        hd.setFont(hd.getFont().deriveFont(Font.BOLD));
        DefaultTableCellRenderer dtcr = new DefaultTableCellRenderer();
        dtcr.setHorizontalAlignment(SwingConstants.LEFT);
        tblEmployee.setFont(new java.awt.Font("Tahoma", 0, 12));
        jScrollPane1.setViewportView(tblEmployee);

        for (int i = 0; i < columnNames.length;) {
            employeeTableModel.addColumn(columnNames[i]);
            i++;
        }

        TableColumn[] column = new TableColumn[6];
        //...

        column[0] = tblEmployee.getColumnModel().getColumn(0);
        column[0].setPreferredWidth(50);
        
        column[1] = tblEmployee.getColumnModel().getColumn(1);
        column[1].setPreferredWidth(100);

        column[2] = tblEmployee.getColumnModel().getColumn(2);
        column[2].setPreferredWidth(100);

        column[3] = tblEmployee.getColumnModel().getColumn(3);
        column[3].setPreferredWidth(100);

        column[4] = tblEmployee.getColumnModel().getColumn(4);
        column[4].setPreferredWidth(100);

        column[5] = tblEmployee.getColumnModel().getColumn(5);
        column[5].setPreferredWidth(100);

//        TableColumn hidden = tblEmployee.getColumnModel().getColumn(0);
//        hidden.setMinWidth(0);
//        hidden.setPreferredWidth(0);
//        hidden.setMaxWidth(0);
    }
    
    private void employeeData() {
        try {
            Vector row = new Vector();
            PreparedStatement preparedStatement;
            ResultSet resultSet;

            row.setSize(0);
            Employee.databaseConnection();
            preparedStatement = Employee.connection.prepareStatement("select * from employee");
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                String empID = resultSet.getString("EmpID");
                String lname = resultSet.getString("Lastname");
                String fname = resultSet.getString("Firstname");
                String mname = resultSet.getString("Middlename");
                String position = resultSet.getString("Position");
                String department = resultSet.getString("Department");

                Vector column = new Vector();
                column.add(empID);
                column.add(lname);
                column.add(fname);
                column.add(mname);
                column.add(position);
                column.add(department);

                row.add(column);
            }
            resultSet.close();
            preparedStatement.close();
            
            employeeTableModel.setRowCount(0);
            for (int i = 0; i < row.size(); i++) {
                employeeTableModel.addRow((Vector) row.get(i));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws SQLException{
                
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Employee().setVisible(true);
            }
        });
    }
    
    public static void databaseConnection() {
        try {
            String databaseDriver = "com.mysql.jdbc.Driver";
            String connectionURL = "jdbc:mysql://localhost:3306/it121db";
            String databaseUsername = "root";
            String databasePassword = "";

            Class.forName(databaseDriver);
            connection = DriverManager.getConnection(connectionURL, databaseUsername, databasePassword);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblEmployee;
    private javax.swing.JTextField txtDepartment;
    private javax.swing.JTextField txtFName;
    private javax.swing.JTextField txtIDNo;
    private javax.swing.JTextField txtLName;
    private javax.swing.JTextField txtMName;
    private javax.swing.JTextField txtPosition;
    // End of variables declaration//GEN-END:variables
}
