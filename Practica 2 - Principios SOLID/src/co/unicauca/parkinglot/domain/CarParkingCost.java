package co.unicauca.parkinglot.domain;

import static co.unicauca.parkinglot.infra.Utilities.redondear;
import java.time.Duration;
import java.time.LocalDateTime;

public class CarParkingCost implements IParkingCost{

    @Override
    public long calculateCost(Vehicle prmVehiculo, LocalDateTime prmHoraEntrada, LocalDateTime prmHoraSalida) {
        double varDuracionHoras = Duration.between(prmHoraEntrada, prmHoraSalida).getSeconds();
        varDuracionHoras = varDuracionHoras / 3600;
        if (varDuracionHoras < 1) {
            return redondear(valorMinCar);
        } else{
            return redondear((long) (valorFijoCar + ((varDuracionHoras - 1)*valorAdicionCar)));
        }
    }
    
}
