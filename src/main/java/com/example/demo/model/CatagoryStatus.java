package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="adv_status")
public class CatagoryStatus {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String status;
	
	public CatagoryStatus() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public CatagoryStatus(int id, String status) {
		super();
		this.id = id;
		this.status = status;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "CatagoryStatus [id=" + id + ", status=" + status + "]";
	}
	
}
