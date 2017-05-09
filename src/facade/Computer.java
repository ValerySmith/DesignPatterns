package facade;

public class Computer {
    private PowerSupply powerSupply = new PowerSupply();
    private HardDrive hardDrive = new HardDrive();
    private RAM ram = new RAM();
    private GPU gpu = new GPU();

    public void startComputer() {
        powerSupply.toSupplyFood();
        powerSupply.powerTheGraphicsCard();
        gpu.launch();
        gpu.isCheckMonitor();
        powerSupply.powerTheRAM();
        ram.launchingDevices();
        ram.memoryAnalysis();
        gpu.outDataRam();
        powerSupply.powerTheHardDrive();
        hardDrive.startHardDrive();
        hardDrive.bootSectorCheck();
        gpu.outDeviceHardDrive();

    }

}
