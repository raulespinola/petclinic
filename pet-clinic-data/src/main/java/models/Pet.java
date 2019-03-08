package models;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="pets")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Pet extends BaseEntityName {

	private PetType petType;
	private Owner owner;
	private LocalDate birthDate;
}
