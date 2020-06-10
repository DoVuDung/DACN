/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package qltv;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author DELL
 */
public class lop_sach {
    String masach, tensach, maloai, mann;
    int gia;
    String manxb,matg,mancc;

    public lop_sach()
    {
        
    }

    public lop_sach(String masach,String maloai,String mann,String manxb,String mancc,String tensach, int gia )
    {
        this.masach=masach;
        this.maloai=maloai;
        this.mann=mann;
        this.gia=gia;
        this.manxb=manxb;
        this.tensach=tensach;
        this.mancc=mancc;
    }

    public void set_masach(String masach)
    {
        this.masach=masach;
    }
    public void set_tensach(String tensach)
    {
        this.tensach = tensach;
    }

    public void set_mancc(String mancc)
    {
        this.mancc = mancc;
    }
    
    public void set_maloai(String maloai)
    {
        this.maloai = maloai;
    }

    public void set_mangonngu(String mann)
    {
        this.mann = mann;
    }

    public void set_gia(int gia)
    {
        this.gia = gia;
    }

    public void set_manhaxuatban(String manxb)
    {
        this.manxb = manxb;
    }
        
    public void set_matacgia(String matg)
    {
        this.matg = matg;
    }

    public String get_masach()
    {
        return masach;
    }

    public String get_tensach()
    {
        return tensach;
    }

    public String get_mancc()
    {
        return mancc;
    }
    
    public String get_maloai()
    {
        return maloai;
    }

    public String get_mangonngu()
    {
        return mann;
    }

    public int get_gia()
    {
        return gia;
    }

    public String get_manhaxuatban()
    {
        return manxb;
    }

    public String get_matacgia()
    {
        return matg;
    }

   private static final String DRIVER =
           "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private static final String URL = 
           "jdbc:sqlserver://localhost:1433;databaseName=QuanLyThuVien;integratedSecurity=true;user=sa;password=123456";
    
    public boolean taosachmoi()
    {
        try {
            Class.forName(DRIVER);
            try {
                Connection con = DriverManager.getConnection(URL);                
                CallableStatement cs = con.prepareCall("{call sp_themsach(?,?,?,?,?,?,?)}");
                cs.setString(1,masach);
                cs.setString(2,maloai);
                cs.setString(3,mann);
                cs.setString(4,manxb);
                cs.setString(5,mancc);
                cs.setString(6,tensach);
                cs.setInt(7,gia);
                cs.execute();
                return true;
            } catch (SQLException ex) {
                Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
                return false;
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public boolean suasach()
    {
        try {
            Class.forName(DRIVER);
            try {
                Connection con = DriverManager.getConnection(URL);
                CallableStatement cs = con.prepareCall("{call sp_suasach(?,?,?,?,?,?,?)}");
                cs.setString(1,masach);
                cs.setString(2,maloai);
                cs.setString(3,mann);
                cs.setString(4,manxb);
                cs.setString(5,mancc);
                cs.setString(6,tensach);
                cs.setInt(7,gia);
                cs.execute();
                return true;
            } catch (SQLException ex) {
                Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
                return false;
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public boolean xoasach()
    {
        try {
            Class.forName(DRIVER);
            try {
                Connection con = DriverManager.getConnection(URL);
                CallableStatement cs = con.prepareCall("{call sp_xoasach(?)}");
                cs.setString(1,masach);
                cs.execute();
                return true;
            } catch (SQLException ex) {
                Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
                return false;
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public boolean taomoisangtac()
    {
        try {
            Class.forName(DRIVER);
            try {
                Connection con = DriverManager.getConnection(URL);                
                CallableStatement cs = con.prepareCall("{call sp_themsangtac(?,?)}");
                cs.setString(1,masach);
                cs.setString(2, matg);
                cs.execute();
                return true;
                  } catch (SQLException ex) {
                Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
                return false;
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public boolean suasangtac()
    {
        try {
            Class.forName(DRIVER);
            try {
                Connection con = DriverManager.getConnection(URL);
                CallableStatement cs = con.prepareCall("{call sp_suasangtac(?,?)}");
                cs.setString(1,masach);
                cs.setString(2, matg);
                cs.execute();
                return true;
                  } catch (SQLException ex) {
                Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
                return false;
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public boolean xoasangtac()
    {
        try {
            Class.forName(DRIVER);
            try {
                Connection con = DriverManager.getConnection(URL);
                CallableStatement cs = con.prepareCall("{call sp_xoasangtac(?)}");
                cs.setString(1,masach);
                cs.execute();
                return true;
            } catch (SQLException ex) {
                Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
                return false;
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

}
