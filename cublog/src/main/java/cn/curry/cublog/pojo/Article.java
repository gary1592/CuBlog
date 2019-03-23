package cn.curry.cublog.pojo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "article")
public class Article implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	@Column(length = 11)
	private Integer id;

	@Column(name = "article_id", length = 20, nullable = false)
	private Integer articleId;

	@Column(nullable = false)
	private String auther;

	@Column(nullable = false)
	private String originalAuther;

	@Column(nullable = false)
	private String title;

	@Column(nullable = false)
	private String content;

	@Column(nullable = false)
	private String tags;

	@Column(nullable = false)
	private String type;

	@Column(nullable = false)
	private String categories;

	@Column(nullable = false)
	private String publishDate;

	@Column(nullable = false)
	private String updateDate;

	@Column(nullable = false)
	private String url;

	@Column(nullable = false)
	private String tabloid;

	@Column(length = 11, nullable = false)
	private Integer likeness;

	@Column(length = 20)
	private String lastArticleId;

	@Column(length = 20)
	private String nextArticleId;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getArticleId() {
		return articleId;
	}

	public void setArticleId(Integer articleId) {
		this.articleId = articleId;
	}

	public String getAuther() {
		return auther;
	}

	public void setAuther(String auther) {
		this.auther = auther;
	}

	public String getOriginalAuther() {
		return originalAuther;
	}

	public void setOriginalAuther(String originalAuther) {
		this.originalAuther = originalAuther;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getTags() {
		return tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getCategories() {
		return categories;
	}

	public void setCategories(String categories) {
		this.categories = categories;
	}

	public String getPublishDate() {
		return publishDate;
	}

	public void setPublishDate(String publishDate) {
		this.publishDate = publishDate;
	}

	public String getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(String updateDate) {
		this.updateDate = updateDate;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getTabloid() {
		return tabloid;
	}

	public void setTabloid(String tabloid) {
		this.tabloid = tabloid;
	}

	public Integer getLikeness() {
		return likeness;
	}

	public void setLikeness(Integer likeness) {
		this.likeness = likeness;
	}

	public String getLastArticleId() {
		return lastArticleId;
	}

	public void setLastArticleId(String lastArticleId) {
		this.lastArticleId = lastArticleId;
	}

	public String getNextArticleId() {
		return nextArticleId;
	}

	public void setNextArticleId(String nextArticleId) {
		this.nextArticleId = nextArticleId;
	}

}
