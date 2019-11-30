package com.contact.gpankaj.cac.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Instance {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	
	private String name;
	
	private String label; //Prod/Dev/Test
	
	private String type; //Dev || Prod || Test
	
	private String managedBy;
	
	private String purpose;
	
	private int numberOfInstance;
	
	private int memory;
	
	private int cpu;
	
	
	

}
