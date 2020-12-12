package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import bean.sachbean;

public class sachdao {
	DungChung dc = new DungChung();
	public ArrayList<sachbean> getsach() throws Exception{
		ArrayList<sachbean> ds=new ArrayList<sachbean>();
		//B1 ket noi
		dc.KetNoi();
		//B2 thiet lap cau lenh
		String sql="select * from sach";
		//B3 laays du lieu
		PreparedStatement cmd = dc.cn.prepareStatement(sql);
		ResultSet rs = cmd.executeQuery();
		//B4 duyet qua cac don vi
		while(rs.next()) {
			String masach = rs.getString("masach");
			String tensach = rs.getString("tensach");
			String tacgia = rs.getString("tacgia");
			long gia = rs.getLong("gia");
			String anh = rs.getString("anh");
			String maloai = rs.getString("maloai");
			sachbean sach = new sachbean(maloai, anh, tensach, tacgia, gia, masach);
			ds.add(sach);
		}
		rs.close();
		dc.cn.close(); 
		return ds;
	}
}
		
		

