package com.springmvc.entities;

import java.io.Serializable;
import java.time.OffsetDateTime;

import javax.persistence.*;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.*;

/*
 * Add Comments Here
 */
@Data
@MappedSuperclass
public abstract class BaseEntity implements Serializable {

	@Id
	@Column(name = "id", updatable = false, nullable = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	
	@Column(name = "creation_date")
	//Check the date format
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private OffsetDateTime creationDate;
	
}
