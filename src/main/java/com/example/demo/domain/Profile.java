package com.example.demo.domain;

import java.util.Date;

public class Profile {
	
	private Integer profileId;
	private String profilePic;
	private Integer profileUserId;
	private Date createAt;
	private Date updateAt;
	
	public Integer getProfileId() {
		return profileId;
	}
	public void setProfileId(Integer profileId) {
		this.profileId = profileId;
	}
	public String getProfilePic() {
		return profilePic;
	}
	public void setProfilePic(String profilePic) {
		this.profilePic = profilePic;
	}
	public Integer getProfileUserId() {
		return profileUserId;
	}
	public void setProfileUserId(Integer profileUserId) {
		this.profileUserId = profileUserId;
	}
	public Date getCreateAt() {
		return createAt;
	}
	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}
	public Date getUpdateAt() {
		return updateAt;
	}
	public void setUpdateAt(Date updateAt) {
		this.updateAt = updateAt;
	}
	
	@Override
	public String toString() {
		return "Profile [profileId=" + profileId + ", profilePic=" + profilePic + ", profileUserId=" + profileUserId
				+ ", createAt=" + createAt + ", updateAt=" + updateAt + "]";
	}
	
}
