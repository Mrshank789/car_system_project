public class Car {
    private String plateNumber;
    private String model;
    private boolean isAvailable;

    public Car(String plateNumber, String model) {
        this.plateNumber = plateNumber;
        this.model = model;
        this.isAvailable = true;
    }

    public void rentCar() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Car rented: " + model);
        } else {
            System.out.println("Car is already rented.");
        }
    }

    public void returnCar() {
        isAvailable = true;
        System.out.println("Car returned: " + model);
    }

    public boolean isAvailable() {
        return isAvailable;
    }
}
