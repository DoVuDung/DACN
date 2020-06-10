/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * QLSACH.java
 *
 * Created on Oct 20, 2010, 10:07:56 PM
 */

package qltv;
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.*;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author DELL
 */
public class QLSACH extends javax.swing.JFrame {

    /** Creates new form QLSACH */
    public QLSACH() {
        initComponents();
        //loadcbqls();
        load_table();
        closeboxqls();
    }

    private static final String DRIVER =
           "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private static final String URL = 
           "jdbc:sqlserver://localhost:1433;databaseName=QuanLyThuVien;integratedSecurity=true;user=sa;password=123456";
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cb_qls_nhaxuatban = new javax.swing.JComboBox();
        cb_qls_ngonngu = new javax.swing.JComboBox();
        bt_qls_xoa = new javax.swing.JButton();
        bt_qls_sua = new javax.swing.JButton();
        bt_qls_them = new javax.swing.JButton();
        jLabel37 = new javax.swing.JLabel();
        tb_qls_masach = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        cb_qls_tacgia = new javax.swing.JComboBox();
        cb_qls_linhvuc = new javax.swing.JComboBox();
        jLabel32 = new javax.swing.JLabel();
        cb_qls_nhacungcap = new javax.swing.JComboBox();
        jLabel33 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        tb_qls_tensach = new javax.swing.JTextField();
        tb_qls_gia = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        btthoat = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_xemkq = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 0, 204));

        bt_qls_xoa.setBackground(new java.awt.Color(255, 102, 102));
        bt_qls_xoa.setForeground(new java.awt.Color(255, 255, 102));
        bt_qls_xoa.setText("Xóa");
        bt_qls_xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_qls_xoaActionPerformed(evt);
            }
        });

        bt_qls_sua.setText("Sữa");
        bt_qls_sua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_qls_suaActionPerformed(evt);
            }
        });

        bt_qls_them.setText("Thêm");
        bt_qls_them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_qls_themActionPerformed(evt);
            }
        });

        jLabel37.setText("Giá");

        tb_qls_masach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tb_qls_masachActionPerformed(evt);
            }
        });

        jLabel36.setText("Mã Sách");

        jLabel35.setText("Ngôn Ngữ");

        cb_qls_linhvuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_qls_linhvucActionPerformed(evt);
            }
        });

        jLabel32.setText("Nhà Xuất bản");

        jLabel33.setText("Tác Giả");

        jLabel39.setText("Nhà Cung Cấp");

        jLabel34.setText("Lĩnh Vực");

        jLabel31.setText("Tên Sách");

        btthoat.setText("Thoát");
        btthoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btthoatActionPerformed(evt);
            }
        });

        tb_xemkq.setBackground(new java.awt.Color(255, 255, 0));
        tb_xemkq.setForeground(new java.awt.Color(255, 51, 0));
        jScrollPane1.setViewportView(tb_xemkq);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel33)
                            .addComponent(jLabel31)
                            .addComponent(jLabel36)
                            .addComponent(jLabel37))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cb_qls_tacgia, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tb_qls_masach)
                            .addComponent(tb_qls_tensach, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                            .addComponent(tb_qls_gia))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel34)
                                .addGap(60, 60, 60)
                                .addComponent(cb_qls_linhvuc, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel35)
                                    .addComponent(jLabel32)
                                    .addComponent(jLabel39))
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cb_qls_nhacungcap, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cb_qls_nhaxuatban, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cb_qls_ngonngu, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bt_qls_them, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(bt_qls_sua, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(bt_qls_xoa, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(btthoat))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 742, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel36)
                    .addComponent(tb_qls_masach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel35)
                        .addComponent(cb_qls_ngonngu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel31)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tb_qls_tensach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel32)
                        .addComponent(cb_qls_nhaxuatban, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel33)
                        .addComponent(cb_qls_tacgia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel39)
                        .addComponent(cb_qls_nhacungcap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel37)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tb_qls_gia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel34)
                        .addComponent(cb_qls_linhvuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_qls_them, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_qls_sua)
                    .addComponent(bt_qls_xoa)
                    .addComponent(btthoat))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(155, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    Vector data,column;
    DefaultTableModel modelDG = new DefaultTableModel(data,column);
    public void load_table()
    {
        try {
            Class.forName(DRIVER);
            try {
                Connection con = DriverManager.getConnection(URL);
                Statement stm = con.createStatement();
                data = new Vector();
                column = new Vector();                
                column.add("STT");
                column.add("Mã Sách");
                column.add("Tên Sách");
                column.add("Loại Sách");
                column.add("Nhà Xuất Bản");
                column.add("Tác Giả");
                column.add("Nhà Cung Cấp");
                column.add("Ngôn Ngữ");
                column.add("Giá");
                int i=1;
                ResultSet rs = stm.executeQuery("SELECT SACH.MASACH,SACH.TENSACH,LOAISACH.TENLOAISACH,NXB.TENNXB,TACGIA.HOTEN,NHACUNGCAP.TENNCC,NGONNGU.NGONNGU,SACH.GIA FROM SACH,LOAISACH,NGONNGU,NXB,TACGIA,SANGTAC,NHACUNGCAP WHERE SACH.MANGONNGU=NGONNGU.MANGONNGU AND SACH.MALOAISACH=LOAISACH.MALOAISACH AND SACH.MANXB=NXB.MANXB AND SACH.MASACH=SANGTAC.MASACH AND TACGIA.MATACGIA=SANGTAC.MATACGIA AND SACH.MANCC=NHACUNGCAP.MANCC");
                while(rs.next())
                {
                    Vector temp = new Vector();
                    temp.add(""+i);
                    temp.add(rs.getString("MASACH"));
                    temp.add(rs.getString("TENSACH"));
                    temp.add(rs.getString("TENLOAISACH"));
                    temp.add(rs.getString("TENNXB"));
                    temp.add(rs.getString("HOTEN"));
                    temp.add(rs.getString("TENNCC"));
                    temp.add(rs.getString("NGONNGU"));
                    temp.add(""+rs.getInt("GIA"));
                    data.add(temp);
                    i++;                    
                }                 
                 
                modelDG = new DefaultTableModel(data, column);           
                tb_xemkq.setModel(modelDG);               
            } catch (SQLException ex) {
                Logger.getLogger(QLSACH.class.getName()).log(Level.SEVERE, null, ex);
            }
            

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(QLSACH.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    public void loadcbqls()
    {
        try {
            Class.forName(DRIVER);
            try {
                Connection con = DriverManager.getConnection(URL);
                Statement stm = con.createStatement();
                ResultSet rs1 = stm.executeQuery("SELECT* FROM TACGIA");
                while(rs1.next())
                {
                    String hoten= rs1.getString("HOTEN");
                    cb_qls_tacgia.addItem(hoten);
                }

                ResultSet rs2=stm.executeQuery("SELECT * FROM NGONNGU");
                while(rs2.next())
                {
                    String ngonngu= rs2.getString("NGONNGU");
                    cb_qls_ngonngu.addItem(ngonngu);
                }

                ResultSet rs3=stm.executeQuery("SELECT *FROM LOAISACH");
                while(rs3.next())
                {
                    String linhvuc= rs3.getString("TENLOAISACH");
                    cb_qls_linhvuc.addItem(linhvuc);
                }

                ResultSet rs4=stm.executeQuery("SELECT *FROM NXB");
                while(rs4.next())
                {
                    String nxb= rs4.getString("TENNXB");
                    cb_qls_nhaxuatban.addItem(nxb);
                }

                ResultSet rs5=stm.executeQuery("SELECT *FROM NHACUNGCAP");
                while(rs5.next())
                {
                    String ncc= rs5.getString("TENNCC");
                    cb_qls_nhacungcap.addItem(ncc);
                }

            }
            catch (SQLException ex) {
                Logger.getLogger(QLTV.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        catch (ClassNotFoundException ex) {
            Logger.getLogger(QLTV.class.getName()).log(Level.SEVERE, null, ex);
        }
        //dua du lieu vao combox
    }


    public void clearqls()
    {
        tb_qls_masach.setText("");
        tb_qls_gia.setText("");
        tb_qls_tensach.setText("");
        cb_qls_linhvuc.removeAllItems();
        cb_qls_tacgia.removeAllItems();
        cb_qls_ngonngu.removeAllItems();
        cb_qls_nhaxuatban.removeAllItems();
        cb_qls_nhacungcap.removeAllItems();
    }

    public void openboxqls()
    {
        tb_qls_masach.setVisible(true);
        tb_qls_tensach.setVisible(true);
        tb_qls_gia.setVisible(true);
        cb_qls_linhvuc.setVisible(true);
        cb_qls_tacgia.setVisible(true);
        cb_qls_nhacungcap.setVisible(true);
        cb_qls_nhaxuatban.setVisible(true);
        cb_qls_ngonngu.setVisible(true);

    }

    public void closeboxqls()
    {
        tb_qls_masach.setVisible(false);
        tb_qls_tensach.setVisible(false);
        tb_qls_gia.setVisible(false);
        cb_qls_linhvuc.setVisible(false);
        cb_qls_tacgia.setVisible(false);
        cb_qls_nhacungcap.setVisible(false);
        cb_qls_nhaxuatban.setVisible(false);
        cb_qls_ngonngu.setVisible(false);
    }

    boolean kt=false;
    private void bt_qls_xoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_qls_xoaActionPerformed
        // TODO add your handling code here:
        bt_qls_xoa.setBackground(Color.red);
        if (bt_qls_xoa.getText().equals("Xóa")) {
            tb_qls_masach.setVisible(true);
            JOptionPane.showMessageDialog(this, "Nhập vào mã sách cần Xóa");
            tb_qls_masach.setText("nhap ma sach");
            bt_qls_xoa.setText("Xác Nhận");
            bt_qls_them.setVisible(false);
            bt_qls_sua.setVisible(false);
        } else if(bt_qls_xoa.getText().equals("Xác Nhận")) {
            try {
                Class.forName(DRIVER);
                try {
                    Connection con = DriverManager.getConnection(URL);
                    Statement stm = con.createStatement();
                    ResultSet rs= stm.executeQuery("SELECT *FROM SACH");
                    String masach=tb_qls_masach.getText().toUpperCase();
                    while(rs.next()) {
                        if(rs.getString("MASACH").trim().equals(masach))
                            kt=true;
                    }
                    if(kt) {
                        openboxqls();
                        ResultSet rs1 = stm.executeQuery("select GIA,TENSACH,TENLOAISACH,HOTEN,NGONNGU,TENNXB,TENNCC from SACH,LOAISACH,NGONNGU,NXB,TACGIA,SANGTAC,NHACUNGCAP where SACH.MASACH='" + masach + "' AND SACH.MANGONNGU=NGONNGU.MANGONNGU AND SACH.MALOAISACH=LOAISACH.MALOAISACH AND SACH.MANCC=NHACUNGCAP.MANCC AND SACH.MANXB=NXB.MANXB AND SACH.MASACH=SANGTAC.MASACH AND TACGIA.MATACGIA=SANGTAC.MATACGIA ");
                        while(rs1.next()) {
                            String gia=""+rs1.getInt("gia");
                            tb_qls_gia.setText(gia);
                            tb_qls_tensach.setText(rs1.getString("TENSACH"));
                            cb_qls_linhvuc.addItem(rs1.getString("TENLOAISACH"));
                            cb_qls_tacgia.addItem(rs1.getString("HOTEN"));
                            cb_qls_ngonngu.addItem(rs1.getString("NGONNGU"));
                            cb_qls_nhaxuatban.addItem(rs1.getString("TENNXB"));
                            cb_qls_nhacungcap.addItem(rs1.getString("TENNCC"));
                        }
                        loadcbqls();
                        // tim cac du lieu trung trong cb de xoa
                        bt_qls_xoa.setText("Chấp Nhận");
                        kt=false;
                    } else JOptionPane.showMessageDialog(this,"Bạn phải nhập đúng mã sách ");
                } catch (SQLException ex) {
                    Logger.getLogger(QLTV.class.getName()).log(Level.SEVERE, null, ex);
                }
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(QLTV.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if(bt_qls_xoa.getText().equals("Chấp Nhận")) {
            try {
                Class.forName(DRIVER);
                try {
                    Connection con = DriverManager.getConnection(URL);
                    lop_sach l_sach = new lop_sach();
                    String masach=tb_qls_masach.getText();
                    l_sach.set_masach(masach);
                    if(l_sach.xoasangtac()) {
                        if(l_sach.xoasach())
                        {
                            JOptionPane.showMessageDialog(this, "cap nhat thanh cong");
                            load_table();
                        }
                        else JOptionPane.showMessageDialog(this, "ko cap nhat duoc sach");
                    } else
                        JOptionPane.showMessageDialog(this, "ko thanh cong");
                    clearqls();
                    bt_qls_xoa.setText("Xóa");
                    closeboxqls();
                    bt_qls_them.setVisible(true);
                    bt_qls_sua.setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(QLTV.class.getName()).log(Level.SEVERE, null, ex);
                }
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(QLTV.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
}//GEN-LAST:event_bt_qls_xoaActionPerformed

    private void bt_qls_suaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_qls_suaActionPerformed
        // TODO add your handling code here:
        if (bt_qls_sua.getText().equals("Sữa")) {
            tb_qls_masach.setVisible(true);
            JOptionPane.showMessageDialog(this, "Nhập vào mã sách cần sữa");
            tb_qls_masach.setText("nhap ma sach");
            bt_qls_sua.setText("Xác Nhận");
            bt_qls_them.setVisible(false);
            bt_qls_xoa.setVisible(false);
        } else if(bt_qls_sua.getText().equals("Xác Nhận")) {
            try {
                Class.forName(DRIVER);
                try {
                    Connection con = DriverManager.getConnection(URL);
                    Statement stm = con.createStatement();
                    ResultSet rs= stm.executeQuery("SELECT *FROM SACH");
                    String masach=tb_qls_masach.getText().toUpperCase();
                    while(rs.next()) {
                        if(rs.getString("MASACH").trim().equals(masach))
                            kt=true;
                    }
                    if(kt) {
                        openboxqls();
                        ResultSet rs1 = stm.executeQuery("select GIA,TENSACH,TENLOAISACH,HOTEN,NGONNGU,TENNXB,TENNCC from SACH,LOAISACH,NGONNGU,NXB,TACGIA,SANGTAC,NHACUNGCAP where SACH.MASACH='" + masach + "' AND SACH.MANGONNGU=NGONNGU.MANGONNGU AND SACH.MALOAISACH=LOAISACH.MALOAISACH AND SACH.MANCC=NHACUNGCAP.MANCC AND SACH.MANXB=NXB.MANXB AND SACH.MASACH=SANGTAC.MASACH AND TACGIA.MATACGIA=SANGTAC.MATACGIA ");
                        while(rs1.next()) {
                            String gia=""+rs1.getInt("gia");
                            tb_qls_gia.setText(gia);
                            tb_qls_tensach.setText(rs1.getString("TENSACH"));
                            cb_qls_linhvuc.addItem(rs1.getString("TENLOAISACH"));
                            cb_qls_tacgia.addItem(rs1.getString("HOTEN"));
                            cb_qls_ngonngu.addItem(rs1.getString("NGONNGU"));
                            cb_qls_nhaxuatban.addItem(rs1.getString("TENNXB"));
                            cb_qls_nhacungcap.addItem(rs1.getString("TENNCC"));
                        }
                        loadcbqls();
                        // tim cac du lieu trung trong cb de xoa
                        bt_qls_sua.setText("Chấp Nhận");
                        kt=false;
                    } else JOptionPane.showMessageDialog(this,"Bạn phải nhập đúng mã sách ");
                } catch (SQLException ex) {
                    Logger.getLogger(QLTV.class.getName()).log(Level.SEVERE, null, ex);
                }
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(QLTV.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if(bt_qls_sua.getText().equals("Chấp Nhận")) {
            try {
                Class.forName(DRIVER);
                try {
                    Connection con = DriverManager.getConnection(URL);
                    lop_sach l_sach = new lop_sach();
                    int gia=Integer.parseInt(tb_qls_gia.getText());

                    // lay du lieu tu combox
                    String maloai = cb_qls_linhvuc.getSelectedItem().toString();
                    String manxb = cb_qls_nhaxuatban.getSelectedItem().toString();
                    String mancc = cb_qls_nhacungcap.getSelectedItem().toString();
                    String matg = cb_qls_tacgia.getSelectedItem().toString();
                    String mann = cb_qls_ngonngu.getSelectedItem().toString();
                    Statement stm = con.createStatement();
                    ResultSet rs1=stm.executeQuery("SELECT *FROM NXB WHERE TENNXB='"+manxb+"'");
                    while(rs1.next()) {
                        String nxb= rs1.getString("MANXB");
                        l_sach.set_manhaxuatban(nxb);
                    }
                    ResultSet rs2=stm.executeQuery("SELECT *FROM NHACUNGCAP WHERE TENNCC='"+mancc+"'");
                    while(rs2.next()) {
                        String ncc= rs2.getString("MANCC");
                        l_sach.set_mancc(ncc);
                    }
                    ResultSet rs3=stm.executeQuery("SELECT *FROM TACGIA WHERE HOTEN='"+matg+"'");
                    while(rs3.next()) {
                        String tg= rs3.getString("MATACGIA");
                        l_sach.set_matacgia(tg);
                    }
                    ResultSet rs4=stm.executeQuery("SELECT *FROM NGONNGU WHERE NGONNGU='"+mann+"'");
                    while(rs4.next()) {
                        String nn= rs4.getString("MANGONNGU");
                        l_sach.set_mangonngu(nn);
                    }
                    ResultSet rs5=stm.executeQuery("SELECT *FROM LOAISACH WHERE TENLOAISACH='"+maloai+"'");
                    while(rs5.next()) {
                        String loai= rs5.getString("MALOAISACH");
                        l_sach.set_maloai(loai);
                    }

                    l_sach.set_gia(gia);
                    l_sach.set_masach(tb_qls_masach.getText());
                    l_sach.set_tensach(tb_qls_tensach.getText());
                    if(l_sach.suasach()) {
                        if(l_sach.suasangtac())
                        {
                            JOptionPane.showMessageDialog(this,"cap nhat thanh cong");
                            load_table();
                        }
                        else JOptionPane.showMessageDialog(this, "ko cap nhat duoc sang tac");
                    } else
                        JOptionPane.showMessageDialog(this, "ko thanh cong");
                    clearqls();
                    bt_qls_sua.setText("Sữa");
                    closeboxqls();
                    bt_qls_them.setVisible(true);
                    bt_qls_xoa.setVisible(true);

                } catch (SQLException ex) {
                    Logger.getLogger(QLTV.class.getName()).log(Level.SEVERE, null, ex);
                }
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(QLTV.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_bt_qls_suaActionPerformed

    private void bt_qls_themActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_qls_themActionPerformed
        //sua cai button cho giong C#
        if(bt_qls_them.getText().equals("Thêm")) {
            openboxqls();
            loadcbqls();
            bt_qls_them.setText("Chấp Nhận");
            bt_qls_sua.setVisible(false);
            bt_qls_xoa.setVisible(false);
        } else if(bt_qls_them.getText().equals("Chấp Nhận")) {
            try {
                Class.forName(DRIVER);
                try {
                    Connection con = DriverManager.getConnection(URL);
                    lop_sach l_sach = new lop_sach();
                    int gia=Integer.parseInt(tb_qls_gia.getText());

                    // lay du lieu tu combox
                    String maloai = cb_qls_linhvuc.getSelectedItem().toString();
                    String manxb = cb_qls_nhaxuatban.getSelectedItem().toString();
                    String mancc = cb_qls_nhacungcap.getSelectedItem().toString();
                    String matg = cb_qls_tacgia.getSelectedItem().toString();
                    String mann = cb_qls_ngonngu.getSelectedItem().toString();
                    Statement stm = con.createStatement();
                    ResultSet rs1=stm.executeQuery("SELECT *FROM NXB WHERE TENNXB='"+manxb+"'");
                    while(rs1.next()) {
                        String nxb= rs1.getString("MANXB");
                        l_sach.set_manhaxuatban(nxb);
                    }
                    ResultSet rs2=stm.executeQuery("SELECT *FROM NHACUNGCAP WHERE TENNCC='"+mancc+"'");
                    while(rs2.next()) {
                        String ncc= rs2.getString("MANCC");
                        l_sach.set_mancc(ncc);
                    }
                    ResultSet rs3=stm.executeQuery("SELECT *FROM TACGIA WHERE HOTEN='"+matg+"'");
                    while(rs3.next()) {
                        String tg= rs3.getString("MATACGIA");
                        l_sach.set_matacgia(tg);
                    }
                    ResultSet rs4=stm.executeQuery("SELECT *FROM NGONNGU WHERE NGONNGU='"+mann+"'");
                    while(rs4.next()) {
                        String nn= rs4.getString("MANGONNGU");
                        l_sach.set_mangonngu(nn);
                    }
                    ResultSet rs5=stm.executeQuery("SELECT *FROM LOAISACH WHERE TENLOAISACH='"+maloai+"'");
                    while(rs5.next()) {
                        String loai= rs5.getString("MALOAISACH");
                        l_sach.set_maloai(loai);
                    }

                    l_sach.set_gia(gia);
                    l_sach.set_masach(tb_qls_masach.getText());
                    l_sach.set_tensach(tb_qls_tensach.getText());
                    if(l_sach.taosachmoi()) {
                        if(l_sach.taomoisangtac())
                        {
                            JOptionPane.showMessageDialog(this,"cap nhat thanh cong");
                            load_table();
                        }
                        else JOptionPane.showMessageDialog(this, "ko cap nhat duoc sang tac");
                    } else
                        JOptionPane.showMessageDialog(this, "ko thanh cong");
                    clearqls();
                    bt_qls_them.setText("Thêm");
                    closeboxqls();
                    bt_qls_sua.setVisible(true);
                    bt_qls_xoa.setVisible(true);

                } catch (SQLException ex) {
                    Logger.getLogger(QLTV.class.getName()).log(Level.SEVERE, null, ex);
                }
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(QLTV.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
}//GEN-LAST:event_bt_qls_themActionPerformed

    private void cb_qls_linhvucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_qls_linhvucActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_cb_qls_linhvucActionPerformed

    private void btthoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btthoatActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_btthoatActionPerformed

    private void tb_qls_masachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tb_qls_masachActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tb_qls_masachActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QLSACH().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_qls_sua;
    private javax.swing.JButton bt_qls_them;
    private javax.swing.JButton bt_qls_xoa;
    private javax.swing.JButton btthoat;
    private javax.swing.JComboBox cb_qls_linhvuc;
    private javax.swing.JComboBox cb_qls_ngonngu;
    private javax.swing.JComboBox cb_qls_nhacungcap;
    private javax.swing.JComboBox cb_qls_nhaxuatban;
    private javax.swing.JComboBox cb_qls_tacgia;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField tb_qls_gia;
    private javax.swing.JTextField tb_qls_masach;
    private javax.swing.JTextField tb_qls_tensach;
    private javax.swing.JTable tb_xemkq;
    // End of variables declaration//GEN-END:variables

}