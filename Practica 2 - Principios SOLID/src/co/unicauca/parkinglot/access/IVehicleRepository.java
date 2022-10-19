package co.unicauca.parkinglot.access;

import co.unicauca.parkinglot.domain.Vehicle;
import java.util.List;

public interface IVehicleRepository {
    public boolean save(Vehicle prmNewVehiculo);
    public List<Vehicle> list();
}
