/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Home.java
 *
 * Created on Oct 16, 2010, 8:51:46 PM
 */

package qltv;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author DELL
 */
public class Home extends javax.swing.JFrame {

    /** Creates new form Home */
    public Home() {
        initComponents();        
        khoitao();
    }

   private static final String DRIVER =
           "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private static final String URL = 
           "jdbc:sqlserver://localhost:1433;databaseName=QuanLyThuVien;integratedSecurity=true;user=sa;password=123";

    public void load_label()
    {
        lbgioithieu.setVisible(true);
 
    }

    public void close_label()
    {
        lbgioithieu.setVisible(false);
       
    }
    
    public void khoitao()
    {
        mn_logout.setVisible(false);
        mn_qlms.setVisible(false);
        mn_qlts.setVisible(false);
        mn_qls.setVisible(false);
        mn_qldg.setVisible(false);
        close_label();
    }    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btthoat = new javax.swing.JButton();
        btdangnhap = new javax.swing.JButton();
        lbpw = new javax.swing.JLabel();
        lbun = new javax.swing.JLabel();
        tbpw = new javax.swing.JPasswordField();
        tbun = new javax.swing.JTextField();
        lbgioithieu = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mn_dn = new javax.swing.JMenu();
        mn_login = new javax.swing.JMenuItem();
        mn_logout = new javax.swing.JMenuItem();
        mn_ql = new javax.swing.JMenu();
        mn_qlms = new javax.swing.JMenuItem();
        mn_qlts = new javax.swing.JMenuItem();
        mn_qls = new javax.swing.JMenuItem();
        mn_qldg = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btthoat.setText("Exit");
        btthoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btthoatActionPerformed(evt);
            }
        });

        btdangnhap.setText("Sign In");
        btdangnhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btdangnhapActionPerformed(evt);
            }
        });

        lbpw.setText("Password");

        lbun.setText("Username");

        lbgioithieu.setBackground(new java.awt.Color(0, 0, 255));
        lbgioithieu.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbgioithieu.setForeground(new java.awt.Color(0, 0, 255));
        lbgioithieu.setText("Library Management");

        mn_dn.setText("Sign In");

        mn_login.setText("Đăng Nhập");
        mn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mn_loginActionPerformed(evt);
            }
        });
        mn_dn.add(mn_login);

        mn_logout.setText("Đăng Xuất");
        mn_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mn_logoutActionPerformed(evt);
            }
        });
        mn_dn.add(mn_logout);

        jMenuBar1.add(mn_dn);

        mn_ql.setText("Manage");

        mn_qlms.setText("Quản Lý Mượn Sách");
        mn_qlms.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mn_qlmsActionPerformed(evt);
            }
        });
        mn_ql.add(mn_qlms);

        mn_qlts.setText("Quản Lý Trả Sách");
        mn_qlts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mn_qltsActionPerformed(evt);
            }
        });
        mn_ql.add(mn_qlts);

        mn_qls.setText("Quản Lý Sách");
        mn_qls.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mn_qlsActionPerformed(evt);
            }
        });
        mn_ql.add(mn_qls);

        mn_qldg.setText("Quản Lý Độc Giả");
        mn_qldg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mn_qldgActionPerformed(evt);
            }
        });
        mn_ql.add(mn_qldg);

        jMenuBar1.add(mn_ql);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbun)
                                    .addComponent(lbpw))
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(tbun, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tbpw, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addComponent(btdangnhap)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btthoat))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(lbgioithieu)))
                .addContainerGap(89, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbgioithieu, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tbun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbun))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tbpw, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbpw))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btdangnhap)
                    .addComponent(btthoat))
                .addContainerGap(116, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
     //public void frm_load()
    private void mn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mn_loginActionPerformed
        // TODO add your handling code here:
        btthoat.setVisible(true);
        btdangnhap.setVisible(true);
        tbun.setVisible(true);
        tbpw.setVisible(true);
        lbun.setVisible(true);
        lbpw.setVisible(true);
        close_label();
    }//GEN-LAST:event_mn_loginActionPerformed

    private void mn_qlmsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mn_qlmsActionPerformed
        // TODO add your handling code here:
        QLMUONSACH qlms = new QLMUONSACH();
        qlms.setVisible(true);
    }//GEN-LAST:event_mn_qlmsActionPerformed

    private void mn_qltsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mn_qltsActionPerformed
        // TODO add your handling code here:
        QLTRASACH qlts = new QLTRASACH();
        qlts.setVisible(true);
    }//GEN-LAST:event_mn_qltsActionPerformed

    private void mn_qlsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mn_qlsActionPerformed
        // TODO add your handling code here:
        QLSACH qls = new QLSACH();
        qls.setVisible(true);
    }//GEN-LAST:event_mn_qlsActionPerformed

    private void mn_qldgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mn_qldgActionPerformed
        // TODO add your handling code here:
        QLDocGia qldg = new QLDocGia();
        qldg.setVisible(true);
    }//GEN-LAST:event_mn_qldgActionPerformed

    private void mn_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mn_logoutActionPerformed
        // TODO add your handling code here:
        mn_qldg.setVisible(false);
        mn_qls.setVisible(false);
        mn_qlms.setVisible(false);
        mn_qlts.setVisible(false);
        btdangnhap.setVisible(false);
        btthoat.setVisible(false);
        mn_logout.setVisible(false);
        mn_login.setVisible(true);
        load_label();
        tbun.setText("");
        tbpw.setText("");
    }//GEN-LAST:event_mn_logoutActionPerformed

    private void btthoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btthoatActionPerformed
        // TODO add your handling code here:
        mn_qldg.setVisible(false);
        mn_qls.setVisible(false);
        mn_qlms.setVisible(false);
        mn_qlts.setVisible(false);
        mn_logout.setVisible(false);
        mn_login.setVisible(true);
        btthoat.setVisible(false);
        btdangnhap.setVisible(false);
        tbun.setVisible(false);
        tbpw.setVisible(false);
        lbun.setVisible(false);
        lbpw.setVisible(false);
        load_label();
}//GEN-LAST:event_btthoatActionPerformed

    public String Username;
    public String Password;
    public static String manhanvien;
    public String quyenhan;
    
    private void btdangnhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btdangnhapActionPerformed
        // TODO add your handling code here:
        try {
            Class.forName(DRIVER);
            try {
                boolean flag = false;
                Username= tbun.getText();
                Password= tbpw.getText();
                
                if(!Username.equals(""))
                {
                    Connection con = DriverManager.getConnection(URL);
                    Statement stm=con.createStatement();
                    ResultSet rs = stm.executeQuery("SELECT TENDANGNHAP,MANHANVIEN,QUYENHAN FROM NHANVIEN WHERE NHANVIEN.TENDANGNHAP='" + Username +"' AND NHANVIEN.MATKHAU='"+ Password + "'");
                    String s = "";
                    while (rs.next()) {
                        s = rs.getString(1);
                        manhanvien = rs.getString(2);
                        quyenhan = rs.getString(3);
                        quyenhan=quyenhan.toUpperCase();
                        s=s.toUpperCase();
                        Username=Username.toUpperCase();
                    }
                    if(Username.equals(s.trim()))
                    {
                        mn_qldg.setVisible(true);
                        mn_qls.setVisible(true);
                        mn_qlms.setVisible(true);
                        mn_qlts.setVisible(true);
                        btdangnhap.setVisible(false);
                        btthoat.setVisible(false);
                        tbun.setVisible(false);
                        tbpw.setVisible(false);
                        lbun.setVisible(false);
                        lbpw.setVisible(false);
                        mn_logout.setVisible(true);
                        mn_login.setVisible(false);
                        load_label();
                        if (quyenhan.trim().equals("ADMIN"))
                        {
                            mn_qldg.setVisible(true);
                            mn_qls.setVisible(true);
                            mn_qlms.setVisible(true);
                            mn_qlts.setVisible(true);
                            JOptionPane.showMessageDialog(this, "Đăng nhập thành công với quyền admin");
                            

                        } 
                        else if(quyenhan.trim().equals("THUKHO"))
                        {
                            mn_qldg.setVisible(true);
                            mn_qls.setVisible(true);
                            mn_qlms.setVisible(false);
                            mn_qlts.setVisible(false);
                            JOptionPane.showMessageDialog(this, "Đăng nhập thành công với quyền Thủ Kho");
                          
                        }
                        else if(quyenhan.trim().equals("MUONTRA"))
                        {
                            mn_qldg.setVisible(false);
                            mn_qls.setVisible(false);
                            mn_qlms.setVisible(true);
                            mn_qlts.setVisible(true);
                            JOptionPane.showMessageDialog(this, "Đăng nhập thành công với quyền Mượn Trả");
                        }
                        else
                        {
                            mn_qldg.setVisible(false);
                            mn_qls.setVisible(false);
                            mn_qlms.setVisible(false);
                            mn_qlts.setVisible(false);
                            JOptionPane.showMessageDialog(this, "Đăng nhập ko thành công");
                        }

                    }
                    else
                    {
                        JOptionPane.showMessageDialog(this, "ko thành công");
                        tbun.setText("");
                        tbpw.setText("");
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btdangnhapActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btdangnhap;
    private javax.swing.JButton btthoat;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel lbgioithieu;
    private javax.swing.JLabel lbpw;
    private javax.swing.JLabel lbun;
    private javax.swing.JMenu mn_dn;
    public javax.swing.JMenuItem mn_login;
    public javax.swing.JMenuItem mn_logout;
    private javax.swing.JMenu mn_ql;
    public javax.swing.JMenuItem mn_qldg;
    public javax.swing.JMenuItem mn_qlms;
    public javax.swing.JMenuItem mn_qls;
    public javax.swing.JMenuItem mn_qlts;
    private javax.swing.JPasswordField tbpw;
    private javax.swing.JTextField tbun;
    // End of variables declaration//GEN-END:variables

}
