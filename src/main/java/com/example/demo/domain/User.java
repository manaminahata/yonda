package com.example.demo.domain;

import java.sql.Timestamp;
import java.util.Date;

/**
 * usersテーブルのためのドメインクラス
 * @author manami
 *
 */
public class User {
	
	private Integer userId;
	private String userName;
	private String userEmail;
	private String userPassword;
//	private Date createAt;
//	private Date updateAt;
	private Timestamp createAt;
	private Timestamp updateAt;
	
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public Date getCreateAt() {
		return createAt;
	}
//	public void setCreateAt(Date createAt) {
//		this.createAt = createAt;
//	}
//	public Date getUpdateAt() {
//		return updateAt;
//	}
//	public void setUpdateAt(Date updateAt) {
//		this.updateAt = updateAt;
//	}
	public Timestamp getUpdateAt() {
		return updateAt;
	}
	public void setUpdateAt(Timestamp updateAt) {
		this.updateAt = updateAt;
	}
	public void setCreateAt(Timestamp createAt) {
		this.createAt = createAt;
	}
	
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userEmail=" + userEmail + ", userPassword="
				+ userPassword + ", createAt=" + createAt + ", updateAt=" + updateAt + "]";
	}
	
//	@Override
//	public String toString() {
//		return "User [userId=" + userId + ", userName=" + userName + ", userEmail=" + userEmail + ", userPassword="
//				+ userPassword + ", createAt=" + createAt + ", updateAt=" + updateAt + "]";
//	}
	
	
	
}
