package dk.itu.bsdb.hotline.controller;
import dk.itu.bsdb.hotline.model.*;
import java.util.*;
import java.util.stream.*;
public class EmployeeController {
    private Model model = Model.getInstance();

    public Employee newEmployee(String name, String email, String phone){
        Employee e = new Employee();
        e.name = name;
        e.email = email;
        e.phone = phone;
        model.employees.add(e);
        return e;
    }

    public Collection<Employee> getEmployees(){
        return model.employees;
    }

    public Collection<Employee> getEmployees(String name){
        return model.employees.stream().filter(e -> e.name == name)
            .collect(Collectors.toList());
    }


    public HotlineEmployee newHotlineEmployee(Employee e){
        HotlineEmployee h = new HotlineEmployee();
        h.employee = e;
        model.hotline.add(h);
        return h;
    }

    public void setLevel(HotlineEmployee h, int i){
        if(i != 1 && i != 2) throw new RuntimeException("Level must be one or two");
        h.level = i;
    }

    public void setPresent(HotlineEmployee h, boolean present){
        h.present = present;
    }

    public Collection<HotlineEmployee> getHotlineEmployees(){
        return model.hotline;
    }

    public Collection<HotlineEmployee> getPresentHotlineEmployees(){
        return model.hotline.stream().filter(h -> h.present)
            .collect(Collectors.toList());
    }

    public Collection<HotlineEmployee> getHotlineEmployees(int level){
        return model.hotline.stream().filter(h -> h.level == level)
            .collect(Collectors.toList());
    }

    public Collection<HotlineEmployee> getHotlineEmployees(String name){
        return model.hotline.stream().filter(h -> h.employee.name == name)
            .collect(Collectors.toList());
    }


}


