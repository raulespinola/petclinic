package com.springmvc.entities;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="pets")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Pet extends Person {

}
