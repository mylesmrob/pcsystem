package computer;

public class Case {
    private String model;
    private String manufacturer;
    private String powerSupply;
    private Dimensions dimensions;

    public void pressPowerButton(){
        System.out.println("PoweButton pressed");
    }

    public Case(Dimensions dimensions){
        this.dimensions = dimensions;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getPowerSupply() {
        return powerSupply;
    }

    public void setPowerSupply(String powerSupply) {
        this.powerSupply = powerSupply;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }
}
