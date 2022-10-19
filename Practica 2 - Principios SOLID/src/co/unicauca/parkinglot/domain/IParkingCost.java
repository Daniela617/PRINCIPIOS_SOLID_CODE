package co.unicauca.parkinglot.domain;
import java.time.LocalDateTime;

public interface IParkingCost {
    static final long valorFijoMoto = 2000;
    static final long valorMinMoto = 1000;
    static final long valorAdicionMoto = 1000;
    static final long valorFijoCar = 4000;
    static final long valorMinCar = 2000;
    static final long valorAdicionCar = 2000;
    static final long valorFijoTruck = 15000;
    static final long valorMinTruck = 10000;
    static final long valorAdicionTruck = 15000;
    public long calculateCost(Vehicle prmVehiculo, LocalDateTime prmHoraEntrada, LocalDateTime prmHoraSalida);
}
