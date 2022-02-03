package org.kenux.theater;

public class Bag {

    private Long amount;
    private Invitation invitation;
    private Ticket ticket;

    public Bag(Long amount) {
        this.amount = amount;
    }

    public Bag(Long amount, Invitation invitation) {
        this.amount = amount;
        this.invitation = invitation;
    }

    public boolean hasInvitation() {
        return invitation != null;
    }

    public boolean hasTicket() {
        return ticket != null;
    }

    private void minusAmount(Long amount) {
        this.amount -= amount;
    }

    private void plusAmount(Long amount) {
        this.amount += amount;
    }

    private void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public Long hold(Ticket ticket) {
        if (hasInvitation()) {
            setTicket(ticket);
            System.out.println("초대장 있는 관객 입장");
            return 0L;
        } else {
            minusAmount(ticket.getFee());
            setTicket(ticket);
            System.out.println("초대장 없는 관객 입장");
            return ticket.getFee();
        }
    }
}
