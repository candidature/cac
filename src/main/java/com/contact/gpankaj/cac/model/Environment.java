package com.contact.gpankaj.cac.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Environment {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	
	private String name;
	
	private String label; //Prod/Dev/Test
	
	private String type; //Kubernetes Or 
	
	private String managedBy;
	
	private String apiServer;
	
	private String token;
	
	private String caCert;
	
	private Boolean active;
}
