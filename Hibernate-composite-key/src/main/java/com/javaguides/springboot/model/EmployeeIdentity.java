package com.javaguides.springboot.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Embeddable;

@Embeddable
public class EmployeeIdentity implements Serializable {

	
 private static final long serialVersionUID=1L;
	
	private String employeeId;
	private String companyId;
	
	
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getCompanyId() {
		return companyId;
	}
	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	public EmployeeIdentity(String employeeId, String companyId) {
		super();
		this.employeeId = employeeId;
		this.companyId = companyId;
	}
	@Override
	public int hashCode() {
		return Objects.hash(companyId, employeeId);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeIdentity other = (EmployeeIdentity) obj;
		return Objects.equals(companyId, other.companyId) && Objects.equals(employeeId, other.employeeId);
	}
	
   
	
	
}
