package com.pete.domain.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.pete.domain.base.BaseEntity;
@Entity(name = "acct_user") 
public class AcctUser extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4173840626915621588L;

	@Column(name = "nick_name", nullable = false) 
	private String nickName;
	@Column(name = "telephone", nullable = false) 
	private String telephone;
	@Column(name = "register_time", nullable = false) 
	private Date registerTime;

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public Date getRegisterTime() {
		return registerTime;
	}

	public void setRegisterTime(Date registerTime) {
		this.registerTime = registerTime;
	}
	
	
	
}
