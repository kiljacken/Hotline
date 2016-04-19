package dk.itu.bsdb.hotline.model;
public class Employee {
    private static int auto_id = 0;
    public final int id = ++auto_id;
    public String name, email, phone;

    @Override
    public String toString() {
        return name + " <" + email + ">";
    }
}
