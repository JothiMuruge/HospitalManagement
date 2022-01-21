package daoimpl;


	import java.sql.Connection;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.sql.Statement;

	import config.MyConnection;
import dao.Hospital_LoginDetails_Dao;
import dao.LoginDetailsDao;
	
	
	//import respository.Account;
	import respository.LoginDetailsDaoRes;

	public class Hospital_LoginDetails_DaoImpl implements LoginDetailsDao {

		private static final String Hospital_LoginDetailsDaoRes = null;
		LoginDetailsDaoRes loginDetailsDaoRes = null;
		private Hospital_LoginDetails_Dao Hospital_LoginDetails_Dao;

		public Hospital_LoginDetails_DaoImpl() throws SQLException {
			Hospital_LoginDetails_Dao= new  Hospital_LoginDetails_Dao ();
		}

		@Override
		public boolean signUp(UserDetails user) {
			// TODO Auto-generated method stub

			return loginDetailsDaoRes.signUp(user);
		}

		public LoginDetailsDaoRes getLoginDetailsDaoRes() {
			return loginDetailsDaoRes;
		}

		public void setLoginDetailsDaoRes(LoginDetailsDaoRes loginDetailsDaoRes) {
			this.loginDetailsDaoRes = loginDetailsDaoRes;
		}

		public Hospital_LoginDetails_Dao getHospital_LoginDetails_Dao() {
			return Hospital_LoginDetails_Dao;
		}

		public void setHospital_LoginDetails_Dao(Hospital_LoginDetails_Dao hospital_LoginDetails_Dao) {
			Hospital_LoginDetails_Dao = hospital_LoginDetails_Dao;
		}

		@Override
		public boolean signIn(UserDetails user) {
			// TODO Auto-generated method stub
			return false;
		}

		
	


}
