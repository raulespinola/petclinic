package com.springmvc.entities;

import javax.persistence.*;
import javax.persistence.MappedSuperclass;
import javax.validation.constraints.NotEmpty;

import lombok.Data;

@Data
@MappedSuperclass
public abstract class BaseEntityName extends BaseEntity{

	@Column(name = "first_name")
	private String firstname;		
}
