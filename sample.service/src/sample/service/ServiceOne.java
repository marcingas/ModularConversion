package sample.service;

import sample.core.UtilityClass;
import sample.entity.EntityOne;

public class ServiceOne {
    private EntityOne e = new EntityOne("ServiceOne has an entity");

    public ServiceOne(String s){
        UtilityClass.doSomething("ServiceOne instantiated with " + s);
    }
}
