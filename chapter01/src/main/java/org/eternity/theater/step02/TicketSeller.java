package org.eternity.theater.step02;

public class TicketSeller {
    private TicketOffice ticketOffice;

    public TicketSeller(TicketOffice ticketOffice) {
        this.ticketOffice = ticketOffice;
    }

    public void sellTo(Audience audience) {
        // step03과 비교해보면, ticketOffice가 audience를 몰라도 되는 구조다.
        ticketOffice.plusAmount(audience.buy(ticketOffice.getTicket()));
    }
}
