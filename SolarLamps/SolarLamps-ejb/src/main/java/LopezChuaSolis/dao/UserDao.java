package LopezChuaSolis.dao;

import javax.ejb.Local;

import LopezChuaSolis.model.User;

@Local
public interface UserDao extends Dao<User> {

	String NAME = "userDao";
	String JNDI_NAME = "java:app/SolarLamps-ejb/UserDaoBean";

	User findByUsername(String username);

}
