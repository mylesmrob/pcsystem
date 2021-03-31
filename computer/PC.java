package computer;

public class PC {
    private Case caseObj;
    private Motherboard motherboard;
    private Monitor monitor;

    public PC(Case caseObj, Motherboard motherboard, Monitor monitor){
        this.caseObj = caseObj;
        this.motherboard = motherboard;
        this.monitor = monitor;
    }

    private void drawLogo(){
        monitor.drawPixel(10,5,"blue");
    }

    public void description(){
        System.out.println("Welcome to Worst Buy. Below is the description of the PC on sale today: \n" +
                            "CASE \n" +
                            "Model: " + caseObj.getModel() + " Manufacturer: " + caseObj.getManufacturer() + " Power: " + caseObj.getPowerSupply() + "\n" +
                            "Height: " + caseObj.getDimensions().getHeight() + " Width: " + caseObj.getDimensions().getWidth() + " Depth: " + caseObj.getDimensions().getDepth() + "\n" +
                            "MOTHERBOARD \n" +
                            "Model: " + motherboard.getModel() + " Manufacturer: " + motherboard.getManufacturer() + "\n" +
                            "RAMSlots: " + motherboard.getRamSlots() + " CardSlots: " + motherboard.getCardSlots() + " BIOS: " + motherboard.getBios() + "\n" +
                            "MONITOR \n" +
                            "Model: " + monitor.getModel() + " Manufacturer: " + monitor.getManufacturer() + "\n" +
                            "Height: " + monitor.getResolution().getHeight() + " Width: " + monitor.getResolution().getWidth());
    }

    public void powerUp(){
        caseObj.pressPowerButton();
        drawLogo();
        motherboard.loadProgram("IntelliJ");
    }
}
