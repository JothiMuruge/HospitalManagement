package dao;

import daoimpl.UserDetails;

public interface LoginDetailsDao {

	boolean signUp(UserDetails user);

	boolean signIn(UserDetails user);

}
