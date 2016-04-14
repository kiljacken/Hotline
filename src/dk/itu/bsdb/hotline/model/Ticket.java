package dk.itu.bsdb.hotline.model;
import java.util.Date;
public class Ticket {

    private static int auto_id = 0;
    public final int id = ++auto_id;
    public String subject, text;
    public Date start = new Date(),
           due, end;

    //enums
    public Status status = Status.level1;
    public Priority priority = Priority.normal;

    //relations
    public HotlineEmployee owner;
    public HotlineEmployee recipient;
    public Employee sender;
    public Cause cause;

}
