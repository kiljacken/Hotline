package dk.itu.bsdb.hotline.model;
public class Cause {
    private static int auto_id = 0;
    public final int id = ++auto_id;
    public String name, description;
    public Cause belongsTo;

    @Override
    public String toString() {
        return name;
    }
}
