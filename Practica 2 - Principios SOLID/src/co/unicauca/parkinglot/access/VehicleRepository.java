package co.unicauca.parkinglot.access;

import co.unicauca.parkinglot.domain.Vehicle;
import java.util.List;
import java.sql.*;
import java.util.ArrayList;

public class VehicleRepository implements IVehicleRepository{
    
    private Connection atrConn;
    private List<Vehicle> atrListVehiculos = new ArrayList<Vehicle>();
    
    public VehicleRepository(){
    }
    
    @Override
    public boolean save(Vehicle prmNewVehicle)
    {
        if(prmNewVehicle != null)
            return atrListVehiculos.add(prmNewVehicle);
        return false;
    }

    @Override
    public List<Vehicle> list()
    {
        return atrListVehiculos;
    }
    
    private boolean initDatabase()
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    public boolean connect()
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    public boolean disconnect()
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
