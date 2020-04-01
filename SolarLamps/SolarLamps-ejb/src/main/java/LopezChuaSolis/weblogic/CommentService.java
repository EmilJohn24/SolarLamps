package LopezChuaSolis.weblogic;

import javax.ejb.Local;

import LopezChuaSolis.model.Comment;

@Local
public interface CommentService {

	String NAME = "commentService";
	String JNDI_NAME = "java:app/SolarLamps-ejb/CommentServiceBean";

	Comment getInstance();

	void save();

	void remove();

}
