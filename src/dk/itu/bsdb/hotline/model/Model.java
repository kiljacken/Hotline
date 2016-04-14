package dk.itu.bsdb.hotline.model;
import java.util.ArrayList;

public class Model {

    public ArrayList<Cause> causes = new ArrayList<>();
    public ArrayList<Ticket> tickets = new ArrayList<>();
    public ArrayList<Employee> employees = new ArrayList<>();
    public ArrayList<HotlineEmployee> hotline = new ArrayList<>();
    
    private static Model instance;
    public static Model getInstance(){
        return instance == null ? instance = new Model() : instance;
    }

    public void fillWithDummyData(){
        //Adding employees
        Employee e1 = new Employee();
        e1.name = "Nete Hansen";
        e1.email = "nete@itu.dk";

        Employee e2 = new Employee();
        e2.name = "knt";
        e2.email = "knt@itu.dk";

        Employee e3 = new Employee();
        e3.name = "Esben";
        e3.email = "ebsen@itu.dk";
        
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);

        //Adding hotline employees
        HotlineEmployee h1 = new HotlineEmployee();
        h1.employee = e1;
        h1.level = 1;
        h1.present = true;

        HotlineEmployee h2 = new HotlineEmployee();
        h2.employee = e2;
        h2.level = 2;
        h2.present = true;

        hotline.add(h1);
        hotline.add(h2);
       
       //Adding causes 
       Cause c1 = new Cause();
       c1.name = "Printer";

       Cause c2 = new Cause();
       c2.name = "Login";

       Cause c3 = new Cause();
       c3.name = "Color";
       c3.belongsTo = c1;

       Cause c4 = new Cause();
       c4.name = "Inkjet";
       c4.belongsTo = c1;

       causes.add(c1);
       causes.add(c2);
       causes.add(c3);
       causes.add(c4);

       //Adding tickets
       Ticket t1 = new Ticket();
       t1.subject = "Printers not working";
       t1.text = "It complains about not enough color ink";
       t1.owner = h1;
       t1.recipient = h1;
       t1.sender = e3;
       t1.cause = c3;

       tickets.add(t1);
    }
}
