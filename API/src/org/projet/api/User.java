package org.projet.api;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "User")
public class User {

	private String name;
	private String surname;
	private double score;

	public User() {
	}

	public User(final String name, final String surname, final double score) {
		this.name = name;
		this.surname = surname;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	

}
