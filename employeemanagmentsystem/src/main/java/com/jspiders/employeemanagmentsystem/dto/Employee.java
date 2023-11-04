package com.jspiders.employeemanagmentsystem.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "emp_info")
public class Employee {

	@Id
	@Column(name = "emp_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "emp_name", nullable = false)
	private String name;
	@Column(name = "emp_email", nullable = false, unique = true)
	private String email;
	@Column(name = "emp_salary", nullable = false)
	private double salary;
}
