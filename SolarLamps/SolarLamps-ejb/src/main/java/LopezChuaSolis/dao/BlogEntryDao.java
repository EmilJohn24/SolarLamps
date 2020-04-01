package LopezChuaSolis.dao;

import java.util.List;

import javax.ejb.Local;

import LopezChuaSolis.model.BlogEntry;

@Local
public interface BlogEntryDao extends Dao<BlogEntry> {

	String NAME = "blogEntryDao";
	String JNDI_NAME = "java:app/SolarLamps-ejb/BlogEntryDaoBean";

	List<BlogEntry> find(int maxresults, int firstresult);

	Long count();

}
