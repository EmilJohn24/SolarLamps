package LopezChuaSolis.dao;

import java.util.List;

import javax.ejb.Local;

import LopezChuaSolis.model.BlogEntry;
import LopezChuaSolis.model.Comment;

@Local
public interface CommentDao extends Dao<Comment> {

	String NAME = "commentDao";
	String JNDI_NAME = "java:app/SolarLamps-ejb/CommentDaoBean";

	List<Comment> findComments(BlogEntry blogEntry);

}
