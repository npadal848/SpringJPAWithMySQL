package com.np.jpa.entity;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "employees")
@Data
public class Employee implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "employee_id")
	private long employeeID;
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "phone_number")
	private String phoneNumber;
	
	@Column(name = "hire_date")
	private Timestamp hireDate;
	
	@Column(name = "job_id")
	private long jobId;
	
	@Column(name = "salary")
	private double salary;
	
	@Column(name = "manager_id")
	private long managerId;
	
	@Column(name = "department_id")
	private long departmentId;
}
