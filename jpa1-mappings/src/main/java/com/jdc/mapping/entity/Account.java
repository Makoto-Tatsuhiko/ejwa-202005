package com.jdc.mapping.entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

@Data
@Entity
@Table(name = "ACCOUNT_TBL")
public class Account implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	private int id;
	private String name;
	private String password;
	private Gender gender;
	@Enumerated(EnumType.STRING)
	private Role role;
	@Temporal(TemporalType.DATE)
	private LocalDate dob;
	private String address;
	private String phone;
	@Column(name = "login_email",unique = true,nullable = false)
	private String email;
	
	public enum Gender {
		Male, Female
	}
	
	public enum Role {
		Admin, Owner, Member
	}

}
