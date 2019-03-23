package cn.curry.cublog.pojo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user_info")
public class BlogUser implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	@Column(length = 11)
	private Integer id;

	@Column(name = "user_name")
	private String userName;

	@Column(nullable = false)
	private String password;

	@Column(nullable = false)
	private String phone;

	@Column(length = 50, nullable = false)
	private Character gendor;

	@Column(name = "true_name")
	private String trueName;

	@Column(length = 100)
	private Character birthday;

	private String email;

	@Column(name = "persnal_brief")
	private String pernalBrief;

	@Column(name = "avatar_img_url", nullable = false)
	private String avatarImgUrl;

	@Column(name = "recent_land")
	private String recentlyLanded;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String username) {
		this.userName = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Character getGendor() {
		return gendor;
	}

	public void setGendor(Character gendor) {
		this.gendor = gendor;
	}

	public String getTrueName() {
		return trueName;
	}

	public void setTrueName(String truename) {
		this.trueName = truename;
	}

	public Character getBirthday() {
		return birthday;
	}

	public void setBirthday(Character birthday) {
		this.birthday = birthday;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPernalBrief() {
		return pernalBrief;
	}

	public void setPernalBrief(String pernalBrief) {
		this.pernalBrief = pernalBrief;
	}

	public String getAvatarImgUrl() {
		return avatarImgUrl;
	}

	public void setAvatarImgUrl(String avatarImgUrl) {
		this.avatarImgUrl = avatarImgUrl;
	}

	public String getRecentlyLanded() {
		return recentlyLanded;
	}

	public void setRecentlyLanded(String recentlyLanded) {
		this.recentlyLanded = recentlyLanded;
	}
}
