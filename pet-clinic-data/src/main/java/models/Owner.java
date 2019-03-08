package models;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="owners")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Owner extends Person {

}
