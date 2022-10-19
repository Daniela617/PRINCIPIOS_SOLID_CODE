package co.unicauca.parkinglot.domain;

import static co.unicauca.parkinglot.infra.Utilities.redondear;
import java.time.LocalDateTime;
import java.time.Duration;

public class MotoParkingCost implements IParkingCost{

    @Override
    public long calculateCost(Vehicle prmVehiculo, LocalDateTime prmHoraEntrada, LocalDateTime prmHoraSalida) {
        double varDuracionHoras = Duration.between(prmHoraEntrada, prmHoraSalida).getSeconds();
        varDuracionHoras = varDuracionHoras / 3600;
        if (varDuracionHoras < 1) {
            return redondear(valorMinMoto);
        } else{
            return redondear((long) (valorFijoMoto + ((varDuracionHoras - 1)*valorAdicionMoto)));
        }
    }
    
}
