package cn.curry.cublog.pojo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "comment_record")
public class CommentRecord implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	@Column(length = 20)
	private Integer id;

	@Column(length = 20, nullable = false)
	private Integer pid;

	@Column(name = "article_id", length = 20, nullable = false)
	private Integer ArticleId;

	@Column(name = "original_author", nullable = false)
	private String originalAuthor;

	@Column(name = "answerer_id", nullable = false)
	private Integer answererId;

	@Column(name = "respondent_id", nullable = false)
	private Integer respondentId;

	@Column(name = "comment_date", length = 100, nullable = false)
	private String commentDate;

	@Column(length = 11, nullable = false)
	private Integer likeness;

	@Column(nullable = false)
	private String content;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public Integer getArticleId() {
		return ArticleId;
	}

	public void setArticleId(Integer articleId) {
		ArticleId = articleId;
	}

	public String getOriginalAuthor() {
		return originalAuthor;
	}

	public void setOriginalAuthor(String originalAuthor) {
		this.originalAuthor = originalAuthor;
	}

	public Integer getAnswererId() {
		return answererId;
	}

	public void setAnswererId(Integer answererId) {
		this.answererId = answererId;
	}

	public Integer getRespondentId() {
		return respondentId;
	}

	public void setRespondentId(Integer respondentId) {
		this.respondentId = respondentId;
	}

	public String getCommentDate() {
		return commentDate;
	}

	public void setCommentDate(String commentDate) {
		this.commentDate = commentDate;
	}

	public Integer getLikeness() {
		return likeness;
	}

	public void setLikeness(Integer likeness) {
		this.likeness = likeness;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

}
