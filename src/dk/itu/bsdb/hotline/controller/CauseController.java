package dk.itu.bsdb.hotline.controller;
import dk.itu.bsdb.hotline.model.*;
import java.util.*;
import java.util.stream.*;
public class CauseController{

    private Model model = Model.getInstance();
    public Cause newCause(String name, String description, Cause parent){
        Cause c = new Cause();
        c.name = name;
        c.description = description;
        c.belongsTo = parent;
        model.causes.add(c);
        return c;
    }

    public Cause newCause(String name, String description){
        return newCause(name,description,null);
    }

    public Collection<Cause> getCauses(){
        return model.causes;
    }

    public Collection<Cause> getCauses(String search){
        return model.causes.stream().filter(c -> c.name == search || c.description == search)
            .collect(Collectors.toList());
    }

}
