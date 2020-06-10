/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package qltv;
import java.sql.*;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author DELL
 */
public class KTDN implements Serializable{
    String tendangnhap,matkhau;
    String manhanvien,quyenhan;

    public KTDN(String tendangnhap,String matkhau)
    {
        this.tendangnhap=tendangnhap;
        this.matkhau=matkhau;
    }

   private static final String DRIVER =
           "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private static final String URL = 
           "jdbc:sqlserver://localhost:1433;databaseName=librarymanagement;integratedSecurity=true";
   public void lay_dulieu()
   {
        try {
            Class.forName(DRIVER);
            try {
                Connection con = DriverManager.getConnection(URL);
                Statement stm = con.createStatement();
                ResultSet rs = stm.executeQuery("SELECT TENDANGNHAP,MANHANVIEN,QUYENHAN FROM NHANVIEN WHERE NHANVIEN.TENDANGNHAP='" + tendangnhap +"' AND NHANVIEN.MATKHAU='"+ matkhau + "'");
                    String s = "";
                    while (rs.next()) {
                        s = rs.getString(1);
                        manhanvien = rs.getString(2);
                        quyenhan = rs.getString(3);
                        quyenhan=quyenhan.toUpperCase();
                        s=s.toUpperCase();
                        tendangnhap=tendangnhap.toUpperCase();
                    }
            } catch (SQLException ex) {
                Logger.getLogger(KTDN.class.getName()).log(Level.SEVERE, null, ex);
            }
            

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(KTDN.class.getName()).log(Level.SEVERE, null, ex);
        }
   }
    
}
