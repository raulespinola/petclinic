package com.springmvc.entities;

import java.time.LocalDate;
import java.time.OffsetDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToOne;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
@MappedSuperclass
public abstract class Person extends BaseEntityName{

	@Column(name = "lastname")
	private String lastName;	
	
	@Column(name = "personal_phone")
	private String personalphone;
	
	@Column(name = "personal_email", nullable = true)
	private String personalEmail;
	
	@Column(name = "birth_date")
	//Check the date format
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate birthdate;
	
	@OneToOne (cascade= CascadeType.ALL)
	private Address addressPersonal;
	
}
