package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="vets")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Vet extends Person {

	@Column(name = "work_phone")
	private String workPhone;
	
	@Column(name = "work_email", nullable = true)
	private String workEmail;
}
