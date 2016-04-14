package dk.itu.bsdb.hotline.controller;
import dk.itu.bsdb.hotline.model.*;
import java.util.*;
import java.util.stream.*;

public class TicketController {
    private Model model = Model.getInstance();

    public Ticket newTicket(HotlineEmployee recipient){
        Ticket t = new Ticket(); //Id is automatically set
        t.recipient = recipient;
        model.tickets.add(t);
        return t;
    }


    public void closeTicket(Ticket ticket){
        ticket.status = Status.closed;
        ticket.end = new Date();
    }

    public void updateDue(Ticket t, Date due){ t.due = due; }
    public void updateText(Ticket t, String text){ t.text = text; }
    public void updateStatus(Ticket t, Status status){ t.status = status; }
    public void updateSubject(Ticket t, String subject){ t.subject = subject; }
    public void updatePriority(Ticket t, Priority p){ t.priority = p; }
    public void transferTicket(Ticket t, HotlineEmployee e){ t.owner = e; }

    public void pushToLevel2(Ticket ticket){
        ticket.status = Status.level2;
        ticket.owner = null;
    }

    public Collection<Ticket> getTickets(){
        return model.tickets;
    }

    public Optional<Ticket> getTicket(int id){
        return model.tickets.stream().filter(t -> t.id == id)
            .collect(singleOrEmpty());
    }

    public Collection<Ticket> getTickets(Status status){
        return model.tickets.stream().filter(t -> t.status == status)
            .collect(Collectors.toList());
    }

    public Collection<Ticket> getTickets(Cause cause){
        return model.tickets.stream().filter(t -> t.cause == cause)
            .collect(Collectors.toList());
    }

    public Collection<Ticket> getTickets(Employee submittedBy){
        return model.tickets.stream().filter(t -> t.sender == submittedBy)
            .collect(Collectors.toList());
    }

    public Collection<Ticket> getTickets(String keyword){
        return model.tickets.stream()
            .filter(t -> t.subject.contains(keyword) || t.text.contains(keyword))
            .collect(Collectors.toList());
    }

    public Collection<Ticket> getOverdueTickets(){
        Date now = new Date();
        //Getting all tickets that are not closed and with a due date before than now
        List<Ticket> tickets = model.tickets.stream()
            .filter(t -> t.due != null && now.after(t.due) && t.end == null)
            .collect(Collectors.toList());

        //Setting all of these tasks status to overdue
        tickets.forEach(t -> t.status = Status.overdue);

        return tickets;
    }

    public static Collection<Ticket> orderById(Collection<Ticket> tickets){
        return tickets.stream().sorted((t1,t2) -> Integer.compare(t1.id,t2.id)).
            collect(Collectors.toList());
    }

    public static Collection<Ticket> orderByDue(Collection<Ticket> tickets){
        return tickets.stream().sorted((t1,t2) -> t1.due.compareTo(t2.due)).
            collect(Collectors.toList());
    }

    public static Collection<Ticket> orderByAge(Collection<Ticket> tickets){
        return tickets.stream().sorted((t1,t2) -> t1.start.compareTo(t2.start)).
            collect(Collectors.toList());
    }

    public static Collection<Ticket> orderByPriority(Collection<Ticket> tickets){
        return tickets.stream().sorted((t1,t2) -> t1.priority.compareTo(t2.priority)).
            collect(Collectors.toList());
    }

    static<T> Collector<T,?,Optional<T>> singleOrEmpty() {
        return Collectors.collectingAndThen(
                Collectors.toSet(),
                set -> set.size() == 1
                ? set.stream().findAny()
                : Optional.empty()
                );
    }
}
