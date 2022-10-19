package co.unicauca.parkinglot.domain;

import static co.unicauca.parkinglot.infra.Utilities.redondear;
import java.time.Duration;
import java.time.LocalDateTime;

public class TruckParkingCost implements IParkingCost {

    @Override
    public long calculateCost(Vehicle prmVehiculo, LocalDateTime prmHoraEntrada, LocalDateTime prmHoraSalida) {
        double varDuracionHoras = Duration.between(prmHoraEntrada, prmHoraSalida).toHours();
        if (varDuracionHoras <= 12) {
            return redondear(valorMinTruck);
        } else if(varDuracionHoras <= 24){
            return redondear(valorFijoTruck);
        } else{
            return redondear((long) (valorFijoTruck + (((varDuracionHoras - 24) / 24) * valorAdicionTruck)));
        }
    }

}
