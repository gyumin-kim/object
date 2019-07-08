package com.codespitz;

/**
 * @author Gyumin Kim
 * @since 2019-07-08
 */
public class Audience {

	private Ticket ticket = Ticket.EMPTY;
	private Invitation invitation = Invitation.EMPTY;
	private Long amount;

	public Audience(final Long amount) {
		this.amount = amount;
	}

	public void buyTicket(TicketSeller seller) {
		ticket = seller.getTicket(this);
	}

	public boolean hasAmount(Long amount) {
		return this.amount >= amount;
	}

	public boolean minusAmount(Long amount) {
		if (this.amount < amount)	return false;
		this.amount -= amount;
		return true;
	}

	public Invitation getInvitation() {
		return invitation;
	}

	public void removeInvitation() {
		invitation = Invitation.EMPTY;
	}

	public Ticket getTicket() {
		return ticket;
	}

	public void setInvitation(Invitation invitation) {
		this.invitation = invitation;
	}

}
