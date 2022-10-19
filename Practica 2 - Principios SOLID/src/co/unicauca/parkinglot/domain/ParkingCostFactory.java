package co.unicauca.parkinglot.domain;

import java.util.Hashtable;
import java.util.Map;

public class ParkingCostFactory {
    private Map<TypeEnum, IParkingCost> atrDictionary = new Hashtable<TypeEnum, IParkingCost>();
    private static ParkingCostFactory atrInstance;

    private ParkingCostFactory() {
        atrDictionary.put(TypeEnum.MOTO, new MotoParkingCost());
        atrDictionary.put(TypeEnum.CAR, new CarParkingCost());
        atrDictionary.put(TypeEnum.TRUCK, new TruckParkingCost());
    }
    
    public static ParkingCostFactory getInstance(){
        if (atrInstance == null) {
            atrInstance = new ParkingCostFactory();
        }
        return atrInstance;
    }
    
    public IParkingCost getParkingCost(TypeEnum prmTipoVehiculo){
        return atrDictionary.get(prmTipoVehiculo);
    }
}