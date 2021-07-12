package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "emptab")
public class Employee {

	@Id
	@Column(name = "empid_col")
	@GeneratedValue
	private Integer empId;
	@Column(name = "empname_col")
	private String empName;
	@Column(name = "emploca_col")
	private String empLoc;

}
