package co.unicauca.parkinglot.domain.service;

import co.unicauca.parkinglot.access.IVehicleRepository;
import co.unicauca.parkinglot.domain.Vehicle;
import co.unicauca.parkinglot.domain.ParkingCostFactory;
import java.time.LocalDateTime;
import java.util.List;

public class Service {
    private IVehicleRepository atrRepository;

    public Service(IVehicleRepository prmRepositorio)
    {
        atrRepository = prmRepositorio;
    }

    public long calculateParkingCost(Vehicle prmVehiculo, LocalDateTime prmHoraEntrada, LocalDateTime prmHoraSalida)
    {
        return ParkingCostFactory.getInstance().getParkingCost(prmVehiculo.getAtrType()).calculateCost(prmVehiculo, prmHoraEntrada, prmHoraSalida);
    }

    public void saveVehicle(Vehicle prmVehicle)
    {
        atrRepository.save(prmVehicle);
    }
    
    public List<Vehicle> listVehicles()
    {
        return atrRepository.list();
    }
}
