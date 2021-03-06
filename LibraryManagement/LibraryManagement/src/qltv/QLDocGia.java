/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * QLDocGia.java
 *
 * Created on Oct 15, 2010, 10:55:36 PM
 */

package qltv;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HUNTER-IT
 */
public class QLDocGia extends javax.swing.JFrame {
    Connection con=null;
    Statement stmt1, stmt2;
     private static final String DRIVER =
           "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private static final String URL = 
           "jdbc:sqlserver://localhost:1433;databaseName=QuanLyThuVien;integratedSecurity=true;user=sa;password=123456";
   
    Vector column, data;
    DefaultTableModel modelDG = new DefaultTableModel(data,column);
    /** Creates new form QLDocGia */
    public QLDocGia() {
        initComponents();
        SetModel();
    }


    public void SetModel(){
        try
        {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QuanLyThuVien;integratedSecurity=true;user=sa;password=123456");
            
            SimpleDateFormat formatDate = new SimpleDateFormat("dd-MM-yyyy");
            table_DOCGIA.setModel(modelDG); //Sets the data model for this table to newModel and registers
            stmt2 = con.createStatement();
            data = new Vector();
            column = new Vector();

            //Add Header for User Table Model
            column.add("MA DOC GIA");
            column.add("MA LOAI DOC GIA");
            column.add("HO TEN");
            column.add("GIOI TINH");
            column.add("NGAY SINH");
            column.add("DIA CHI");

            String sqlDG = "select * from DOCGIA";
            ResultSet rs = stmt2.executeQuery(sqlDG);

            while(rs.next()){
                Vector temp = new Vector();
                temp.add(rs.getString(1));
                temp.add(rs.getString(2));
                temp.add(rs.getString(3));
                temp.add(rs.getString(4));
                //temp.add(rs.getString(5));
                temp.add(formatDate.format(rs.getDate(5)));
                temp.add(rs.getString(6));

                data.add(temp);

            }
            modelDG = new DefaultTableModel(data, column) {
                
                @Override
                public boolean isCellEditable(int row, int column) {
                    return false;
                }
            };
            table_DOCGIA.setModel(modelDG);
            rs.close();
            stmt2.close();
            con.close();
        }
        
        catch(SQLException se){
            JOptionPane.showMessageDialog(this, se.toString());
        }
        catch(ClassNotFoundException ce){
            JOptionPane.showMessageDialog(this, ce.toString());
        }
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_DOCGIA = new javax.swing.JTable();
        bt_THEM = new javax.swing.JButton();
        bt_SUA = new javax.swing.JButton();
        bt_XOA = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btthoat = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Danh sách độc giả:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        table_DOCGIA.setModel(new javax.swing.table.DefaultTableModel(
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
        table_DOCGIA.setColumnSelectionAllowed(true);
        jScrollPane1.setViewportView(table_DOCGIA);
        table_DOCGIA.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 627, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(138, Short.MAX_VALUE))
        );

        bt_THEM.setFont(new java.awt.Font("Tahoma", 1, 12));
        bt_THEM.setText("THÊM");
        bt_THEM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_THEMActionPerformed(evt);
            }
        });

        bt_SUA.setFont(new java.awt.Font("Tahoma", 1, 12));
        bt_SUA.setText("SỬA");
        bt_SUA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_SUAActionPerformed(evt);
            }
        });

        bt_XOA.setFont(new java.awt.Font("Tahoma", 1, 12));
        bt_XOA.setText("XÓA");
        bt_XOA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_XOAActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel2.setText("QUẢN LÝ ĐỘC GIẢ");

        btthoat.setText("Thoát");
        btthoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btthoatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(275, 275, 275)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(44, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(291, Short.MAX_VALUE)
                .addComponent(bt_THEM)
                .addGap(26, 26, 26)
                .addComponent(bt_XOA, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(bt_SUA, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btthoat)
                .addGap(132, 132, 132))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel2)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_THEM)
                    .addComponent(bt_XOA)
                    .addComponent(bt_SUA)
                    .addComponent(btthoat))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jPanel1.getAccessibleContext().setAccessibleName("Danh sach doc gia:");

        getAccessibleContext().setAccessibleName("Danh sach doc gia\n");

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    // Kiem tra rang buoc khi xoa doc gia
    public int Kiemtra(){
        try{
            Vector v = new Vector();
            v = (Vector) modelDG.getDataVector().elementAt(table_DOCGIA.getSelectedRow());
            String madocgia = v.elementAt(0).toString();
            Connection conn=null;
            Class.forName(DRIVER);
            conn = DriverManager.getConnection(URL);

            String sqlSelect = "select MADOCGIA from PHIEUMUON";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sqlSelect);
            while(rs.next()){
                String str=rs.getString("MADOCGIA");
                if(madocgia.equals(str))  // trung khoa chinh
                    return 0;
            }
        }
        catch(ClassNotFoundException ex){
                JOptionPane.showMessageDialog(this, ex.toString());
            }
        catch (SQLException ex) {
                //Logger.getLogger(frmMain.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(this,ex.toString());
            }
        return 1;
    
    }

    private void bt_THEMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_THEMActionPerformed
        // TODO add your handling code here:
        themDG them = new themDG(this);
        them.setVisible(true);
        
    }//GEN-LAST:event_bt_THEMActionPerformed

    private void bt_XOAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_XOAActionPerformed
        // TODO add your handling code here:
        int Row[] = table_DOCGIA.getSelectedRows();
        if (Row.length > 1) {
            JOptionPane.showMessageDialog(null, "Ban chỉ được chọn một độc giả để xóa!");
            return;
        }
        if (table_DOCGIA.getSelectedRow() <0) {
            JOptionPane.showMessageDialog(null, "Hãy chọn độc giả để xóa!");
            return;
        }
        if(Kiemtra()==0){
            JOptionPane.showMessageDialog(null, "Không xóa được! độc giả này đang mượn sách.");
            return;
        }
        else {
            Vector v = new Vector();
            v = (Vector) modelDG.getDataVector().elementAt(table_DOCGIA.getSelectedRow());
            String madocgia = null;
            madocgia=v.elementAt(0).toString();
           
            String sqlDelete = "delete from DOCGIA where MADOCGIA = " + madocgia +"";
            if (JOptionPane.showConfirmDialog(null, "Bạn có chắc là muốn xóa độc giả " + v.elementAt(2)+ " không?", "Quản lý độc giả", JOptionPane.OK_CANCEL_OPTION) == 0) {
                try {
                        Class.forName(DRIVER);
                        con = DriverManager.getConnection(URL);

                        CallableStatement cs = con.prepareCall("{call xoaDG (?)}");
                        cs.setString(1, v.elementAt(0).toString());

                        int i=cs.executeUpdate();
                        if (i < 0) {
                            JOptionPane.showMessageDialog(null, "Xóa độc giả " + v.elementAt(2) + " không thành công!");
                        }
                        if (i > 0) {
                            JOptionPane.showMessageDialog(null, "Xóa độc giả " + v.elementAt(2) + " thành công!");
                        }
                        //JOptionPane.showMessageDialog(this, "Xóa thành công");
                        con.close();
                    }
                catch(ClassNotFoundException ex){
                    JOptionPane.showMessageDialog(this, ex.toString());
                }
                catch (SQLException ex) {
                    //Logger.getLogger(frmMain.class.getName()).log(Level.SEVERE, null, ex);
                    JOptionPane.showMessageDialog(this,ex.toString());
                }
            }
            SetModel();
        }
    }//GEN-LAST:event_bt_XOAActionPerformed

    private void bt_SUAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_SUAActionPerformed
        // TODO add your handling code here:
        int Row[] = table_DOCGIA.getSelectedRows();
        if (Row.length > 1) {
            JOptionPane.showMessageDialog(null, "Ban chỉ được chọn một độc giả để sửa!");
            return;
        }

        if (table_DOCGIA.getSelectedRow() >= 0) {
           suaDG sd = new suaDG(this);
           sd.setVisible(true);

        } else {
            JOptionPane.showMessageDialog(null, "Hãy chọn độc giả để sửa!");
        }
    }//GEN-LAST:event_bt_SUAActionPerformed

    private void btthoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btthoatActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btthoatActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QLDocGia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_SUA;
    private javax.swing.JButton bt_THEM;
    private javax.swing.JButton bt_XOA;
    private javax.swing.JButton btthoat;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable table_DOCGIA;
    // End of variables declaration//GEN-END:variables

}
