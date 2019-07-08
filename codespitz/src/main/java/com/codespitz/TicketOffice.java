package com.codespitz;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Gyumin Kim
 * @since 2019-07-08
 */
public class TicketOffice {

	private Long amount;
	private List<Ticket> tickets = new ArrayList<>();

	public TicketOffice(final Long amount) {
		this.amount = amount;
	}

	public void addTicket(Ticket ticket) {
		this.tickets.add(ticket);
	}

	public Ticket getTicketWithFee() {
		if (tickets.size() == 0)	return Ticket.EMPTY;
		Ticket ticket = tickets.get(0);
		amount += ticket.getFee();
		return ticket;
	}

	// TicketOffice는 Invitation의 존재를 모른다.
	// 초대장이 아니라 예를 들어 VIP, 통신사 혜택 등의 다른 수단이 생길 가능성이 있다.
	public Ticket getTicketWithNoFee() {
		if (tickets.size() == 0)	return Ticket.EMPTY;
		return tickets.remove(0);
	}

	public Long getTicketPrice() {
		if (tickets.size() == 0)	return 0L;
		return tickets.get(0).getFee();
	}
}
