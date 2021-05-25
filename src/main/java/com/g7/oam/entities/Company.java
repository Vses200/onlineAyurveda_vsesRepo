package com.g7.oam.entities;

public enum Company {

	Divis("Divis Laboratories Ltd."), Sun("Sun Pharmaceutical Industries Ltd."), Reddy("Dr. Reddys Laboratories Ltd."),
	Cipla("Cipla Ltd."), Biocon("Biocon Ltd.");

	String name;

	Company(String name) {
		this.name = name;
	}

}
