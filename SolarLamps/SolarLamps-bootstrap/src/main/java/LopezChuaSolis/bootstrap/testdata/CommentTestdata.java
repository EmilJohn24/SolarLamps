package LopezChuaSolis.bootstrap.testdata;

import javax.ejb.Local;

@Local
public interface CommentTestdata {

	String NAME = "commentTestdata";
	String JNDI_NAME = "java:app/SolarLamps-bootstrap/CommentTestdataBean";

	void insert();

}
