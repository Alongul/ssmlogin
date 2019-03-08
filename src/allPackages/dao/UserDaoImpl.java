package allPackages.dao;


import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import org.junit.Test;


import com.mchange.v2.c3p0.ComboPooledDataSource;

import allPackages.bean.User;


public class UserDaoImpl implements UserDao {
 
	private ComboPooledDataSource dataSource;	
	public void setDataSource(ComboPooledDataSource dataSource) {
		this.dataSource = dataSource;
	}

	@Test
	public  User getUserByInfo(User u) {		
	
		QueryRunner qr=new QueryRunner(dataSource);
		String sql="select * from user where —ß∫≈=? and √‹¬Î=?";
		try {
			return qr.query(sql,new BeanHandler<User>(User.class),u.getStudenID(),u.getPassword());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	
	}
		
		
	


}
