package LopezChuaSolis.bootstrap.testdata;

import javax.ejb.Local;

@Local
public interface BlogEntryTestdata {

	String NAME = "blogEntryTestdata";
	String JNDI_NAME = "java:app/SolarLamps-bootstrap/BlogEntryTestdataBean";

	void insert();

}
