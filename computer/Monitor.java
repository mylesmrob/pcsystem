package computer;

public class Monitor {
    private Resolution resolution;
    private String model;
    private String manufacturer;

    public void drawPixel(int x, int y, String color){
        System.out.println("Drawing pixel at " + x + ", " + y + ", " + "in color " + color);
    }

    public Monitor(Resolution resolution){
        this.resolution = resolution;
    }

    public Resolution getResolution() {
        return resolution;
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
}
