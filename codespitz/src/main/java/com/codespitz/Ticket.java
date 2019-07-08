package com.codespitz;

public class Ticket {

	final static public Ticket EMPTY = new Ticket(null);
	final private Theater theater;
	private boolean isEntered = false;

	public Ticket(final Theater theater) {
		this.theater = theater;
	}

	public boolean isValid(Theater theater) {
		// Ticket의 상태는 Ticket만이 관리한다
		if (isEntered || theater != this.theater || this == EMPTY) {
			return false;
		}
		isEntered = true;
		return true;
	}

	public Long getFee() {
		return theater.getFee();	// Pointer of pointer
	}
}
