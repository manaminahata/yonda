package com.example.demo.domain;

import java.util.Date;

public class Memo {

	private Integer memoId;
	private String memoBody;
	private Integer memoBookId;
	private Date createAt;
	private Date updateAt;
	
	public Integer getMemoId() {
		return memoId;
	}
	public void setMemoId(Integer memoId) {
		this.memoId = memoId;
	}
	public String getMemoBody() {
		return memoBody;
	}
	public void setMemoBody(String memoBody) {
		this.memoBody = memoBody;
	}
	public Integer getMemoBookId() {
		return memoBookId;
	}
	public void setMemoBookId(Integer memoBookId) {
		this.memoBookId = memoBookId;
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
		return "Memo [memoId=" + memoId + ", memoBody=" + memoBody + ", memoBookId=" + memoBookId + ", createAt="
				+ createAt + ", updateAt=" + updateAt + "]";
	}
	
}
