package org.eternity.theater.step03;

public class TicketSeller {
    private TicketOffice ticketOffice;

    public TicketSeller(TicketOffice ticketOffice) {
        this.ticketOffice = ticketOffice;
    }

    // 아래 코드는 책에서 설명한 것처럼 트레이드오프 후에 원래의 step02의 구현으로 복구해야 합니다.
    public void sellTo(Audience audience) {
        ticketOffice.sellTicketTo(audience);
        // ticketSeller가 ticketOffice의 인터페이스에만 의존하게 되어, ticketSeller의 자율성은 높였다.
        // 하지만 ticketOffice가 audience에 대해 알고 있어야 하는 구조가 된다.
    }
}
