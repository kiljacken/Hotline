package dk.itu.bsdb.hotline;

import dk.itu.bsdb.hotline.controller.*;
import dk.itu.bsdb.hotline.model.*;
import dk.itu.bsdb.hotline.view.*;

public class Hotline {

    private TicketController tc = new TicketController();
    private EmployeeController ec  = new EmployeeController();
    private CauseController cc = new CauseController();

    public static void main(String[] args){

        Model.getInstance().fillWithDummyData();

        Hotline h = new Hotline();
        TicketView v = new TicketView();
    }

}
