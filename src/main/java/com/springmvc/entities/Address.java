package com.springmvc.entities;

import javax.persistence.*;

import lombok.Data;

@Data
@Entity
@Table(name ="addresses")
public class Address extends BaseEntity  {
		

	private String street;
	private String city;
	private String state;
	private String zip;
	private String country;
	
}
