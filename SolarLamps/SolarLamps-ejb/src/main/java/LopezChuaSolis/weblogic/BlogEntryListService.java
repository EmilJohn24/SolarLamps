package LopezChuaSolis.weblogic;

import java.util.List;

import javax.ejb.Local;

import LopezChuaSolis.model.BlogEntry;

@Local
public interface BlogEntryListService {

	String NAME = "blogEntryListService";
	String JNDI_NAME = "java:app/SolarLamps-ejb/BlogEntryListServiceBean";

	List<BlogEntry> getResultList();

	int getNextFirstResult();

	int getPreviousFirstResult();

	Integer getFirstResult();

	void setFirstResult(Integer firstResult);

	boolean isPreviousExists();

	boolean isNextExists();

	void remove();

}
