package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class dangkydao {
	public boolean KtDangNhap(String un, String pass) throws Exception{

		//B1 ket noi
		DungChung dc =new DungChung();
		dc.KetNoi();
		//B2 thiet lap cau lenh
		String sql="select * from KhachHang where tendn="+ un+" and pass="+ pass+"";
		//B3 lấy dữ liệu
		PreparedStatement cmd = dc.cn.prepareStatement(sql);
		ResultSet r= cmd.executeQuery();
		boolean kq= r.next();
		
		r.close();
		
		
		return kq;
		}
}
