package com.codespitz;

/**
 * @author Gyumin Kim
 * @since 2019-07-08
 */
public class Invitation {

	final static public Invitation EMPTY = new Invitation(null);
	final private Theater theater;

	public Invitation(Theater theater) {
		this.theater = theater;
	}
}
