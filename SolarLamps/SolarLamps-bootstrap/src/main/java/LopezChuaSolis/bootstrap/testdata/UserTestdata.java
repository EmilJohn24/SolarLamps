package LopezChuaSolis.bootstrap.testdata;

import javax.ejb.Local;

@Local
public interface UserTestdata {

	String NAME = "userTestdata";
	String JNDI_NAME = "java:app/SolarLamps-bootstrap/UserTestdataBean";

	void insert();
}
