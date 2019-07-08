package com.codespitz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Gyumin Kim
 * @since 2019-07-08
 */
public class Theater {

	final private List<TicketOffice> ticketOffices = new ArrayList<>();
	final private Long fee;

	public Theater(final Long fee) {
		this.fee = fee;
	}

	Long getFee() {
		return this.fee;
	}

	public void setTicketOffices(TicketOffice ... ticketOffices) {
		this.ticketOffices.addAll(Arrays.asList(ticketOffices));
	}

	public void setTicket(TicketOffice ticketOffice, Long num) {
		if (!this.ticketOffices.contains(ticketOffice)) return;
		while (num-- > 0) {
			ticketOffice.addTicket(new Ticket(this));
			// Ticket의 가장 중요한 식별자: 어떤 Theater에서 발행했는가
		}
	}

	public void setInvitation(Audience audience) {
		audience.setInvitation(new Invitation(this));
		// Invitation의 가장 중요한 식별자: 어떤 Theater에서 발행했는가
	}

	public boolean enter(Audience audience) {
		Ticket ticket = audience.getTicket();
		return ticket.isValid(this);
	}

}
