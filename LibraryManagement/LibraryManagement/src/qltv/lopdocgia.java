/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package qltv;
import java.util.Date;
/**
 *
 * @author DELL
 */
public class lopdocgia {
        String madg, hotendg, madtdg,gioitinh, diachi;
        Date ngaysinh;

        public lopdocgia() { }
        public lopdocgia(String madg, String madtdg, String hotendg, String gioitinh, Date ngaysinh, String diachi)
        {
            this.diachi = diachi;
            this.hotendg = hotendg;
            this.gioitinh = gioitinh;
            this.madg = madg;
            this.madtdg = madtdg;
            this.ngaysinh = ngaysinh;
        }

   // cac phuong thuc set
        public void set_madtdg(String madtdg)
        {
            this.madtdg = madtdg;
        }

        public void set_gioitinh(String gioitinh)
        {
            this.gioitinh = gioitinh;
        }

        public void set_hotendg(String hotendg)
        {
            this.hotendg = hotendg;
        }

        public void set_diachi(String diachi)
        {
            this.diachi = diachi;
        }

        public void set_madg(String madg)
        {
            this.madg = madg;
        }

        public void set_ngaysinh(Date ngaysinh)
        {
            this.ngaysinh = ngaysinh;
        }


        // cac phuong thuc get
        public String get_madtdg()
        {
            return madtdg;
        }

        public String get_gioitinh()
        {
            return gioitinh;
        }

        public String get_diachi()
        {
            return diachi;
        }

        public String get_hotendg()
        {
            return hotendg;
        }

        public String get_madg()
        {
            return madg;
        }

        public Date get_ngaysinh()
        {
            return ngaysinh;
        }
     

}
