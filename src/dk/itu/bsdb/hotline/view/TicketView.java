package dk.itu.bsdb.hotline.view;
import dk.itu.bsdb.hotline.controller.*;
import dk.itu.bsdb.hotline.model.*;
public class TicketView {
    private TicketController tc;
    public TicketView(){
        tc = new TicketController();
        System.out.println("Tickets");
        tc.getTickets().forEach(t -> System.out.println(t.id + ": " + t.subject));
    }
}

