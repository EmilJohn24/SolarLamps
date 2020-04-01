package LopezChuaSolis.weblogic;

import javax.ejb.Local;

import LopezChuaSolis.model.BlogEntry;

@Local
public interface BlogEntryService {

	String NAME = "blogEntryService";
	String JNDI_NAME = "java:app/SolarLamps-ejb/BlogEntryServiceBean";

	BlogEntry getInstance();

	boolean newInstance();

	boolean persistOrUpdate();

	boolean delete();

	Long getId();

	void setId(Long id);

	void remove();
}
