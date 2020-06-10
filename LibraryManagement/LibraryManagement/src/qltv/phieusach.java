/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package qltv;
import java.util.Calendar;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
//import java.util.Date;

/**
 *
 * @author DELL
 */
public class phieusach {
        String mapm, masach;
        String ngayhethantra,ngaytra;
        int songayquahan,tienphat;
        boolean matsach;
        public phieusach() { }

        public phieusach(String mapm, String masach, String ngayhethantra,String ngaytra, int songayquahan,boolean matsach,int tienphat)
        {
            this.mapm = mapm;
            this.masach = masach;
            this.ngayhethantra = ngayhethantra;
            this.ngaytra = ngaytra;
            this.songayquahan = songayquahan;
            this.matsach = matsach;
            this.tienphat = tienphat;
        }

        public void set_maphieumuon(String mapm)
        {
            this.mapm = mapm;
        }

        public void set_masach(String masach)
        {
            this.masach = masach;
        }

        public void set_ngaytra(String ngaytra)
        {
            this.ngaytra=ngaytra;
        }

        public void set_ngayhethantra(String ngayhethantra)
        {
            this.ngayhethantra = ngayhethantra;
        }

        public void set_songayquahan(int songayquahan)
        {
            this.songayquahan = songayquahan;
        }

        public void set_tienphat(int tienphat)
        {
            this.tienphat = tienphat;
        }

        public void set_matsach(boolean matsach)
        {
            this.matsach = matsach;
        }

        public String get_maphieumuon()
        {
            return mapm;
        }
        public String get_masach()
        {
            return masach;
        }

        public int get_tienphat()
        {
            return tienphat;
        }

        public String get_ngaytra()
        {
            return ngaytra;
        }

        public String get_ngayhethantra()
        {
            return ngayhethantra;
        }

        public int get_songayquahan()
        {
            return songayquahan;
        }

        public boolean get_matsach()
        {
            return matsach;
        }

    private static final String DRIVER =
           "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private static final String URL = 
           "jdbc:sqlserver://localhost:1433;databaseName=QuanLyThuVien;integratedSecurity=true;user=sa;password=123456";
    
    public boolean taomoiphieusach()
    {
        try {
            Class.forName(DRIVER);
            try {
                Connection con = DriverManager.getConnection(URL);
                CallableStatement cs=con.prepareCall("{call sp_themphieusach(?,?,?)}");
                cs.setString(1, mapm);
                cs.setString(2, masach);
                cs.setString(3, ngayhethantra);
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

    public boolean trasach()
    {
        try {
            Class.forName(DRIVER);
            try {
                Connection con = DriverManager.getConnection(URL);
                CallableStatement cs=con.prepareCall("{call sp_trasach(?,?,?,?,?,?)}");
                cs.setString(1, mapm);
                cs.setString(2, masach);
                cs.setString(3, ngaytra);
                cs.setInt(4, songayquahan);
                cs.setInt(5, tienphat);
                cs.setBoolean(6, matsach);
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

    public boolean xoaphieusach()
    {
        try {
            Class.forName(DRIVER);
            try {
                Connection con = DriverManager.getConnection(URL);
                CallableStatement cs=con.prepareCall("{call sp_xoaphieusach(?)}");
                cs.setString(1, mapm);
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
