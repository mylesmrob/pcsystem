package computer;

public class Main {

    public static void main(String[] args) {
        //Set Dimensions
        Dimensions dimensions = new Dimensions();
        dimensions.setWidth(20);
        dimensions.setHeight(15);
        dimensions.setDepth(17);

        //Set Case
        Case caseObj = new Case(dimensions);
        caseObj.setModel("ROG Z11");
        caseObj.setManufacturer("Asus");
        caseObj.setPowerSupply("ATX");

        //Set Motherboard
        Motherboard motherboard = new Motherboard();
        motherboard.setModel("Z390");
        motherboard.setManufacturer("Intel");
        motherboard.setRamSlots(2);
        motherboard.setCardSlots(2);
        motherboard.setBios("Z390.bios");

        //Set Resolution
        Resolution resolution = new Resolution();
        resolution.setHeight(14);
        resolution.setWidth(24);

        //Set Monitor
        Monitor monitor = new Monitor(resolution);
        monitor.setModel("Strix");
        monitor.setManufacturer("Asus");

        PC pc = new PC(caseObj, motherboard, monitor);
        pc.description();
        System.out.print("\n");
        pc.powerUp();
    }
}
