package allPackages.service;

import allPackages.bean.User;
import allPackages.dao.UserDao;
import allPackages.dao.UserDaoImpl;

public class UserServiceImpl implements UserService {

	
	private UserDao ud;	
	public void setUd(UserDao ud) {
		this.ud = ud;
	}

	@Override
	public User getUserByInfo(User u) {
		// TODO Auto-generated method stub
		return ud.getUserByInfo(u);
	}

}
