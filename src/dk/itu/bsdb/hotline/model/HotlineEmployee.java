package dk.itu.bsdb.hotline.model;
public class HotlineEmployee {
    private static int auto_id = 0;
    public final int id = ++auto_id;
    public int level;
    public boolean present;
    public Employee employee;
}

