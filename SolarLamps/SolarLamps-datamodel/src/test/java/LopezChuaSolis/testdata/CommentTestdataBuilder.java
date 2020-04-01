package LopezChuaSolis.testdata;

import javax.persistence.EntityManager;

import de.akquinet.jbosscc.needle.db.testdata.AbstractTestdataBuilder;
import LopezChuaSolis.model.BlogEntry;
import LopezChuaSolis.model.Comment;
import LopezChuaSolis.model.User;

public class CommentTestdataBuilder extends AbstractTestdataBuilder<Comment> {

	private static final String CONTENT = "Lorem ipsum dolor sit amet";

	private User withAuthor;
	private BlogEntry withBlogEntry;
	private String withContent;

	public CommentTestdataBuilder() {
		super();
	}

	public CommentTestdataBuilder(EntityManager entityManager) {
		super(entityManager);
	}

	public CommentTestdataBuilder withAuthor(User author) {
		withAuthor = author;
		return this;
	}

	public CommentTestdataBuilder withContent(String content) {
		withContent = content;
		return this;
	}

	public CommentTestdataBuilder withBlogEntry(BlogEntry blogEntry) {
		withBlogEntry = blogEntry;
		return this;
	}

	private User getAuthor() {
		if (withAuthor != null) {
			return withAuthor;
		}

		return hasEntityManager() ? new UserTestdataBuilder(getEntityManager())
				.buildAndSave() : new UserTestdataBuilder().build();
	}

	private BlogEntry getBlogEntry() {
		if (withBlogEntry != null) {
			return withBlogEntry;
		}

		return hasEntityManager() ? new BlogEntryTestdataBuilder(getEntityManager())
				.buildAndSave() : new BlogEntryTestdataBuilder().build();
	}

	private String getContent() {
		return withContent != null ? withContent : CONTENT;
	}

	@Override
	public Comment build() {
		Comment comment = new Comment();
		comment.setAuthor(getAuthor());
		comment.setBlogEntry(getBlogEntry());
		comment.setContent(getContent());
		return comment;
	}

}