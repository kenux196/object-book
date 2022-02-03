package org.kenux.chapter01;

import org.kenux.chapter01.theater.*;

public class TheaterApplication {

    public static void main(String[] args) {
        TicketOffice ticketOffice = new TicketOffice(1000L, new Ticket(100L), new Ticket(100L));
        TicketSeller ticketSeller = new TicketSeller(ticketOffice);
        Theater theater = new Theater(ticketSeller);

        Audience audience1 = new Audience(new Bag(2000L));
        Audience audience2 = new Audience(new Bag(2000L, new Invitation()));

        theater.enter(audience1);
        theater.enter(audience2);
    }
}