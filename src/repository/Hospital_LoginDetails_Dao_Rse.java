package repository;
	import java.sql.Connection;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.sql.Statement;

	import config.MyConnection;
import daoimpl.UserDetails;
	
	public class Hospital_LoginDetails_Dao_Rse {

		private static final String doctor = null;
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		private String medical;
		private String lab;

		public void Hospital_LoginDetailsDaoRse() throws SQLException {
			connection = MyConnection.getConnection();
			statement = connection.createStatement();
		}

		public boolean signUp(UserDetails user) throws SQLException {
			// TODO Auto-generated method stub

			int r = statement.executeUpdate("insert into userdetails values('" + user.getUsername() + "','"
					+ user.getPassword() + "','" + user.getUsername() + "','" + user.getLastName() + "','"
					+ user.getLocation() + "','" + user.getMobileno() + "')");
			if (r == 1) {
				return true;
			} else
				return false;

		}

		public boolean signIn(UserDetails user) throws SQLException {
			// TODO Auto-generated method stub
	        String tuser = user.getUsername();
			String pass = user.getPassword();
			resultSet = statement
					.executeQuery("select *from userdetails where admin='" + tuser + "' and password='" + pass + "'");
			if (resultSet.next()) {
				return true;
			} else
				return false;
		}

		public boolean withdraw(int staff, int facility) throws SQLException {
			// TODO Auto-generated method stub
			ResultSet rs = statement.executeQuery("select *from account where doctor=" + doctor + "");
			while (rs.next()) {
				int balance = rs.getInt("doctor");
				if("patient checked successfully" != null);
			}

				
				
				String medical = null;
				int r = statement.executeUpdate("update doctor = " + medical+ " where patient=" + doctor + "");
				if (r == 1)
					return true;
				{
			return false;
				}
		}

		public boolean deposite(int accno, int amount) throws SQLException {
			// TODO Auto-generated method stub
			ResultSet rs = statement.executeQuery("select *from patient where patient=" + medical + "");
			while (rs.next()) {
				
			}
			return false;
		}

		public int checkdoctor(int medical) throws SQLException {
			// System.out.println("*****"+accno3);
			ResultSet rs2 = statement.executeQuery("select * from doctor where patient=" +lab+ "  ");
			while (rs2.next()) {
				int value = rs2.getInt("amount");

				return value;
			}
			return 0;
		}

		}	



