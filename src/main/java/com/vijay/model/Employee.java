package com.vijay.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="emp9")
public class Employee implements Serializable {
	/*@Id
	@Column(name="eid")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int empId; 
	@Column(name="empName",columnDefinition="varchar(40)",nullable=false)
	private String empName;
	@Column(name="empSal",columnDefinition="number(40)",nullable=false)
	private Double empSal;*/
	@Id     //PrimaryKey
	@Column(name="eId")
	private int empId;
	@Column(name="eName")
	private String empName;
	private Double empSal;
	
	public Employee(int empId, String empName, Double empSal) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Double getEmpSal() {
		return empSal;
	}
	public void setEmpSal(Double empSal) {
		this.empSal = empSal;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal+ "]";
	}
	
	
}
