package co.unicauca.parkinglot.access;

public class RepositoryFactory {

    private static RepositoryFactory atrInstance;

    private RepositoryFactory() {
    }
    
    public static RepositoryFactory getInstance() {
        if (atrInstance == null) {
            atrInstance = new RepositoryFactory();
        }
        return atrInstance;
    }
    
    public IVehicleRepository getRepository(){
        return new VehicleRepository();
    }
    
    public IVehicleRepository getRepository(String prmType){
        return new VehicleRepository();
    }
    
}
