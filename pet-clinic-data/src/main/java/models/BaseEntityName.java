package models;

import javax.persistence.*;
import javax.persistence.MappedSuperclass;
import javax.validation.constraints.NotEmpty;

import lombok.Data;

@Data
@MappedSuperclass
public abstract class BaseEntityName extends BaseEntity{

	@Column(name = "name")
	private String name;		
}
