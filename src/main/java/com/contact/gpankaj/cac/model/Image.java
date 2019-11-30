package com.contact.gpankaj.cac.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Image {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	
	private String name;
	
	private String label; //Prod/Dev/Test
	
	private String type; //Machine Image || Service Image
	
	private String managedBy;
	
	private String purpose;
	
	private String generationMethod; //Command used
	
	private String configurationFile; //Dockerfile
}
