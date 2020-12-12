package bo;

import dao.dangkydao;

public class dangkybo {
	dangkydao k = new dangkydao();
	public boolean KTdangnhap(String user, String pass) throws Exception{

	return k.KtDangNhap(user, pass);

	}
}
