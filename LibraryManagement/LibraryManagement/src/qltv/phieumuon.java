/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package qltv;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Calendar;

/**
 *
 * @author DELL
 */
public class phieumuon {
    String maPM, madg , manv;
    String ngaymuon;
    public phieumuon() { }

    public phieumuon(String maPM, String madg, String manv,String ngaymuon)
    {
        this.maPM = maPM;
        this.madg = madg;
        this.manv = manv;
        this.ngaymuon = ngaymuon;
    }

    public void set_maPM(String mathe)
    {
        this.maPM = mathe;
    }

    public void set_madg(String madg)
    {
        this.madg = madg;
    }

    public void set_manv(String manv)
    {
        this.manv = manv;
    }

    public void set_ngaymuon(String ngaymuon)
    {
        this.ngaymuon = ngaymuon;
    }
    public String get_maPM()
    {
        return maPM;
    }

    public String get_madg()
    {
        return madg;
    }

    public String get_manv()
    {
        return manv;
    }

    public String get_ngaymuon()
    {
        return ngaymuon;
    }

    private static final String DRIVER =
           "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private static final String URL = 
           "jdbc:sqlserver://localhost:1433;databaseName=QuanLyThuVien;integratedSecurity=true;user=sa;password=123456";

    public boolean taomoiphieumuon()
    {
        try {
            Class.forName(DRIVER);
            try {
                Connection con = DriverManager.getConnection(URL);                
                CallableStatement cs=con.prepareCall("{call sp_taomoiphieumuon(?,?,?,?)}");
                cs.setString(1,maPM);
                cs.setString(2, madg);
                cs.setString(3,manv);
                cs.setString(4, ngaymuon);
                cs.execute();
                return true;
                } catch (SQLException ex) {
                Logger.getLogger(phieumuon.class.getName()).log(Level.SEVERE, null, ex);
                return false;
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(phieumuon.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public boolean xoaphieumuon()
    {
        try {
            Class.forName(DRIVER);
            try {
                Connection con = DriverManager.getConnection(URL);
                CallableStatement cs=con.prepareCall("{call sp_xoaphieumuon(?)}");
                cs.setString(1,maPM);
                cs.execute();
                return true;
                } catch (SQLException ex) {
                Logger.getLogger(phieumuon.class.getName()).log(Level.SEVERE, null, ex);
                return false;
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(phieumuon.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
}
