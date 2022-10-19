package co.unicauca.parkinglot.presentation;

import co.unicauca.parkinglot.access.IVehicleRepository;
import co.unicauca.parkinglot.access.RepositoryFactory;
import co.unicauca.parkinglot.domain.Vehicle;
import co.unicauca.parkinglot.domain.TypeEnum;
import co.unicauca.parkinglot.domain.service.Service;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.List;

public class ClientMain {

    public static void main(String[] args) {
        
        System.out.println("Guardar y listar");
        
        IVehicleRepository repo1 = RepositoryFactory.getInstance().getRepository("default");
        Service service1 = new Service(repo1);
        
        Vehicle veh1 = new Vehicle("QET-646", TypeEnum.MOTO);
        service1.saveVehicle(veh1);
        veh1 = new Vehicle("NBV-987", TypeEnum.CAR);
        service1.saveVehicle(veh1);
        veh1 = new Vehicle("IJY-987", TypeEnum.TRUCK);
        service1.saveVehicle(veh1);
        
        List<Vehicle> list1 = service1.listVehicles();
        
        long expResult = 3L;
        long result1 = service1.listVehicles().size();
        
        
        Vehicle veh = new Vehicle("FTK-123", TypeEnum.MOTO);
        LocalDateTime input = LocalDateTime.of(2021, Month.FEBRUARY, 22, 8, 0);
        LocalDateTime output = LocalDateTime.of(2021, Month.FEBRUARY, 22, 19, 30);
        
        IVehicleRepository repo = RepositoryFactory.getInstance().getRepository("default");
        Service service = new Service(repo); //Inyección de dependencias
        
        long result = service.calculateParkingCost(veh, input, output);
        System.out.println("Valor a pagar por la moto: " + result);
        service.saveVehicle(veh);
        veh = new Vehicle("JNK-124", TypeEnum.CAR);
        service.saveVehicle(veh);
        List<Vehicle> list = service.listVehicles();
        list.forEach(vehicle -> {
            System.out.println(vehicle.toString());
        });
    }
}
