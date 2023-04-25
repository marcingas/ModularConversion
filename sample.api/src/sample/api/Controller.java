package sample.api;

import sample.core.UtilityClass;
import sample.entity.EntityOne;
import sample.service.ServiceOne;


public class Controller {
    ServiceOne s = new ServiceOne("Controller has a service");
    EntityOne e = new EntityOne("Controller has an entity");

    Controller(String s) {
        UtilityClass.doSomething("Controller instantiated with " + s);
    }

    public static void main(String[] args) {
        queryModuleData(UtilityClass.class);
        queryModuleData(Controller.class);
        queryModuleData(java.util.logging.Logger.class);
        queryModuleData(EntityOne.class);
        queryModuleData(ServiceOne.class);
    }

    private static void queryModuleData(Class cls) {
        System.out.println("\n============class " + cls);
        Module module = cls.getModule();
        System.out.println("Module: " + module);
        System.out.println("Module name: " + module.getName());
        System.out.println("Module is named: " + module.isNamed());
        System.out.println("Module descriptor: " + module.getDescriptor());
        if (module.getDescriptor() != null) {
            System.out.println("is Automatic: " + module.getDescriptor().isAutomatic());
        }
    }
}
