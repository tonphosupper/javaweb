package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Account {
	static DungChung dc = new DungChung();
	public static boolean checkLogin(String username, String password) throws SQLException {
		boolean isValid = false;
		dc.KetNoi();
		String sql = "select * from KhachHang where tendn=? and pass=?";
        PreparedStatement pre = dc.cn.prepareStatement(sql);
        pre.setString(1, username);
        pre.setString(2, password);
 
        ResultSet rs = pre.executeQuery();
 
        
 
        if (rs.next()) {
            isValid = true;         
        }else {
        	isValid = false;
        }
        rs.close();
        
        dc.cn.close();
 
        return isValid;
	}

}
