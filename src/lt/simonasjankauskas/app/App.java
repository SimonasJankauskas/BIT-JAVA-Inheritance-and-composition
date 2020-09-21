package lt.simonasjankauskas.app;

public class App {
    public static void main(String[] args) {
        Computers computers1 = new Computers();
        computers1.setName("Lenovo");
        HardDrive hardDrive1 = new HardDrive();
        hardDrive1.setType("SSD");
        computers1.setHardDrive(hardDrive1);
        System.out.println(computers1);
    }
}

class Computers {
    private String name;
    private HardDrive hardDrive;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HardDrive getHardDrive() {
        return hardDrive;
    }

    public void setHardDrive(HardDrive hardDrive) {
        this.hardDrive = hardDrive;
    }

    @Override
    public String toString() {
        return "Name: " + name +
                hardDrive;
    }
}

class HardDrive {

    private String type;

    public String getType() {
        return type;
    }


    public void setType(String type) {
        this.type = type;
    }


    @Override
    public String toString() {
        return ", Type: " + type;
    }
}