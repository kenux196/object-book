package org.kenux;

import org.kenux.theater.*;

public class Main {

    public static void main(String[] args) {
	// write your code here

        TicketOffice ticketOffice = new TicketOffice(1000L, new Ticket(100L), new Ticket(100L));
        TicketSeller ticketSeller = new TicketSeller(ticketOffice);
        Theater theater = new Theater(ticketSeller);

        Audience audience1 = new Audience(new Bag(2000L));
        Audience audience2 = new Audience(new Bag(2000L, new Invitation()));

        theater.enter(audience1);
        theater.enter(audience2);
    }
}
