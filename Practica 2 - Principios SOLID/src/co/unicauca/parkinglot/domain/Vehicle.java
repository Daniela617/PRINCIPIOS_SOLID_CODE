package co.unicauca.parkinglot.domain;

public class Vehicle{
    
    private String atrPlate;
    private TypeEnum atrType;
    
    public Vehicle() {
    }
    
    public Vehicle(String prmPlate, TypeEnum prmTipo) {
        atrPlate = prmPlate;
        atrType = prmTipo;
    }
    
    public String getAtrPlate() {
        return atrPlate;
    }
    public TypeEnum getAtrType() {
        return atrType;
    }
    
    public void setAtrPlate(String prmPlate) {
        this.atrPlate = prmPlate;
    }
    public void setAtrType(TypeEnum prmTipo) {
        this.atrType = prmTipo;
    }

    @Override
    public String toString() {
        return "Vehicle{" + "plate=" + atrPlate + ", type=" + atrType + '}';
    }

}
